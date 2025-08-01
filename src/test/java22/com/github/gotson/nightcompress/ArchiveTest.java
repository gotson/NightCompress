package com.github.gotson.nightcompress;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ArchiveTest {
    @Test
    void library_is_available() {
        assertThat(Archive.isAvailable()).isTrue();
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    void can_get_entries_static(TestData testData) throws LibArchiveException {
        assertThat(Archive.getEntries(testData.archivePath())).isEqualTo(testData.entries());
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    void can_get_entries(TestData testData) throws LibArchiveException {
        try (var archive = new Archive(testData.archivePath())) {
            ArchiveEntry entry;
            int i = 0;
            while ((entry = archive.getNextEntry()) != null) {
                assertThat(entry).isEqualTo(testData.entries().get(i++));
            }
        }
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    void can_extract_static(TestData testData) throws Exception {
        for (int i = 0; i < testData.entries().size(); i++) {
            try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                try (InputStream is = Archive.getInputStream(testData.archivePath(), testData.entries().get(i).getName())) {
                    is.transferTo(baos);
                }
                var expectedContent = testData.entriesContent().get(i);
                assertThat(baos.toString()).isEqualTo(expectedContent);
            }
        }
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    void can_extract(TestData testData) throws Exception {
        try (var archive = new Archive(testData.archivePath())) {
            int i = 0;
            while (archive.getNextEntry() != null) {
                try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                    try (InputStream is = archive.getInputStream()) {
                        is.transferTo(baos);
                    }
                    var expectedContent = testData.entriesContent().get(i++);
                    assertThat(baos.toString()).isEqualTo(expectedContent);
                }
            }
        }
    }

    List<TestData> getTestData() throws URISyntaxException {
        return List.of(
            new TestData(getResourcePath("/rar5/rar5.rar"),
                List.of(
                    new ArchiveEntry("FILE1.TXT", 7L, ZonedDateTime.of(2010, 11, 2, 23, 27, 28, 0, ZoneId.of("UTC")).toInstant()),
                    new ArchiveEntry("FILE2.TXT", 7L, ZonedDateTime.of(2010, 11, 2, 23, 27, 34, 0, ZoneId.of("UTC")).toInstant())
                ),
                List.of(
                    "file1\r\n",
                    "file2\r\n"
                )
            ),
            // archive with recovery record (-rr5)
            new TestData(getResourcePath("/rar5/rr5.rar"),
                List.of(
                    new ArchiveEntry("FILE1.TXT", 7L, ZonedDateTime.of(2010, 11, 2, 23, 27, 28, 0, ZoneId.of("UTC")).toInstant()),
                    new ArchiveEntry("FILE2.TXT", 7L, ZonedDateTime.of(2010, 11, 2, 23, 27, 34, 0, ZoneId.of("UTC")).toInstant())
                ),
                List.of(
                    "file1\r\n",
                    "file2\r\n"
                )
            ),
            new TestData(getResourcePath("/rar5/unicode.rar"),
                List.of(
                    new ArchiveEntry("ウニコド.txt", 67L, ZonedDateTime.of(2020, 7, 28, 1, 49, 34, 0, ZoneId.of("UTC")).toInstant()),
                    new ArchiveEntry("新建文本文档.txt", 10L, ZonedDateTime.of(2020, 7, 28, 1, 50, 48, 0, ZoneId.of("UTC")).toInstant())
                ),
                List.of(
                    "このファイルにはUnicodeテキストが含まれています",
                    "aaaaaaaaaa"
                )
            )
        );
    }

    Path getResourcePath(String resourceName) throws URISyntaxException {
        return Path.of(getClass().getResource(resourceName).toURI());
    }
}
