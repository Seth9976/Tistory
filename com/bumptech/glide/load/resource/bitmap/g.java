package com.bumptech.glide.load.resource.bitmap;

public final class g extends DownsampleStrategy {
    // 去混淆评级： 低(20)
    @Override  // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
    public final SampleSizeRounding getSampleSizeRounding(int v, int v1, int v2, int v3) {
        return DownsampleStrategy.a ? SampleSizeRounding.QUALITY : SampleSizeRounding.MEMORY;
    }

    @Override  // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
    public final float getScaleFactor(int v, int v1, int v2, int v3) {
        if(DownsampleStrategy.a) {
            return Math.min(((float)v2) / ((float)v), ((float)v3) / ((float)v1));
        }
        int v4 = Math.max(v1 / v3, v / v2);
        return v4 == 0 ? 1.0f : 1.0f / ((float)Integer.highestOneBit(v4));
    }
}

