package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class ExifOrientationStream extends FilterInputStream {
    public final byte a;
    public int b;
    public static final byte[] c;
    public static final int d;

    static {
        ExifOrientationStream.c = new byte[]{-1, (byte)0xE1, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        ExifOrientationStream.d = 0x1F;
    }

    public ExifOrientationStream(InputStream inputStream0, int v) {
        super(inputStream0);
        if(v < -1 || v > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + v);
        }
        this.a = (byte)v;
    }

    @Override
    public void mark(int v) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public int read() throws IOException {
        int v2;
        int v = this.b;
        if(v >= 2) {
            int v1 = ExifOrientationStream.d;
            if(v > v1) {
                v2 = super.read();
            }
            else if(v == v1) {
                v2 = this.a;
            }
            else {
                v2 = ExifOrientationStream.c[v - 2] & 0xFF;
            }
        }
        else {
            v2 = super.read();
        }
        if(v2 != -1) {
            ++this.b;
        }
        return v2;
    }

    @Override
    public int read(@NonNull byte[] arr_b, int v, int v1) throws IOException {
        int v4;
        int v2 = this.b;
        int v3 = ExifOrientationStream.d;
        if(v2 > v3) {
            v4 = super.read(arr_b, v, v1);
        }
        else if(v2 == v3) {
            arr_b[v] = this.a;
            v4 = 1;
        }
        else if(v2 < 2) {
            v4 = super.read(arr_b, v, 2 - v2);
        }
        else {
            int v5 = Math.min(v3 - v2, v1);
            System.arraycopy(ExifOrientationStream.c, this.b - 2, arr_b, v, v5);
            v4 = v5;
        }
        if(v4 > 0) {
            this.b += v4;
        }
        return v4;
    }

    @Override
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public long skip(long v) throws IOException {
        long v1 = super.skip(v);
        if(v1 > 0L) {
            this.b = (int)(((long)this.b) + v1);
        }
        return v1;
    }
}

