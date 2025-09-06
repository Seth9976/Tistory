package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.signature.ObjectKey;
import java.io.IOException;

public final class DataUrlLoader implements ModelLoader {
    public interface DataDecoder {
        void close(Object arg1) throws IOException;

        Object decode(String arg1) throws IllegalArgumentException;

        Class getDataClass();
    }

    public static final class StreamFactory implements ModelLoaderFactory {
        public final f a;

        public StreamFactory() {
            this.a = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory0) {
            return new DataUrlLoader(this.a);
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public final DataDecoder a;

    public DataUrlLoader(DataDecoder dataUrlLoader$DataDecoder0) {
        this.a = dataUrlLoader$DataDecoder0;
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public LoadData buildLoadData(@NonNull Object object0, int v, int v1, @NonNull Options options0) {
        return new LoadData(new ObjectKey(object0), new e(object0.toString(), this.a));
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Object object0) {
        return object0.toString().startsWith("data:image");
    }
}

