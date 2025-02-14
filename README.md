<div align="center">

# 📱 Awesome Android Code Template

[![Android](https://img.shields.io/badge/Platform-Android-green.svg)](https://developer.android.com)
[![Java](https://img.shields.io/badge/Language-Java-orange.svg)](https://www.java.com)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](CONTRIBUTING.md)
[![ko-fi](https://ko-fi.com/img/githubbutton_sm.svg)](https://ko-fi.com/S6S419B72M)

<img src="https://raw.githubusercontent.com/github/explore/80688e429a7d4ef2fca1e82350fe8e3517d3494d/topics/android/android.png" width="100" height="100" alt="Android Logo"/>

🚀 A collection of powerful, ready-to-use Android templates to supercharge your development workflow.  
⚡️ Modular, customizable, and easily integrated into any Android project.

📦 **Time-Saving Templates** • 🎨 **Clean Architecture** • 🛠 **Best Practices**

[Explore Templates](#-java-templates-overview) • 
[Quick Start](#getting-started) •
[Documentation](#-project-structure) • 
[Contribute](#-contributing) • 
[Support on Ko-fi](https://ko-fi.com/S6S419B72M)

<details>
<summary>🌟 Key Features</summary>

- 📐 Modern Architecture Components
- 🎯 MVVM Design Pattern
- 🔄 Repository Pattern
- 🗃️ Room Database Templates
- 🎨 Material Design Components
- 🔌 Easy Integration

</details>

---

</div>

## 📁 Project Structure

```
C:.
│   LICENSE                        # License file for the project
│   README.md                      # Project documentation
│
└───CodeTemplates                  # Main source directory
    ├───java                       # Java source files
    │   │   CustomNavigatorMainActivity.java  # Main activity for the app
    │   │
    │   ├───data                   # Data layer (DAO, Database, Repository)
    │   │   ├───dao
    │   │   │       CustomDAO.java           # DAO for data operations
    │   │   │
    │   │   ├───database
    │   │   │       CustomDatabase.java      # Database setup and management
    │   │   │
    │   │   └───repository
    │   │           CustomRepository.java    # Repository for data operations
    │   │
    │   ├───model                  # Data models for the application
    │   │       CustomModel.java             # Example data model class
    │   │
    │   ├───ui                     # UI components of the app
    │   │   ├───adapter
    │   │   │       CustomAdapter.java       # RecyclerView adapter implementation
    │   │   │
    │   │   ├───components
    │   │   │       CustomFormControls.java    # A collection of form control component logic
    │   │   │       CustomInfoButton.java    # Custom button component
    │   │   │
    │   │   ├───fragment
    │   │   │       CustomListFragment.java  # Fragment displaying a list of items
    │   │   │       CustomEditModelFragment.java  # Fragment to edit a specific item by ID
    │   │   │
    │   │   ├───navigation
    │   │   │       BottomNavigation.java    # Bottom navigation bar setup
    │   │   │       SideMenu.java            # Side navigation menu setup
    │   │   │
    │   │   ├───viewHolder
    │   │   │       CustomViewHolder.java    # ViewHolder for RecyclerView
    │   │   │
    │   │   └───viewModel
    │   │           CustomEntityViewModel.java # ViewModel managing UI-related data
    │   │
    │   └───util                     # Utility classes
    │           AppStorageUtil.java          # Utilities for app storage
    │           DiskCacheUtil.java           # Disk cache management
    │           HybridCacheUtil.java         # Hybrid cache management
    │           MemoryCacheUtil.java         # Memory cache utilities
    │           NavigationUtil.java          # Utilities for navigation handling
    │           PreferenceManagerUtil.java   # Utilities for managing preferences
    │           SharedPrefsUtil.java         # Shared preferences utilities
    │
    └───res                           # Resources like layouts, styles, and colors
        ├───layout
        │       custom_bottom_nav_layout.xml   # Layout for bottom navigation
        │       custom_button_layout.xml       # Layout for custom buttons
        │       custom_card_layout.xml         # Layout for card views
        │       custom_list_recycler_view_layout.xml # Layout for RecyclerView lists
        │       custom_login_layout.xml        # Layout for login screen
        │       custom_navigator_main_activity.xml  # Layout for the main activity
        │       custom_side_nav_layout.xml     # Layout for side navigation menu
        │       custom_toolbar_layout.xml      # Layout for the toolbar
        │
        ├───menu
        │       custom_bottom_nav_menu.xml     # Menu resource for bottom navigation items
        │       custom_main_nav_menu.xml       # Menu resource for the main navigation menu
        │       custom_side_nav_menu.xml       # Menu resource for side navigation
        │
        └───values
                custom_colors.xml            # Color resources
                custom_dimes.xml             # Dimens (sizes and spacing)
                custom_styles.xml            # Styles and themes
```

## 📂 Java Templates Overview

### Activity
| Template                                | Description                                                                                                                                                                                   | Location   |
|-----------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------|
| **CustomNavigatorMainActivity.java**    | Custom main activity template for navigation-based Android applications. Features: Navigation Component setup, Drawer and Bottom Navigation integration, Toolbar, and overflow menu.        | `java`     |

### Data

|| Template            | Description                                                                                                             | Location          |
|-|---------------------|-------------------------------------------------------------------------------------------------------------------------|-------------------|
|DAO| **CustomDAO.java**  | Room Database DAO interface template with CRUD operations, LiveData support, and ordered queries.                        | `java/data/dao`   |
|Database| **CustomDatabase.java**   | Room Database singleton template with instance management and migration handling.                       | `java/data/database` |
|Repository| **CustomRepository.java**       | Repository pattern implementation with ExecutorService and LiveData management.                                 | `java/data/repository` |

### Model
| Template                        | Description                                                                                                       | Location       |
|---------------------------------|-------------------------------------------------------------------------------------------------------------------|----------------|
| **CustomModel.java**            | Room Entity model template with a basic data structure and primary key configuration.                              | `java/model`   |

### UI

|| Template                         | Description                                                                                                              | Location         |
|-|----------------------------------|--------------------------------------------------------------------------------------------------------------------------|------------------|
|Adapter| **CustomAdapter.java**           | RecyclerView adapter template implementing the ViewHolder pattern, click listener interface, data binding, and list management methods.   | `java/ui/adapter` |
|Components| **CustomFormControls.java**        | Implemented with varieties of form control component code including, radio, checkbox, switch, autocomplete text view, spinner dropdown and button                                  | `java/ui/components` |
|| **CustomInfoButton.java**        | Custom ImageButton implementation with Material Design integration and click handling.                                  | `java/ui/components` |
|Fragment| **CustomListFragment.java**         | Fragment template that displays a list of items using RecyclerView, ViewModel, and NavigationUtil. Supports different LayoutManagers and item click navigation. | `java/ui/fragment` |
|| **CustomEditModelFragment.java**    | Fragment template for editing a specific model entity by ID. Integrates ViewModel for data binding and form validation, using NavigationUtil for navigation.           | `java/ui/fragment` |
|Navigation| **BottomNavigation.java**         | Material Design bottom navigation implementation with pre-configured navigation listener. Supports both fragment-based and intent-based navigation.      | `java/ui/navigation` |
|| **SideMenu.java**                | Navigation drawer implementation using Material Design NavigationView. Provides menu item handling using NavigationUtil for seamless navigation.         | `java/ui/navigation` |
|ViewHolder| **CustomViewHolder.java**         | RecyclerView ViewHolder template with view binding and data binding methods for efficient view recycling.                     | `java/ui/viewHolder` |
|ViewModel| **CustomEntityViewModel.java**    | AndroidViewModel implementation with repository integration and CRUD operations for lifecycle-aware data handling.                | `java/ui/viewModel` |

### Util
| Template                          | Description                                                                                                  | Location     |
|-----------------------------------|--------------------------------------------------------------------------------------------------------------|--------------|
| **AppStorageUtil.java**           | Utilities for app storage management.                                                                       | `java/util`  |
| **DiskCacheUtil.java**            | Utility class for managing disk caching.                                                                    | `java/util`  |
| **HybridCacheUtil.java**          | Utility that combines disk and memory caching strategies.                                                   | `java/util`  |
| **MemoryCacheUtil.java**          | In-memory cache utilities for quick data retrieval.                                                         | `java/util`  |
| **NavigationUtil.java**           | Utility class for handling navigation throughout the app. Supports fragment-based (NavController) and intent-based navigation methods. | `java/util`  |
| **PreferenceManagerUtil.java**    | Utilities for managing user preferences.                                                                    | `java/util`  |
| **SharedPrefsUtil.java**          | Helper class for working with SharedPreferences.                                                            | `java/util`  |

## 📂 XML Templates Overview

### Layouts
| Template                                | Description                                                                                                                                     | Location      |
|-----------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------|---------------|
| **custom_login_layout.xml**             | Material Design login screen with email and password fields.                                                                                    | `res/layout`  |
| **custom_bottom_nav_layout.xml**        | Layout for bottom navigation integrated with a fragment container.                                                                              | `res/layout`  |
| **custom_side_nav_layout.xml**          | Layout for a navigation drawer with header and menu items.                                                                                      | `res/layout`  |
| **custom_card_layout.xml**              | Material card layout with image, title, and subtitle.                                                                                           | `res/layout`  |
| **custom_button_layout.xml**            | Layout showcasing various Material button styles.                                                                                              | `res/layout`  |
| **custom_toolbar_layout.xml**           | Custom toolbar layout with title and menu support.                                                                                             | `res/layout`  |
| **custom_navigator_main_activity.xml**  | Layout for CustomNavigatorMainActivity, including AppBarLayout with Toolbar, FragmentContainerView, BottomNavigationView, and NavigationView for side menu. | `res/layout`  |
| **custom_form_controls_layout.xml**        | Layout for which consists of variety of component for form control.                                                                          | `res/layout`  |
| **custom_list_recycler_view_layout.xml**        | Custom RecyclerView layout with standard spacing and consistent design.                                                                           | `res/layout`  |

### Menus
| Template                             | Description                                                             | Location     |
|--------------------------------------|-------------------------------------------------------------------------|--------------|
| **custom_bottom_nav_menu.xml**       | Menu resource for bottom navigation items.                              | `res/menu`   |
| **custom_main_nav_menu.xml**         | Menu resource for the overflow menu in CustomNavigatorMainActivity.       | `res/menu`   |
| **custom_side_nav_menu.xml**         | Menu resource for navigation drawer items.                              | `res/menu`   |

### Values
| Template                             | Description                                      | Location     |
|--------------------------------------|--------------------------------------------------|--------------|
| **custom_colors.xml**                | Material Design color system resources.          | `res/values` |
| **custom_dimes.xml**                 | Standard dimensions and spacing definitions.     | `res/values` |
| **custom_styles.xml**                | Material component styles and themes.            | `res/values` |


## Getting Started
There are 2 method to create the templates in Android Studio
1. **Download and Extract the Template Package**
2. **Manually Add Templates One by One**

---

### Method 1: Download and Extract

1. **Download the Template Package:**
   - Visit the [releases page](https://github.com/szeyu/Awsome-Android-Code-Template/releases/tag/v1.0).
   - Download either `fileTemplates.zip` or `fileTemplates.tar`.

2. **Extract the Package:**
   - Extract the downloaded archive to a location on your computer.
  
3. **Import Settings into Android Studio:**
   - Open **Android Studio**.
   - Navigate to **File > Manage IDE Settings > Import Settings**.
   - When prompted, copy the path shown in the dialog.
   - Open your file explorer, navigate to the copied path, and locate the `fileTemplates` folder.
   - Copy all files from the `fileTemplates` folder.
   - Paste the copied files into the folder specified by the Import Settings dialog.
   - Restart Android Studio if necessary to see the new templates.

---

### Method 2: Add Templates Manually

1. **Open Template Settings:**
   - Open **Android Studio**.
   - Navigate to:
     - **File > Settings** (on Windows/Linux) or
     - **Android Studio > Preferences** (on macOS).

2. **Access File and Code Templates:**
   - In the Settings/Preferences window, go to **Editor > File and Code Templates**.

3. **Manually Add Each Template:**
   - Click the **+** icon to create a new template.
   - For each template, enter the provided **Name** and **File Name**.
   - Copy the content from the template files (from the repository or your downloaded package) into the corresponding editor.
   - Click **Apply** and **OK** to save your changes.

---

## 🚀 How to Use

1. In the Project view, right-click on your desired package.
2. Select **New > Other > [Template Name]**.
3. Enter the name for your class (this replaces the `${NAME}` variable in the template).
4. Click **OK**.

### Template Variables

Replace the following common variables when using these templates:
- `${PACKAGE_NAME}`: Your app's package name.
- `${NAME}`: The name you input when creating a new file.
- Other template-specific variables will be highlighted during template usage.

*Tips:*
- Templates can be modified post-creation in the File and Code Templates settings.
- Custom variables can be added using the `#set($VARIABLE_NAME = "value")` syntax.
- Use `$NAME` to reference the input name in your template.
- Use `${PACKAGE_NAME}` to reference the current package.

## 📚 Dependencies

Add the following dependencies to your app's `build.gradle` file as needed:

```gradle
dependencies {
    // AndroidX Libraries
    implementation 'androidx.appcompat:appcompat:x.x.x'
    implementation 'com.google.android.material:material:x.x.x'
    
    // Room Database
    implementation 'androidx.room:room-runtime:x.x.x'
    annotationProcessor 'androidx.room:room-compiler:x.x.x'

    // LiveData & ViewModel
    implementation 'androidx.lifecycle:lifecycle-viewmodel:x.x.x'
    implementation 'androidx.lifecycle:lifecycle-livedata:x.x.x'
    
    // Navigation Component
    implementation 'androidx.navigation:navigation-fragment:x.x.x'
    implementation 'androidx.navigation:navigation-ui:x.x.x'
}
```

## 🤝 Contributing

Thank you for considering contributing to Awesome-Android-Code-Template! 

### How to Contribute

1. Fork the repository (https://github.com/szeyu/Awesome-Android-Code-Template/fork)
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

### Pull Request Process

1. Update the README.md with details of changes if needed
2. Update the template documentation if you've modified any templates
3. Your PR will be reviewed and merged upon approval

### Code Style

- Follow existing template structure
- Maintain consistent naming conventions
- Include comments for complex logic
- Keep templates modular and reusable

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

---

<div align="center">

### Created by Sim Sze Yu

Bachelor of Computer Science (Artificial Intelligence)  
Universiti Malaya  
WIA2007 Mobile Application Development Course

[![ko-fi](https://ko-fi.com/img/githubbutton_sm.svg)](https://ko-fi.com/S6S419B72M)

⭐️ **Don't forget to star this repository if you find it helpful!** ⭐️

[🔱 Fork](https://github.com/szeyu/Awesome-Android-Code-Template/fork) &nbsp;&nbsp;•&nbsp;&nbsp; 
[🐛 Report Bug](https://github.com/szeyu/Awesome-Android-Code-Template/issues) &nbsp;&nbsp;•&nbsp;&nbsp; 
[✨ Request Feature](https://github.com/szeyu/Awesome-Android-Code-Template/issues)

</div>




