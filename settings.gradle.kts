rootProject.name = "playground"
include("architecture-tests")
include("subproject-one")
include("subproject-one:nested")
include("subproject-two")
include("application")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            from("de.c-otto:version-catalog:2023.01.29")
        }
    }
}
