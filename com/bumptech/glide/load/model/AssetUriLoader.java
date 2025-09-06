package com.bumptech.glide.load.model;

import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.FileDescriptorAssetPathFetcher;
import com.bumptech.glide.load.data.StreamAssetPathFetcher;
import com.bumptech.glide.signature.ObjectKey;

public class AssetUriLoader implements ModelLoader {
    public interface AssetFetcherFactory {
        DataFetcher buildFetcher(AssetManager arg1, String arg2);
    }

    public static class FileDescriptorFactory implements AssetFetcherFactory, ModelLoaderFactory {
        public final AssetManager a;

        public FileDescriptorFactory(AssetManager assetManager0) {
            this.a = assetManager0;
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory0) {
            return new AssetUriLoader(this.a, this);
        }

        @Override  // com.bumptech.glide.load.model.AssetUriLoader$AssetFetcherFactory
        public DataFetcher buildFetcher(AssetManager assetManager0, String s) {
            return new FileDescriptorAssetPathFetcher(assetManager0, s);
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public static class StreamFactory implements AssetFetcherFactory, ModelLoaderFactory {
        public final AssetManager a;

        public StreamFactory(AssetManager assetManager0) {
            this.a = assetManager0;
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory0) {
            return new AssetUriLoader(this.a, this);
        }

        @Override  // com.bumptech.glide.load.model.AssetUriLoader$AssetFetcherFactory
        public DataFetcher buildFetcher(AssetManager assetManager0, String s) {
            return new StreamAssetPathFetcher(assetManager0, s);
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public final AssetManager a;
    public final AssetFetcherFactory b;

    public AssetUriLoader(AssetManager assetManager0, AssetFetcherFactory assetUriLoader$AssetFetcherFactory0) {
        this.a = assetManager0;
        this.b = assetUriLoader$AssetFetcherFactory0;
    }

    public LoadData buildLoadData(@NonNull Uri uri0, int v, int v1, @NonNull Options options0) {
        return new LoadData(new ObjectKey(uri0), this.b.buildFetcher(this.a, uri0.toString().substring(22)));
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public LoadData buildLoadData(@NonNull Object object0, int v, int v1, @NonNull Options options0) {
        return this.buildLoadData(((Uri)object0), v, v1, options0);
    }

    // 去混淆评级： 低(30)
    public boolean handles(@NonNull Uri uri0) {
        return "file".equals(uri0.getScheme()) && !uri0.getPathSegments().isEmpty() && "android_asset".equals(uri0.getPathSegments().get(0));
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Object object0) {
        return this.handles(((Uri)object0));
    }
}

