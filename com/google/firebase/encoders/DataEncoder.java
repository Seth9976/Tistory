package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.Writer;

public interface DataEncoder {
    @NonNull
    String encode(@NonNull Object arg1);

    void encode(@NonNull Object arg1, @NonNull Writer arg2) throws IOException;
}

