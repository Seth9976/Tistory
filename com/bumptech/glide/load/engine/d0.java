package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class d0 implements DataCallback, DataFetcherGenerator {
    public final n a;
    public final h b;
    public int c;
    public int d;
    public Key e;
    public List f;
    public int g;
    public volatile LoadData h;
    public File i;
    public e0 j;

    public d0(h h0, n n0) {
        this.d = -1;
        this.b = h0;
        this.a = n0;
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
        this.a.onDataFetcherReady(this.e, object0, this.h.fetcher, DataSource.RESOURCE_DISK_CACHE, this.j);
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher$DataCallback
    public final void onLoadFailed(Exception exception0) {
        this.a.onDataFetcherFailed(this.j, exception0, this.h.fetcher, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override  // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final boolean startNext() {
        try {
            ArrayList arrayList0 = this.b.a();
            if(!arrayList0.isEmpty()) {
                List list0 = this.b.c.getRegistry().getRegisteredResourceClasses(this.b.d.getClass(), this.b.g, this.b.k);
                if(!list0.isEmpty()) {
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
                        if(v1 >= list0.size()) {
                            int v2 = this.c + 1;
                            this.c = v2;
                            if(v2 < arrayList0.size()) {
                                this.d = 0;
                                goto label_27;
                            }
                            return false;
                        }
                    label_27:
                        Key key0 = (Key)arrayList0.get(this.c);
                        Object object0 = list0.get(this.d);
                        Transformation transformation0 = this.b.c(((Class)object0));
                        this.j = new e0(this.b.c.getArrayPool(), key0, this.b.n, this.b.e, this.b.f, transformation0, ((Class)object0), this.b.i);
                        File file0 = this.b.h.getDiskCache().get(this.j);
                        this.i = file0;
                        if(file0 != null) {
                            this.e = key0;
                            this.f = this.b.c.getRegistry().getModelLoaders(file0);
                            this.g = 0;
                        }
                    }
                }
                if(!File.class.equals(this.b.k)) {
                    throw new IllegalStateException("Failed to find any load path from " + this.b.d.getClass() + " to " + this.b.k);
                }
                return false;
            }
            return false;
        }
        catch(Throwable throwable0) {
        }
        throw throwable0;
    }
}

