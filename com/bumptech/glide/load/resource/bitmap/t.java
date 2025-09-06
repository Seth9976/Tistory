package com.bumptech.glide.load.resource.bitmap;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

public final class t extends MediaDataSource {
    public final ByteBuffer a;

    public t(ByteBuffer byteBuffer0) {
        this.a = byteBuffer0;
        super();
    }

    @Override
    public final void close() {
    }

    @Override  // android.media.MediaDataSource
    public final long getSize() {
        return (long)this.a.limit();
    }

    @Override  // android.media.MediaDataSource
    public final int readAt(long v, byte[] arr_b, int v1, int v2) {
        ByteBuffer byteBuffer0 = this.a;
        if(v >= ((long)byteBuffer0.limit())) {
            return -1;
        }
        byteBuffer0.position(((int)v));
        int v3 = Math.min(v2, byteBuffer0.remaining());
        byteBuffer0.get(arr_b, v1, v3);
        return v3;
    }
}

