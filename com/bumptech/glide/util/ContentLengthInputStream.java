package com.bumptech.glide.util;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class ContentLengthInputStream extends FilterInputStream {
    public final long a;
    public int b;

    public ContentLengthInputStream(InputStream inputStream0, long v) {
        super(inputStream0);
        this.a = v;
    }

    public final void a(int v) {
        if(v >= 0) {
            this.b += v;
            return;
        }
        long v1 = this.a;
        if(v1 - ((long)this.b) > 0L) {
            throw new IOException("Failed to read all expected data, expected: " + v1 + ", but read: " + this.b);
        }
    }

    @Override
    public int available() throws IOException {
        long v1;
        synchronized(this) {
            v1 = Math.max(this.a - ((long)this.b), this.in.available());
        }
        return (int)v1;
    }

    @NonNull
    public static InputStream obtain(@NonNull InputStream inputStream0, long v) {
        return new ContentLengthInputStream(inputStream0, v);
    }

    @NonNull
    public static InputStream obtain(@NonNull InputStream inputStream0, @Nullable String s) {
        if(!TextUtils.isEmpty(s)) {
            try {
                return ContentLengthInputStream.obtain(inputStream0, ((long)Integer.parseInt(s)));
            }
            catch(NumberFormatException numberFormatException0) {
                if(Log.isLoggable("ContentLengthStream", 3)) {
                    Log.d("ContentLengthStream", "failed to parse content length header: " + s, numberFormatException0);
                    return ContentLengthInputStream.obtain(inputStream0, -1L);
                }
            }
        }
        return ContentLengthInputStream.obtain(inputStream0, -1L);
    }

    @Override
    public int read() throws IOException {
        synchronized(this) {
            int v1 = super.read();
            this.a((v1 < 0 ? -1 : 1));
            return v1;
        }
    }

    @Override
    public int read(byte[] arr_b) throws IOException {
        return this.read(arr_b, 0, arr_b.length);
    }

    @Override
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        synchronized(this) {
            int v3 = super.read(arr_b, v, v1);
            this.a(v3);
            return v3;
        }
    }
}

