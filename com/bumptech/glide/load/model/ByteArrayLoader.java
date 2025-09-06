package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.signature.ObjectKey;

public class ByteArrayLoader implements ModelLoader {
    public static class ByteBufferFactory implements ModelLoaderFactory {
        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory0) {
            return new ByteArrayLoader(new a());  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public interface Converter {
        Object convert(byte[] arg1);

        Class getDataClass();
    }

    public static class StreamFactory implements ModelLoaderFactory {
        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory0) {
            return new ByteArrayLoader(new c());  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public final Converter a;

    public ByteArrayLoader(Converter byteArrayLoader$Converter0) {
        this.a = byteArrayLoader$Converter0;
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public LoadData buildLoadData(@NonNull Object object0, int v, int v1, @NonNull Options options0) {
        return this.buildLoadData(((byte[])object0), v, v1, options0);
    }

    public LoadData buildLoadData(@NonNull byte[] arr_b, int v, int v1, @NonNull Options options0) {
        return new LoadData(new ObjectKey(arr_b), new b(arr_b, this.a));
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Object object0) {
        return this.handles(((byte[])object0));
    }

    public boolean handles(@NonNull byte[] arr_b) {
        return true;
    }
}

