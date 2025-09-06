package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;
import java.nio.ByteBuffer;

public class ByteBufferBitmapDecoder implements ResourceDecoder {
    public final Downsampler a;

    public ByteBufferBitmapDecoder(Downsampler downsampler0) {
        this.a = downsampler0;
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public Resource decode(@NonNull Object object0, int v, int v1, @NonNull Options options0) throws IOException {
        return this.decode(((ByteBuffer)object0), v, v1, options0);
    }

    public Resource decode(@NonNull ByteBuffer byteBuffer0, int v, int v1, @NonNull Options options0) throws IOException {
        return this.a.decode(byteBuffer0, v, v1, options0);
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull Object object0, @NonNull Options options0) throws IOException {
        return this.handles(((ByteBuffer)object0), options0);
    }

    public boolean handles(@NonNull ByteBuffer byteBuffer0, @NonNull Options options0) {
        return true;
    }
}

