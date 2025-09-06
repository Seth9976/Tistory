package com.google.android.gms.common;

import a7.e;
import a7.f;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.zzy;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@Class(creator = "GoogleCertificatesQueryCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final e b;
    public final boolean c;
    public final boolean d;

    static {
        zzs.CREATOR = new zzt();
    }

    public zzs(String s, e e0, boolean z, boolean z1) {
        this.a = s;
        this.b = e0;
        this.c = z;
        this.d = z1;
    }

    public zzs(String s, IBinder iBinder0, boolean z, boolean z1) {
        IObjectWrapper iObjectWrapper0;
        this.a = s;
        e e0 = null;
        if(iBinder0 != null) {
            try {
                iObjectWrapper0 = zzy.zzg(iBinder0).zzd();
            }
            catch(RemoteException remoteException0) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", remoteException0);
                this.b = e0;
                this.c = z;
                this.d = z1;
                return;
            }
            byte[] arr_b = iObjectWrapper0 == null ? null : ((byte[])ObjectWrapper.unwrap(iObjectWrapper0));
            if(arr_b == null) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            }
            else {
                e0 = new f(arr_b);
            }
        }
        this.b = e0;
        this.c = z;
        this.d = z1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.a, false);
        e e0 = this.b;
        if(e0 == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            e0 = null;
        }
        SafeParcelWriter.writeIBinder(parcel0, 2, e0, false);
        SafeParcelWriter.writeBoolean(parcel0, 3, this.c);
        SafeParcelWriter.writeBoolean(parcel0, 4, this.d);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

