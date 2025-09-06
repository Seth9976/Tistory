package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;

@Class(creator = "ScopeCreator")
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;

    static {
        Scope.CREATOR = new zza();
    }

    public Scope(int v, String s) {
        Preconditions.checkNotEmpty(s, "scopeUri must not be null or empty");
        this.a = v;
        this.b = s;
    }

    public Scope(@NonNull String s) {
        this(1, s);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof Scope ? this.b.equals(((Scope)object0).b) : false;
    }

    @NonNull
    @KeepForSdk
    public String getScopeUri() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override
    @NonNull
    public String toString() {
        return this.b;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.a);
        SafeParcelWriter.writeString(parcel0, 2, this.getScopeUri(), false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

