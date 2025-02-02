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
 * A modular utility class for app-specific storage using internal storage.
 * Features:
 * - Singleton pattern for easy access.
 * - Methods to save and read text data to/from a file.
 * - File deletion support.
 *
 * Usage:
 * 1. Retrieve an instance via AppStorageUtil.getInstance(context);
 * 2. Use saveToFile() to write data and readFromFile() to retrieve data.
 * 
 * Sample Usage
 * // requireContext() gets Fragment’s context
 * // 'this' refers to the Activity context
 * 
 * // Save data to internal storage
 * AppStorageUtil.saveToFile(context, "config.json", "{ 'theme': 'dark' }");
 * 
 * // Read data from internal storage
 * String configData = AppStorageUtil.readFromFile(context, "config.json");
 * 
 * // Delete a file
 * AppStorageUtil.deleteFile(context, "config.json");
 * 
 * // Check if file exists
 * boolean exists = AppStorageUtil.fileExists(context, "config.json");
 */
public class AppStorageUtil {
    private static AppStorageUtil instance;
    private Context context;
    
    private AppStorageUtil(Context context) {
        this.context = context.getApplicationContext();
    }
    
    public static synchronized AppStorageUtil getInstance(Context context) {
        if (instance == null) {
            instance = new AppStorageUtil(context);
        }
        return instance;
    }
    
    // Save text data to a file.
    public boolean saveToFile(String fileName, String data) {
        try (FileOutputStream fos = context.openFileOutput(fileName, Context.MODE_PRIVATE)) {
            fos.write(data.getBytes());
            fos.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // Read text data from a file.
    public String readFromFile(String fileName) {
        try (FileInputStream fis = context.openFileInput(fileName);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {
             
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            return sb.toString().trim();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    // Delete a file.
    public boolean deleteFile(String fileName) {
        return context.deleteFile(fileName);
    }
}
