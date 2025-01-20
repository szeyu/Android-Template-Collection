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

    @Query("SELECT * FROM ${TABLE_NAME} ORDER BY timestamp DESC")
    LiveData<List<${MODEL_NAME}>> getAllItems();
}