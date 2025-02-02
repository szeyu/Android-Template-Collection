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
 * A modular utility class for handling SharedPreferences in Android.
 * Features:
 * - Singleton pattern for global access.
 * - Easy read/write operations for various data types.
 * - Methods to clear or remove preferences.
 *
 * Usage:
 * 1. Initialize in your Application class using SharedPrefsUtil.init(context);
 * 2. Retrieve the instance via SharedPrefsUtil.getInstance() for subsequent operations.
 * 
 * Sample Usage
 * // requireContext() gets Fragment’s context
 * // 'this' refers to the Activity context
 * 
 * // Save user preferences
 * SharedPrefsUtil.setBoolean(context, "first_launch", false);
 * SharedPrefsUtil.setString(context, "username", "SimSzeYu");
 * 
 * // Retrieve user preferences
 * boolean isFirstLaunch = SharedPrefsUtil.getBoolean(context, "first_launch");
 * String username = SharedPrefsUtil.getString(context, "username", "Guest");
 * 
 * // Remove a specific preference
 * SharedPrefsUtil.remove(context, "username");
 * 
 * // Clear all preferences
 * SharedPrefsUtil.clearAll(context);
 */
public class SharedPrefsUtil {
    private static final String PREFS_NAME = "${PREFS_NAME}"; // Replace with your preference file name.
    private static SharedPrefsUtil instance;
    private SharedPreferences sharedPreferences;
    
    private SharedPrefsUtil(Context context) {
        sharedPreferences = context.getApplicationContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }
    
    public static synchronized void init(Context context) {
        if (instance == null) {
            instance = new SharedPrefsUtil(context);
        }
    }
    
    public static SharedPrefsUtil getInstance() {
        if (instance == null) {
            throw new IllegalStateException("SharedPrefsUtil is not initialized. Call init(context) in your Application class.");
        }
        return instance;
    }
    
    // Save a String value.
    public void putString(String key, String value) {
        sharedPreferences.edit().putString(key, value).apply();
    }
    
    // Retrieve a String value.
    public String getString(String key, String defaultValue) {
        return sharedPreferences.getString(key, defaultValue);
    }
    
    // Save an integer value.
    public void putInt(String key, int value) {
        sharedPreferences.edit().putInt(key, value).apply();
    }
    
    // Retrieve an integer value.
    public int getInt(String key, int defaultValue) {
        return sharedPreferences.getInt(key, defaultValue);
    }
    
    // Save a boolean value.
    public void putBoolean(String key, boolean value) {
        sharedPreferences.edit().putBoolean(key, value).apply();
    }
    
    // Retrieve a boolean value.
    public boolean getBoolean(String key, boolean defaultValue) {
        return sharedPreferences.getBoolean(key, defaultValue);
    }
    
    // Save a long value.
    public void putLong(String key, long value) {
        sharedPreferences.edit().putLong(key, value).apply();
    }
    
    // Retrieve a long value.
    public long getLong(String key, long defaultValue) {
        return sharedPreferences.getLong(key, defaultValue);
    }
    
    // Save a float value.
    public void putFloat(String key, float value) {
        sharedPreferences.edit().putFloat(key, value).apply();
    }
    
    // Retrieve a float value.
    public float getFloat(String key, float defaultValue) {
        return sharedPreferences.getFloat(key, defaultValue);
    }
    
    // Remove a specific key.
    public void remove(String key) {
        sharedPreferences.edit().remove(key).apply();
    }
    
    // Clear all preferences.
    public void clear() {
        sharedPreferences.edit().clear().apply();
    }
}
