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
 * - Easy integration with fragments using NavigationUtil
 * - Customizable menu items
 * - Supports both fragment-based and intent-based navigation
 * 
 * Usage:
 * 1. Include bottom_nav_menu.xml in your resources
 * 2. Initialize in your activity
 * 3. Uncomment either fragment-based or intent-based navigation
 */

 package ${PACKAGE_NAME}.ui.navigation;

 import android.app.Activity;
 import com.google.android.material.bottomnavigation.BottomNavigationView;
 import ${PACKAGE_NAME}.R;
 
 public class BottomNavigation {
 
     private final BottomNavigationView bottomNavigationView;
     private final Activity activity;
 
     public BottomNavigation(Activity activity) {
         this.activity = activity;
         this.bottomNavigationView = activity.findViewById(R.id.bottom_navigation);
         setupBottomNav();
     }
 
     private void setupBottomNav() {
         bottomNavigationView.setOnItemSelectedListener(item -> {
             int id = item.getItemId();
 
             if (id == R.id.nav_home) {
                 // Option 1: Navigate using NavController
                 // NavigationUtil.navigateTo(activity, R.id.homeFragment);
 
                 // Option 2: Navigate using Intent
                 // NavigationUtil.navigateTo(activity, HomeActivity.class);
                 return true;
             } else if (id == R.id.nav_add) {
                 // Option 1: Navigate using NavController
                 // NavigationUtil.navigateTo(activity, R.id.addFragment);
 
                 // Option 2: Navigate using Intent
                 // NavigationUtil.navigateTo(activity, AddActivity.class);
                 return true;
             }
 
             return false;
         });
     }
 }
 