package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.Option;

public abstract class DownsampleStrategy {
    public static enum SampleSizeRounding {
        MEMORY,
        QUALITY;

    }

    public static final DownsampleStrategy AT_LEAST;
    public static final DownsampleStrategy AT_MOST;
    public static final DownsampleStrategy CENTER_INSIDE;
    public static final DownsampleStrategy CENTER_OUTSIDE;
    public static final DownsampleStrategy DEFAULT;
    public static final DownsampleStrategy FIT_CENTER;
    public static final DownsampleStrategy NONE;
    public static final Option OPTION;
    public static final boolean a;

    static {
        DownsampleStrategy.AT_LEAST = new c();  // 初始化器: Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;-><init>()V
        DownsampleStrategy.AT_MOST = new d();  // 初始化器: Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;-><init>()V
        DownsampleStrategy.FIT_CENTER = new g();  // 初始化器: Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;-><init>()V
        DownsampleStrategy.CENTER_INSIDE = new e();  // 初始化器: Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;-><init>()V
        f f0 = new f();  // 初始化器: Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;-><init>()V
        DownsampleStrategy.CENTER_OUTSIDE = f0;
        DownsampleStrategy.NONE = new h();  // 初始化器: Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;-><init>()V
        DownsampleStrategy.DEFAULT = f0;
        DownsampleStrategy.OPTION = Option.memory("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", f0);
        DownsampleStrategy.a = true;
    }

    public abstract SampleSizeRounding getSampleSizeRounding(int arg1, int arg2, int arg3, int arg4);

    public abstract float getScaleFactor(int arg1, int arg2, int arg3, int arg4);
}

