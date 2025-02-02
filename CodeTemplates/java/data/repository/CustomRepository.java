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
 * Repository pattern implementation for data operations.
 * Features:
 * - Single source of truth principle
 * - Async operation handling
 * - LiveData integration
 * - Clean architecture compliance
 * 
 * Usage:
 * 1. Initialize with your DAO
 * 2. Implement data operations
 * 3. Use with ViewModel
 */

package ${PACKAGE_NAME};

import android.app.Application;
import androidx.lifecycle.LiveData;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Replace ${PACKAGE_NAME} with your package name
// Replace ${REPOSITORY_NAME} with your Repository class name
// Replace ${DAO_NAME} with your DAO interface name
// Replace ${MODEL_NAME} with your data model class name
// Replace ${DATABASE_NAME} with your Room database class name

public class ${REPOSITORY_NAME} {

    private final ${DAO_NAME} dao;
    private final LiveData<List<${MODEL_NAME}>> allItems;
    private final ExecutorService executorService;

    public ${REPOSITORY_NAME}(Application application) {
        ${DATABASE_NAME} db = ${DATABASE_NAME}.getDatabase(application);
        dao = db.${DAO_INSTANCE_NAME}();
        allItems = dao.getAllItems();
        executorService = Executors.newFixedThreadPool(2);
    }

    public LiveData<List<${MODEL_NAME}>> getAllItems() {
        return allItems;
    }

    public LiveData<List<${MODEL_NAME}>> getItemById(int itemId) {
        return dao.getItemById(itemId);
    }

    public void insert(${MODEL_NAME} item) {
        executorService.execute(() -> dao.insert(item));
    }

    public void update(${MODEL_NAME} item) {
        executorService.execute(() -> dao.update(item));
    }

    public void delete(${MODEL_NAME} item) {
        executorService.execute(() -> dao.delete(item));
    }
}