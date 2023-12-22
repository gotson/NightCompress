[![GitHub Workflow Status](https://img.shields.io/github/actions/workflow/status/gotson/NightCompress/ci.yml?branch=main&style=flat-square)](https://github.com/gotson/NightCompress/actions/workflows/ci.yml)
[![Maven Central](https://img.shields.io/maven-central/v/com.github.gotson.NightCompress/nightcompress?color=blue&style=flat-square)](https://search.maven.org/search?q=g:com.github.gotson.NightCompress)
[![Sonatype Nexus (Snapshots)](https://img.shields.io/nexus/s/com.github.gotson.NightCompress/nightcompress?color=blue&label=maven-snapshot&server=https%3A%2F%2Foss.sonatype.org&style=flat-square)](https://oss.sonatype.org/content/repositories/snapshots/com/github/gotson/NightCompress/)

# NightCompress

A Java wrapper around [libarchive](https://libarchive.org/). NightCompress uses the newer Foreign Linker API
available in JDK 21 to access native libraries.

## How it works

NightCompress is released as a multi-release JAR:

- with Java < 21 as a no-op version that throws `UnsupportedOperationException` on any operation
- with Java 21 all the features are available
- the JAR is not compatible with other Java versions, as the Foreign Linker APIs are still changing

This lets you add the dependency in your project whatever the JDK used, and still enable the feature at runtime if the required JDK is used. 

## Requirements

In order for the JAR to run properly, you will need to:

- Run Java 21 with the following options:

```
--enable-preview --enable-native-access=ALL-UNNAMED
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
