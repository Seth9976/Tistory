package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;

public interface ValueEncoderContext {
    @NonNull
    ValueEncoderContext add(double arg1) throws IOException;

    @NonNull
    ValueEncoderContext add(float arg1) throws IOException;

    @NonNull
    ValueEncoderContext add(int arg1) throws IOException;

    @NonNull
    ValueEncoderContext add(long arg1) throws IOException;

    @NonNull
    ValueEncoderContext add(@Nullable String arg1) throws IOException;

    @NonNull
    ValueEncoderContext add(boolean arg1) throws IOException;

    @NonNull
    ValueEncoderContext add(@NonNull byte[] arg1) throws IOException;
}

