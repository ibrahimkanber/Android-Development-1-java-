# Android-Development Notes (java)

------------Application Fundamentals -------------
```
An Android package, which is an archive file with an .apk suffix, contains the contents of an Android app that are required at runtime and it is the file that Android-powered devices use to install the app.

An Android App Bundle, which is an archive file with an .aab suffix, contains the contents of an Android app project including some additional metadata that is not required at runtime. An AAB is a publishing format and is not installable on Android devices, it defers APK generation and signing to a later stage. When distributing your app through Google Play for example, Google Play's servers generate optimized APKs that contain only the resources and code that are required by a particular device that is requesting installation of the app.
```

------------Activity lifecycle-------------
```
1.onCreate()
2.onStart()
3.onResume()
4.onPause()
5.onStop()
6.onDestroy() 
```
