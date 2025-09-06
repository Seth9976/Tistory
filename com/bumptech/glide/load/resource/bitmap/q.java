package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.Option.CacheKeyUpdater;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class q implements CacheKeyUpdater {
    public final ByteBuffer a;

    public q() {
        this.a = ByteBuffer.allocate(8);
    }

    @Override  // com.bumptech.glide.load.Option$CacheKeyUpdater
    public final void update(byte[] arr_b, Object object0, MessageDigest messageDigest0) {
        messageDigest0.update(arr_b);
        synchronized(this.a) {
            this.a.position(0);
            messageDigest0.update(this.a.putLong(((long)(((Long)object0)))).array());
        }
    }
}

