package com.bumptech.glide.load;

import androidx.annotation.Nullable;
import java.io.IOException;

public final class HttpException extends IOException {
    public static final int UNKNOWN = -1;
    public final int a;

    public HttpException(int v) {
        this("Http request failed", v);
    }

    @Deprecated
    public HttpException(String s) {
        this(s, -1);
    }

    public HttpException(String s, int v) {
        this(s, v, null);
    }

    public HttpException(String s, int v, @Nullable Throwable throwable0) {
        super(s + ", status code: " + v, throwable0);
        this.a = v;
    }

    public int getStatusCode() {
        return this.a;
    }
}

