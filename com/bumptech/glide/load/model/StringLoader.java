package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import java.io.File;
import java.io.InputStream;

public class StringLoader implements ModelLoader {
    public static final class AssetFileDescriptorFactory implements ModelLoaderFactory {
        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory0) {
            return new StringLoader(multiModelLoaderFactory0.build(Uri.class, AssetFileDescriptor.class));
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public static class FileDescriptorFactory implements ModelLoaderFactory {
        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory0) {
            return new StringLoader(multiModelLoaderFactory0.build(Uri.class, ParcelFileDescriptor.class));
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public static class StreamFactory implements ModelLoaderFactory {
        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory0) {
            return new StringLoader(multiModelLoaderFactory0.build(Uri.class, InputStream.class));
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public final ModelLoader a;

    public StringLoader(ModelLoader modelLoader0) {
        this.a = modelLoader0;
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public LoadData buildLoadData(@NonNull Object object0, int v, int v1, @NonNull Options options0) {
        return this.buildLoadData(((String)object0), v, v1, options0);
    }

    public LoadData buildLoadData(@NonNull String s, int v, int v1, @NonNull Options options0) {
        Uri uri0;
        if(TextUtils.isEmpty(s)) {
            uri0 = null;
        }
        else if(s.charAt(0) == 0x2F) {
            uri0 = Uri.fromFile(new File(s));
        }
        else {
            Uri uri1 = Uri.parse(s);
            uri0 = uri1.getScheme() == null ? Uri.fromFile(new File(s)) : uri1;
        }
        if(uri0 != null) {
            return this.a.handles(uri0) ? this.a.buildLoadData(uri0, v, v1, options0) : null;
        }
        return null;
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Object object0) {
        return this.handles(((String)object0));
    }

    public boolean handles(@NonNull String s) {
        return true;
    }
}

