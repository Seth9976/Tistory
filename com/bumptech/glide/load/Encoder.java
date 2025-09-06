package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import java.io.File;

public interface Encoder {
    boolean encode(@NonNull Object arg1, @NonNull File arg2, @NonNull Options arg3);
}

