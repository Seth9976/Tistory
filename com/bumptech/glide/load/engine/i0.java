package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import com.bumptech.glide.util.LogTime;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public final class i0 implements FetcherReadyCallback, DataFetcherGenerator {
    public final h a;
    public final n b;
    public volatile int c;
    public volatile e d;
    public volatile Object e;
    public volatile LoadData f;
    public volatile f g;

    public i0(h h0, n n0) {
        this.a = h0;
        this.b = n0;
    }

    public final boolean a(Object object0) {
        DataRewinder dataRewinder0;
        long v = LogTime.getLogTime();
        boolean z = false;
        try {
            dataRewinder0 = this.a.c.getRegistry().getRewinder(object0);
            Object object1 = dataRewinder0.rewindAndGet();
            Encoder encoder0 = this.a.c.getRegistry().getSourceEncoder(object1);
            g g0 = new g(encoder0, object1, this.a.i);
            f f0 = new f(this.f.sourceKey, this.a.n);
            DiskCache diskCache0 = this.a.h.getDiskCache();
            diskCache0.put(f0, g0);
            if(Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + f0 + ", data: " + object0 + ", encoder: " + encoder0 + ", duration: " + LogTime.getElapsedMillis(v));
            }
            if(diskCache0.get(f0) != null) {
                this.g = f0;
                this.d = new e(Collections.singletonList(this.f.sourceKey), this.a, this);
                goto label_14;
            }
            goto label_16;
        }
        catch(Throwable throwable0) {
            goto label_29;
        }
    label_14:
        this.f.fetcher.cleanup();
        return true;
        try {
        label_16:
            if(Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.g + ", data: " + object0 + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
        }
        catch(Throwable throwable0) {
            goto label_29;
        }
        try {
            Key key0 = this.f.sourceKey;
            Object object2 = dataRewinder0.rewindAndGet();
            DataFetcher dataFetcher0 = this.f.fetcher;
            DataSource dataSource0 = this.f.fetcher.getDataSource();
            this.b.onDataFetcherReady(key0, object2, dataFetcher0, dataSource0, this.f.sourceKey);
            return false;
        }
        catch(Throwable throwable0) {
            z = true;
        }
    label_29:
        if(!z) {
            this.f.fetcher.cleanup();
        }
        throw throwable0;
    }

    @Override  // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final void cancel() {
        LoadData modelLoader$LoadData0 = this.f;
        if(modelLoader$LoadData0 != null) {
            modelLoader$LoadData0.fetcher.cancel();
        }
    }

    @Override  // com.bumptech.glide.load.engine.DataFetcherGenerator$FetcherReadyCallback
    public final void onDataFetcherFailed(Key key0, Exception exception0, DataFetcher dataFetcher0, DataSource dataSource0) {
        DataSource dataSource1 = this.f.fetcher.getDataSource();
        this.b.onDataFetcherFailed(key0, exception0, dataFetcher0, dataSource1);
    }

    @Override  // com.bumptech.glide.load.engine.DataFetcherGenerator$FetcherReadyCallback
    public final void onDataFetcherReady(Key key0, Object object0, DataFetcher dataFetcher0, DataSource dataSource0, Key key1) {
        DataSource dataSource1 = this.f.fetcher.getDataSource();
        this.b.onDataFetcherReady(key0, object0, dataFetcher0, dataSource1, key0);
    }

    @Override  // com.bumptech.glide.load.engine.DataFetcherGenerator$FetcherReadyCallback
    public final void reschedule() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final boolean startNext() {
        if(this.e != null) {
            try {
                Object object0 = this.e;
                this.e = null;
                if(!this.a(object0)) {
                    return true;
                }
            }
            catch(IOException iOException0) {
                if(Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", iOException0);
                }
            }
        }
        if(this.d != null && this.d.startNext()) {
            return true;
        }
        this.d = null;
        this.f = null;
        boolean z = false;
        while(!z && this.c < this.a.b().size()) {
            ArrayList arrayList0 = this.a.b();
            int v = this.c;
            this.c = v + 1;
            this.f = (LoadData)arrayList0.get(v);
            if(this.f == null) {
            }
            else if(this.a.p.isDataCacheable(this.f.fetcher.getDataSource())) {
                this.f.fetcher.loadData(this.a.o, new h0(this, this.f));
                z = true;
            }
            else {
                Class class0 = this.f.fetcher.getDataClass();
                if(this.a.c.getRegistry().getLoadPath(class0, this.a.g, this.a.k) != null) {
                    this.f.fetcher.loadData(this.a.o, new h0(this, this.f));
                    z = true;
                }
            }
        }
        return z;
    }
}

