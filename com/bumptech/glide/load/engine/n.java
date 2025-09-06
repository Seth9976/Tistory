package com.bumptech.glide.load.engine;

import a5.b;
import android.util.Log;
import androidx.core.util.Pools.Pool;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools.Poolable;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.ArrayList;
import l1.a;

public final class n implements FetcherReadyCallback, Poolable, Comparable, Runnable {
    public DataFetcher A;
    public volatile DataFetcherGenerator B;
    public volatile boolean C;
    public volatile boolean D;
    public boolean E;
    public int F;
    public final h a;
    public final ArrayList b;
    public final StateVerifier c;
    public final t d;
    public final Pool e;
    public final k f;
    public final l g;
    public GlideContext h;
    public Key i;
    public Priority j;
    public y k;
    public int l;
    public int m;
    public DiskCacheStrategy n;
    public Options o;
    public x p;
    public int q;
    public m r;
    public long s;
    public boolean t;
    public Object u;
    public Thread v;
    public Key w;
    public Key x;
    public Object y;
    public DataSource z;

    public n(t t0, Pool pools$Pool0) {
        this.a = new h();
        this.b = new ArrayList();
        this.c = StateVerifier.newInstance();
        this.f = new k();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.g = new l();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.d = t0;
        this.e = pools$Pool0;
    }

    public final Resource a(Object object0, DataSource dataSource0) {
        Class class0 = object0.getClass();
        LoadPath loadPath0 = this.a.c.getRegistry().getLoadPath(class0, this.a.g, this.a.k);
        Options options0 = this.o;
        boolean z = dataSource0 == DataSource.RESOURCE_DISK_CACHE || this.a.r;
        Option option0 = Downsampler.ALLOW_HARDWARE_CONFIG;
        Boolean boolean0 = (Boolean)options0.get(option0);
        if(boolean0 == null || boolean0.booleanValue() && !z) {
            options0 = new Options();
            options0.putAll(this.o);
            options0.set(option0, Boolean.valueOf(z));
        }
        DataRewinder dataRewinder0 = this.h.getRegistry().getRewinder(object0);
        try {
            return loadPath0.load(dataRewinder0, options0, this.l, this.m, new j(this, dataSource0));
        }
        finally {
            dataRewinder0.cleanup();
        }
    }

    public final void b() {
        Resource resource0;
        c0 c00;
        if(Log.isLoggable("DecodeJob", 2)) {
            this.e("Retrieved data", this.s, "data: " + this.y + ", cache key: " + this.w + ", fetcher: " + this.A);
        }
        try {
            c00 = null;
            DataFetcher dataFetcher0 = this.A;
            Object object0 = this.y;
            DataSource dataSource0 = this.z;
            if(object0 == null) {
                dataFetcher0.cleanup();
                goto label_23;
            }
            else {
                try {
                    long v1 = LogTime.getLogTime();
                    resource0 = this.a(object0, dataSource0);
                    if(Log.isLoggable("DecodeJob", 2)) {
                        this.e("Decoded result " + resource0, v1, null);
                    }
                }
                finally {
                    dataFetcher0.cleanup();
                }
            }
            goto label_24;
        }
        catch(GlideException glideException0) {
            glideException0.b = this.x;
            glideException0.c = this.z;
            glideException0.d = null;
            this.b.add(glideException0);
        }
    label_23:
        resource0 = null;
    label_24:
        if(resource0 == null) {
            this.h();
        }
        else {
            DataSource dataSource1 = this.z;
            boolean z = this.E;
            if(resource0 instanceof Initializable) {
                ((Initializable)resource0).initialize();
            }
            if(this.f.c != null) {
                c00 = (c0)Preconditions.checkNotNull(((c0)c0.e.acquire()));
                c00.d = false;
                c00.c = true;
                c00.b = resource0;
                resource0 = c00;
            }
            this.j();
            this.p.onResourceReady(resource0, dataSource1, z);
            this.F = 5;
            try {
                k k0 = this.f;
                if(k0.c != null) {
                    k0.a(this.d, this.o);
                }
            }
            finally {
                if(c00 != null) {
                    c00.a();
                }
            }
            synchronized(this.g) {
                this.g.b = true;
                boolean z1 = this.g.a();
            }
            if(z1) {
                this.g();
                return;
            }
        }
        try {
            return;
        }
        catch(Throwable throwable0) {
        }
        throw throwable0;
    }

    public final DataFetcherGenerator c() {
        int v = a.c(this.F);
        h h0 = this.a;
        switch(v) {
            case 1: {
                return new d0(h0, this);
            }
            case 2: {
                return new e(h0.a(), h0, this);
            }
            case 3: {
                return new i0(h0, this);
            }
            case 5: {
                return null;
            }
            default: {
                throw new IllegalStateException("Unrecognized stage: " + androidx.room.a.C(this.F));
            }
        }
    }

    @Override
    public final int compareTo(Object object0) {
        int v = this.j.ordinal() - ((n)object0).j.ordinal();
        return v == 0 ? this.q - ((n)object0).q : v;
    }

    public final int d(int v) {
        int v1 = a.c(v);
        switch(v1) {
            case 0: {
                return this.n.decodeCachedResource() ? 2 : this.d(2);
            }
            case 1: {
                return this.n.decodeCachedData() ? 3 : this.d(3);
            }
            case 2: {
                return this.t ? 6 : 4;
            label_6:
                if(v1 != 5) {
                    throw new IllegalArgumentException("Unrecognized stage: " + androidx.room.a.C(v));
                }
                break;
            }
            case 3: {
                break;
            }
            default: {
                goto label_6;
            }
        }
        return 6;
    }

