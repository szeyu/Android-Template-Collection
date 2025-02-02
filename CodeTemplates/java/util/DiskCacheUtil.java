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
 * A persistent disk cache using DiskLruCache.
 * Features:
 * - Stores data on disk for long-term caching.
 * - Automatic eviction when full.
 *
 * Usage:
 * 1. Initialize using DiskCacheUtil.getInstance(context);
 * 2. Use put() and get() for cache operations.
 * 
 * Sample Usage
 * // requireContext() gets Fragment’s context
 * // 'this' refers to the Activity context
 * 
 * // Save data to disk cache
 * DiskCacheUtil.put(context, "user_profile", "{ 'name': 'John', 'age': 25 }");
 * 
 * // Retrieve data from disk cache
 * String userProfile = DiskCacheUtil.get(context, "user_profile");
 * 
 * // Check if cache entry exists
 * boolean exists = DiskCacheUtil.contains(context, "user_profile");
 * 
 * // Remove specific cache entry
 * DiskCacheUtil.remove(context, "user_profile");
 * 
 * // Clear entire disk cache
 * DiskCacheUtil.clearAll(context);
 */
public class DiskCacheUtil {
    private static final int APP_VERSION = 1;
    private static final int VALUE_COUNT = 1;
    private static final long MAX_SIZE = 10 * 1024 * 1024; // 10MB cache size

    private static DiskCacheUtil instance;
    private DiskLruCache diskCache;

    private DiskCacheUtil(Context context) throws IOException {
        File cacheDir = new File(context.getCacheDir(), "disk_cache");
        diskCache = DiskLruCache.open(cacheDir, APP_VERSION, VALUE_COUNT, MAX_SIZE);
    }

    public static synchronized DiskCacheUtil getInstance(Context context) throws IOException {
        if (instance == null) {
            instance = new DiskCacheUtil(context);
        }
        return instance;
    }

    public void put(String key, String data) throws IOException {
        String hashedKey = String.valueOf(key.hashCode());
        DiskLruCache.Editor editor = diskCache.edit(hashedKey);
        if (editor != null) {
            try (OutputStream output = editor.newOutputStream(0)) {
                output.write(data.getBytes());
                output.flush();
                editor.commit();
            } catch (IOException e) {
                editor.abort();
                throw e;
            }
        }
    }

    public String get(String key) throws IOException {
        String hashedKey = String.valueOf(key.hashCode());
        DiskLruCache.Snapshot snapshot = diskCache.get(hashedKey);
        if (snapshot != null) {
            try (InputStream input = snapshot.getInputStream(0);
                 BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }
                return sb.toString();
            }
        }
        return null;
    }

    public void remove(String key) throws IOException {
        String hashedKey = String.valueOf(key.hashCode());
        diskCache.remove(hashedKey);
    }

    public void clear() throws IOException {
        diskCache.delete();
    }
}
