package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;

@Class(creator = "StringToIntConverterEntryCreator")
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;
    public final int c;

    static {
        zac.CREATOR = new zae();
    }

    public zac(int v, String s, int v1) {
        this.a = v;
        this.b = s;
        this.c = v1;
    }

    public zac(String s, int v) {
        this.a = 1;
        this.b = s;
        this.c = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.a);
        SafeParcelWriter.writeString(parcel0, 2, this.b, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.c);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

