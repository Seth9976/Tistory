package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.Iterator;

@Class(creator = "EventParamsCreator")
@Reserved({1})
public final class zzau extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator CREATOR;
    public final Bundle a;

    static {
        zzau.CREATOR = new zzav();
    }

    public zzau(Bundle bundle0) {
        this.a = bundle0;
    }

    public final Double a() {
        return this.a.getDouble("value");
    }

    public final Object b(String s) {
        return this.a.get(s);
    }

    public final String c() {
        return this.a.getString("currency");
    }

    @Override
    public final Iterator iterator() {
        return new i(this);
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBundle(parcel0, 2, this.zzc(), false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final int zza() {
        return this.a.size();
    }

    public final Bundle zzc() {
        return new Bundle(this.a);
    }
}

