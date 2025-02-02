/**
 * Created by Sim Sze Yu
 * GitHub: https://github.com/szeyu/Awsome-Android-Code-Template
 * 
 * This template is part of the WIA2007 Mobile Application Development Course
 * Bachelor of Computer Science (Artificial Intelligence)
 * Universiti Malaya
 * 
 * Licensed under MIT License
 * Copyright (c) 2025 Sim Sze Yu
 * 
 * Utility class for handling navigation throughout the app.
 * Features:
 * - Static navigation methods
 * - Intent management
 * - Activity transition handling
 * - Common navigation patterns
 * 
 * Usage:
 * 1. Import this utility class
 * 2. Call static methods for navigation
 * 3. Uncomment the navigation option (fragment-based or intent-based)
 */

 package ${PACKAGE_NAME}.ui.navigation;

 import android.app.Activity;
 import android.content.Intent;
 import android.util.Log;
 
 import androidx.fragment.app.Fragment;
 import androidx.navigation.NavController;
 import androidx.navigation.Navigation;
 
 import ${PACKAGE_NAME}.R;
 
 public class NavigationUtil {
 
     private NavigationUtil() {
         // Private constructor to prevent instantiation
     }
 
     // Navigate using NavController (for fragments) without arguments
    public static void navigateTo(Fragment fragment, int actionId) {
        try {
            NavController navController = Navigation.findNavController(fragment.requireView());
            navController.navigate(actionId);
        } catch (Exception e) {
            Log.e("NavigationUtil", "NavController not found, check setup.");
        }
    }

    // Navigate using NavController (for activities)
    public static void navigateTo(Activity activity, int actionId) {
        try {
            NavController navController = Navigation.findNavController(activity, R.id.nav_host_fragment);
            navController.navigate(actionId);
        } catch (Exception e) {
            Log.e("NavigationUtil", "NavController not found in Activity, check setup.");
        }
    }

    // Navigate using Intent (for activities)
    public static void navigateTo(Activity activity, Class<?> destination) {
        Intent intent = new Intent(activity, destination);
        activity.startActivity(intent);
    }

    // Navigate back (pop the back stack) using the NavController.
    public static void navigateBack(Fragment fragment) {
        try {
            NavController navController = Navigation.findNavController(fragment.requireView());
            navController.popBackStack();
        } catch (Exception e) {
            Log.e("NavigationUtil", "Failed to navigate back", e);
        }
    }
 }
 