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
 * Room Database DAO (Data Access Object) interface template.
 * Features:
 * - Basic CRUD operations
 * - LiveData support for reactive programming
 * - Customizable query methods
 * - Asynchronous database operations
 * 
 * Usage:
 * 1. Create your entity class
 * 2. Extend this DAO interface
 * 3. Add custom queries as needed
 */

package ${PACKAGE_NAME};

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

// Replace ${PACKAGE_NAME} with your package name
// Replace ${DAO_NAME} with your DAO interface name
// Replace ${MODEL_NAME} with your data model class name
// Replace ${TABLE_NAME} with your database table name

@Dao
public interface ${DAO_NAME} {

    @Insert
    void insert(${MODEL_NAME} item);

    @Update
    void update(${MODEL_NAME} item);

    @Delete
    void delete(${MODEL_NAME} item);

    @Query("SELECT * FROM ${TABLE_NAME}")
    LiveData<List<${MODEL_NAME}>> getAllItems();

    @Query("SELECT * FROM ${TABLE_NAME} WHERE id = :itemId LIMIT 1")
    LiveData<${MODEL_NAME}> getItemById(int itemId);
}