package com.bumptech.glide.load.model;

import androidx.core.util.Pools.Pool;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.List;

public final class t implements DataCallback, DataFetcher {
    public final ArrayList a;
    public final Pool b;
    public int c;
    public Priority d;
    public DataCallback e;
    public List f;
    public boolean g;

    public t(ArrayList arrayList0, Pool pools$Pool0) {
        this.b = pools$Pool0;
        Preconditions.checkNotEmpty(arrayList0);
        this.a = arrayList0;
        this.c = 0;
    }

    public final void a() {
        if(this.g) {
            return;
        }
        if(this.c < this.a.size() - 1) {
            ++this.c;
            this.loadData(this.d, this.e);
            return;
        }
        Preconditions.checkNotNull(this.f);
        this.e.onLoadFailed(new GlideException("Fetch failed", new ArrayList(this.f)));
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
        this.g = true;
        for(Object object0: this.a) {
            ((DataFetcher)object0).cancel();
        }
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
        List list0 = this.f;
        if(list0 != null) {
            this.b.release(list0);
        }
        this.f = null;
        for(Object object0: this.a) {
            ((DataFetcher)object0).cleanup();
        }
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        return ((DataFetcher)this.a.get(0)).getDataClass();
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final DataSource getDataSource() {
        return ((DataFetcher)this.a.get(0)).getDataSource();
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(Priority priority0, DataCallback dataFetcher$DataCallback0) {
        this.d = priority0;
        this.e = dataFetcher$DataCallback0;
        this.f = (List)this.b.acquire();
        ((DataFetcher)this.a.get(this.c)).loadData(priority0, this);
        if(this.g) {
            this.cancel();
        }
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher$DataCallback
    public final void onDataReady(Object object0) {
        if(object0 != null) {
            this.e.onDataReady(object0);
            return;
        }
        this.a();
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher$DataCallback
    public final void onLoadFailed(Exception exception0) {
        ((List)Preconditions.checkNotNull(this.f)).add(exception0);
        this.a();
    }
}

