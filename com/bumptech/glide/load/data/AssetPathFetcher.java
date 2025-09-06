package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;

public abstract class AssetPathFetcher implements DataFetcher {
    public final String a;
    public final AssetManager b;
    public Object c;

    public AssetPathFetcher(AssetManager assetManager0, String s) {
        this.b = assetManager0;
        this.a = s;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public void cleanup() {
        Object object0 = this.c;
        if(object0 == null) {
            return;
        }
        try {
            this.close(object0);
        }
        catch(IOException unused_ex) {
        }
    }

    public abstract void close(Object arg1) throws IOException;

    @Override  // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public void loadData(@NonNull Priority priority0, @NonNull DataCallback dataFetcher$DataCallback0) {
        try {
            Object object0 = this.loadResource(this.b, this.a);
            this.c = object0;
            dataFetcher$DataCallback0.onDataReady(object0);
        }
        catch(IOException iOException0) {
            if(Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", iOException0);
            }
            dataFetcher$DataCallback0.onLoadFailed(iOException0);
        }
    }

    public abstract Object loadResource(AssetManager arg1, String arg2) throws IOException;
}

