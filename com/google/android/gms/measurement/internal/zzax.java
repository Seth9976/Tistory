package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzax implements Parcelable.Creator {
    public static void a(zzaw zzaw0, Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 2, zzaw0.zza, false);
        SafeParcelWriter.writeParcelable(parcel0, 3, zzaw0.zzb, v, false);
        SafeParcelWriter.writeString(parcel0, 4, zzaw0.zzc, false);
        SafeParcelWriter.writeLong(parcel0, 5, zzaw0.zzd);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        String s = null;
        zzau zzau0 = null;
        String s1 = null;
        long v1 = 0L;
        while(parcel0.dataPosition() < v) {
            int v2 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v2)) {
                case 2: {
                    s = SafeParcelReader.createString(parcel0, v2);
                    break;
                }
                case 3: {
                    zzau0 = (zzau)SafeParcelReader.createParcelable(parcel0, v2, zzau.CREATOR);
                    break;
                }
                case 4: {
                    s1 = SafeParcelReader.createString(parcel0, v2);
                    break;
                }
                case 5: {
                    v1 = SafeParcelReader.readLong(parcel0, v2);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v2);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new zzaw(s, zzau0, s1, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzaw[v];
    }
}

