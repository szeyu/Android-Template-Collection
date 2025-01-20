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