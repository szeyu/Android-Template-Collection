# Android Template Collection

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
│ └── components # CustomInfoButton.java
├── util # CustomUtility.java, CustomNavigationUtil.java
└── MainApplication.java
```

## 📁 Templates Overview

### CustomAdapter.java
A reusable RecyclerView adapter template with ViewHolder pattern implementation. Includes:
- Click listener interface
- Data binding functionality
- List management methods

### CustomBottomNavigation.java
Bottom navigation implementation using Material Design components:
- Easy to integrate bottom navigation bar
- Pre-configured navigation listener
- Customizable menu items

### CustomDAO.java
Room Database DAO (Data Access Object) interface template:
- Basic CRUD operations
- LiveData support
- Ordered query example

### CustomDatabase.java
Room Database singleton template:
- Database instance management
- Builder pattern implementation
- Migration handling

### CustomInfoButton.java
Custom ImageButton implementation:
- Material Design integration
- Click handling
- Customizable appearance

### CustomModel.java
Room Entity model template:
- Basic data structure
- Primary key configuration
- Common field examples

### CustomNavigationUtil.java
Navigation utility class:
- Activity navigation helpers
- Intent management
- Static utility methods

### CustomRepository.java
Repository pattern implementation:
- AsyncTask handling with ExecutorService
- LiveData management
- DAO integration

### CustomSideMenu.java
Navigation drawer implementation:
- Material Design NavigationView
- Drawer layout configuration
- Menu item handling

### CustomUtility.java
General utility class template:
- Static helper methods
- Utility function structure

### CustomViewHolder.java
RecyclerView ViewHolder template:
- View binding
- Data binding methods
- Component initialization

### CustomViewModel.java
AndroidViewModel implementation:
- Repository integration
- LiveData management
- CRUD operation handling

## 🚀 How to Use

### Setting Up Templates in Android Studio

1. Open Android Studio
2. Go to `File > Settings` (Windows/Linux) or `Android Studio > Preferences` (macOS)
3. Navigate to `Editor > File and Code Templates`
4. Click the `+` icon to create a new template
5. For each template below, create a new entry with the specified Name and File Name

### Template Configurations

#### Adapter Template
- **Name:** Custom Android Adapter
- **File name:** Custom${NAME}Adapter
- **Extension:** java
- Copy content from `CustomAdapter.java`

#### Bottom Navigation Template
- **Name:** Custom Bottom Navigation
- **File name:** Custom${NAME}BottomNavigation
- **Extension:** java
- Copy content from `CustomBottomNavigation.java`

#### DAO Template
- **Name:** Custom Room DAO
- **File name:** Custom${NAME}DAO
- **Extension:** java
- Copy content from `CustomDAO.java`

#### Database Template
- **Name:** Custom Room Database
- **File name:** Custom${NAME}Database
- **Extension:** java
- Copy content from `CustomDatabase.java`

#### Info Button Template
- **Name:** Custom Info Button
- **File name:** Custom${NAME}InfoButton
- **Extension:** java
- Copy content from `CustomInfoButton.java`

#### Model Template
- **Name:** Custom Data Model
- **File name:** Custom${NAME}Model
- **Extension:** java
- Copy content from `CustomModel.java`

#### Navigation Utility Template
- **Name:** Custom Navigation Utility
- **File name:** Custom${NAME}NavigationUtil
- **Extension:** java
- Copy content from `CustomNavigationUtil.java`

#### Repository Template
- **Name:** Custom Repository
- **File name:** Custom${NAME}Repository
- **Extension:** java
- Copy content from `CustomRepository.java`

#### Side Menu Template
- **Name:** Custom Side Menu
- **File name:** Custom${NAME}SideMenu
- **Extension:** java
- Copy content from `CustomSideMenu.java`

#### Utility Template
- **Name:** Custom Utility
- **File name:** Custom${NAME}Utility
- **Extension:** java
- Copy content from `CustomUtility.java`

#### ViewHolder Template
- **Name:** Custom ViewHolder
- **File name:** Custom${NAME}ViewHolder
- **Extension:** java
- Copy content from `CustomViewHolder.java`

#### ViewModel Template
- **Name:** Custom ViewModel
- **File name:** Custom${NAME}ViewModel
- **Extension:** java
- Copy content from `CustomViewModel.java`

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
