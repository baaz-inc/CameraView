
buildscript {

    extra["minSdkVersion"] = 15
    extra["compileSdkVersion"] = 33
    extra["targetSdkVersion"] = 31

    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.4.2")
        classpath("io.deepmedia.tools:publisher:0.7.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.21")

    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(buildDir)
}