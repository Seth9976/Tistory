package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zzr implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        String s = "";
        String s1 = "";
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        String s7 = null;
        String s8 = null;
        Boolean boolean0 = null;
        ArrayList arrayList0 = null;
        String s9 = null;
        String s10 = null;
        long v1 = 0L;
        long v2 = 0L;
        long v3 = 0L;
        long v4 = 0L;
        long v5 = 0L;
        boolean z = true;
        boolean z1 = true;
        boolean z2 = false;
        int v6 = 0;
        boolean z3 = false;
        long v7 = 0xFFFFFFFF80000000L;
        while(parcel0.dataPosition() < v) {
            int v8 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v8)) {
                case 2: {
                    s2 = SafeParcelReader.createString(parcel0, v8);
                    break;
                }
                case 3: {
                    s3 = SafeParcelReader.createString(parcel0, v8);
                    break;
                }
                case 4: {
                    s4 = SafeParcelReader.createString(parcel0, v8);
                    break;
                }
                case 5: {
                    s5 = SafeParcelReader.createString(parcel0, v8);
                    break;
                }
                case 6: {
                    v1 = SafeParcelReader.readLong(parcel0, v8);
                    break;
                }
                case 7: {
                    v2 = SafeParcelReader.readLong(parcel0, v8);
                    break;
                }
                case 8: {
                    s6 = SafeParcelReader.createString(parcel0, v8);
                    break;
                }
                case 9: {
                    z = SafeParcelReader.readBoolean(parcel0, v8);
                    break;
                }
                case 10: {
                    z2 = SafeParcelReader.readBoolean(parcel0, v8);
                    break;
                }
                case 11: {
                    v7 = SafeParcelReader.readLong(parcel0, v8);
                    break;
                }
                case 12: {
                    s7 = SafeParcelReader.createString(parcel0, v8);
                    break;
                }
                case 13: {
                    v3 = SafeParcelReader.readLong(parcel0, v8);
                    break;
                }
                case 14: {
                    v4 = SafeParcelReader.readLong(parcel0, v8);
                    break;
                }
                case 15: {
                    v6 = SafeParcelReader.readInt(parcel0, v8);
                    break;
                }
                case 16: {
                    z1 = SafeParcelReader.readBoolean(parcel0, v8);
                    break;
                }
                case 18: {
                    z3 = SafeParcelReader.readBoolean(parcel0, v8);
                    break;
                }
                case 19: {
                    s8 = SafeParcelReader.createString(parcel0, v8);
                    break;
                }
                case 21: {
                    boolean0 = SafeParcelReader.readBooleanObject(parcel0, v8);
                    break;
                }
                case 22: {
                    v5 = SafeParcelReader.readLong(parcel0, v8);
                    break;
                }
                case 23: {
                    arrayList0 = SafeParcelReader.createStringList(parcel0, v8);
                    break;
                }
                case 24: {
                    s9 = SafeParcelReader.createString(parcel0, v8);
                    break;
                }
                case 25: {
                    s = SafeParcelReader.createString(parcel0, v8);
                    break;
                }
                case 26: {
                    s1 = SafeParcelReader.createString(parcel0, v8);
                    break;
                }
                case 27: {
                    s10 = SafeParcelReader.createString(parcel0, v8);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v8);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new zzq(s2, s3, s4, s5, v1, v2, s6, z, z2, v7, s7, v3, v4, v6, z1, z3, s8, boolean0, v5, arrayList0, s9, s, s1, s10);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new zzq[v];
    }
}

