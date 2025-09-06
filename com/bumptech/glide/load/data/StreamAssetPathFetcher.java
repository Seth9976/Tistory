package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

public class StreamAssetPathFetcher extends AssetPathFetcher {
    public StreamAssetPathFetcher(AssetManager assetManager0, String s) {
        super(assetManager0, s);
    }

    public void close(InputStream inputStream0) throws IOException {
        inputStream0.close();
    }

    @Override  // com.bumptech.glide.load.data.AssetPathFetcher
    public void close(Object object0) throws IOException {
        this.close(((InputStream)object0));
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public Class getDataClass() {
        return InputStream.class;
    }

    public InputStream loadResource(AssetManager assetManager0, String s) throws IOException {
        return assetManager0.open(s);
    }

    @Override  // com.bumptech.glide.load.data.AssetPathFetcher
    public Object loadResource(AssetManager assetManager0, String s) throws IOException {
        return this.loadResource(assetManager0, s);
    }
}

