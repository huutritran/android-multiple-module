
plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(AndroidConfig.COMPILE_SDK_VERSION)
    buildToolsVersion(AndroidConfig.BUILD_TOOLS_VERSION)

    defaultConfig {
        applicationId(AndroidConfig.ID)
        minSdkVersion(AndroidConfig.MIN_SDK_VERSION)
        targetSdkVersion(AndroidConfig.TARGET_SDK_VERSION)
        versionCode(AndroidConfig.VERSION_CODE)
        versionName(AndroidConfig.VERSION_NAME)

        testInstrumentationRunner(AndroidConfig.TEST_INSTRUMENTATION_RUNNER)
    }

    buildTypes {
        getByName(BuildType.RELEASE) {
            isMinifyEnabled = BuildTypeRelease.isMinifyEnabled
            proguardFiles("proguard-android.txt", "proguard-rules.pro")
        }
        getByName(BuildType.DEBUG) {
            isMinifyEnabled = BuildTypeDebug.isMinifyEnabled
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

dependencies {
    implementation(project(":auth"))
    implementation(LibraryDependency.KOTLIN)
    implementation(LibraryDependency.CORE_KTX)

    implementation(LibraryDependency.MATERIAL)
    implementation(LibraryDependency.CONSTRAINT_LAYOUT)

    implementation(LibraryDependency.NAVIGATION_FRAGMENT_KTX)
    implementation(LibraryDependency.NAVIGATION_UI_KTX)

    implementation(LibraryDependency.RETROFIT)
    implementation(LibraryDependency.OKHTTP)
    implementation(LibraryDependency.MOSHI)
    implementation(LibraryDependency.MOSHI_KOTLIN)
    implementation(LibraryDependency.MOSHI_CONVERTER)
    implementation(LibraryDependency.STETHO)
    implementation(LibraryDependency.STETHO_OKHTTP)
    implementation(LibraryDependency.LOGGING_INTERCEPTOR)

    implementation(LibraryDependency.DAGGER)
    kapt(LibraryDependency.DAGGER_COMPILER)

    testImplementation(TestLibraryDependency.JUNIT)
    androidTestImplementation(TestLibraryDependency.ANDROID_JUNIT)
    androidTestImplementation(TestLibraryDependency.ANDROID_ESPRESSO)
}