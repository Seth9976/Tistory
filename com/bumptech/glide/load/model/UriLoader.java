package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.AssetFileDescriptorLocalUriFetcher;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.FileDescriptorLocalUriFetcher;
import com.bumptech.glide.load.data.StreamLocalUriFetcher;
import com.bumptech.glide.signature.ObjectKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UriLoader implements ModelLoader {
    public static final class AssetFileDescriptorFactory implements ModelLoaderFactory, LocalUriFetcherFactory {
        public final ContentResolver a;

        public AssetFileDescriptorFactory(ContentResolver contentResolver0) {
            this.a = contentResolver0;
        }

        @Override  // com.bumptech.glide.load.model.UriLoader$LocalUriFetcherFactory
        public DataFetcher build(Uri uri0) {
            return new AssetFileDescriptorLocalUriFetcher(this.a, uri0);
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory0) {
            return new UriLoader(this);
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public static class FileDescriptorFactory implements ModelLoaderFactory, LocalUriFetcherFactory {
        public final ContentResolver a;

        public FileDescriptorFactory(ContentResolver contentResolver0) {
            this.a = contentResolver0;
        }

        @Override  // com.bumptech.glide.load.model.UriLoader$LocalUriFetcherFactory
        public DataFetcher build(Uri uri0) {
            return new FileDescriptorLocalUriFetcher(this.a, uri0);
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory0) {
            return new UriLoader(this);
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public interface LocalUriFetcherFactory {
        DataFetcher build(Uri arg1);
    }

    public static class StreamFactory implements ModelLoaderFactory, LocalUriFetcherFactory {
        public final ContentResolver a;

        public StreamFactory(ContentResolver contentResolver0) {
            this.a = contentResolver0;
        }

        @Override  // com.bumptech.glide.load.model.UriLoader$LocalUriFetcherFactory
        public DataFetcher build(Uri uri0) {
            return new StreamLocalUriFetcher(this.a, uri0);
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory0) {
            return new UriLoader(this);
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public final LocalUriFetcherFactory a;
    public static final Set b;

    static {
        UriLoader.b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "content", "android.resource"})));
    }

    public UriLoader(LocalUriFetcherFactory uriLoader$LocalUriFetcherFactory0) {
        this.a = uriLoader$LocalUriFetcherFactory0;
    }

    public LoadData buildLoadData(@NonNull Uri uri0, int v, int v1, @NonNull Options options0) {
        return new LoadData(new ObjectKey(uri0), this.a.build(uri0));
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public LoadData buildLoadData(@NonNull Object object0, int v, int v1, @NonNull Options options0) {
        return this.buildLoadData(((Uri)object0), v, v1, options0);
    }

    public boolean handles(@NonNull Uri uri0) {
        String s = uri0.getScheme();
        return UriLoader.b.contains(s);
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Object object0) {
        return this.handles(((Uri)object0));
    }
}

