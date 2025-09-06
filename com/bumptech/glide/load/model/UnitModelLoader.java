package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.signature.ObjectKey;

public class UnitModelLoader implements ModelLoader {
    public static class Factory implements ModelLoaderFactory {
        public static final Factory a;

        static {
            Factory.a = new Factory();
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory0) {
            return UnitModelLoader.getInstance();
        }

        public static Factory getInstance() {
            return Factory.a;
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public static final UnitModelLoader a;

    static {
        UnitModelLoader.a = new UnitModelLoader();
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public LoadData buildLoadData(@NonNull Object object0, int v, int v1, @NonNull Options options0) {
        return new LoadData(new ObjectKey(object0), new z(object0));
    }

    public static UnitModelLoader getInstance() {
        return UnitModelLoader.a;
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Object object0) {
        return true;
    }
}

