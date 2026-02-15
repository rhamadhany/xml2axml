plugins {
    id("com.android.library") version "8.1.4"
    kotlin("android") version "1.9.0"
}

android {
    namespace = "com.rhamadhany.xml2axml"
    compileSdk = 36

    defaultConfig {
        minSdk = 21
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    packaging {
        resources {

        }
    }
}

dependencies {
    implementation("commons-io:commons-io:2.21.0")
    implementation("net.sf.kxml:kxml2:2.3.0")
    implementation("org.apache.commons:commons-lang3:3.20.0")

}

repositories {
    mavenCentral()
    google()
}




