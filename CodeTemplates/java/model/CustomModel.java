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
 * Room Entity model template for data structure.
 * Features:
 * - Room Entity annotations
 * - Primary key configuration
 * - Basic data structure setup
 * - Common field implementations
 * 
 * Usage:
 * 1. Define your entity fields
 * 2. Add necessary Room annotations
 * 3. Implement getters and setters
 */

package ${PACKAGE_NAME};

import androidx.room.Entity;
import androidx.room.PrimaryKey;

// Replace ${PACKAGE_NAME} with your package name
// Replace ${MODEL_NAME} with your data model class name

@Entity(tableName = "${TABLE_NAME}")
public class ${MODEL_NAME} {

    @PrimaryKey(autoGenerate = true)
    private int id;

    // Add your fields here
    private String title;
    private String content;
    private String imagePath;
    private String audioPath;
    private long timestamp;

    // Empty constructor
    public ${MODEL_NAME}() {
    }

    // Getters and Setters
    // For each field, create public getter and setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    // Repeat for other fields
}