package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.ObjectWrapper;

@Class(creator = "GoogleCertificatesLookupQueryCreator")
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final boolean b;
    public final boolean c;
    public final Context d;
    public final boolean e;

    static {
        zzo.CREATOR = new zzp();
    }

    public zzo(String s, boolean z, boolean z1, IBinder iBinder0, boolean z2) {
        this.a = s;
        this.b = z;
        this.c = z1;
        this.d = (Context)ObjectWrapper.unwrap(Stub.asInterface(iBinder0));
        this.e = z2;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.a, false);
        SafeParcelWriter.writeBoolean(parcel0, 2, this.b);
        SafeParcelWriter.writeBoolean(parcel0, 3, this.c);
        SafeParcelWriter.writeIBinder(parcel0, 4, ((IBinder)ObjectWrapper.wrap(this.d)), false);
        SafeParcelWriter.writeBoolean(parcel0, 5, this.e);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

