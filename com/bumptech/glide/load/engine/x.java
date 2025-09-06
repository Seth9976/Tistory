package com.bumptech.glide.load.engine;

import a7.c;
import androidx.core.util.Pools.Pool;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.util.Executors;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools.Poolable;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public final class x implements DecodeJob.Callback, Poolable {
    public final w a;
    public final StateVerifier b;
    public final Engine c;
    public final Pool d;
    public final c e;
    public final Engine f;
    public final GlideExecutor g;
    public final GlideExecutor h;
    public final GlideExecutor i;
    public final GlideExecutor j;
    public final AtomicInteger k;
    public y l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public Resource q;
    public DataSource r;
    public boolean s;
    public GlideException t;
    public boolean u;
    public z v;
    public n w;
    public volatile boolean x;
    public boolean y;
    public static final c z;

    static {
        x.z = new c(6);
    }

    public x(GlideExecutor glideExecutor0, GlideExecutor glideExecutor1, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, Engine engine0, Engine engine1, Pool pools$Pool0) {
        this.a = new w(new ArrayList(2), 0);
        this.b = StateVerifier.newInstance();
        this.k = new AtomicInteger();
        this.g = glideExecutor0;
        this.h = glideExecutor1;
        this.i = glideExecutor2;
        this.j = glideExecutor3;
        this.f = engine0;
        this.c = engine1;
        this.d = pools$Pool0;
        this.e = x.z;
    }

    public final void a(ResourceCallback resourceCallback0, Executor executor0) {
        synchronized(this) {
            this.b.throwIfRecycled();
            this.a.getClass();
            v v1 = new v(resourceCallback0, executor0);
            ((ArrayList)this.a.b).add(v1);
            if(this.s) {
                this.c(1);
                executor0.execute(new u(this, resourceCallback0, 1));
            }
            else if(this.u) {
                this.c(1);
                executor0.execute(new u(this, resourceCallback0, 0));
            }
            else {
                Preconditions.checkArgument(!this.x, "Cannot add callbacks to a cancelled EngineJob");
            }
        }
    }

    public final void b() {
        z z0;
        synchronized(this) {
            this.b.throwIfRecycled();
            Preconditions.checkArgument(this.d(), "Not yet complete!");
            int v1 = this.k.decrementAndGet();
            Preconditions.checkArgument(v1 >= 0, "Can\'t decrement below 0");
            if(v1 == 0) {
                z0 = this.v;
                this.e();
            }
            else {
                z0 = null;
            }
        }
        if(z0 != null) {
            z0.b();
        }
    }

    public final void c(int v) {
        synchronized(this) {
            Preconditions.checkArgument(this.d(), "Not yet complete!");
            if(this.k.getAndAdd(v) == 0) {
                z z0 = this.v;
                if(z0 != null) {
                    z0.a();
                }
            }
        }
    }

    // 去混淆评级： 低(30)
    public final boolean d() {
        return this.u || this.s || this.x;
    }

    public final void e() {
        synchronized(this) {
            if(this.l != null) {
                ((ArrayList)this.a.b).clear();
                this.l = null;
                this.v = null;
                this.q = null;
                this.u = false;
                this.x = false;
                this.s = false;
                this.y = false;
                n n0 = this.w;
                l l0 = n0.g;
                synchronized(l0) {
                    l0.a = true;
                    boolean z = l0.a();
                }
                if(z) {
                    n0.g();
                }
                this.w = null;
                this.t = null;
                this.r = null;
                this.d.release(this);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public final void f(ResourceCallback resourceCallback0) {
        synchronized(this) {
            this.b.throwIfRecycled();
            this.a.getClass();
            v v1 = new v(resourceCallback0, Executors.directExecutor());
            ((ArrayList)this.a.b).remove(v1);
            if(((ArrayList)this.a.b).isEmpty()) {
                if(!this.d()) {
                    this.x = true;
                    this.w.D = true;
                    DataFetcherGenerator dataFetcherGenerator0 = this.w.B;
                    if(dataFetcherGenerator0 != null) {
                        dataFetcherGenerator0.cancel();
                    }
                    this.f.onEngineJobCancelled(this, this.l);
                }
                if((this.s || this.u) && this.k.get() == 0) {
                    this.e();
                }
            }
        }
    }

    @Override  // com.bumptech.glide.util.pool.FactoryPools$Poolable
    public final StateVerifier getVerifier() {
        return this.b;
    }

    @Override  // com.bumptech.glide.load.engine.DecodeJob$Callback
    public final void onLoadFailed(GlideException glideException0) {
        synchronized(this) {
            this.t = glideException0;
        }
        synchronized(this) {
            this.b.throwIfRecycled();
            if(this.x) {
                this.e();
                return;
            }
            if(!((ArrayList)this.a.b).isEmpty()) {
                if(this.u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.u = true;
                y y0 = this.l;
                this.a.getClass();
                ArrayList arrayList0 = new ArrayList(((ArrayList)this.a.b));
                this.c(arrayList0.size() + 1);
                this.f.onEngineJobComplete(this, y0, null);
                for(Object object0: arrayList0) {
                    u u0 = new u(this, ((v)object0).a, 0);
                    ((v)object0).b.execute(u0);
                }
                this.b();
                return;
            }
        }
        throw new IllegalStateException("Received an exception without any callbacks to notify");
    }

    @Override  // com.bumptech.glide.load.engine.DecodeJob$Callback
    public final void onResourceReady(Resource resource0, DataSource dataSource0, boolean z) {
        synchronized(this) {
            this.q = resource0;
            this.r = dataSource0;
            this.y = z;
        }
        synchronized(this) {
            this.b.throwIfRecycled();
            if(this.x) {
                this.q.recycle();
                this.e();
                return;
            }
            if(!((ArrayList)this.a.b).isEmpty()) {
                if(this.s) {
                    throw new IllegalStateException("Already have resource");
                }
                Resource resource1 = this.q;
                boolean z1 = this.m;
                y y0 = this.l;
                this.e.getClass();
                this.v = new z(resource1, z1, true, y0, this.c);
                this.s = true;
                this.a.getClass();
                ArrayList arrayList0 = new ArrayList(((ArrayList)this.a.b));
                this.c(arrayList0.size() + 1);
                this.f.onEngineJobComplete(this, this.l, this.v);
                for(Object object0: arrayList0) {
                    u u0 = new u(this, ((v)object0).a, 1);
                    ((v)object0).b.execute(u0);
                }
                this.b();
                return;
            }
        }
        throw new IllegalStateException("Received a resource without any callbacks to notify");
    }

    @Override  // com.bumptech.glide.load.engine.DecodeJob$Callback
    public final void reschedule(n n0) {
        GlideExecutor glideExecutor0;
        if(this.n) {
            glideExecutor0 = this.i;
        }
        else {
            glideExecutor0 = this.o ? this.j : this.h;
        }
        glideExecutor0.execute(n0);
    }
}

