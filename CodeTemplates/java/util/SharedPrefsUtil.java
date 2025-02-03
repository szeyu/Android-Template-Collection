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
 * - Supports storing and retrieving lists using Gson.
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
 * SharedPrefsUtil.getInstance().putBoolean("first_launch", false);
 * SharedPrefsUtil.getInstance().putString("username", "SimSzeYu");
 * 
 * // Retrieve user preferences
 * boolean isFirstLaunch = SharedPrefsUtil.getInstance().getBoolean("first_launch", true);
 * String username = SharedPrefsUtil.getInstance().getString("username", "Guest");
 * 
 * // Save and retrieve lists
 * List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
 * SharedPrefsUtil.getInstance().putStringList("name_list", names);
 * List<String> retrievedNames = SharedPrefsUtil.getInstance().getStringList("name_list");
 * 
 * List<Integer> scores = Arrays.asList(10, 20, 30);
 * SharedPrefsUtil.getInstance().putIntList("score_list", scores);
 * List<Integer> retrievedScores = SharedPrefsUtil.getInstance().getIntList("score_list");
 * 
 * // Remove a specific preference
 * SharedPrefsUtil.getInstance().remove("username");
 * 
 * // Clear all preferences
 * SharedPrefsUtil.getInstance().clear();
 */

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class SharedPrefsUtil {
    private static final String PREFS_NAME = "SharedPrefsUtil"; // Replace with your preference file name.
    private static SharedPrefsUtil instance;
    private SharedPreferences sharedPreferences;
    private Gson gson;

    private SharedPrefsUtil(Context context) {
        sharedPreferences = context.getApplicationContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        gson = new Gson();
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

    // Save a list of strings.
    public void putStringList(String key, List<String> list) {
        String json = gson.toJson(list);
        sharedPreferences.edit().putString(key, json).apply();
    }

    // Retrieve a list of strings.
    public List<String> getStringList(String key) {
        String json = sharedPreferences.getString(key, null);
        if (json == null) {
            return new ArrayList<>();
        }
        Type type = new TypeToken<List<String>>() {}.getType();
        return gson.fromJson(json, type);
    }

    // Save a list of integers.
    public void putIntList(String key, List<Integer> list) {
        String json = gson.toJson(list);
        sharedPreferences.edit().putString(key, json).apply();
    }

    // Retrieve a list of integers.
    public List<Integer> getIntList(String key) {
        String json = sharedPreferences.getString(key, null);
        if (json == null) {
            return new ArrayList<>();
        }
        Type type = new TypeToken<List<Integer>>() {}.getType();
        return gson.fromJson(json, type);
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
