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
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

@KeepForSdk
@Class(creator = "TelemetryDataCreator")
public class TelemetryData extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public List b;

    static {
        TelemetryData.CREATOR = new zaab();
    }

    @Constructor
    public TelemetryData(@Param(id = 1) int v, @Param(id = 2) @Nullable List list0) {
        this.a = v;
        this.b = list0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.a);
        SafeParcelWriter.writeTypedList(parcel0, 2, this.b, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final int zaa() {
        return this.a;
    }

    @androidx.annotation.Nullable
    public final List zab() {
        return this.b;
    }

    public final void zac(@NonNull MethodInvocation methodInvocation0) {
        if(this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(methodInvocation0);
    }
}

