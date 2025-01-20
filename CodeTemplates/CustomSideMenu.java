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