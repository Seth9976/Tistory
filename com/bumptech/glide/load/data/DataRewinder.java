package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.IOException;

public interface DataRewinder {
    public interface Factory {
        @NonNull
        DataRewinder build(@NonNull Object arg1);

        @NonNull
        Class getDataClass();
    }

    void cleanup();

    @NonNull
    Object rewindAndGet() throws IOException;
}

