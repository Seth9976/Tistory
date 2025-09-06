package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@KeepForSdk
@Class(creator = "ClientIdentityCreator")
@Reserved({1000})
public class ClientIdentity extends AbstractSafeParcelable {
    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator CREATOR;
    @Nullable
    @KeepForSdk
    @Field(defaultValueUnchecked = "null", id = 2)
    public final String packageName;
    @KeepForSdk
    @Field(defaultValueUnchecked = "0", id = 1)
    public final int uid;

    static {
        ClientIdentity.CREATOR = new zaa();
    }

    @Constructor
    public ClientIdentity(@Param(id = 1) int v, @Nullable @Param(id = 2) String s) {
        this.uid = v;
        this.packageName = s;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof ClientIdentity ? ((ClientIdentity)object0).uid == this.uid && Objects.equal(((ClientIdentity)object0).packageName, this.packageName) : false;
    }

    @Override
    public final int hashCode() {
        return this.uid;
    }

    @Override
    @NonNull
    public final String toString() {
        return this.uid + ":" + this.packageName;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.uid);
        SafeParcelWriter.writeString(parcel0, 2, this.packageName, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

