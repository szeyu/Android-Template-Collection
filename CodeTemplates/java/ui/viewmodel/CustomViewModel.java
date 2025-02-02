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
 * AndroidViewModel implementation for MVVM architecture.
 * Features:
 * - LiveData management
 * - Repository integration
 * - Configuration change handling
 * - Clean architecture compliance
 * 
 * Usage:
 * 1. Initialize with repository
 * 2. Implement data operations
 * 3. Observe LiveData in UI
 */

package ${PACKAGE_NAME};

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import java.util.List;

// Replace ${PACKAGE_NAME} with your package name
// Replace ${VIEW_MODEL_NAME} with your ViewModel class name
// Replace ${MODEL_NAME} with your data model class name
// Replace ${REPOSITORY_NAME} with your repository class name

public class ${VIEW_MODEL_NAME} extends AndroidViewModel {

    private final ${REPOSITORY_NAME} repository;
    private final LiveData<List<${MODEL_NAME}>> allItems;

    public ${VIEW_MODEL_NAME}(@NonNull Application application) {
        super(application);
        repository = new ${REPOSITORY_NAME}(application);
        allItems = repository.getAllItems();
    }

    public LiveData<List<${MODEL_NAME}>> getAllItems() {
        return allItems;
    }

    public LiveData<${MODEL_NAME}> getItemById(int itemId) {
        return repository.getItemById(itemId);
    }

    public void insert(${MODEL_NAME} item) {
        repository.insert(item);
    }

    public void update(${MODEL_NAME} item) {
        repository.update(item);
    }

    public void delete(${MODEL_NAME} item) {
        repository.delete(item);
    }
}