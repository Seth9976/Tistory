package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.model.ModelLoader.LoadData;

public final class h0 implements DataCallback {
    public final LoadData a;
    public final i0 b;

    public h0(i0 i00, LoadData modelLoader$LoadData0) {
        this.b = i00;
        this.a = modelLoader$LoadData0;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher$DataCallback
    public final void onDataReady(Object object0) {
        LoadData modelLoader$LoadData0 = this.b.f;
        if(modelLoader$LoadData0 != null && modelLoader$LoadData0 == this.a) {
            i0 i00 = this.b;
            LoadData modelLoader$LoadData1 = this.a;
            if(object0 != null && i00.a.p.isDataCacheable(modelLoader$LoadData1.fetcher.getDataSource())) {
                i00.e = object0;
                i00.b.reschedule();
                return;
            }
            DataSource dataSource0 = modelLoader$LoadData1.fetcher.getDataSource();
            i00.b.onDataFetcherReady(modelLoader$LoadData1.sourceKey, object0, modelLoader$LoadData1.fetcher, dataSource0, i00.g);
        }
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher$DataCallback
    public final void onLoadFailed(Exception exception0) {
        LoadData modelLoader$LoadData0 = this.b.f;
        if(modelLoader$LoadData0 != null && modelLoader$LoadData0 == this.a) {
            f f0 = this.b.g;
            DataSource dataSource0 = this.a.fetcher.getDataSource();
            this.b.b.onDataFetcherFailed(f0, exception0, this.a.fetcher, dataSource0);
        }
    }
}

