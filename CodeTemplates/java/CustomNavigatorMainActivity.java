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
 * Custom main activity template for navigation-based Android applications.
 * Features:
 * - Navigation component setup
 * - Drawer and Bottom Navigation integration
 * - Toolbar with navigation handling
 * - Overflow menu for additional options
 * 
 * Usage:
 * 1. Replace `${PACKAGE_NAME}` with your actual package name
 * 2. Ensure `nav_graph.xml` and required menu files exist
 * 3. Add dependencies for Navigation Component and Material Design
 */

 package ${PACKAGE_NAME};

 import android.os.Bundle;
 import android.view.Menu;
 import android.view.MenuItem;
 import androidx.appcompat.widget.Toolbar;
 import androidx.activity.EdgeToEdge;
 import androidx.appcompat.app.ActionBarDrawerToggle;
 import androidx.appcompat.app.AppCompatActivity;
 import androidx.drawerlayout.widget.DrawerLayout;
 import androidx.navigation.NavController;
 import androidx.navigation.fragment.NavHostFragment;
 import androidx.navigation.ui.NavigationUI;
 import com.google.android.material.navigation.NavigationView;
 
 public class CustomNavigatorMainActivity extends AppCompatActivity {
 
     private NavController navController;
     private ActionBarDrawerToggle drawerToggle;
     private DrawerLayout drawerLayout;
 
     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         EdgeToEdge.enable(this);
         setContentView(R.layout.custom_navigator_main_activity);
 
         // Setup custom toolbar
         Toolbar toolbar = findViewById(R.id.toolbar);
         setSupportActionBar(toolbar);
 
         // Initialize DrawerLayout
         drawerLayout = findViewById(R.id.drawer_layout);
         NavigationView navigationView = findViewById(R.id.side_nav_view);
 
         // Configure drawer toggle
         drawerToggle = new ActionBarDrawerToggle(
                 this, drawerLayout, toolbar,
                 R.string.navigation_drawer_open,
                 R.string.navigation_drawer_close
         );
         drawerLayout.addDrawerListener(drawerToggle);
         drawerToggle.syncState();
 
         // Setup Navigation Component
         NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                 .findFragmentById(R.id.nav_host_fragment);
         if (navHostFragment != null) {
             navController = navHostFragment.getNavController();
         } else {
             throw new IllegalStateException("NavHostFragment not found");
         }
 
         // Configure Navigation UI
         NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout);
     }
 
     @Override
     public boolean onCreateOptionsMenu(Menu menu) {
         getMenuInflater().inflate(R.menu.main_nav_menu, menu);
         return true;
     }
 
     @Override
     public boolean onOptionsItemSelected(MenuItem item) {
         int id = item.getItemId();
         if (id == R.id.action_settings) {
             // Handle settings navigation
             // Option 1: Navigate using NavController
             // NavigationUtil.navigateTo(activity, R.id.settingsFragment);
 
             // Option 2: Navigate using Intent
             // NavigationUtil.navigateTo(activity, SettingsActivity.class);
             return true;
         } else if (id == R.id.action_about) {
             // Handle the "About" action (e.g., show a dialog)
             return true;
         }
         return super.onOptionsItemSelected(item);
     }
 
     @Override
     public boolean onSupportNavigateUp() {
         return NavigationUI.navigateUp(navController, drawerLayout) || super.onSupportNavigateUp();
     }
 }
 