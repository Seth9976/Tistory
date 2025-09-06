package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import java.io.IOException;

interface Encoder {
    void encode(@NonNull Object arg1, @NonNull Object arg2) throws IOException;
}

