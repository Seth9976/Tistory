package com.bumptech.glide.load.resource.bitmap;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class a implements Reader {
    public final ByteBuffer a;

    public a(ByteBuffer byteBuffer0) {
        this.a = byteBuffer0;
        byteBuffer0.order(ByteOrder.BIG_ENDIAN);
    }

    @Override  // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader
    public final int getUInt16() {
        return this.getUInt8() << 8 | this.getUInt8();
    }

    @Override  // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader
    public final short getUInt8() {
        ByteBuffer byteBuffer0 = this.a;
        if(byteBuffer0.remaining() < 1) {
            throw new EndOfFileException();
        }
        return (short)(byteBuffer0.get() & 0xFF);
    }

    @Override  // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader
    public final int read(byte[] arr_b, int v) {
        ByteBuffer byteBuffer0 = this.a;
        int v1 = Math.min(v, byteBuffer0.remaining());
        if(v1 == 0) {
            return -1;
        }
        byteBuffer0.get(arr_b, 0, v1);
        return v1;
    }

    @Override  // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader
    public final long skip(long v) {
        int v1 = (int)Math.min(this.a.remaining(), v);
        this.a.position(this.a.position() + v1);
        return (long)v1;
    }
}

