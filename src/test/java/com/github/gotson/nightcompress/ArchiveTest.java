package com.github.gotson.nightcompress;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArchiveTest {
    @Test
    void library_not_available() {
        assertThat(Archive.isAvailable()).isFalse();
    }
}
