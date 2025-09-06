package com.bumptech.glide.load.engine;

import a7.b;
import a7.c;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.cache.DiskCache.Factory;
import com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.util.Executors;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Preconditions;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import jeb.synthetic.FIN;

public class Engine implements EngineJobListener, EngineResource.ResourceListener, ResourceRemovedListener {
    public class LoadStatus {
        public final x a;
        public final ResourceCallback b;
        public final Engine c;

        public LoadStatus(ResourceCallback resourceCallback0, x x0) {
            this.b = resourceCallback0;
            this.a = x0;
        }

        public void cancel() {
            synchronized(this.c) {
                this.a.f(this.b);
            }
        }
    }

    public final b a;
    public final c b;
    public final MemoryCache c;
    public final s d;
    public final g0 e;
    public final t f;
    public final q g;
    public final com.bumptech.glide.load.engine.c h;
    public static final boolean i;

    static {
        Engine.i = Log.isLoggable("Engine", 2);
    }

    public Engine(MemoryCache memoryCache0, Factory diskCache$Factory0, GlideExecutor glideExecutor0, GlideExecutor glideExecutor1, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, boolean z) {
        this.c = memoryCache0;
        t t0 = new t(diskCache$Factory0);
        this.f = t0;
        com.bumptech.glide.load.engine.c c0 = new com.bumptech.glide.load.engine.c(z);
        this.h = c0;
        synchronized(this) {
            synchronized(c0) {
                c0.e = this;
            }
        }
        this.b = new c(7);
        this.a = new b(6);
        this.d = new s(glideExecutor0, glideExecutor1, glideExecutor2, glideExecutor3, this, this);
        this.g = new q(t0);
        this.e = new g0();
        memoryCache0.setResourceRemovedListener(this);
    }

    public final z a(y y0, boolean z, long v) {
        z z2;
        z z1;
        if(!z) {
            return null;
        }
        com.bumptech.glide.load.engine.c c0 = this.h;
        __monitor_enter(c0);
        int v1 = FIN.finallyOpen$NT();
        com.bumptech.glide.load.engine.b b0 = (com.bumptech.glide.load.engine.b)c0.c.get(y0);
        if(b0 == null) {
            FIN.finallyExec$NT(v1);
            z1 = null;
        }
        else {
            z1 = (z)b0.get();
            if(z1 == null) {
                c0.b(b0);
            }
            FIN.finallyCodeBegin$NT(v1);
            __monitor_exit(c0);
            FIN.finallyCodeEnd$NT(v1);
        }
        if(z1 != null) {
            z1.a();
        }
        if(z1 != null) {
            if(Engine.i) {
                Engine.b("Loaded resource from active resources", v, y0);
            }
            return z1;
        }
        Resource resource0 = this.c.remove(y0);
        if(resource0 == null) {
            z2 = null;
        }
        else {
            z2 = resource0 instanceof z ? ((z)resource0) : new z(resource0, true, true, y0, this);
        }
        if(z2 != null) {
            z2.a();
            this.h.a(y0, z2);
        }
        if(z2 != null) {
            if(Engine.i) {
                Engine.b("Loaded resource from cache", v, y0);
            }
            return z2;
        }
        return null;
    }

    public static void b(String s, long v, y y0) {
        StringBuilder stringBuilder0 = a5.b.u(s, " in ");
        stringBuilder0.append(LogTime.getElapsedMillis(v));
        stringBuilder0.append("ms, key: ");
        stringBuilder0.append(y0);
        Log.v("Engine", stringBuilder0.toString());
    }

