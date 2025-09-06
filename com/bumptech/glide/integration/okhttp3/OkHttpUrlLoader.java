package com.bumptech.glide.integration.okhttp3;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import okhttp3.OkHttpClient;

public class OkHttpUrlLoader implements ModelLoader {
    public static class Factory implements ModelLoaderFactory {
        public final okhttp3.Call.Factory a;
        public static volatile OkHttpClient b;

        public Factory() {
            if(Factory.b == null) {
                Class class0 = Factory.class;
                synchronized(class0) {
                    if(Factory.b == null) {
                        Factory.b = new OkHttpClient();
                    }
                }
            }
            this(Factory.b);
        }

        public Factory(@NonNull okhttp3.Call.Factory call$Factory0) {
            this.a = call$Factory0;
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory0) {
            return new OkHttpUrlLoader(this.a);
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public final okhttp3.Call.Factory a;

    public OkHttpUrlLoader(@NonNull okhttp3.Call.Factory call$Factory0) {
        this.a = call$Factory0;
    }

    public LoadData buildLoadData(@NonNull GlideUrl glideUrl0, int v, int v1, @NonNull Options options0) {
        return new LoadData(glideUrl0, new OkHttpStreamFetcher(this.a, glideUrl0));
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

