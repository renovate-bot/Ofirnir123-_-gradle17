plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation(platform("de.cotto.playground:platform"))
    implementation("de.aaschmid:gradle-cpd-plugin")
    implementation("com.github.spotbugs.snom:spotbugs-gradle-plugin")
    implementation("net.ltgt.gradle:gradle-errorprone-plugin")
    implementation("net.ltgt.gradle:gradle-nullaway-plugin")
    implementation("com.adarshr:gradle-test-logger-plugin")
    implementation("info.solidsoft.gradle.pitest:gradle-pitest-plugin")
}
