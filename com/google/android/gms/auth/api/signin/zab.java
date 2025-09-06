package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class zab implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = SafeParcelReader.validateObjectHeader(parcel0);
        int v1 = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        Uri uri0 = null;
        String s4 = null;
        String s5 = null;
        ArrayList arrayList0 = null;
        String s6 = null;
        String s7 = null;
        long v2 = 0L;
        while(parcel0.dataPosition() < v) {
            int v3 = SafeParcelReader.readHeader(parcel0);
            switch(((char)v3)) {
                case 1: {
                    v1 = SafeParcelReader.readInt(parcel0, v3);
                    break;
                }
                case 2: {
                    s = SafeParcelReader.createString(parcel0, v3);
                    break;
                }
                case 3: {
                    s1 = SafeParcelReader.createString(parcel0, v3);
                    break;
                }
                case 4: {
                    s2 = SafeParcelReader.createString(parcel0, v3);
                    break;
                }
                case 5: {
                    s3 = SafeParcelReader.createString(parcel0, v3);
                    break;
                }
                case 6: {
                    uri0 = (Uri)SafeParcelReader.createParcelable(parcel0, v3, Uri.CREATOR);
                    break;
                }
                case 7: {
                    s4 = SafeParcelReader.createString(parcel0, v3);
                    break;
                }
                case 8: {
                    v2 = SafeParcelReader.readLong(parcel0, v3);
                    break;
                }
                case 9: {
                    s5 = SafeParcelReader.createString(parcel0, v3);
                    break;
                }
                case 10: {
                    arrayList0 = SafeParcelReader.createTypedList(parcel0, v3, Scope.CREATOR);
                    break;
                }
                case 11: {
                    s6 = SafeParcelReader.createString(parcel0, v3);
                    break;
                }
                case 12: {
                    s7 = SafeParcelReader.createString(parcel0, v3);
                    break;
                }
                default: {
                    SafeParcelReader.skipUnknownField(parcel0, v3);
                }
            }
        }
        SafeParcelReader.ensureAtEnd(parcel0, v);
        return new GoogleSignInAccount(v1, s, s1, s2, s3, uri0, s4, v2, s5, arrayList0, s6, s7);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GoogleSignInAccount[v];
    }
}

