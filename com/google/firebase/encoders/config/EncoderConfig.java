package com.google.firebase.encoders.config;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ValueEncoder;

public interface EncoderConfig {
    @NonNull
    EncoderConfig registerEncoder(@NonNull Class arg1, @NonNull ObjectEncoder arg2);

    @NonNull
    EncoderConfig registerEncoder(@NonNull Class arg1, @NonNull ValueEncoder arg2);
}

