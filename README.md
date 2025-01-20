# Awsome Android Code Template

A collection of commonly used Android templates to accelerate development workflow. Each template is designed to be modular and easily integrated into your Android projects.

## 📁 Project Structure and Template Placement

```
com.template
├── data
│ ├── dao # CustomDAO.java
│ ├── database # CustomDatabase.java
│ └── repository # CustomRepository.java
├── model # CustomModel.java
├── ui
│ ├── activities
│ ├── fragments
│ ├── adapter # CustomAdapter.java
│ ├── holder # CustomViewHolder.java
│ ├── navigation # CustomBottomNavigation.java, CustomSideMenu.java
│ ├── viewmodel # CustomViewModel.java
│ └── components # CustomInfoButton.java
├── util # CustomUtility.java, CustomNavigationUtil.java
└── MainApplication.java
```

## 📁 Templates Overview

| Template | Description | Location |
|----------|-------------|----------|
| [CustomAdapter.java](CodeTemplates/CustomAdapter.java) | RecyclerView adapter template with ViewHolder pattern implementation. Features: click listener interface, data binding functionality, list management methods | `ui/adapter` |
| [CustomBottomNavigation.java](CodeTemplates/CustomBottomNavigation.java) | Material Design bottom navigation implementation with pre-configured listener and customizable menu items | `ui/navigation` |
| [CustomDAO.java](CodeTemplates/CustomDAO.java) | Room Database DAO interface template with CRUD operations, LiveData support, and ordered queries | `data/dao` |
| [CustomDatabase.java](CodeTemplates/CustomDatabase.java) | Room Database singleton template with instance management and migration handling | `data/database` |
| [CustomInfoButton.java](CodeTemplates/CustomInfoButton.java) | Custom ImageButton implementation with Material Design integration and click handling | `ui/components` |
| [CustomModel.java](CodeTemplates/CustomModel.java) | Room Entity model template with basic data structure and primary key configuration | `model` |
| [CustomNavigationUtil.java](CodeTemplates/CustomNavigationUtil.java) | Navigation utility class for activity navigation and intent management | `util` |
| [CustomRepository.java](CodeTemplates/CustomRepository.java) | Repository pattern implementation with ExecutorService and LiveData management | `data/repository` |
| [CustomSideMenu.java](CodeTemplates/CustomSideMenu.java) | Navigation drawer implementation with Material Design NavigationView | `ui/navigation` |
| [CustomUtility.java](CodeTemplates/CustomUtility.java) | General utility class template with static helper methods | `util` |
| [CustomViewHolder.java](CodeTemplates/CustomViewHolder.java) | RecyclerView ViewHolder template with view and data binding methods | `ui/holder` |
| [CustomViewModel.java](CodeTemplates/CustomViewModel.java) | AndroidViewModel implementation with repository integration and CRUD operations | `ui/viewmodel` |

## Template Configurations

| Template Name | File Name | Extension | Source File |
|--------------|-----------|-----------|-------------|
| Custom Android Adapter | Custom${NAME}Adapter | java | [CustomAdapter.java](CodeTemplates/CustomAdapter.java) |
| Custom Bottom Navigation | Custom${NAME}BottomNavigation | java | [CustomBottomNavigation.java](CodeTemplates/CustomBottomNavigation.java) |
| Custom Room DAO | Custom${NAME}DAO | java | [CustomDAO.java](CodeTemplates/CustomDAO.java) |
| Custom Room Database | Custom${NAME}Database | java | [CustomDatabase.java](CodeTemplates/CustomDatabase.java) |
| Custom Info Button | Custom${NAME}InfoButton | java | [CustomInfoButton.java](CodeTemplates/CustomInfoButton.java) |
| Custom Data Model | Custom${NAME}Model | java | [CustomModel.java](CodeTemplates/CustomModel.java) |
| Custom Navigation Utility | Custom${NAME}NavigationUtil | java | [CustomNavigationUtil.java](CodeTemplates/CustomNavigationUtil.java) |
| Custom Repository | Custom${NAME}Repository | java | [CustomRepository.java](CodeTemplates/CustomRepository.java) |
| Custom Side Menu | Custom${NAME}SideMenu | java | [CustomSideMenu.java](CodeTemplates/CustomSideMenu.java) |
| Custom Utility | Custom${NAME}Utility | java | [CustomUtility.java](CodeTemplates/CustomUtility.java) |
| Custom ViewHolder | Custom${NAME}ViewHolder | java | [CustomViewHolder.java](CodeTemplates/CustomViewHolder.java) |
| Custom ViewModel | Custom${NAME}ViewModel | java | [CustomViewModel.java](CodeTemplates/CustomViewModel.java) |

## 🚀 How to Use

### Setting Up Templates in Android Studio

1. Open Android Studio
2. Go to `File > Settings` (Windows/Linux) or `Android Studio > Preferences` (macOS)
3. Navigate to `Editor > File and Code Templates`
4. Click the `+` icon to create a new template
5. For each template below, create a new entry with the specified Name and File Name

### Using the Templates

1. Right-click on your desired package in the Project view
2. Select `New > Other > [Template Name]`
3. Enter the name for your class (will replace ${NAME} in the file name)
4. Click `OK`

### Template Variables

When using the templates, you'll need to replace these common variables:
- `${PACKAGE_NAME}`: Your app's package name
- `${NAME}`: The name you enter when creating a new file
- Other template-specific variables will be highlighted when you use the template

### Tips

- Templates can be modified after creation in the File and Code Templates settings
- You can add your own variables using the `#set($VARIABLE_NAME = "value")` syntax
- Use `$NAME` to reference the input name in your template
- Use `${PACKAGE_NAME}` to reference the current package

## 📚 Dependencies

Add these dependencies to your app's `build.gradle` file as needed:

```gradle
dependencies {
    // AndroidX
    implementation 'androidx.appcompat:appcompat:x.x.x'
    implementation 'com.google.android.material:material:x.x.x'
    
    // Room
    implementation 'androidx.room:room-runtime:x.x.x'
    annotationProcessor 'androidx.room:room-compiler:x.x.x'

    // LiveData & ViewModel
    implementation 'androidx.lifecycle:lifecycle-viewmodel:x.x.x'
    implementation 'androidx.lifecycle:lifecycle-livedata:x.x.x'
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
