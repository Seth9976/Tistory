package com.bumptech.glide.load.resource.bitmap;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;

public final class v implements MediaInitializer {
    @Override  // com.bumptech.glide.load.resource.bitmap.VideoDecoder$MediaInitializer
    public final void initializeExtractor(MediaExtractor mediaExtractor0, Object object0) {
        mediaExtractor0.setDataSource(((ParcelFileDescriptor)object0).getFileDescriptor());
    }

    @Override  // com.bumptech.glide.load.resource.bitmap.VideoDecoder$MediaInitializer
    public final void initializeRetriever(MediaMetadataRetriever mediaMetadataRetriever0, Object object0) {
        mediaMetadataRetriever0.setDataSource(((ParcelFileDescriptor)object0).getFileDescriptor());
    }
}

