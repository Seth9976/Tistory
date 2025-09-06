package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@KeepForSdk
@Class(creator = "ConnectionTelemetryConfigurationCreator")
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator CREATOR;
    public final RootTelemetryConfiguration a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    static {
        ConnectionTelemetryConfiguration.CREATOR = new zzl();
    }

    @Constructor
    public ConnectionTelemetryConfiguration(@NonNull @Param(id = 1) RootTelemetryConfiguration rootTelemetryConfiguration0, @Param(id = 2) boolean z, @Param(id = 3) boolean z1, @Nullable @Param(id = 4) int[] arr_v, @Param(id = 5) int v, @Nullable @Param(id = 6) int[] arr_v1) {
        this.a = rootTelemetryConfiguration0;
        this.b = z;
        this.c = z1;
        this.d = arr_v;
        this.e = v;
        this.f = arr_v1;
    }

    @KeepForSdk
    public int getMaxMethodInvocationsLogged() {
        return this.e;
    }

    @Nullable
    @KeepForSdk
    public int[] getMethodInvocationMethodKeyAllowlist() {
        return this.d;
    }

    @Nullable
    @KeepForSdk
    public int[] getMethodInvocationMethodKeyDisallowlist() {
        return this.f;
    }

    @KeepForSdk
    public boolean getMethodInvocationTelemetryEnabled() {
        return this.b;
    }

    @KeepForSdk
    public boolean getMethodTimingTelemetryEnabled() {
        return this.c;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 1, this.a, v, false);
        SafeParcelWriter.writeBoolean(parcel0, 2, this.getMethodInvocationTelemetryEnabled());
        SafeParcelWriter.writeBoolean(parcel0, 3, this.getMethodTimingTelemetryEnabled());
        SafeParcelWriter.writeIntArray(parcel0, 4, this.getMethodInvocationMethodKeyAllowlist(), false);
        SafeParcelWriter.writeInt(parcel0, 5, this.getMaxMethodInvocationsLogged());
        SafeParcelWriter.writeIntArray(parcel0, 6, this.getMethodInvocationMethodKeyDisallowlist(), false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    @NonNull
    public final RootTelemetryConfiguration zza() {
        return this.a;
    }
}

