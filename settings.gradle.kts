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
    includeBuild("./platform")
}
