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
 * 1. Import utility class
 * 2. Call static methods for navigation
 * 3. Customize transitions as needed
 */

package ${PACKAGE_NAME};

import android.content.Context;
import android.content.Intent;

// Replace ${PACKAGE_NAME} with your package name
// Replace ${NAVIGATION_UTIL_NAME} with your utility class name

public class ${NAVIGATION_UTIL_NAME} {

    private ${NAVIGATION_UTIL_NAME}() {
        // Private constructor to prevent instantiation
    }

    /**
     * Navigate to a new activity.
     *
     * @param context     The current context
     * @param destination The class of the destination activity
     */
    public static void navigateTo(Context context, Class<?> destination) {
        Intent intent = new Intent(context, destination);
        context.startActivity(intent);
    }

    // Add other navigation methods if needed
}