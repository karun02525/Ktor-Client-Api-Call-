# Ktor-Client-Api-Call-


plugins {
    id 'com.android.application'
    id 'org.jetbrains.kotlin.android'
    id 'org.jetbrains.kotlin.plugin.serialization'
}


    def ktor_version = "1.6.3"
    implementation "io.ktor:ktor-client-core:$ktor_version"
    implementation "io.ktor:ktor-client-android:$ktor_version"
    implementation "io.ktor:ktor-client-serialization:$ktor_version"
    implementation "io.ktor:ktor-client-logging:$ktor_version"
    implementation "ch.qos.logback:logback-classic:1.2.3"

    implementation 'org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.3'


class Level:
plugins {
    id 'com.android.application' version '8.0.2' apply false
    id 'com.android.library' version '8.0.2' apply false
    id 'org.jetbrains.kotlin.android' version '1.7.20' apply false
    id 'org.jetbrains.kotlin.plugin.serialization' version '1.6.21'
}

