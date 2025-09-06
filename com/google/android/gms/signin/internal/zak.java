package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.zav;

@Class(creator = "SignInResponseCreator")
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final ConnectionResult b;
    public final zav c;

    static {
        zak.CREATOR = new zal();
    }

    public zak(int v, ConnectionResult connectionResult0, zav zav0) {
        this.a = v;
        this.b = connectionResult0;
        this.c = zav0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.a);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.b, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.c, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final ConnectionResult zaa() {
        return this.b;
    }

    @Nullable
    public final zav zab() {
        return this.c;
    }
}

