package com.bumptech.glide.load.resource.bitmap;

public final class c extends DownsampleStrategy {
    @Override  // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
    public final SampleSizeRounding getSampleSizeRounding(int v, int v1, int v2, int v3) {
        return SampleSizeRounding.QUALITY;
    }

    @Override  // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
    public final float getScaleFactor(int v, int v1, int v2, int v3) {
        int v4 = Math.min(v1 / v3, v / v2);
        return v4 == 0 ? 1.0f : 1.0f / ((float)Integer.highestOneBit(v4));
    }
}

