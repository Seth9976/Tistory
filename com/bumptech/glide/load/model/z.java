package com.bumptech.glide.load.model;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.data.DataFetcher;

public final class z implements DataFetcher {
    public final Object a;

    public z(Object object0) {
        this.a = object0;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        return this.a.getClass();
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(Priority priority0, DataCallback dataFetcher$DataCallback0) {
        dataFetcher$DataCallback0.onDataReady(this.a);
    }
}

