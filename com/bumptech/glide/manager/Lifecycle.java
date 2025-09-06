package com.bumptech.glide.manager;

import androidx.annotation.NonNull;

public interface Lifecycle {
    void addListener(@NonNull LifecycleListener arg1);

    void removeListener(@NonNull LifecycleListener arg1);
}

