package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MarkEnforcingInputStream extends FilterInputStream {
    public int a;

    public MarkEnforcingInputStream(@NonNull InputStream inputStream0) {
        super(inputStream0);
        this.a = 0x80000000;
    }

    public final long a(long v) {
        int v1 = this.a;
        if(v1 == 0) {
            return -1L;
        }
        return v1 == 0x80000000 || v <= ((long)v1) ? v : ((long)v1);
    }

    @Override
    public int available() throws IOException {
        return this.a == 0x80000000 ? super.available() : Math.min(this.a, super.available());
    }

    public final void b(long v) {
        int v1 = this.a;
        if(v1 != 0x80000000 && v != -1L) {
            this.a = (int)(((long)v1) - v);
        }
    }

    @Override
    public void mark(int v) {
        synchronized(this) {
            super.mark(v);
            this.a = v;
        }
    }

    @Override
    public int read() throws IOException {
        if(this.a(1L) == -1L) {
            return -1;
        }
        int v = super.read();
        this.b(1L);
        return v;
    }

    @Override
    public int read(@NonNull byte[] arr_b, int v, int v1) throws IOException {
        int v2 = (int)this.a(((long)v1));
        if(v2 == -1) {
            return -1;
        }
        int v3 = super.read(arr_b, v, v2);
        this.b(((long)v3));
        return v3;
    }

    @Override
    public void reset() throws IOException {
        synchronized(this) {
            super.reset();
            this.a = 0x80000000;
        }
    }

    @Override
    public long skip(long v) throws IOException {
        long v1 = this.a(v);
        if(v1 == -1L) {
            return 0L;
        }
        long v2 = super.skip(v1);
        this.b(v2);
        return v2;
    }
}

