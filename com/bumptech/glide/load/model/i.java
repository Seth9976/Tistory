package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import java.io.InputStream;

public final class i implements ResourceOpener, ModelLoaderFactory {
    public final Context a;

    public i(Context context0) {
        this.a = context0;
    }

    @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
    public final ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory0) {
        return new DirectResourceLoader(this.a, this);
    }

    @Override  // com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener
    public final void close(Object object0) {
        ((InputStream)object0).close();
    }

    @Override  // com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener
    public final Class getDataClass() {
        return InputStream.class;
    }

    @Override  // com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener
    public final Object open(Resources.Theme resources$Theme0, Resources resources0, int v) {
        return resources0.openRawResource(v);
    }

    @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
    public final void teardown() {
    }
}

