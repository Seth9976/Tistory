package com.google.firebase.encoders;

import androidx.annotation.NonNull;

public final class EncodingException extends RuntimeException {
    public EncodingException(@NonNull String s) {
        super(s);
    }

    public EncodingException(@NonNull String s, @NonNull Exception exception0) {
        super(s, exception0);
    }
}

