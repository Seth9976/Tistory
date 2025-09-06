package com.bumptech.glide;

import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.DiskCache.Factory;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator.Builder;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class GlideBuilder {
    public static final class LogRequestOrigins implements Experiment {
    }

    public static final class UseDirectResourceLoader implements Experiment {
    }

    public static final class WaitForFramesAfterTrimMemory implements Experiment {
    }

    public final ArrayMap a;
    public final e b;
    public Engine c;
    public BitmapPool d;
    public ArrayPool e;
    public MemoryCache f;
    public GlideExecutor g;
    public GlideExecutor h;
    public Factory i;
    public MemorySizeCalculator j;
    public ConnectivityMonitorFactory k;
    public int l;
    public RequestOptionsFactory m;
    public RequestManagerFactory n;
    public GlideExecutor o;
    public boolean p;
    public List q;

    public GlideBuilder() {
        this.a = new ArrayMap();
        this.b = new e();
        this.l = 4;
        this.m = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NonNull
    public GlideBuilder addGlobalRequestListener(@NonNull RequestListener requestListener0) {
        if(this.q == null) {
            this.q = new ArrayList();
        }
        this.q.add(requestListener0);
        return this;
    }

    @NonNull
    public GlideBuilder setAnimationExecutor(@Nullable GlideExecutor glideExecutor0) {
        this.o = glideExecutor0;
        return this;
    }

    @NonNull
    public GlideBuilder setArrayPool(@Nullable ArrayPool arrayPool0) {
        this.e = arrayPool0;
        return this;
    }

    @NonNull
    public GlideBuilder setBitmapPool(@Nullable BitmapPool bitmapPool0) {
        this.d = bitmapPool0;
        return this;
    }

    @NonNull
    public GlideBuilder setConnectivityMonitorFactory(@Nullable ConnectivityMonitorFactory connectivityMonitorFactory0) {
        this.k = connectivityMonitorFactory0;
        return this;
    }

    @NonNull
    public GlideBuilder setDefaultRequestOptions(@NonNull RequestOptionsFactory glide$RequestOptionsFactory0) {
        this.m = (RequestOptionsFactory)Preconditions.checkNotNull(glide$RequestOptionsFactory0);
        return this;
    }

    @NonNull
    public GlideBuilder setDefaultRequestOptions(@Nullable RequestOptions requestOptions0) {
        return this.setDefaultRequestOptions(new c(requestOptions0));
    }

    @NonNull
    public GlideBuilder setDefaultTransitionOptions(@NonNull Class class0, @Nullable TransitionOptions transitionOptions0) {
        this.a.put(class0, transitionOptions0);
        return this;
    }

    @NonNull
    public GlideBuilder setDiskCache(@Nullable Factory diskCache$Factory0) {
        this.i = diskCache$Factory0;
        return this;
    }

    @NonNull
    public GlideBuilder setDiskCacheExecutor(@Nullable GlideExecutor glideExecutor0) {
        this.h = glideExecutor0;
        return this;
    }

    public GlideBuilder setImageDecoderEnabledForBitmaps(boolean z) {
        d d0 = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        HashMap hashMap0 = this.b.a;
        Class class0 = d.class;
        if(z && Build.VERSION.SDK_INT >= 29) {
            hashMap0.put(class0, d0);
            return this;
        }
        hashMap0.remove(class0);
        return this;
    }

    @NonNull
    public GlideBuilder setIsActiveResourceRetentionAllowed(boolean z) {
        this.p = z;
        return this;
    }

    @NonNull
    public GlideBuilder setLogLevel(int v) {
        if(v < 2 || v > 6) {
            throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
        }
        this.l = v;
        return this;
    }

    public GlideBuilder setLogRequestOrigins(boolean z) {
        LogRequestOrigins glideBuilder$LogRequestOrigins0 = new LogRequestOrigins();
        HashMap hashMap0 = this.b.a;
        Class class0 = LogRequestOrigins.class;
        if(z) {
            hashMap0.put(class0, glideBuilder$LogRequestOrigins0);
            return this;
        }
        hashMap0.remove(class0);
        return this;
    }

    @NonNull
    public GlideBuilder setMemoryCache(@Nullable MemoryCache memoryCache0) {
        this.f = memoryCache0;
        return this;
    }

    @NonNull
    public GlideBuilder setMemorySizeCalculator(@NonNull Builder memorySizeCalculator$Builder0) {
        return this.setMemorySizeCalculator(memorySizeCalculator$Builder0.build());
    }

    @NonNull
    public GlideBuilder setMemorySizeCalculator(@Nullable MemorySizeCalculator memorySizeCalculator0) {
        this.j = memorySizeCalculator0;
        return this;
    }

    @Deprecated
    public GlideBuilder setResizeExecutor(@Nullable GlideExecutor glideExecutor0) {
        return this.setSourceExecutor(glideExecutor0);
    }

    @NonNull
    public GlideBuilder setSourceExecutor(@Nullable GlideExecutor glideExecutor0) {
        this.g = glideExecutor0;
        return this;
    }
}

