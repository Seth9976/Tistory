package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.measurement.internal.zzfj;

public final class m extends v {
    public final String e;
    public final String f;
    public final Context g;
    public final Bundle h;
    public final zzef i;

    public m(zzef zzef0, String s, String s1, Context context0, Bundle bundle0) {
        this.i = zzef0;
        this.e = s;
        this.f = s1;
        this.g = context0;
        this.h = bundle0;
        super(zzef0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.v
    public final void a() {
        String s2;
        String s1;
        String s;
        try {
            this.i.getClass();
            if(this.f == null || this.e == null || this.i.zzS()) {
                s2 = null;
                s1 = null;
                s = null;
            }
            else {
                s = this.f;
                s1 = this.e;
                s2 = this.i.a;
            }
            Preconditions.checkNotNull(this.g);
            this.i.g = this.i.zzf(this.g, true);
            if(this.i.g == null) {
                Log.w(this.i.a, "Failed to connect to measurement client.");
                return;
            }
            int v = DynamiteModule.getLocalVersion(this.g, "com.google.android.gms.measurement.dynamite");
            int v1 = DynamiteModule.getRemoteVersion(this.g, "com.google.android.gms.measurement.dynamite");
            String s3 = zzfj.zza(this.g);
            zzcl zzcl0 = new zzcl(74029L, ((long)Math.max(v, v1)), v1 < v, s2, s1, s, this.h, s3);
            ((zzcc)Preconditions.checkNotNull(this.i.g)).initialize(ObjectWrapper.wrap(this.g), zzcl0, this.a);
            return;
        }
        catch(Exception exception0) {
        }
        this.i.a(exception0, true, false);
    }
}

