package com.bumptech.glide.load;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;

public interface Transformation extends Key {
    @NonNull
    Resource transform(@NonNull Context arg1, @NonNull Resource arg2, int arg3, int arg4);
}

