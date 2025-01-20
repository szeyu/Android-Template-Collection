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