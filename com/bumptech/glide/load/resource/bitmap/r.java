package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.Option.CacheKeyUpdater;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class r implements CacheKeyUpdater {
    public final ByteBuffer a;

    public r() {
        this.a = ByteBuffer.allocate(4);
    }

    @Override  // com.bumptech.glide.load.Option$CacheKeyUpdater
    public final void update(byte[] arr_b, Object object0, MessageDigest messageDigest0) {
        ByteBuffer byteBuffer0;
        Integer integer0 = (Integer)object0;
        if(integer0 != null) {
            messageDigest0.update(arr_b);
            byteBuffer0 = this.a;
            synchronized(byteBuffer0) {
                this.a.position(0);
                messageDigest0.update(this.a.putInt(((int)integer0)).array());
            }
        }
    }
}