    public final LoadStatus c(GlideContext glideContext0, Object object0, Key key0, int v, int v1, Class class0, Class class1, Priority priority0, DiskCacheStrategy diskCacheStrategy0, Map map0, boolean z, boolean z1, Options options0, boolean z2, boolean z3, boolean z4, boolean z5, ResourceCallback resourceCallback0, Executor executor0, y y0, long v2) {
        GlideExecutor glideExecutor0;
        x x0 = (x)((HashMap)(z5 ? this.a.c : this.a.b)).get(y0);
        if(x0 != null) {
            x0.a(resourceCallback0, executor0);
            if(Engine.i) {
                Engine.b("Added to existing load", v2, y0);
            }
            return new LoadStatus(this, resourceCallback0, x0);
        }
        x x1 = (x)Preconditions.checkNotNull(((x)this.d.g.acquire()));
        synchronized(x1) {
            x1.l = y0;
            x1.m = z2;
            x1.n = z3;
            x1.o = z4;
            x1.p = z5;
        }
        n n0 = (n)Preconditions.checkNotNull(((n)this.g.b.acquire()));
        int v3 = this.g.c;
        this.g.c = v3 + 1;
        n0.a.c = glideContext0;
        n0.a.d = object0;
        n0.a.n = key0;
        n0.a.e = v;
        n0.a.f = v1;
        n0.a.p = diskCacheStrategy0;
        n0.a.g = class0;
        n0.a.h = n0.d;
        n0.a.k = class1;
        n0.a.o = priority0;
        n0.a.i = options0;
        n0.a.j = map0;
        n0.a.q = z;
        n0.a.r = z1;
        n0.h = glideContext0;
        n0.i = key0;
        n0.j = priority0;
        n0.k = y0;
        n0.l = v;
        n0.m = v1;
        n0.n = diskCacheStrategy0;
        n0.t = z5;
        n0.o = options0;
        n0.p = x1;
        n0.q = v3;
        n0.r = m.a;
        n0.u = object0;
        this.a.getClass();
        ((HashMap)(x1.p ? this.a.c : this.a.b)).put(y0, x1);
        x1.a(resourceCallback0, executor0);
        synchronized(x1) {
            x1.w = n0;
            switch(n0.d(1)) {
                case 2: 
                case 3: {
                    glideExecutor0 = x1.g;
                    break;
                }
                default: {
                    if(x1.n) {
                        glideExecutor0 = x1.i;
                    }
                    else if(x1.o) {
                        glideExecutor0 = x1.j;
                    }
                    else {
                        glideExecutor0 = x1.h;
                    }
                }
            }
            glideExecutor0.execute(n0);
        }
        if(Engine.i) {
            Engine.b("Started new load", v2, y0);
        }
        return new LoadStatus(this, resourceCallback0, x1);
    }

    public void clearDiskCache() {
        this.f.getDiskCache().clear();
    }

    public LoadStatus load(GlideContext glideContext0, Object object0, Key key0, int v, int v1, Class class0, Class class1, Priority priority0, DiskCacheStrategy diskCacheStrategy0, Map map0, boolean z, boolean z1, Options options0, boolean z2, boolean z3, boolean z4, boolean z5, ResourceCallback resourceCallback0, Executor executor0) {
        z z6;
        long v2 = Engine.i ? LogTime.getLogTime() : 0L;
        this.b.getClass();
        y y0 = new y(object0, key0, v, v1, map0, class0, class1, options0);
        synchronized(this) {
            z6 = this.a(y0, z2, v2);
            if(z6 == null) {
                return this.c(glideContext0, object0, key0, v, v1, class0, class1, priority0, diskCacheStrategy0, map0, z, z1, options0, z2, z3, z4, z5, resourceCallback0, executor0, y0, v2);
            }
        }
        resourceCallback0.onResourceReady(z6, DataSource.MEMORY_CACHE, false);
        return null;
    }

    @Override  // com.bumptech.glide.load.engine.EngineJobListener
    public void onEngineJobCancelled(x x0, Key key0) {
        synchronized(this) {
            this.a.getClass();
            Object object0 = x0.p ? this.a.c : this.a.b;
            if(x0.equals(((HashMap)object0).get(key0))) {
                ((HashMap)object0).remove(key0);
            }
        }
    }

    @Override  // com.bumptech.glide.load.engine.EngineJobListener
    public void onEngineJobComplete(x x0, Key key0, z z0) {
        synchronized(this) {
            if(z0 != null && z0.a) {
                this.h.a(key0, z0);
            }
            this.a.getClass();
            Object object0 = x0.p ? this.a.c : this.a.b;
            if(x0.equals(((HashMap)object0).get(key0))) {
                ((HashMap)object0).remove(key0);
            }
        }
    }

    @Override  // com.bumptech.glide.load.engine.EngineResource$ResourceListener
    public void onResourceReleased(Key key0, z z0) {
        com.bumptech.glide.load.engine.c c0 = this.h;
        synchronized(c0) {
            com.bumptech.glide.load.engine.b b0 = (com.bumptech.glide.load.engine.b)c0.c.remove(key0);
            if(b0 != null) {
                b0.c = null;
                b0.clear();
            }
        }
        if(z0.a) {
            this.c.put(key0, z0);
            return;
        }
        this.e.a(z0, false);
    }

    @Override  // com.bumptech.glide.load.engine.cache.MemoryCache$ResourceRemovedListener
    public void onResourceRemoved(@NonNull Resource resource0) {
        this.e.a(resource0, true);
    }

    public void release(Resource resource0) {
        if(!(resource0 instanceof z)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((z)resource0).b();
    }

    @VisibleForTesting
    public void shutdown() {
        Executors.shutdownAndAwaitTermination(this.d.a);
        Executors.shutdownAndAwaitTermination(this.d.b);
        Executors.shutdownAndAwaitTermination(this.d.c);
        Executors.shutdownAndAwaitTermination(this.d.d);
        t t0 = this.f;
        synchronized(t0) {
            if(t0.b != null) {
                t0.b.clear();
            }
        }
        this.h.f = true;
        ExecutorService executorService0 = this.h.b;
        if(executorService0 != null) {
            Executors.shutdownAndAwaitTermination(executorService0);
        }
    }
}