    public final void e(String s, long v, String s1) {
        StringBuilder stringBuilder0 = b.u(s, " in ");
        stringBuilder0.append(LogTime.getElapsedMillis(v));
        stringBuilder0.append(", load key: ");
        stringBuilder0.append(this.k);
        stringBuilder0.append((s1 == null ? "" : ", " + s1));
        stringBuilder0.append(", thread: ");
        stringBuilder0.append("jeb-dexdec-sb-st-1201");
        Log.v("DecodeJob", stringBuilder0.toString());
    }

    public final void f() {
        this.j();
        GlideException glideException0 = new GlideException("Failed to load resource", new ArrayList(this.b));
        this.p.onLoadFailed(glideException0);
        synchronized(this.g) {
            this.g.c = true;
            boolean z = this.g.a();
        }
        if(z) {
            this.g();
        }
    }

    public final void g() {
        synchronized(this.g) {
            this.g.b = false;
            this.g.a = false;
            this.g.c = false;
        }
        this.f.a = null;
        this.f.b = null;
        this.f.c = null;
        this.a.c = null;
        this.a.d = null;
        this.a.n = null;
        this.a.g = null;
        this.a.k = null;
        this.a.i = null;
        this.a.o = null;
        this.a.j = null;
        this.a.p = null;
        this.a.a.clear();
        this.a.l = false;
        this.a.b.clear();
        this.a.m = false;
        this.C = false;
        this.h = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.k = null;
        this.p = null;
        this.F = 0;
        this.B = null;
        this.v = null;
        this.w = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.s = 0L;
        this.D = false;
        this.u = null;
        this.b.clear();
        this.e.release(this);
    }

    @Override  // com.bumptech.glide.util.pool.FactoryPools$Poolable
    public final StateVerifier getVerifier() {
        return this.c;
    }

    public final void h() {
        this.v = Thread.currentThread();
        this.s = LogTime.getLogTime();
        boolean z = false;
        while(!this.D && this.B != null) {
            z = this.B.startNext();
            if(z) {
                break;
            }
            this.F = this.d(this.F);
            this.B = this.c();
            if(this.F == 4) {
                this.r = m.b;
                this.p.reschedule(this);
                return;
            }
            if(false) {
                break;
            }
        }
        if((this.F == 6 || this.D) && !z) {
            this.f();
        }
    }

    public final void i() {
        int v = this.r.ordinal();
        switch(v) {
            case 0: {
                this.F = this.d(1);
                this.B = this.c();
                this.h();
                return;
            }
            case 1: {
                this.h();
                return;
            }
            default: {
                if(v != 2) {
                    throw new IllegalStateException("Unrecognized run reason: " + this.r);
                }
                this.b();
            }
        }
    }

    public final void j() {
        this.c.throwIfRecycled();
        if(this.C) {
            throw new IllegalStateException("Already notified", (this.b.isEmpty() ? null : ((Throwable)this.b.get(this.b.size() - 1))));
        }
        this.C = true;
    }

    @Override  // com.bumptech.glide.load.engine.DataFetcherGenerator$FetcherReadyCallback
    public final void onDataFetcherFailed(Key key0, Exception exception0, DataFetcher dataFetcher0, DataSource dataSource0) {
        dataFetcher0.cleanup();
        GlideException glideException0 = new GlideException("Fetching data failed", exception0);
        Class class0 = dataFetcher0.getDataClass();
        glideException0.b = key0;
        glideException0.c = dataSource0;
        glideException0.d = class0;
        this.b.add(glideException0);
        if(Thread.currentThread() != this.v) {
            this.r = m.b;
            this.p.reschedule(this);
            return;
        }
        this.h();
    }

    @Override  // com.bumptech.glide.load.engine.DataFetcherGenerator$FetcherReadyCallback
    public final void onDataFetcherReady(Key key0, Object object0, DataFetcher dataFetcher0, DataSource dataSource0, Key key1) {
        this.w = key0;
        this.y = object0;
        this.A = dataFetcher0;
        this.z = dataSource0;
        this.x = key1;
        this.E = key0 != this.a.a().get(0);
        if(Thread.currentThread() != this.v) {
            this.r = m.c;
            this.p.reschedule(this);
            return;
        }
        this.b();
    }

    @Override  // com.bumptech.glide.load.engine.DataFetcherGenerator$FetcherReadyCallback
    public final void reschedule() {
        this.r = m.b;
        this.p.reschedule(this);
    }

    @Override
    public final void run() {
        DataFetcher dataFetcher0;
        try {
            dataFetcher0 = this.A;
            if(this.D) {
                this.f();
                if(dataFetcher0 != null) {
                    goto label_4;
                }
                return;
            }
            goto label_6;
        }
        catch(d d0) {
            throw d0;
        }
        catch(Throwable throwable0) {
            goto label_11;
        }
    label_4:
        dataFetcher0.cleanup();
        return;
        try {
        label_6:
            this.i();
            goto label_21;
        }
        catch(d d0) {
        }
        catch(Throwable throwable0) {
            goto label_11;
        }
        try {
            throw d0;
        label_11:
            if(Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.D + ", stage: " + androidx.room.a.C(this.F), throwable0);
            }
            if(this.F != 5) {
                this.b.add(throwable0);
                this.f();
            }
            throw throwable0;
        label_18:
            if(dataFetcher0 == null) {
                throw throwable1;
            }
        }
        catch(Throwable throwable1) {
            goto label_18;
        }
        dataFetcher0.cleanup();
        throw throwable1;
    label_21:
        if(dataFetcher0 != null) {
            dataFetcher0.cleanup();
        }
    }
}

