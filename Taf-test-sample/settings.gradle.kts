pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "taf-test"
include(":app")
include(":common")
include(":domain:network")
include(":domain:local")
include(":feature:ticket:api")
include(":feature:ticket:domain")
