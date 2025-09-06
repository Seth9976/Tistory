package com.bumptech.glide.load.resource.bitmap;

import java.io.InputStream;

public final class b implements Reader {
    public final InputStream a;

    public b(InputStream inputStream0) {
        this.a = inputStream0;
    }

    @Override  // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader
    public final int getUInt16() {
        return this.getUInt8() << 8 | this.getUInt8();
    }

    @Override  // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader
    public final short getUInt8() {
        int v = this.a.read();
        if(v == -1) {
            throw new EndOfFileException();
        }
        return (short)v;
    }

    @Override  // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader
    public final int read(byte[] arr_b, int v) {
        int v1 = 0;
        int v2 = 0;
        while(v1 < v) {
            v2 = this.a.read(arr_b, v1, v - v1);
            if(v2 == -1) {
                break;
            }
            v1 += v2;
        }
        if(v1 == 0 && v2 == -1) {
            throw new EndOfFileException();
        }
        return v1;
    }

    @Override  // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader
    public final long skip(long v) {
        if(v < 0L) {
            return 0L;
        }
        long v1 = v;
        while(v1 > 0L) {
            InputStream inputStream0 = this.a;
            long v2 = inputStream0.skip(v1);
            if(v2 > 0L) {
                v1 -= v2;
            }
            else {
                if(inputStream0.read() == -1) {
                    break;
                }
                --v1;
            }
        }
        return v - v1;
    }
}

