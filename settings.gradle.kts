
pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("de.fayard.refreshVersions") version "0.60.3"
}

refreshVersions {
}

include("json-dsl")
include("search-dsls")
include("search-client")
include("docs")
rootProject.name = "kt-search"
