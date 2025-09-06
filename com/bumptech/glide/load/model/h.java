package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat;

public final class h implements ResourceOpener, ModelLoaderFactory {
    public final Context a;

    public h(Context context0) {
        this.a = context0;
    }

    @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
    public final ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory0) {
        return new DirectResourceLoader(this.a, this);
    }

    @Override  // com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener
    public final void close(Object object0) {
        Drawable drawable0 = (Drawable)object0;
    }

    @Override  // com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener
    public final Class getDataClass() {
        return Drawable.class;
    }

    @Override  // com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener
    public final Object open(Resources.Theme resources$Theme0, Resources resources0, int v) {
        return DrawableDecoderCompat.getDrawable(this.a, v, resources$Theme0);
    }

    @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
    public final void teardown() {
    }
}

