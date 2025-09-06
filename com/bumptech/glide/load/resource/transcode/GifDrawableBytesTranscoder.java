package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bytes.BytesResource;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.util.ByteBufferUtil;

public class GifDrawableBytesTranscoder implements ResourceTranscoder {
    @Override  // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @Nullable
    public Resource transcode(@NonNull Resource resource0, @NonNull Options options0) {
        return new BytesResource(ByteBufferUtil.toBytes(((GifDrawable)resource0.get()).getBuffer()));
    }
}

