package com.bumptech.glide.load.model;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.data.DataFetcher;
import java.io.IOException;

public final class e implements DataFetcher {
    public final String a;
    public final DataDecoder b;
    public Object c;

    public e(String s, DataDecoder dataUrlLoader$DataDecoder0) {
        this.a = s;
        this.b = dataUrlLoader$DataDecoder0;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
        try {
            this.b.close(this.c);
        }
        catch(IOException unused_ex) {
        }
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        return this.b.getDataClass();
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(Priority priority0, DataCallback dataFetcher$DataCallback0) {
        try {
            Object object0 = this.b.decode(this.a);
            this.c = object0;
            dataFetcher$DataCallback0.onDataReady(object0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            dataFetcher$DataCallback0.onLoadFailed(illegalArgumentException0);
        }
    }
}

