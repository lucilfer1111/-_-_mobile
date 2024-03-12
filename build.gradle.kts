buildscript {
    repositories {
        google()
        jcenter()
        mavenCentral()
    }
    dependencies {
        classpath("com.google.gms:google-services:4.4.0")
        classpath ("com.android.tools.build:gradle:3.5.4")

    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven { url = uri("https://jitpack.io") }
        mavenCentral()
    }
}
plugins {
    id("com.android.application") version "8.1.1" apply false
}
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}