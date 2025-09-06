package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@KeepForSdk
@Class(creator = "RootTelemetryConfigurationCreator")
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    static {
        RootTelemetryConfiguration.CREATOR = new zzai();
    }

    @Constructor
    public RootTelemetryConfiguration(@Param(id = 1) int v, @Param(id = 2) boolean z, @Param(id = 3) boolean z1, @Param(id = 4) int v1, @Param(id = 5) int v2) {
        this.a = v;
        this.b = z;
        this.c = z1;
        this.d = v1;
        this.e = v2;
    }

    @KeepForSdk
    public int getBatchPeriodMillis() {
        return this.d;
    }

    @KeepForSdk
    public int getMaxMethodInvocationsInBatch() {
        return this.e;
    }

    @KeepForSdk
    public boolean getMethodInvocationTelemetryEnabled() {
        return this.b;
    }

    @KeepForSdk
    public boolean getMethodTimingTelemetryEnabled() {
        return this.c;
    }

    @KeepForSdk
    public int getVersion() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.getVersion());
        SafeParcelWriter.writeBoolean(parcel0, 2, this.getMethodInvocationTelemetryEnabled());
        SafeParcelWriter.writeBoolean(parcel0, 3, this.getMethodTimingTelemetryEnabled());
        SafeParcelWriter.writeInt(parcel0, 4, this.getBatchPeriodMillis());
        SafeParcelWriter.writeInt(parcel0, 5, this.getMaxMethodInvocationsInBatch());
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

