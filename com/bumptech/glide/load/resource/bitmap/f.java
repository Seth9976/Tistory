package com.bumptech.glide.load.resource.bitmap;

public final class f extends DownsampleStrategy {
    @Override  // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
    public final SampleSizeRounding getSampleSizeRounding(int v, int v1, int v2, int v3) {
        return SampleSizeRounding.QUALITY;
    }

    @Override  // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
    public final float getScaleFactor(int v, int v1, int v2, int v3) {
        return Math.max(((float)v2) / ((float)v), ((float)v3) / ((float)v1));
    }
}

