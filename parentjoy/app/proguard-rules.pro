# ProGuard rules for ParentJoy

# Keep classes used by Room (database)
-keep class androidx.room.** { *; }
-dontwarn androidx.room.**

# Keep classes used by Lifecycle (ViewModel & LiveData)
-keep class androidx.lifecycle.** { *; }
-dontwarn androidx.lifecycle.**

# Keep Kotlin metadata
-keep class kotlin.Metadata { *; }

# Do not obfuscate model classes
-keep class com.parentjoy.model.** { *; }
