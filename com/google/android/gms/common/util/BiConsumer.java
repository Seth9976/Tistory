package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public interface BiConsumer {
    @KeepForSdk
    void accept(@NonNull Object arg1, @NonNull Object arg2);
}

