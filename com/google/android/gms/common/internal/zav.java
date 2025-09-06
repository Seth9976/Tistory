package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;

@Class(creator = "ResolveAccountResponseCreator")
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final IBinder b;
    public final ConnectionResult c;
    public final boolean d;
    public final boolean e;

    static {
        zav.CREATOR = new zaw();
    }

    public zav(int v, IBinder iBinder0, ConnectionResult connectionResult0, boolean z, boolean z1) {
        this.a = v;
        this.b = iBinder0;
        this.c = connectionResult0;
        this.d = z;
        this.e = z1;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(object0 == null) {
            return false;
        }
        if(this == object0) {
            return true;
        }
        return object0 instanceof zav ? this.c.equals(((zav)object0).c) && Objects.equal(this.zab(), ((zav)object0).zab()) : false;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.a);
        SafeParcelWriter.writeIBinder(parcel0, 2, this.b, false);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.c, v, false);
        SafeParcelWriter.writeBoolean(parcel0, 4, this.d);
        SafeParcelWriter.writeBoolean(parcel0, 5, this.e);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final ConnectionResult zaa() {
        return this.c;
    }

    @Nullable
    public final IAccountAccessor zab() {
        return this.b == null ? null : Stub.asInterface(this.b);
    }

    public final boolean zac() {
        return this.d;
    }

    public final boolean zad() {
        return this.e;
    }
}

