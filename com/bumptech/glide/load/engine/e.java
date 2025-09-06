package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.File;
import java.util.List;

public final class e implements DataCallback, DataFetcherGenerator {
    public final List a;
    public final h b;
    public final FetcherReadyCallback c;
    public int d;
    public Key e;
    public List f;
    public int g;
    public volatile LoadData h;
    public File i;

    public e(List list0, h h0, FetcherReadyCallback dataFetcherGenerator$FetcherReadyCallback0) {
        this.d = -1;
        this.a = list0;
        this.b = h0;
        this.c = dataFetcherGenerator$FetcherReadyCallback0;
    }

    @Override  // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final void cancel() {
        LoadData modelLoader$LoadData0 = this.h;
        if(modelLoader$LoadData0 != null) {
            modelLoader$LoadData0.fetcher.cancel();
        }
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher$DataCallback
    public final void onDataReady(Object object0) {
        this.c.onDataFetcherReady(this.e, object0, this.h.fetcher, DataSource.DATA_DISK_CACHE, this.e);
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher$DataCallback
    public final void onLoadFailed(Exception exception0) {
        this.c.onDataFetcherFailed(this.e, exception0, this.h.fetcher, DataSource.DATA_DISK_CACHE);
    }

    @Override  // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final boolean startNext() {
        while(true) {
            if(this.f != null && this.g < this.f.size()) {
                this.h = null;
                boolean z = false;
                while(!z && this.g < this.f.size()) {
                    int v = this.g;
                    this.g = v + 1;
                    this.h = ((ModelLoader)this.f.get(v)).buildLoadData(this.i, this.b.e, this.b.f, this.b.i);
                    if(this.h != null) {
                        Class class0 = this.h.fetcher.getDataClass();
                        if(this.b.c.getRegistry().getLoadPath(class0, this.b.g, this.b.k) != null) {
                            this.h.fetcher.loadData(this.b.o, this);
                            z = true;
                        }
                    }
                }
                return z;
            }
            int v1 = this.d + 1;
            this.d = v1;
            if(v1 >= this.a.size()) {
                return false;
            }
            Key key0 = (Key)this.a.get(this.d);
            f f0 = new f(key0, this.b.n);
            File file0 = this.b.h.getDiskCache().get(f0);
            this.i = file0;
            if(file0 != null) {
                this.e = key0;
                this.f = this.b.c.getRegistry().getModelLoaders(file0);
                this.g = 0;
            }
        }
    }
}

