# App components


App components are the essential building blocks of an Android app. Each component is an entry point through which the system or a user can enter your app. Some components depend on others.

There are four different types of app components:
## Activities
## Services
## Broadcast receivers
## Content providers

Each type serves a distinct purpose and has a distinct lifecycle that defines how the component is created and destroyed.
A unique aspect of the Android system design is that any app can start another app’s component. For example, if you want the user to capture a photo with the device camera, there's probably another app that does that and your app can use it instead of developing an activity to capture a photo yourself. You don't need to incorporate or even link to the code from the camera app. Instead, you can simply start the activity in the camera app that captures a photo. When complete, the photo is even returned to your app so you can use it. To the user, it seems as if the camera is actually a part of your app.

Resource Externalisation − strings and graphics
Notification − light, sound, icon, notification, dialog box and toast
