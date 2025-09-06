package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class AssetFileDescriptorLocalUriFetcher extends LocalUriFetcher {
    public AssetFileDescriptorLocalUriFetcher(ContentResolver contentResolver0, Uri uri0) {
        super(contentResolver0, uri0);
    }

    public void close(AssetFileDescriptor assetFileDescriptor0) throws IOException {
        assetFileDescriptor0.close();
    }

    @Override  // com.bumptech.glide.load.data.LocalUriFetcher
    public void close(Object object0) throws IOException {
        this.close(((AssetFileDescriptor)object0));
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public Class getDataClass() {
        return AssetFileDescriptor.class;
    }

    public AssetFileDescriptor loadResource(Uri uri0, ContentResolver contentResolver0) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptor0 = contentResolver0.openAssetFileDescriptor(uri0, "r");
        if(assetFileDescriptor0 == null) {
            throw new FileNotFoundException("FileDescriptor is null for: " + uri0);
        }
        return assetFileDescriptor0;
    }

    @Override  // com.bumptech.glide.load.data.LocalUriFetcher
    public Object loadResource(Uri uri0, ContentResolver contentResolver0) throws FileNotFoundException {
        return this.loadResource(uri0, contentResolver0);
    }
}

