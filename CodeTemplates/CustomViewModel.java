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