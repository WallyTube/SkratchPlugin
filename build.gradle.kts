plugins {
    `java-library`
    id("io.papermc.paperweight.userdev") version "1.4.0"
}

group = "me.plexpvp"
version = "1.0-SNAPSHOT"

tasks {
    assemble {
        dependsOn(reobfJar)
    }

    compileJava {
        options.encoding = Charsets.UTF_8.name()
        options.release.set(17)
    }

    processResources {
        filteringCharset = Charsets.UTF_8.name() // We want UTF-8 for everything
    }
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

repositories {
    mavenCentral()
    maven("https://papermc.io/repo/repository/maven-public/")
    maven("https://oss.sonatype.org/content/groups/public/")
}

dependencies {
    paperDevBundle("1.19.3-R0.1-SNAPSHOT")
}