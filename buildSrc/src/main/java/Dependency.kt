object Apps {
    const val compileSdk = 29
    const val minSdk = 21
    const val targetSdk = 29
    const val versionCode = 1
    const val versionName = "1.0.0"
    val dependency = arrayOf<String>(
        "androidx.core:core-ktx:1.3.0",
        "androidx.appcompat:appcompat:1.1.0",
        "androidx.constraintlayout:constraintlayout:1.1.3",
        "androidx.test.ext:junit:1.1.1",
        "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    )
}

object Versions {
    const val gradle = "3.5.0"
    const val kotlin = "1.3.72"
    const val appcompat = "1.0.2"

    /* test */
    const val junit = "4.12"
}

object Libs {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
}

object TestLibs {
    const val junit = "junit:junit:${Versions.junit}"
}