package com.bumptech.glide.load.model;

import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.data.DataFetcher;
import java.io.IOException;

public final class j implements DataFetcher {
    public final Resources.Theme a;
    public final Resources b;
    public final Object c;
    public final int d;
    public Object e;

    public j(Resources.Theme resources$Theme0, Resources resources0, ResourceOpener directResourceLoader$ResourceOpener0, int v) {
        this.a = resources$Theme0;
        this.b = resources0;
        this.c = directResourceLoader$ResourceOpener0;
        this.d = v;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
        Object object0 = this.e;
        if(object0 != null) {
            try {
                ((ResourceOpener)this.c).close(object0);
            }
            catch(IOException unused_ex) {
            }
        }
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        return ((ResourceOpener)this.c).getDataClass();
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(Priority priority0, DataCallback dataFetcher$DataCallback0) {
        try {
            Object object0 = ((ResourceOpener)this.c).open(this.a, this.b, this.d);
            this.e = object0;
            dataFetcher$DataCallback0.onDataReady(object0);
        }
        catch(Resources.NotFoundException resources$NotFoundException0) {
            dataFetcher$DataCallback0.onLoadFailed(resources$NotFoundException0);
        }
    }
}

