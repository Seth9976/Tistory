package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;

public interface ObjectEncoderContext {
    @NonNull
    ObjectEncoderContext add(@NonNull FieldDescriptor arg1, double arg2) throws IOException;

    @NonNull
    ObjectEncoderContext add(@NonNull FieldDescriptor arg1, float arg2) throws IOException;

    @NonNull
    ObjectEncoderContext add(@NonNull FieldDescriptor arg1, int arg2) throws IOException;

    @NonNull
    ObjectEncoderContext add(@NonNull FieldDescriptor arg1, long arg2) throws IOException;

    @NonNull
    ObjectEncoderContext add(@NonNull FieldDescriptor arg1, @Nullable Object arg2) throws IOException;

    @NonNull
    ObjectEncoderContext add(@NonNull FieldDescriptor arg1, boolean arg2) throws IOException;

    @NonNull
    @Deprecated
    ObjectEncoderContext add(@NonNull String arg1, double arg2) throws IOException;

    @NonNull
    @Deprecated
    ObjectEncoderContext add(@NonNull String arg1, int arg2) throws IOException;

    @NonNull
    @Deprecated
    ObjectEncoderContext add(@NonNull String arg1, long arg2) throws IOException;

    @NonNull
    @Deprecated
    ObjectEncoderContext add(@NonNull String arg1, @Nullable Object arg2) throws IOException;

    @NonNull
    @Deprecated
    ObjectEncoderContext add(@NonNull String arg1, boolean arg2) throws IOException;

    @NonNull
    ObjectEncoderContext inline(@Nullable Object arg1) throws IOException;

    @NonNull
    ObjectEncoderContext nested(@NonNull FieldDescriptor arg1) throws IOException;

    @NonNull
    ObjectEncoderContext nested(@NonNull String arg1) throws IOException;
}

