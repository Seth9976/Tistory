package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import g.a;
import javax.annotation.Nullable;

@Class(creator = "GoogleCertificatesLookupResponseCreator")
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;

    static {
        zzq.CREATOR = new zzr();
    }

    public zzq(boolean z, String s, int v, int v1) {
        this.a = z;
        this.b = s;
        this.c = a.c0(v) - 1;
        int v2 = 1;
        for(int v3 = 0; v3 < 3; ++v3) {
            int v4 = new int[]{1, 2, 3}[v3];
            if(v4 == 0) {
                throw null;
            }
            if(v4 - 1 == v1) {
                v2 = v4;
                break;
            }
        }
        this.d = v2 - 1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeBoolean(parcel0, 1, this.a);
        SafeParcelWriter.writeString(parcel0, 2, this.b, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.c);
        SafeParcelWriter.writeInt(parcel0, 4, this.d);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    @Nullable
    public final String zza() {
        return this.b;
    }

    public final boolean zzb() {
        return this.a;
    }

    public final int zzc() {
        for(int v = 0; v < 3; ++v) {
            int v1 = new int[]{1, 2, 3}[v];
            if(v1 == 0) {
                throw null;
            }
            if(v1 - 1 == this.d) {
                return v1;
            }
        }
        return 1;
    }

    public final int zzd() {
        return a.c0(this.c);
    }
}

