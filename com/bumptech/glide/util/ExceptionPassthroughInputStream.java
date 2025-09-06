package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public final class ExceptionPassthroughInputStream extends InputStream {
    public InputStream a;
    public IOException b;
    public static final Queue c;

    static {
        ExceptionPassthroughInputStream.c = Util.createQueue(0);
    }

    @Override
    public int available() throws IOException {
        return this.a.available();
    }

    @Override
    public void close() throws IOException {
        this.a.close();
    }

    @Nullable
    public IOException getException() {
        return this.b;
    }

    @Override
    public void mark(int v) {
        this.a.mark(v);
    }

    @Override
    public boolean markSupported() {
        return this.a.markSupported();
    }

    @NonNull
    public static ExceptionPassthroughInputStream obtain(@NonNull InputStream inputStream0) {
        ExceptionPassthroughInputStream exceptionPassthroughInputStream0;
        synchronized(ExceptionPassthroughInputStream.c) {
            exceptionPassthroughInputStream0 = (ExceptionPassthroughInputStream)ExceptionPassthroughInputStream.c.poll();
        }
        if(exceptionPassthroughInputStream0 == null) {
            exceptionPassthroughInputStream0 = new ExceptionPassthroughInputStream();  // 初始化器: Ljava/io/InputStream;-><init>()V
        }
        exceptionPassthroughInputStream0.a = inputStream0;
        return exceptionPassthroughInputStream0;
    }

    @Override
    public int read() throws IOException {
        try {
            return this.a.read();
        }
        catch(IOException iOException0) {
            this.b = iOException0;
            throw iOException0;
        }
    }

    @Override
    public int read(byte[] arr_b) throws IOException {
        try {
            return this.a.read(arr_b);
        }
        catch(IOException iOException0) {
            this.b = iOException0;
            throw iOException0;
        }
    }

    @Override
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        try {
            return this.a.read(arr_b, v, v1);
        }
        catch(IOException iOException0) {
            this.b = iOException0;
            throw iOException0;
        }
    }

    public void release() {
        this.b = null;
        this.a = null;
        synchronized(ExceptionPassthroughInputStream.c) {
            ExceptionPassthroughInputStream.c.offer(this);
        }
    }

    @Override
    public void reset() throws IOException {
        synchronized(this) {
            this.a.reset();
        }
    }

    @Override
    public long skip(long v) throws IOException {
        try {
            return this.a.skip(v);
        }
        catch(IOException iOException0) {
            this.b = iOException0;
            throw iOException0;
        }
    }
}

