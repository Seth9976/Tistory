package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public interface Predicate {
    @KeepForSdk
    boolean apply(@NonNull Object arg1);
}

