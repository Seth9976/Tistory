package com.bumptech.glide.load.model.stream;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.HttpUrlFetcher;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.ModelCache;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;

public class HttpGlideUrlLoader implements ModelLoader {
    public static class Factory implements ModelLoaderFactory {
        public final ModelCache a;

        public Factory() {
            this.a = new ModelCache(500L);
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory0) {
            return new HttpGlideUrlLoader(this.a);
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public static final Option TIMEOUT;
    public final ModelCache a;

    static {
        HttpGlideUrlLoader.TIMEOUT = Option.memory("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    }

    public HttpGlideUrlLoader() {
        this(null);
    }

    public HttpGlideUrlLoader(@Nullable ModelCache modelCache0) {
        this.a = modelCache0;
    }

    public LoadData buildLoadData(@NonNull GlideUrl glideUrl0, int v, int v1, @NonNull Options options0) {
        ModelCache modelCache0 = this.a;
        if(modelCache0 != null) {
            GlideUrl glideUrl1 = (GlideUrl)modelCache0.get(glideUrl0, 0, 0);
            if(glideUrl1 == null) {
                modelCache0.put(glideUrl0, 0, 0, glideUrl0);
                return new LoadData(glideUrl0, new HttpUrlFetcher(glideUrl0, ((int)(((Integer)options0.get(HttpGlideUrlLoader.TIMEOUT))))));
            }
            glideUrl0 = glideUrl1;
        }
        return new LoadData(glideUrl0, new HttpUrlFetcher(glideUrl0, ((int)(((Integer)options0.get(HttpGlideUrlLoader.TIMEOUT))))));
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public LoadData buildLoadData(@NonNull Object object0, int v, int v1, @NonNull Options options0) {
        return this.buildLoadData(((GlideUrl)object0), v, v1, options0);
    }

    public boolean handles(@NonNull GlideUrl glideUrl0) {
        return true;
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Object object0) {
        return this.handles(((GlideUrl)object0));
    }
}

