# LoginDemo_Kotlin

It is simple login example using kotlin as main language. Here we have used dagger, MVP and Room library. 
Headtsart your Modern Application Journey with Kotlin!

## Getting Started

apply plugin: 'kotlin-kapt' // For Annotation in to your code.

Apply Following library in to your app gradle inside dependencies block

implementation "android.arch.persistence.room:runtime:1.0.0"
kapt "android.arch.persistence.room:compiler:1.0.0"

implementation 'com.google.dagger:dagger:2.12'
kapt 'com.google.dagger:dagger-compiler:2.12'

### Prerequisites

Android Studio 3.0 or later and you know how to use it.

A device or emulator that runs API level 26



### Getting Started

1. Install Android Studio, if you don't already have it.
2. Download the sample.
3. Import the sample into Android Studio.
4. Build and run the sample.

## Project Package Detail

The app has following packages:

1. DB: It contains all the Database related task.
2. DI: Dependency providing classes using Dagger2.
3. Model: Simple model class to read data from the user inputs.
4. Modules: Whole Application Related task.
5. Presenter: It is bridge classes for Model and View. 
6. UI: Contains class which are showing user interface.
7. View: Contains interface for UI to prepare data for the user.
