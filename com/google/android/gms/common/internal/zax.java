package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;

@Class(creator = "SignInButtonConfigCreator")
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final int c;
    public final Scope[] d;

    static {
        zax.CREATOR = new zay();
    }

    public zax(int v, int v1, int v2, Scope[] arr_scope) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = arr_scope;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.a);
        SafeParcelWriter.writeInt(parcel0, 2, this.b);
        SafeParcelWriter.writeInt(parcel0, 3, this.c);
        SafeParcelWriter.writeTypedArray(parcel0, 4, this.d, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

