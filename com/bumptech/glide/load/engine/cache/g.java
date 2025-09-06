package com.bumptech.glide.load.engine.cache;

import android.util.DisplayMetrics;

public final class g implements ScreenDimensions {
    public final DisplayMetrics a;

    public g(DisplayMetrics displayMetrics0) {
        this.a = displayMetrics0;
    }

    @Override  // com.bumptech.glide.load.engine.cache.MemorySizeCalculator$ScreenDimensions
    public final int getHeightPixels() {
        return this.a.heightPixels;
    }

    @Override  // com.bumptech.glide.load.engine.cache.MemorySizeCalculator$ScreenDimensions
    public final int getWidthPixels() {
        return this.a.widthPixels;
    }
}

