package com.bumptech.glide.load.resource.bitmap;

public final class e extends DownsampleStrategy {
    @Override  // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
    public final SampleSizeRounding getSampleSizeRounding(int v, int v1, int v2, int v3) {
        return this.getScaleFactor(v, v1, v2, v3) == 1.0f ? SampleSizeRounding.QUALITY : DownsampleStrategy.FIT_CENTER.getSampleSizeRounding(v, v1, v2, v3);
    }

    @Override  // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
    public final float getScaleFactor(int v, int v1, int v2, int v3) {
        return Math.min(1.0f, DownsampleStrategy.FIT_CENTER.getScaleFactor(v, v1, v2, v3));
    }
}

