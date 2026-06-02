plugins {
	alias(libs.plugins.android.application)
}

android {
	namespace = "studying.course1"
	compileSdk = 36

	defaultConfig {
		applicationId = "studying.course1"
		minSdk = 26
		targetSdk = 36
		versionCode = 1
		versionName = "1.0"

		testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
	}

	buildTypes {
		release {
			isMinifyEnabled = false
			proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
		}
	}
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_11
		targetCompatibility = JavaVersion.VERSION_11
	}
	buildFeatures {
		viewBinding = true
	}

	testOptions {
		unitTests.all {
			it.useJUnitPlatform()
		}
	}
}

dependencies {
	implementation(libs.androidx.core.ktx)
	implementation(libs.androidx.appcompat)
	implementation(libs.material)
	implementation(libs.androidx.constraintlayout)
	implementation(libs.androidx.navigation.fragment.ktx)
	implementation(libs.androidx.navigation.ui.ktx)
	
	testImplementation(libs.junit)
	testImplementation(libs.junit.jupiter.api)
	testImplementation(libs.junit.jupiter.params)
	testRuntimeOnly(libs.junit.jupiter.engine)
	testRuntimeOnly(libs.junit.platform.launcher)
	
	testImplementation(libs.mockito.kotlin)
	
	androidTestImplementation(libs.androidx.junit)
	androidTestImplementation(libs.androidx.espresso.core)
}