package com.bumptech.glide;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator.Builder;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.load.engine.prefill.BitmapPreFiller;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.HardwareConfigState;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.DefaultConnectivityMonitorFactory;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.module.GlideModule;
import com.bumptech.glide.module.ManifestParser;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ImageViewTargetFactory;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Glide implements ComponentCallbacks2 {
    public interface RequestOptionsFactory {
        @NonNull
        RequestOptions build();
    }

    public final Engine a;
    public final BitmapPool b;
    public final MemoryCache c;
    public final GlideContext d;
    public final ArrayPool e;
    public final RequestManagerRetriever f;
    public final ConnectivityMonitorFactory g;
    public final ArrayList h;
    public final RequestOptionsFactory i;
    public MemoryCategory j;
    public BitmapPreFiller k;
    public static volatile Glide l;
    public static volatile boolean m;

    public Glide(Context context0, Engine engine0, MemoryCache memoryCache0, BitmapPool bitmapPool0, ArrayPool arrayPool0, RequestManagerRetriever requestManagerRetriever0, ConnectivityMonitorFactory connectivityMonitorFactory0, int v, RequestOptionsFactory glide$RequestOptionsFactory0, ArrayMap arrayMap0, List list0, List list1, AppGlideModule appGlideModule0, GlideExperiments glideExperiments0) {
        this.h = new ArrayList();
        this.j = MemoryCategory.NORMAL;
        this.a = engine0;
        this.b = bitmapPool0;
        this.e = arrayPool0;
        this.c = memoryCache0;
        this.f = requestManagerRetriever0;
        this.g = connectivityMonitorFactory0;
        this.i = glide$RequestOptionsFactory0;
        this.d = new GlideContext(context0, arrayPool0, new h(this, list1, appGlideModule0), new ImageViewTargetFactory(), glide$RequestOptionsFactory0, arrayMap0, list0, engine0, glideExperiments0, v);
    }

    // 去混淆评级： 低(30)
    public static GeneratedAppGlideModule a(Context context0) {
        return new GeneratedAppGlideModuleImpl(context0.getApplicationContext());
    }

    public static RequestManagerRetriever b(Context context0) {
        Preconditions.checkNotNull(context0, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return Glide.get(context0).getRequestManagerRetriever();
    }

    public static void c(Context context0, GlideBuilder glideBuilder0, GeneratedAppGlideModule generatedAppGlideModule0) {
        Context context1 = context0.getApplicationContext();
        List list0 = Collections.emptyList();
        if(generatedAppGlideModule0 == null || generatedAppGlideModule0.isManifestParsingEnabled()) {
            list0 = new ManifestParser(context1).parse();
        }
        if(generatedAppGlideModule0 != null && !generatedAppGlideModule0.a().isEmpty()) {
            Set set0 = generatedAppGlideModule0.a();
            Iterator iterator0 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                GlideModule glideModule0 = (GlideModule)object0;
                if(set0.contains(glideModule0.getClass())) {
                    if(Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + glideModule0);
                    }
                    iterator0.remove();
                }
            }
        }
        if(Log.isLoggable("Glide", 3)) {
            for(Object object1: list0) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + ((GlideModule)object1).getClass());
            }
        }
        glideBuilder0.n = generatedAppGlideModule0 == null ? null : generatedAppGlideModule0.b();
        for(Object object2: list0) {
            ((GlideModule)object2).applyOptions(context1, glideBuilder0);
        }
        if(generatedAppGlideModule0 != null) {
            generatedAppGlideModule0.applyOptions(context1, glideBuilder0);
        }
        if(glideBuilder0.g == null) {
            glideBuilder0.g = GlideExecutor.newSourceExecutor();
        }
        if(glideBuilder0.h == null) {
            glideBuilder0.h = GlideExecutor.newDiskCacheExecutor();
        }
        if(glideBuilder0.o == null) {
            glideBuilder0.o = GlideExecutor.newAnimationExecutor();
        }
        if(glideBuilder0.j == null) {
            glideBuilder0.j = new Builder(context1).build();
        }
        if(glideBuilder0.k == null) {
            glideBuilder0.k = new DefaultConnectivityMonitorFactory();
        }
        if(glideBuilder0.d == null) {
            int v = glideBuilder0.j.getBitmapPoolSize();
            glideBuilder0.d = v > 0 ? new LruBitmapPool(((long)v)) : new BitmapPoolAdapter();
        }
        if(glideBuilder0.e == null) {
            glideBuilder0.e = new LruArrayPool(glideBuilder0.j.getArrayPoolSizeInBytes());
        }
        if(glideBuilder0.f == null) {
            glideBuilder0.f = new LruResourceCache(((long)glideBuilder0.j.getMemoryCacheSize()));
        }
        if(glideBuilder0.i == null) {
            glideBuilder0.i = new InternalCacheDiskCacheFactory(context1);
        }
        if(glideBuilder0.c == null) {
            glideBuilder0.c = new Engine(glideBuilder0.f, glideBuilder0.i, glideBuilder0.h, glideBuilder0.g, GlideExecutor.newUnlimitedSourceExecutor(), glideBuilder0.o, glideBuilder0.p);
        }
        List list1 = glideBuilder0.q;
        glideBuilder0.q = list1 == null ? Collections.emptyList() : Collections.unmodifiableList(list1);
        glideBuilder0.b.getClass();
        GlideExperiments glideExperiments0 = new GlideExperiments(glideBuilder0.b);
        RequestManagerRetriever requestManagerRetriever0 = new RequestManagerRetriever(glideBuilder0.n, glideExperiments0);
        Glide glide0 = new Glide(context1, glideBuilder0.c, glideBuilder0.f, glideBuilder0.d, glideBuilder0.e, requestManagerRetriever0, glideBuilder0.k, glideBuilder0.l, glideBuilder0.m, glideBuilder0.a, glideBuilder0.q, list0, generatedAppGlideModule0, glideExperiments0);
        context1.registerComponentCallbacks(glide0);
        Glide.l = glide0;
    }

    public void clearDiskCache() {
        Util.assertBackgroundThread();
        this.a.clearDiskCache();
    }

    public void clearMemory() {
        Util.assertMainThread();
        this.c.clearMemory();
        this.b.clearMemory();
        this.e.clearMemory();
    }

    @VisibleForTesting
    public static void enableHardwareBitmaps() {
        HardwareConfigState.getInstance().unblockHardwareBitmaps();
    }

    @NonNull
    public static Glide get(@NonNull Context context0) {
        if(Glide.l == null) {
            GeneratedAppGlideModule generatedAppGlideModule0 = Glide.a(context0.getApplicationContext());
            Class class0 = Glide.class;
            synchronized(class0) {
                if(Glide.l == null) {
                    if(Glide.m) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    Glide.m = true;
                    try {
                        Glide.c(context0, new GlideBuilder(), generatedAppGlideModule0);
                    }
                    finally {
                        Glide.m = false;
                    }
                }
                return Glide.l;
            }
        }
        return Glide.l;
    }

    @NonNull
    public ArrayPool getArrayPool() {
        return this.e;
    }

    @NonNull
    public BitmapPool getBitmapPool() {
        return this.b;
    }

    @NonNull
    public Context getContext() {
        return this.d.getBaseContext();
    }

    @Nullable
    public static File getPhotoCacheDir(@NonNull Context context0) {
        return Glide.getPhotoCacheDir(context0, "image_manager_disk_cache");
    }

    @Nullable
    public static File getPhotoCacheDir(@NonNull Context context0, @NonNull String s) {
        File file0 = context0.getCacheDir();
        if(file0 != null) {
            File file1 = new File(file0, s);
            return file1.isDirectory() || file1.mkdirs() ? file1 : null;
        }
        if(Log.isLoggable("Glide", 6)) {
            Log.e("Glide", "default disk cache dir is null");
        }
        return null;
    }

    @NonNull
    public Registry getRegistry() {
        return this.d.getRegistry();
    }

    @NonNull
    public RequestManagerRetriever getRequestManagerRetriever() {
        return this.f;
    }

    @VisibleForTesting
    public static void init(@NonNull Context context0, @NonNull GlideBuilder glideBuilder0) {
        GeneratedAppGlideModule generatedAppGlideModule0 = Glide.a(context0);
        synchronized(Glide.class) {
            if(Glide.l != null) {
                Glide.tearDown();
            }
            Glide.c(context0, glideBuilder0, generatedAppGlideModule0);
        }
    }

    @VisibleForTesting
    @Deprecated
    public static void init(Glide glide0) {
        synchronized(Glide.class) {
            if(Glide.l != null) {
                Glide.tearDown();
            }
            Glide.l = glide0;
        }
    }

    @Override  // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration0) {
    }

    @Override  // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.clearMemory();
    }

    @Override  // android.content.ComponentCallbacks2
    public void onTrimMemory(int v) {
        this.trimMemory(v);
    }

    public void preFillBitmapPool(@NonNull com.bumptech.glide.load.engine.prefill.PreFillType.Builder[] arr_preFillType$Builder) {
        synchronized(this) {
            if(this.k == null) {
                DecodeFormat decodeFormat0 = (DecodeFormat)this.i.build().getOptions().get(Downsampler.DECODE_FORMAT);
                this.k = new BitmapPreFiller(this.c, this.b, decodeFormat0);
            }
            this.k.preFill(arr_preFillType$Builder);
        }
    }

    @NonNull
    public MemoryCategory setMemoryCategory(@NonNull MemoryCategory memoryCategory0) {
        Util.assertMainThread();
        this.c.setSizeMultiplier(memoryCategory0.getMultiplier());
        this.b.setSizeMultiplier(memoryCategory0.getMultiplier());
        MemoryCategory memoryCategory1 = this.j;
        this.j = memoryCategory0;
        return memoryCategory1;
    }

    @VisibleForTesting
    public static void tearDown() {
        synchronized(Glide.class) {
            if(Glide.l != null) {
                Glide.l.getContext().getApplicationContext().unregisterComponentCallbacks(Glide.l);
                Glide.l.a.shutdown();
            }
            Glide.l = null;
        }
    }

    public void trimMemory(int v) {
        Util.assertMainThread();
        synchronized(this.h) {
            for(Object object0: this.h) {
                ((RequestManager)object0).onTrimMemory(v);
            }
        }
        this.c.trimMemory(v);
        this.b.trimMemory(v);
        this.e.trimMemory(v);
    }

    @NonNull
    @Deprecated
    public static RequestManager with(@NonNull Activity activity0) {
        return Glide.b(activity0).get(activity0);
    }

    @NonNull
    @Deprecated
    public static RequestManager with(@NonNull Fragment fragment0) {
        return Glide.b(fragment0.getActivity()).get(fragment0);
    }

    @NonNull
    public static RequestManager with(@NonNull Context context0) {
        return Glide.b(context0).get(context0);
    }

    @NonNull
    public static RequestManager with(@NonNull View view0) {
        return Glide.b(view0.getContext()).get(view0);
    }

    @NonNull
    public static RequestManager with(@NonNull androidx.fragment.app.Fragment fragment0) {
        return Glide.b(fragment0.getContext()).get(fragment0);
    }

    @NonNull
    public static RequestManager with(@NonNull FragmentActivity fragmentActivity0) {
        return Glide.b(fragmentActivity0).get(fragmentActivity0);
    }
}

