package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.signature.ObjectKey;
import java.io.File;

public class ByteBufferFileLoader implements ModelLoader {
    public static class Factory implements ModelLoaderFactory {
        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory0) {
            return new ByteBufferFileLoader();
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public LoadData buildLoadData(@NonNull File file0, int v, int v1, @NonNull Options options0) {
        return new LoadData(new ObjectKey(file0), new d(file0));
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public LoadData buildLoadData(@NonNull Object object0, int v, int v1, @NonNull Options options0) {
        return this.buildLoadData(((File)object0), v, v1, options0);
    }

    public boolean handles(@NonNull File file0) {
        return true;
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Object object0) {
        return this.handles(((File)object0));
    }
}

