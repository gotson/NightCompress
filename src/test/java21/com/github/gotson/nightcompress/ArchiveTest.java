package com.github.gotson.nightcompress;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ArchiveTest {
    @Test
    void library_is_available() {
        assertThat(Archive.isAvailable()).isTrue();
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    void can_get_entries(TestData testData) throws LibArchiveException {
        try (var archive = new Archive(testData.archivePath())) {
            assertThat(archive.getEntries()).isEqualTo(testData.entries());
        }
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    void can_extract(TestData testData) throws Exception {
        try (var archive = new Archive(testData.archivePath())) {
            List<Path> entries = Files.list(testData.contentPath()).toList();

            for (var entry : archive.getEntries()) {
                var testEntryPath = entries.stream().filter(path -> path.getFileName().toString().equals(entry.getName())).findAny().orElse(null);
                assertThat(testEntryPath).isNotNull();

                var testEntryBytes = Files.readAllBytes(testEntryPath);

                try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                    try (InputStream is = archive.getInputStream(entry)) {
                        is.transferTo(baos);
                    }
                    assertThat(baos.toByteArray()).isEqualTo(testEntryBytes);
                }
            }
        }
    }

    List<TestData> getTestData() throws URISyntaxException {
        return List.of(
            new TestData(getResourcePath("/rar5/rar5.rar"), getResourcePath("/rar5/rar5/"), asList(
                new ArchiveEntry("FILE1.TXT", 7L, ZonedDateTime.of(2010, 11, 3, 7, 27, 28, 0, ZoneId.systemDefault()).toInstant()),
                new ArchiveEntry("FILE2.TXT", 7L, ZonedDateTime.of(2010, 11, 3, 7, 27, 34, 0, ZoneId.systemDefault()).toInstant())
            )),
            new TestData(getResourcePath("/rar5/unicode.rar"), getResourcePath("/rar5/unicode/"), asList(
                new ArchiveEntry("ウニコド.txt", 67L, ZonedDateTime.of(2020, 7, 28, 9, 49, 34, 0, ZoneId.systemDefault()).toInstant()),
                new ArchiveEntry("新建文本文档.txt", 10L, ZonedDateTime.of(2020, 7, 28, 9, 50, 48, 0, ZoneId.systemDefault()).toInstant())
            ))
        );
    }

    Path getResourcePath(String resourceName) throws URISyntaxException {
        return Path.of(getClass().getResource(resourceName).toURI());
    }
}
