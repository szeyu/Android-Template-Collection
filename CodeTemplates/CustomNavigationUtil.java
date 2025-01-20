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