package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;

public class FileDescriptorAssetPathFetcher extends AssetPathFetcher {
    public FileDescriptorAssetPathFetcher(AssetManager assetManager0, String s) {
        super(assetManager0, s);
    }

    public void close(AssetFileDescriptor assetFileDescriptor0) throws IOException {
        assetFileDescriptor0.close();
    }

    @Override  // com.bumptech.glide.load.data.AssetPathFetcher
    public void close(Object object0) throws IOException {
        this.close(((AssetFileDescriptor)object0));
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public Class getDataClass() {
        return AssetFileDescriptor.class;
    }

    public AssetFileDescriptor loadResource(AssetManager assetManager0, String s) throws IOException {
        return assetManager0.openFd(s);
    }

    @Override  // com.bumptech.glide.load.data.AssetPathFetcher
    public Object loadResource(AssetManager assetManager0, String s) throws IOException {
        return this.loadResource(assetManager0, s);
    }
}

