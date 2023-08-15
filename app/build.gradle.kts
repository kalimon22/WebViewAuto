plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "org.openauto.webviewauto"
    compileSdk = 33

    defaultConfig {
        applicationId = "org.openauto.webviewauto"
        minSdk = 27
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(fileTree(mapOf(
        "dir" to "libs",
        "include" to listOf("*.aar", "*.jar"),
        "exclude" to listOf("")
    )))
    implementation("com.android.support:support-fragment:28.0.0")
    implementation("com.android.support:appcompat-v7:28.0.0")
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("com.android.support:design:28.0.0")
    testImplementation("junit:junit:4.13.2")
}