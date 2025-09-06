package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.signature.ObjectKey;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileLoader implements ModelLoader {
    public static class Factory implements ModelLoaderFactory {
        public final FileOpener a;

        public Factory(FileOpener fileLoader$FileOpener0) {
            this.a = fileLoader$FileOpener0;
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public final ModelLoader build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory0) {
            return new FileLoader(this.a);
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public final void teardown() {
        }
    }

    public static class FileDescriptorFactory extends Factory {
        public FileDescriptorFactory() {
            super(new k());  // 初始化器: Ljava/lang/Object;-><init>()V
        }
    }

    public interface FileOpener {
        void close(Object arg1) throws IOException;

        Class getDataClass();

        Object open(File arg1) throws FileNotFoundException;
    }

    public static class StreamFactory extends Factory {
        public StreamFactory() {
            super(new m());  // 初始化器: Ljava/lang/Object;-><init>()V
        }
    }

    public final FileOpener a;

    public FileLoader(FileOpener fileLoader$FileOpener0) {
        this.a = fileLoader$FileOpener0;
    }

    public LoadData buildLoadData(@NonNull File file0, int v, int v1, @NonNull Options options0) {
        return new LoadData(new ObjectKey(file0), new l(file0, this.a));
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

