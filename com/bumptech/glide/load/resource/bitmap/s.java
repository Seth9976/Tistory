package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;

public final class s implements MediaInitializer {
    @Override  // com.bumptech.glide.load.resource.bitmap.VideoDecoder$MediaInitializer
    public final void initializeExtractor(MediaExtractor mediaExtractor0, Object object0) {
        mediaExtractor0.setDataSource(((AssetFileDescriptor)object0).getFileDescriptor(), ((AssetFileDescriptor)object0).getStartOffset(), ((AssetFileDescriptor)object0).getLength());
    }

    @Override  // com.bumptech.glide.load.resource.bitmap.VideoDecoder$MediaInitializer
    public final void initializeRetriever(MediaMetadataRetriever mediaMetadataRetriever0, Object object0) {
        mediaMetadataRetriever0.setDataSource(((AssetFileDescriptor)object0).getFileDescriptor(), ((AssetFileDescriptor)object0).getStartOffset(), ((AssetFileDescriptor)object0).getLength());
    }
}

