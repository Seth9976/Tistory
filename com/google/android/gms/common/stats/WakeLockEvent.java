package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import java.util.ArrayList;
import wb.a;

@KeepForSdk
@Class(creator = "WakeLockEventCreator")
@Deprecated
public final class WakeLockEvent extends StatsEvent {
    @NonNull
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final long b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final ArrayList h;
    public final String i;
    public final long j;
    public final int k;
    public final String l;
    public final float m;
    public final long n;
    public final boolean o;
    public final long p;

    static {
        WakeLockEvent.CREATOR = new zza();
    }

    public WakeLockEvent(int v, long v1, int v2, String s, int v3, ArrayList arrayList0, String s1, long v4, int v5, String s2, String s3, float f, long v6, String s4, boolean z) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = s;
        this.e = s2;
        this.f = s4;
        this.g = v3;
        this.p = -1L;
        this.h = arrayList0;
        this.i = s1;
        this.j = v4;
        this.k = v5;
        this.l = s3;
        this.m = f;
        this.n = v6;
        this.o = z;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.a);
        SafeParcelWriter.writeLong(parcel0, 2, this.b);
        SafeParcelWriter.writeString(parcel0, 4, this.d, false);
        SafeParcelWriter.writeInt(parcel0, 5, this.g);
        SafeParcelWriter.writeStringList(parcel0, 6, this.h, false);
        SafeParcelWriter.writeLong(parcel0, 8, this.j);
        SafeParcelWriter.writeString(parcel0, 10, this.e, false);
        SafeParcelWriter.writeInt(parcel0, 11, this.c);
        SafeParcelWriter.writeString(parcel0, 12, this.i, false);
        SafeParcelWriter.writeString(parcel0, 13, this.l, false);
        SafeParcelWriter.writeInt(parcel0, 14, this.k);
        SafeParcelWriter.writeFloat(parcel0, 15, this.m);
        SafeParcelWriter.writeLong(parcel0, 16, this.n);
        SafeParcelWriter.writeString(parcel0, 17, this.f, false);
        SafeParcelWriter.writeBoolean(parcel0, 18, this.o);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    @Override  // com.google.android.gms.common.stats.StatsEvent
    public final int zza() {
        return this.c;
    }

    @Override  // com.google.android.gms.common.stats.StatsEvent
    public final long zzb() {
        return this.p;
    }

    @Override  // com.google.android.gms.common.stats.StatsEvent
    public final long zzc() {
        return this.b;
    }

    @Override  // com.google.android.gms.common.stats.StatsEvent
    @NonNull
    public final String zzd() {
        String s = "";
        String s1 = this.h == null ? "" : TextUtils.join(",", this.h);
        String s2 = this.e == null ? "" : this.e;
        String s3 = this.l == null ? "" : this.l;
        String s4 = this.f;
        if(s4 != null) {
            s = s4;
        }
        StringBuilder stringBuilder0 = new StringBuilder("\t");
        stringBuilder0.append(this.d);
        stringBuilder0.append("\t");
        a.j(stringBuilder0, this.g, "\t", s1, "\t");
        a.j(stringBuilder0, this.k, "\t", s2, "\t");
        stringBuilder0.append(s3);
        stringBuilder0.append("\t");
        stringBuilder0.append(this.m);
        stringBuilder0.append("\t");
        stringBuilder0.append(s);
        stringBuilder0.append("\t");
        stringBuilder0.append(this.o);
        return stringBuilder0.toString();
    }
}

