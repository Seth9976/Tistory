package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;

@Class(creator = "GoogleSignInOptionsExtensionCreator")
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final Bundle c;

    static {
        GoogleSignInOptionsExtensionParcelable.CREATOR = new zaa();
    }

    public GoogleSignInOptionsExtensionParcelable(int v, int v1, Bundle bundle0) {
        this.a = v;
        this.b = v1;
        this.c = bundle0;
    }

    public GoogleSignInOptionsExtensionParcelable(@NonNull GoogleSignInOptionsExtension googleSignInOptionsExtension0) {
        this(1, googleSignInOptionsExtension0.getExtensionType(), googleSignInOptionsExtension0.toBundle());
    }

    @KeepForSdk
    public int getType() {
        return this.b;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.a);
        SafeParcelWriter.writeInt(parcel0, 2, this.getType());
        SafeParcelWriter.writeBundle(parcel0, 3, this.c, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

