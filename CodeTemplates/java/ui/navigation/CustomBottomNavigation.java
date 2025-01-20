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
 * Material Design bottom navigation implementation.
 * Features:
 * - Pre-configured navigation listener
 * - Easy integration with fragments
 * - Customizable menu items
 * - Material Design guidelines compliant
 * 
 * Usage:
 * 1. Include bottom_nav_menu.xml in your resources
 * 2. Initialize in your activity
 * 3. Set up navigation listeners
 */

package ${PACKAGE_NAME};

import android.app.Activity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

// Replace ${PACKAGE_NAME} with your actual package name

public class BottomNavigation {

    private final BottomNavigationView bottomNavigationView;

    public BottomNavigation(Activity activity) {
        this.bottomNavigationView = activity.findViewById(R.id.bottom_navigation);
        setupBottomNav();
    }

    private void setupBottomNav() {
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            int id = item.getItemId();

            if (id == R.id.nav_home) {
                // Handle navigation to Home
                return true;
            } else if (id == R.id.nav_dashboard) {
                // Handle navigation to Dashboard
                return true;
            } else if (id == R.id.nav_notifications) {
                // Handle navigation to Notifications
                return true;
            } // Add more conditions for other menu items

            return false;
        });
    }
}