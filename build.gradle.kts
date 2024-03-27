import com.gradle.enterprise.gradleplugin.testselection.PredictiveTestSelectionProfile

plugins {
    id("com.autonomousapps.dependency-analysis") version "1.21.0"
    id("org.jetbrains.kotlin.jvm") version ("1.9.10") apply false
    id("com.android.application") version "8.1.1" apply false
    id("com.android.library") version "8.1.1" apply false
    id("io.github.cdsap.kotlinprocess") version "0.1.5"
    id("io.github.cdsap.gradleprocess") version "0.1.1"
    id("io.github.cdsap.testprocess") version "0.1.3"
}

allprojects {
    tasks.withType<Test>().configureEach {
        useJUnitPlatform()
        predictiveSelection {
            profile.set(PredictiveTestSelectionProfile.CONSERVATIVE)
            enabled = true
        }
    }
}
