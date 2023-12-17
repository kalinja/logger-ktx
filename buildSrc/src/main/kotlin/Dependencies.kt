import org.gradle.api.JavaVersion

object Dependencies {

    object Versions {
        const val appCompat = "1.0.0"
        const val constraintLayout = "1.1.2"

        const val kotlin = "1.9.10"
        const val dokka = "1.9.10"

        const val gradle = "8.4"
        const val gradleBuildTools = "8.1.4"

        const val timber = "5.0.1"
        const val koin = "3.5.0"

        const val junit = "4.12"
    }

    /* =============================  ANDROID ============================= */

    object Android {
        const val applicationId = "cz.eman.logger.sample"

        const val minSdk = 21
        const val targetSdk = 34
        const val compileSdk = 34

        const val versionCode = 1

        const val testInstrumentRunner = "androidx.test.runner.AndroidJUnitRunner"
        val sourceCompatibilityJava = JavaVersion.VERSION_17
        val targetCompatibilityJava = JavaVersion.VERSION_17
    }

    /* =============================  BUILD-PLUGINS ======================= */

    object BuildPlugins {
        const val encoding = "UTF-8"
        const val gradle = Versions.gradle

        const val android = "com.android.tools.build:gradle:${Versions.gradleBuildTools}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val dokka = "org.jetbrains.dokka:dokka-gradle-plugin:${Versions.dokka}"
    }

    /* =============================  KOTLIN ============================== */

    object Kotlin {
        const val standardLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    }

    /* =============================  LIBS ================================ */

    object Libs {
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
        const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
        const val koin = "io.insert-koin:koin-core:${Versions.koin}"
    }

    /* =============================  TEST-LIBS =========================== */

    object TestLibs {
        const val junit = "junit:junit:${Versions.junit}"
    }
}
