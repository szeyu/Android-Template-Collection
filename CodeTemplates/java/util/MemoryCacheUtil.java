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
 * A lightweight memory cache using LruCache.
 * Features:
 * - Stores objects in memory for fast access.
 * - Removes least recently used items when full.
 *
 * Usage:
 * 1. Initialize using MemoryCacheUtil.init(maxSize);
 * 2. Use put(), get(), and remove() for caching.
 * 
 * Sample Usage
 * // requireContext() gets Fragment’s context
 * // 'this' refers to the Activity context
 * 
 * // Add data to memory cache
 * MemoryCacheUtil.put("api_response", "{ 'status': 'ok', 'data': [] }");
 * 
 * // Retrieve data from memory cache
 * String response = MemoryCacheUtil.get("api_response");
 * 
 * // Check if cache contains key
 * boolean exists = MemoryCacheUtil.contains("api_response");
 * 
 * // Remove a specific entry
 * MemoryCacheUtil.remove("api_response");
 * 
 * // Clear entire memory cache
 * MemoryCacheUtil.clearAll();
 */
public class MemoryCacheUtil {
    private static MemoryCacheUtil instance;
    private LruCache<String, Object> memoryCache;

    private MemoryCacheUtil(int maxSize) {
        memoryCache = new LruCache<>(maxSize);
    }

    public static synchronized void init(int maxSize) {
        if (instance == null) {
            instance = new MemoryCacheUtil(maxSize);
        }
    }

    public static MemoryCacheUtil getInstance() {
        if (instance == null) {
            throw new IllegalStateException("MemoryCacheUtil not initialized. Call init(maxSize) first.");
        }
        return instance;
    }

    public void put(String key, Object value) {
        memoryCache.put(key, value);
    }

    public Object get(String key) {
        return memoryCache.get(key);
    }

    public void remove(String key) {
        memoryCache.remove(key);
    }

    public void clear() {
        memoryCache.evictAll();
    }
}
