plugins {
  id("awesome.androidlib.plugin")
}
android {
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
}
dependencies {
    implementation("com.google.auto.value:auto-value-annotations:1.10")
    kapt("com.google.auto.value:auto-value:1.6.6")
    implementation("androidx.activity:activity-compose:1.8.1")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation(project(":layer_0:module_0_24"))
    implementation(project(":layer_0:module_0_7"))
    implementation(project(":layer_0:module_0_25"))
    implementation(project(":layer_0:module_0_14"))
    implementation(project(":layer_0:module_0_62"))
    implementation(project(":layer_0:module_0_32"))
    implementation(project(":layer_0:module_0_9"))
    implementation(project(":layer_0:module_0_6"))
    implementation(project(":layer_0:module_0_57"))
    implementation(project(":layer_0:module_0_26"))
    implementation(project(":layer_0:module_0_31"))
    implementation(project(":layer_0:module_0_3"))
    implementation(project(":layer_0:module_0_10"))
    implementation(project(":layer_0:module_0_49"))
    implementation(project(":layer_0:module_0_36"))
    implementation(project(":layer_0:module_0_67"))
    implementation(project(":layer_0:module_0_19"))
    implementation(project(":layer_0:module_0_30"))
    implementation(project(":layer_0:module_0_47"))
    implementation(project(":layer_0:module_0_35"))
    implementation(project(":layer_0:module_0_56"))
    implementation(project(":layer_0:module_0_1"))
    implementation(project(":layer_0:module_0_48"))
    implementation(project(":layer_0:module_0_37"))
    implementation(project(":layer_0:module_0_43"))
}
