package com.bumptech.glide.module;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;

@Deprecated
interface RegistersComponents {
    void registerComponents(@NonNull Context arg1, @NonNull Glide arg2, @NonNull Registry arg3);
}

