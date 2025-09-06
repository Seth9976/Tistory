package com.bumptech.glide.load.model;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class d implements DataFetcher {
    public final File a;

    public d(File file0) {
        this.a = file0;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        return ByteBuffer.class;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(Priority priority0, DataCallback dataFetcher$DataCallback0) {
        try {
            dataFetcher$DataCallback0.onDataReady(ByteBufferUtil.fromFile(this.a));
        }
        catch(IOException iOException0) {
            if(Log.isLoggable("ByteBufferFileLoader", 3)) {
                Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", iOException0);
            }
            dataFetcher$DataCallback0.onLoadFailed(iOException0);
        }
    }
}

