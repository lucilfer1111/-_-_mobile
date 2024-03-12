pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven{
            url = uri("https://jitpack.io")
        }
        jcenter()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        maven{
            url = uri("https://jitpack.io")
        }
        jcenter()
    }
}

rootProject.name = "pizza"
include(":app")
 