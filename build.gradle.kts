plugins {
    java
}

group = "dsa"
version = "1.0-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

sourceSets {
    main {
        java {
            srcDirs("src")
        }
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}
