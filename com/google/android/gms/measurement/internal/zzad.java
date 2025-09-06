package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzad implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        String s = null;
        String s1 = null;
        zzkw zzkw0 = null;
        String s2 = null;
        zzaw zzaw0 = null;
        zzaw zzaw1 = null;
        zzaw zzaw2 = null;
        long v1 = 0L;
        long v2 = 0L;
        long v3 = 0L;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v4 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v4)) {
                case 2: {
                    s = SafeParcelReader.createString(parcel0, v4);
                    break;
                }
                case 3: {
                    s1 = SafeParcelReader.createString(parcel0, v4);
                    break;
                }
                case 4: {
                    zzkw0 = (zzkw)SafeParcelReader.createParcelable(parcel0, v4, zzkw.CREATOR);
                    break;
                }
                case 5: {
                    v1 = SafeParcelReader.readLong(parcel0, v4);
                    break;
                }
                case 6: {
                    z = SafeParcelReader.readBoolean(parcel0, v4);
                    break;
                }
                case 7: {
                    s2 = SafeParcelReader.createString(parcel0, v4);
                    break;
                }
                case 8: {
                    zzaw0 = (zzaw)SafeParcelReader.createParcelable(parcel0, v4, zzaw.CREATOR);
                    break;
                }
                case 9: {
                    v2 = SafeParcelReader.readLong(parcel0, v4);
                    break;
                }
                case 10: {
                    zzaw1 = (zzaw)SafeParcelReader.createParcelable(parcel0, v4, zzaw.CREATOR);
                    break;
                }
                case 11: {
                    v3 = SafeParcelReader.readLong(parcel0, v4);
                    break;
                }
                case 12: {
                    zzaw2 = (zzaw)SafeParcelReader.createParcelable(parcel0, v4, zzaw.CREATOR);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v4);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new zzac(s, s1, zzkw0, v1, z, s2, zzaw0, v2, zzaw1, v3, zzaw2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzac[v];
    }
}

