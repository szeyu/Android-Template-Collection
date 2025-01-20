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
 * Room Database singleton template for Android applications.
 * Features:
 * - Thread-safe singleton implementation
 * - Database instance management
 * - Migration handling
 * - Fallback to destructive migration
 * 
 * Usage:
 * 1. Define your database entities
 * 2. Add your DAOs
 * 3. Access using getInstance() method
 */

package ${PACKAGE_NAME};

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

// Replace ${PACKAGE_NAME} with your package name
// Replace ${DATABASE_NAME} with your database class name
// Replace ${MODEL_NAME} with your data model class name
// Replace ${DAO_NAME} with your DAO interface name

@Database(entities = {${MODEL_NAME}.class}, version = 1, exportSchema = false)
public abstract class ${DATABASE_NAME} extends RoomDatabase {

    private static volatile ${DATABASE_NAME} INSTANCE;

    public abstract ${DAO_NAME} ${DAO_INSTANCE_NAME}();

    public static ${DATABASE_NAME} getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (${DATABASE_NAME}.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            ${DATABASE_NAME}.class, "${DATABASE_FILE_NAME}")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}