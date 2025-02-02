/**
 * Created by Sim Sze Yu
 * GitHub: https://github.com/szeyu/Awesome-Android-Code-Template
 * 
 * This template is part of the WIA2007 Mobile Application Development Course
 * Bachelor of Computer Science (Artificial Intelligence)
 * Universiti Malaya
 * 
 * Licensed under MIT License
 * Copyright (c) 2025 Sim Sze Yu
 * 
 * Sample Usage
 * // requireContext() gets Fragment’s context
 * // 'this' refers to the Activity context
 * 
 * // Save user preferences
 * PreferenceManagerUtil.setBoolean(context, "notifications_enabled", true);
 * PreferenceManagerUtil.setString(context, "theme", "dark");
 * 
 * // Retrieve user preferences
 * boolean notifications = PreferenceManagerUtil.getBoolean(context, "notifications_enabled");
 * String theme = PreferenceManagerUtil.getString(context, "theme", "light");
 * 
 * // Remove a specific preference
 * PreferenceManagerUtil.remove(context, "theme");
 * 
 * // Clear all preferences
 * PreferenceManagerUtil.clearAll(context);
 */

package com.example.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceManagerUtil {
    private static final String PREF_NAME = "app_preferences";

    private static SharedPreferences getPreferences(Context context) {
        return context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    public static void setString(Context context, String key, String value) {
        SharedPreferences.Editor editor = getPreferences(context).edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static String getString(Context context, String key, String defaultValue) {
        return getPreferences(context).getString(key, defaultValue);
    }

    public static void setBoolean(Context context, String key, boolean value) {
        SharedPreferences.Editor editor = getPreferences(context).edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public static boolean getBoolean(Context context, String key) {
        return getPreferences(context).getBoolean(key, false);
    }

    public static void setInt(Context context, String key, int value) {
        SharedPreferences.Editor editor = getPreferences(context).edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public static int getInt(Context context, String key, int defaultValue) {
        return getPreferences(context).getInt(key, defaultValue);
    }

    public static void remove(Context context, String key) {
        SharedPreferences.Editor editor = getPreferences(context).edit();
        editor.remove(key);
        editor.apply();
    }

    public static void clearAll(Context context) {
        SharedPreferences.Editor editor = getPreferences(context).edit();
        editor.clear();
        editor.apply();
    }
}
