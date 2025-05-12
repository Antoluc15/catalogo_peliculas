plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

    // 🔥 Plugin de Google Services necesario para Firebase
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.catalogo_peliculas"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.catalogo_peliculas"
        minSdk = 21
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // 🔥 Firebase BoM
    implementation(platform("com.google.firebase:firebase-bom:33.13.0"))

    // 🔥 Firebase Analytics (puedes agregar más productos aquí)
    implementation("com.google.firebase:firebase-analytics")
}
