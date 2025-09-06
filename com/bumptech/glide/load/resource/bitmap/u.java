package com.bumptech.glide.load.resource.bitmap;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import java.nio.ByteBuffer;

public final class u implements MediaInitializer {
    @Override  // com.bumptech.glide.load.resource.bitmap.VideoDecoder$MediaInitializer
    public final void initializeExtractor(MediaExtractor mediaExtractor0, Object object0) {
        mediaExtractor0.setDataSource(new t(((ByteBuffer)object0)));
    }

    @Override  // com.bumptech.glide.load.resource.bitmap.VideoDecoder$MediaInitializer
    public final void initializeRetriever(MediaMetadataRetriever mediaMetadataRetriever0, Object object0) {
        mediaMetadataRetriever0.setDataSource(new t(((ByteBuffer)object0)));
    }
}

