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
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@KeepForSdk
@Class(creator = "MethodInvocationCreator")
public class MethodInvocation extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    static {
        MethodInvocation.CREATOR = new zan();
    }

    @KeepForSdk
    @Deprecated
    public MethodInvocation(int v, int v1, int v2, long v3, long v4, @Nullable String s, @Nullable String s1, int v5) {
        this(v, v1, v2, v3, v4, s, s1, v5, -1);
    }

    @Constructor
    public MethodInvocation(@Param(id = 1) int v, @Param(id = 2) int v1, @Param(id = 3) int v2, @Param(id = 4) long v3, @Param(id = 5) long v4, @Nullable @Param(id = 6) String s, @Nullable @Param(id = 7) String s1, @Param(id = 8) int v5, @Param(id = 9) int v6) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = s;
        this.g = s1;
        this.h = v5;
        this.i = v6;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.a);
        SafeParcelWriter.writeInt(parcel0, 2, this.b);
        SafeParcelWriter.writeInt(parcel0, 3, this.c);
        SafeParcelWriter.writeLong(parcel0, 4, this.d);
        SafeParcelWriter.writeLong(parcel0, 5, this.e);
        SafeParcelWriter.writeString(parcel0, 6, this.f, false);
        SafeParcelWriter.writeString(parcel0, 7, this.g, false);
        SafeParcelWriter.writeInt(parcel0, 8, this.h);
        SafeParcelWriter.writeInt(parcel0, 9, this.i);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

