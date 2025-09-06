package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.ListPreloader.PreloadSizeProvider;

public class FixedPreloadSizeProvider implements PreloadSizeProvider {
    public final int[] a;

    public FixedPreloadSizeProvider(int v, int v1) {
        this.a = new int[]{v, v1};
    }

    @Override  // com.bumptech.glide.ListPreloader$PreloadSizeProvider
    @Nullable
    public int[] getPreloadSize(@NonNull Object object0, int v, int v1) {
        return this.a;
    }
}

