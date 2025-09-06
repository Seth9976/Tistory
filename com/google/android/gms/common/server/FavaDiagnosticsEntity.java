package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@KeepForSdk
@Class(creator = "FavaDiagnosticsEntityCreator")
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator CREATOR;
    public final int a;
    @NonNull
    @Field(id = 2)
    public final String zab;
    @Field(id = 3)
    public final int zac;

    static {
        FavaDiagnosticsEntity.CREATOR = new zaa();
    }

    @Constructor
    public FavaDiagnosticsEntity(@Param(id = 1) int v, @NonNull @Param(id = 2) String s, @Param(id = 3) int v1) {
        this.a = v;
        this.zab = s;
        this.zac = v1;
    }

    @KeepForSdk
    public FavaDiagnosticsEntity(@NonNull String s, int v) {
        this.a = 1;
        this.zab = s;
        this.zac = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.a);
        SafeParcelWriter.writeString(parcel0, 2, this.zab, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.zac);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

