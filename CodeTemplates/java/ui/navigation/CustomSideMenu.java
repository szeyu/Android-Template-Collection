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
 * Navigation drawer implementation using Material Design.
 * Features:
 * - Material Design NavigationView
 * - Drawer layout configuration
 * - Menu item handling
 * - Header view support
 * 
 * Usage:
 * 1. Include in activity layout
 * 2. Setup menu items
 * 3. Implement navigation callbacks
 */

package ${PACKAGE_NAME};

import android.app.Activity;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

// Replace ${PACKAGE_NAME} with your actual package name

public class SideMenu {

    private final DrawerLayout drawerLayout;
    private final NavigationView navigationView;

    public SideMenu(Activity activity) {
        this.drawerLayout = activity.findViewById(R.id.drawer_layout);
        this.navigationView = activity.findViewById(R.id.nav_view);
        setupDrawerContent();
    }

    private void setupDrawerContent() {
        navigationView.setNavigationItemSelectedListener(menuItem -> {
            int id = menuItem.getItemId();

            if (id == R.id.nav_home) {
                // Handle navigation to Home
            } else if (id == R.id.nav_settings) {
                // Handle navigation to Settings
            } // Add more conditions for other menu items

            drawerLayout.closeDrawers();
            return true;
        });
    }
}