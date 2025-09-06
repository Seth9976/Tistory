package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@KeepForSdk
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public boolean a;
    public static final Object b;

    static {
        DowngradeableSafeParcel.b = new Object();
    }

    public DowngradeableSafeParcel() {
        this.a = false;
    }

    @KeepForSdk
    public static boolean canUnparcelSafely(@NonNull String s) {
        synchronized(DowngradeableSafeParcel.b) {
        }
        return true;
    }

    @Nullable
    @KeepForSdk
    public static Integer getUnparcelClientVersion() {
        synchronized(DowngradeableSafeParcel.b) {
        }
        return null;
    }

    @KeepForSdk
    public abstract boolean prepareForClientVersion(int arg1);

    @KeepForSdk
    public void setShouldDowngrade(boolean z) {
        this.a = z;
    }

    @KeepForSdk
    public boolean shouldDowngrade() {
        return this.a;
    }
}

