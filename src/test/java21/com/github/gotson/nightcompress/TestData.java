package com.github.gotson.nightcompress;

import java.nio.file.Path;
import java.util.List;

public record TestData(
    Path archivePath,
    List<ArchiveEntry> entries,
    List<String> entriesContent
) {
}
