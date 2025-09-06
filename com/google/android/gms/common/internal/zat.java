package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;

@Class(creator = "ResolveAccountRequestCreator")
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    static {
        zat.CREATOR = new zau();
    }

    public zat(int v, Account account0, int v1, GoogleSignInAccount googleSignInAccount0) {
        this.a = v;
        this.b = account0;
        this.c = v1;
        this.d = googleSignInAccount0;
    }

    public zat(Account account0, int v, @Nullable GoogleSignInAccount googleSignInAccount0) {
        this(2, account0, v, googleSignInAccount0);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.a);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.b, v, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.c);
        SafeParcelWriter.writeParcelable(parcel0, 4, this.d, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

