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
 * - Menu item handling with NavigationUtil
 * - Supports both fragment-based and intent-based navigation
 * 
 * Usage:
 * 1. Include the side menu in your activity layout
 * 2. Setup menu items in res/menu
 * 3. Uncomment either fragment-based or intent-based navigation
 */

 package ${PACKAGE_NAME}.ui.navigation;

 import android.app.Activity;
 import androidx.drawerlayout.widget.DrawerLayout;
 import com.google.android.material.navigation.NavigationView;
 import ${PACKAGE_NAME}.R;
 
 public class SideMenu {
 
     private final DrawerLayout drawerLayout;
     private final NavigationView navigationView;
     private final Activity activity;
 
     public SideMenu(Activity activity) {
         this.activity = activity;
         this.drawerLayout = activity.findViewById(R.id.drawer_layout);
         this.navigationView = activity.findViewById(R.id.side_nav_view);
         setupDrawerContent();
     }
 
     private void setupDrawerContent() {
         navigationView.setNavigationItemSelectedListener(menuItem -> {
             int id = menuItem.getItemId();
 
             if (id == R.id.nav_home) {
                 // Option 1: Navigate using NavController (uncomment this)
                 // NavigationUtil.navigateTo(activity, R.id.peopleListFragment);
 
                 // Option 2: Navigate using Intent (uncomment this)
                 // NavigationUtil.navigateTo(activity, HomeActivity.class);
             } else if (id == R.id.nav_settings) {
                 // Option 1: Navigate using NavController
                 // NavigationUtil.navigateTo(activity, R.id.settingsFragment);
 
                 // Option 2: Navigate using Intent
                 // NavigationUtil.navigateTo(activity, SettingsActivity.class);
             }
 
             drawerLayout.closeDrawers();
             return true;
         });
     }
 }
 