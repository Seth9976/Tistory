package com.bumptech.glide.load.model.stream;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import java.io.InputStream;
import java.net.URL;

public class UrlLoader implements ModelLoader {
    public static class StreamFactory implements ModelLoaderFactory {
        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory0) {
            return new UrlLoader(multiModelLoaderFactory0.build(GlideUrl.class, InputStream.class));
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public final ModelLoader a;

    public UrlLoader(ModelLoader modelLoader0) {
        this.a = modelLoader0;
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public LoadData buildLoadData(@NonNull Object object0, int v, int v1, @NonNull Options options0) {
        return this.buildLoadData(((URL)object0), v, v1, options0);
    }

    public LoadData buildLoadData(@NonNull URL uRL0, int v, int v1, @NonNull Options options0) {
        GlideUrl glideUrl0 = new GlideUrl(uRL0);
        return this.a.buildLoadData(glideUrl0, v, v1, options0);
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Object object0) {
        return this.handles(((URL)object0));
    }

    public boolean handles(@NonNull URL uRL0) {
        return true;
    }
}

