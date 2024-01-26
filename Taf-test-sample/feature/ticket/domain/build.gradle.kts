@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.kotlinAndroid)
}


android {
    compileSdk = 31
    namespace = "com.hamza.ticket.domain"

    defaultConfig {
        minSdk = 24

        consumerProguardFiles("consumer-rules.pro")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {
    implementation(project(":feature:ticket:api"))
    implementation(project(":domain:network"))
    implementation(project(":domain:local"))
    implementation(libs.koin.core)
    implementation(libs.coroutines)

    testImplementation(libs.junit)
    testImplementation(libs.mockk)
}