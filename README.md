[![GitHub Workflow Status](https://img.shields.io/github/actions/workflow/status/gotson/NightCompress/ci.yml?branch=main&style=flat-square)](https://github.com/gotson/NightCompress/actions/workflows/ci.yml)
[![Maven Central](https://img.shields.io/maven-central/v/com.github.gotson.nightcompress/nightcompress?color=blue&style=flat-square)](https://search.maven.org/search?q=g:com.github.gotson.nightcompress)
[![Sonatype Nexus (Snapshots)](https://img.shields.io/nexus/s/com.github.gotson.nightcompress/nightcompress?color=blue&label=maven-snapshot&server=https%3A%2F%2Foss.sonatype.org&style=flat-square)](https://oss.sonatype.org/content/repositories/snapshots/com/github/gotson/nightcompress/)

# NightCompress

A Java wrapper around [libarchive](https://libarchive.org/). NightCompress uses the newer Foreign Linker API
available in JDK 22 to access native libraries.

## How it works

NightCompress is released as a multi-release JAR:

- with Java < 22 as a no-op version that throws `UnsupportedOperationException` on any operation
- with Java 22 all the features are available
- the JAR is not compatible with other Java versions, as the Foreign Linker APIs are still changing

This lets you add the dependency in your project whatever the JDK used, and still enable the feature at runtime if the required JDK is used. 

## Requirements

In order for the JAR to run properly, you will need to:

- Run Java 22 with the following options:

```
--enable-native-access=ALL-UNNAMED
```

- Make sure the path to the directory containing the native libraries is contained in the Java system
  property `java.library.path` (check
  also [this](https://stackoverflow.com/questions/20038789/default-java-library-path)).
  - For Linux, normally it works fine when installed from a package manager. You can add the libraries' path to
    the `LD_LIBRARY_PATH` environment variable.
  - For Mac, if using HomeBrew, you will need to set `JAVA_LIBRARY_PATH` to `/usr/local/lib/` or `/opt/homebrew/lib/`.

## Installation

### Gradle

```groovy
runtimeOnly "com.github.gotson.nightcompress:nightcompress:{version}"
```

### Gradle (Kotlin DSL)

```kotlin
runtimeOnly("com.github.gotson.nightcompress:nightcompress:{version}")
```

### Maven

```xml
<dependency>
  <groupId>com.github.gotson.nightcompress</groupId>
  <artifactId>nightcompress</artifactId>
  <version>{version}</version>
</dependency>
```

## Usage

### Check if the library is available

```java
try {
  if (Archive.isAvailable()) {
    // do stuff
  }
} catch(Exception e) {
  // to be on the safe side
}
```

### Extract from a `Path` to an `OutputStream`
```java
// Assuming you already have a Path pointing to the archive file and an OutputStream for writing to
Archive archive = new Archive(path);
while (archive.getNextEntry() !=null) {
  try (InputStream is = archive.getInputStream()) {
    is.transferTo(outputStream);
  }
}

// Assuming you already know which entry you want to extract
try (InputStream is = Archive.getInputStream(path, entryName)) {
  is.transferTo(outputStream);
}
```

## Configuration

NightCompress allows for some tuning using System Properties:

- Options for `Archive#getInputStream(Path)`:
  - `nightcompress.extractor.buffer-size`: accepts any positive integer. Defaults to `32 * 1024`.
    - Sets the maximum size used for the dynamic byte buffer in the `PipedInputStream`.
  - `nightcompress.extractor.use-executor`: accepts either `true` or `false`. Defaults to `true`.
    - If `true`, it uses a cached thread pool for extracting the contents, which is generally faster.
    - If `false`, it will create a new thread on each call. This may be slower, but may require slightly less memory.
    - Options for tuning the thread pool:
      - `nightcompress.extractor.max-threads`: accepts any positive integer. Defaults to `2^31`.
        - Sets the maximum number of threads to be used in the pool. By default, there is no hard limit on the number
          of threads, but they are only created when needed, so the maximum should not exceed the number of threads
          calling this method at any given moment. Use this if you need to restrict the number of threads.
      - `nightcompress.extractor.thread-keep-alive-seconds`: accepts any positive integer. Defaults to `5`.
        - Sets the number of seconds a thread can be kept alive in the pool, waiting for a next extraction operation.
          After that time, the thread may be stopped.
