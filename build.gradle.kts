plugins {
    kotlin("js") version "1.4.20-RC"
}

group = "ru.avdim"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test-js"))
    implementation("org.jetbrains.kotlinx:kotlinx-nodejs:0.0.7")
}

kotlin {
    js(IR) {
        nodejs {
            binaries.executable()
        }
    }
}
