package com.bumptech.glide.load.model;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.data.DataFetcher;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class l implements DataFetcher {
    public final File a;
    public final FileOpener b;
    public Object c;

    public l(File file0, FileOpener fileLoader$FileOpener0) {
        this.a = file0;
        this.b = fileLoader$FileOpener0;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
        Object object0 = this.c;
        if(object0 != null) {
            try {
                this.b.close(object0);
            }
            catch(IOException unused_ex) {
            }
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
            Object object0 = this.b.open(this.a);
            this.c = object0;
            dataFetcher$DataCallback0.onDataReady(object0);
        }
        catch(FileNotFoundException fileNotFoundException0) {
            if(Log.isLoggable("FileLoader", 3)) {
                Log.d("FileLoader", "Failed to open file", fileNotFoundException0);
            }
            dataFetcher$DataCallback0.onLoadFailed(fileNotFoundException0);
        }
    }
}

