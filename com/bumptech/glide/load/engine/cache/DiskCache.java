package com.bumptech.glide.load.engine.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import java.io.File;

public interface DiskCache {
    public interface Factory {
        public static final String DEFAULT_DISK_CACHE_DIR = "image_manager_disk_cache";
        public static final int DEFAULT_DISK_CACHE_SIZE = 0xFA00000;

        @Nullable
        DiskCache build();
    }

    public interface Writer {
        boolean write(@NonNull File arg1);
    }

    void clear();

    void delete(Key arg1);

    @Nullable
    File get(Key arg1);

    void put(Key arg1, Writer arg2);
}

