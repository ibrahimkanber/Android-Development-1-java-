# Android-Development Notes (java)

------------Application Fundamentals -------------

Android apps can be written using Kotlin, Java, and C++ languages. The Android SDK tools compile your code along with any data and resource files into an APK or an Android App Bundle.

An Android package, which is an archive file with an .apk suffix, contains the contents of an Android app that are required at runtime and it is the file that Android-powered devices use to install the app.

An Android App Bundle, which is an archive file with an .aab suffix, contains the contents of an Android app project including some additional metadata that is not required at runtime. An AAB is a publishing format and is not installable on Android devices, it defers APK generation and signing to a later stage. When distributing your app through Google Play for example, Google Play's servers generate optimized APKs that contain only the resources and code that are required by a particular device that is requesting installation of the app.

App components
App components are the essential building blocks of an Android app. Each component is an entry point through which the system or a user can enter your app. Some components depend on others.
There are four different types of app components:

-Activities
 An activity is the entry point for interacting with the user.
-Services

-Broadcast receivers

-Content providers


------------Activity lifecycle-------------
```
1.onCreate()
2.onStart()
3.onResume()
4.onPause()
5.onStop()
6.onDestroy() 
```
