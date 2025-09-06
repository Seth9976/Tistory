package com.bumptech.glide.load.resource.bitmap;

public final class d extends DownsampleStrategy {
    @Override  // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
    public final SampleSizeRounding getSampleSizeRounding(int v, int v1, int v2, int v3) {
        return SampleSizeRounding.MEMORY;
    }

    @Override  // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
    public final float getScaleFactor(int v, int v1, int v2, int v3) {
        int v4 = (int)Math.ceil(Math.max(((float)v1) / ((float)v3), ((float)v) / ((float)v2)));
        int v5 = 1;
        int v6 = Math.max(1, Integer.highestOneBit(v4));
        if(v6 >= v4) {
            v5 = 0;
        }
        return 1.0f / ((float)(v6 << v5));
    }
}

