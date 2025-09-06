package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;

@Class(creator = "ConnectionInfoCreator")
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Bundle a;
    public Feature[] b;
    public int c;
    public ConnectionTelemetryConfiguration d;

    static {
        zzj.CREATOR = new zzk();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBundle(parcel0, 1, this.a, false);
        SafeParcelWriter.writeTypedArray(parcel0, 2, this.b, v, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.c);
        SafeParcelWriter.writeParcelable(parcel0, 4, this.d, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

