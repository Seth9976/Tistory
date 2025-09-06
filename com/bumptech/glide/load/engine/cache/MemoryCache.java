package com.bumptech.glide.load.engine.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;

public interface MemoryCache {
    public interface ResourceRemovedListener {
        void onResourceRemoved(@NonNull Resource arg1);
    }

    void clearMemory();

    long getCurrentSize();

    long getMaxSize();

    @Nullable
    Resource put(@NonNull Key arg1, @Nullable Resource arg2);

    @Nullable
    Resource remove(@NonNull Key arg1);

    void setResourceRemovedListener(@NonNull ResourceRemovedListener arg1);

    void setSizeMultiplier(float arg1);

    void trimMemory(int arg1);
}

