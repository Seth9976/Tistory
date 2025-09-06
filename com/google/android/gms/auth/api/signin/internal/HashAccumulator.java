package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class HashAccumulator {
    public int a;

    public HashAccumulator() {
        this.a = 1;
    }

    @NonNull
    @KeepForSdk
    public HashAccumulator addObject(@Nullable Object object0) {
        this.a = 0x1F * this.a + (object0 == null ? 0 : object0.hashCode());
        return this;
    }

    @KeepForSdk
    public int hash() {
        return this.a;
    }

    @NonNull
    public final HashAccumulator zaa(boolean z) {
        this.a = 0x1F * this.a + ((int)z);
        return this;
    }
}

