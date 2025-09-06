package com.google.gson.stream;

import java.io.IOException;

public final class MalformedJsonException extends IOException {
    public MalformedJsonException(String s) {
        super(s);
    }

    public MalformedJsonException(String s, Throwable throwable0) {
        super(s, throwable0);
    }

    public MalformedJsonException(Throwable throwable0) {
        super(throwable0);
    }
}

