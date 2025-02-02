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
 * A hybrid caching system using LruCache (memory) and DiskLruCache (disk).
 * Features:
 * - Uses memory cache for fast access.
 * - Falls back to disk cache if memory cache misses.
 * - Evicts old data automatically when full.
 *
 * Usage:
 * 1. Initialize using HybridCacheUtil.getInstance(context, maxSize);
 * 2. Use put(), get(), and remove() to manage cache.
 * 
 * Sample Usage
 * // requireContext() gets Fragment’s context
 * // 'this' refers to the Activity context
 * 
 * // Store data in hybrid cache (tries memory first, then disk)
 * HybridCacheUtil.put(context, "session_token", "abcdef123456");
 * 
 * // Retrieve data (first tries memory, then falls back to disk)
 * String token = HybridCacheUtil.get(context, "session_token");
 * 
 * // Remove an entry from hybrid cache
 * HybridCacheUtil.remove(context, "session_token");
 * 
 * // Clear entire hybrid cache
 * HybridCacheUtil.clearAll(context);
 */
public class HybridCacheUtil {
    private static HybridCacheUtil instance;
    private MemoryCacheUtil memoryCache;
    private DiskCacheUtil diskCache;

    private HybridCacheUtil(Context context, int memorySize) throws IOException {
        memoryCache = new MemoryCacheUtil(memorySize);
        diskCache = DiskCacheUtil.getInstance(context);
    }

    public static synchronized HybridCacheUtil getInstance(Context context, int memorySize) throws IOException {
        if (instance == null) {
            instance = new HybridCacheUtil(context, memorySize);
        }
        return instance;
    }

    public void put(String key, String data) {
        memoryCache.put(key, data);
        try {
            diskCache.put(key, data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String get(String key) {
        // Try memory cache first
        String data = (String) memoryCache.get(key);
        if (data != null) {
            return data;
        }

        // Fallback to disk cache
        try {
            data = diskCache.get(key);
            if (data != null) {
                memoryCache.put(key, data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public void remove(String key) {
        memoryCache.remove(key);
        try {
            diskCache.remove(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clear() {
        memoryCache.clear();
        try {
            diskCache.clear();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
