package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;

@ShowFirstParty
@Class(creator = "FieldMapPairCreator")
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;
    public final Field c;

    static {
        zam.CREATOR = new zak();
    }

    public zam(Field fastJsonResponse$Field0, String s) {
        this.a = 1;
        this.b = s;
        this.c = fastJsonResponse$Field0;
    }

    public zam(Field fastJsonResponse$Field0, String s, int v) {
        this.a = v;
        this.b = s;
        this.c = fastJsonResponse$Field0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.a);
        SafeParcelWriter.writeString(parcel0, 2, this.b, false);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.c, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

