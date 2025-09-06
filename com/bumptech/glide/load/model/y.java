package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.InputStream;

public final class y implements ModelLoaderFactory {
    public final int a;
    public final Context b;

    public y(Context context0, int v) {
        this.a = v;
        this.b = context0;
        super();
    }

    private final void a() {
    }

    private final void b() {
    }

    @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
    public final ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory0) {
        if(this.a != 0) {
            ModelLoader modelLoader0 = multiModelLoaderFactory0.build(Integer.class, InputStream.class);
            return new ResourceUriLoader(this.b, modelLoader0);
        }
        ModelLoader modelLoader1 = multiModelLoaderFactory0.build(Integer.class, AssetFileDescriptor.class);
        return new ResourceUriLoader(this.b, modelLoader1);
    }

    @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
    public final void teardown() {
    }
}

