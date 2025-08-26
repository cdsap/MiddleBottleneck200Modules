
plugins {
    id("org.jetbrains.kotlin.jvm") version ("2.1.0") apply false
    id("com.android.application") version "8.1.1" apply false
    id("com.android.library") version "8.1.1" apply false
    id("io.github.cdsap.kotlinprocess") version "0.2.0"
    id("io.github.cdsap.gradleprocess") version "0.2.0"
    id("io.github.cdsap.testprocess") version "0.1.3"
}

allprojects {
    tasks.withType<Test>().configureEach {
        useJUnitPlatform()
        develocity.predictiveTestSelection {
            enabled = true
        }
    }
}
