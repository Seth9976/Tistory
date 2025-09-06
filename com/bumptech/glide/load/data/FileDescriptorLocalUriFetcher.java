package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDescriptorLocalUriFetcher extends LocalUriFetcher {
    public FileDescriptorLocalUriFetcher(ContentResolver contentResolver0, Uri uri0) {
        super(contentResolver0, uri0);
    }

    public void close(ParcelFileDescriptor parcelFileDescriptor0) throws IOException {
        parcelFileDescriptor0.close();
    }

    @Override  // com.bumptech.glide.load.data.LocalUriFetcher
    public void close(Object object0) throws IOException {
        this.close(((ParcelFileDescriptor)object0));
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public Class getDataClass() {
        return ParcelFileDescriptor.class;
    }

    public ParcelFileDescriptor loadResource(Uri uri0, ContentResolver contentResolver0) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptor0 = contentResolver0.openAssetFileDescriptor(uri0, "r");
        if(assetFileDescriptor0 == null) {
            throw new FileNotFoundException("FileDescriptor is null for: " + uri0);
        }
        return assetFileDescriptor0.getParcelFileDescriptor();
    }

    @Override  // com.bumptech.glide.load.data.LocalUriFetcher
    public Object loadResource(Uri uri0, ContentResolver contentResolver0) throws FileNotFoundException {
        return this.loadResource(uri0, contentResolver0);
    }
}

