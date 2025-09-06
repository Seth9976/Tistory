package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@KeepForSdk
@Class(creator = "GetServiceRequestCreator")
@Reserved({9})
public class GetServiceRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final int c;
    public String d;
    public IBinder e;
    public Scope[] f;
    public Bundle g;
    public Account h;
    public Feature[] i;
    public Feature[] j;
    public final boolean k;
    public final int l;
    public boolean m;
    public final String n;
    public static final Scope[] o;
    public static final Feature[] p;

    static {
        GetServiceRequest.CREATOR = new zzm();
        GetServiceRequest.o = new Scope[0];
        GetServiceRequest.p = new Feature[0];
    }

    public GetServiceRequest(int v, int v1, int v2, String s, IBinder iBinder0, Scope[] arr_scope, Bundle bundle0, Account account0, Feature[] arr_feature, Feature[] arr_feature1, boolean z, int v3, boolean z1, String s1) {
        if(arr_scope == null) {
            arr_scope = GetServiceRequest.o;
        }
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        Feature[] arr_feature2 = GetServiceRequest.p;
        if(arr_feature == null) {
            arr_feature = arr_feature2;
        }
        if(arr_feature1 == null) {
            arr_feature1 = arr_feature2;
        }
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = "com.google.android.gms".equals(s) ? "com.google.android.gms" : s;
        if(v < 2) {
            this.h = iBinder0 == null ? null : AccountAccessor.getAccountBinderSafe(Stub.asInterface(iBinder0));
        }
        else {
            this.e = iBinder0;
            this.h = account0;
        }
        this.f = arr_scope;
        this.g = bundle0;
        this.i = arr_feature;
        this.j = arr_feature1;
        this.k = z;
        this.l = v3;
        this.m = z1;
        this.n = s1;
    }

    @NonNull
    @KeepForSdk
    public Bundle getExtraArgs() {
        return this.g;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel0, int v) {
        zzm.a(this, parcel0, v);
    }

    @Nullable
    public final String zza() {
        return this.n;
    }
}

