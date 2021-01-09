private object TestLibraryVersion {
    const val JUNIT = "4.+"
    const val ANDROID_JUNIT = "1.1.1"
    const val  ANDROID_ESPRESSO = "3.2.0"
}

object  TestLibraryDependency {
    const val JUNIT  = "junit:junit:${TestLibraryVersion.JUNIT}"
    const val ANDROID_JUNIT = "androidx.test.ext:junit:${TestLibraryVersion.ANDROID_JUNIT}"
    const val ANDROID_ESPRESSO = "androidx.test.espresso:espresso-core:${TestLibraryVersion.ANDROID_ESPRESSO}"
}