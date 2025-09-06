package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;

@KeepForSdk
public class BooleanResult implements Result {
    public final Status a;
    public final boolean b;

    @KeepForSdk
    @ShowFirstParty
    public BooleanResult(@NonNull Status status0, boolean z) {
        this.a = (Status)Preconditions.checkNotNull(status0, "Status must not be null");
        this.b = z;
    }

    @Override
    @KeepForSdk
    public final boolean equals(@Nullable Object object0) {
        if(object0 == null) {
            return false;
        }
        if(object0 == this) {
            return true;
        }
        return object0 instanceof BooleanResult ? this.a.equals(((BooleanResult)object0).a) && this.b == ((BooleanResult)object0).b : false;
    }

    @Override  // com.google.android.gms.common.api.Result
    @NonNull
    @KeepForSdk
    public Status getStatus() {
        return this.a;
    }

    @KeepForSdk
    public boolean getValue() {
        return this.b;
    }

    @Override
    @KeepForSdk
    public final int hashCode() {
        return (this.a.hashCode() + 0x20F) * 0x1F + this.b;
    }
}

