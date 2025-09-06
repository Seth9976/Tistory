package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;

public interface ResourceDecoder {
    @Nullable
    Resource decode(@NonNull Object arg1, int arg2, int arg3, @NonNull Options arg4) throws IOException;

    boolean handles(@NonNull Object arg1, @NonNull Options arg2) throws IOException;
}

