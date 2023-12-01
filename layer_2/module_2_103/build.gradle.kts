plugins {
  id("awesome.androidlib.plugin")
}
android {
    buildFeatures {
        compose = true
    }
    composeOptions {
        useLiveLiterals = true
        kotlinCompilerExtensionVersion = "1.5.3"
    }
}
dependencies {
    implementation("com.google.auto.value:auto-value-annotations:1.10")
    kapt("com.google.auto.value:auto-value:1.6.6")
    implementation("se.ansman.kotshi:api:2.14.0")
    kapt("se.ansman.kotshi:compiler:2.14.0")
    implementation("androidx.activity:activity-compose:1.8.1")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation(project(":layer_1:module_1_72"))
    implementation(project(":layer_1:module_1_82"))
    implementation(project(":layer_1:module_1_73"))
    implementation(project(":layer_1:module_1_93"))
    implementation(project(":layer_1:module_1_90"))
    implementation(project(":layer_1:module_1_95"))
    implementation(project(":layer_1:module_1_94"))
    implementation(project(":layer_1:module_1_100"))
    implementation(project(":layer_1:module_1_98"))
    implementation(project(":layer_1:module_1_96"))
}
