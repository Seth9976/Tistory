package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class LocalUriFetcher implements DataFetcher {
    public final Uri a;
    public final ContentResolver b;
    public Object c;

    public LocalUriFetcher(ContentResolver contentResolver0, Uri uri0) {
        this.b = contentResolver0;
        this.a = uri0;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public void cancel() {
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public void cleanup() {
        Object object0 = this.c;
        if(object0 != null) {
            try {
                this.close(object0);
            }
            catch(IOException unused_ex) {
            }
        }
    }

    public abstract void close(Object arg1) throws IOException;

    @Override  // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(@NonNull Priority priority0, @NonNull DataCallback dataFetcher$DataCallback0) {
        try {
            Object object0 = this.loadResource(this.a, this.b);
            this.c = object0;
            dataFetcher$DataCallback0.onDataReady(object0);
        }
        catch(FileNotFoundException fileNotFoundException0) {
            if(Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", fileNotFoundException0);
            }
            dataFetcher$DataCallback0.onLoadFailed(fileNotFoundException0);
        }
    }

    public abstract Object loadResource(Uri arg1, ContentResolver arg2) throws FileNotFoundException;
}

