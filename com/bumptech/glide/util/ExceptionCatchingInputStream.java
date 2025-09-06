package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

@Deprecated
public class ExceptionCatchingInputStream extends InputStream {
    public InputStream a;
    public IOException b;
    public static final Queue c;

    static {
        ExceptionCatchingInputStream.c = Util.createQueue(0);
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
    public static ExceptionCatchingInputStream obtain(@NonNull InputStream inputStream0) {
        ExceptionCatchingInputStream exceptionCatchingInputStream0;
        synchronized(ExceptionCatchingInputStream.c) {
            exceptionCatchingInputStream0 = (ExceptionCatchingInputStream)ExceptionCatchingInputStream.c.poll();
        }
        if(exceptionCatchingInputStream0 == null) {
            exceptionCatchingInputStream0 = new ExceptionCatchingInputStream();  // 初始化器: Ljava/io/InputStream;-><init>()V
        }
        exceptionCatchingInputStream0.a = inputStream0;
        return exceptionCatchingInputStream0;
    }

    @Override
    public int read() {
        try {
            return this.a.read();
        }
        catch(IOException iOException0) {
            this.b = iOException0;
            return -1;
        }
    }

    @Override
    public int read(byte[] arr_b) {
        try {
            return this.a.read(arr_b);
        }
        catch(IOException iOException0) {
            this.b = iOException0;
            return -1;
        }
    }

    @Override
    public int read(byte[] arr_b, int v, int v1) {
        try {
            return this.a.read(arr_b, v, v1);
        }
        catch(IOException iOException0) {
            this.b = iOException0;
            return -1;
        }
    }

    public void release() {
        this.b = null;
        this.a = null;
        synchronized(ExceptionCatchingInputStream.c) {
            ExceptionCatchingInputStream.c.offer(this);
        }
    }

    @Override
    public void reset() throws IOException {
        synchronized(this) {
            this.a.reset();
        }
    }

    @Override
    public long skip(long v) {
        try {
            return this.a.skip(v);
        }
        catch(IOException iOException0) {
            this.b = iOException0;
            return 0L;
        }
    }
}

