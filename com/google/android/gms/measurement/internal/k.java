package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.Map;
import r0.a;

public final class k implements Runnable {
    public final int a;
    public final int b;
    public final String c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public k(zzeh zzeh0, int v, String s, Object object0, Object object1, Object object2) {
        this.a = 0;
        super();
        this.g = zzeh0;
        this.b = v;
        this.c = s;
        this.d = object0;
        this.e = object1;
        this.f = object2;
    }

    public k(String s, zzej zzej0, int v, IOException iOException0, byte[] arr_b, Map map0) {
        this.a = 1;
        super();
        Preconditions.checkNotNull(zzej0);
        this.d = zzej0;
        this.b = v;
        this.e = iOException0;
        this.f = arr_b;
        this.c = s;
        this.g = map0;
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            ((zzej)this.d).zza(this.c, this.b, ((IOException)this.e), ((byte[])this.f), ((Map)this.g));
            return;
        }
        zzeh zzeh0 = (zzeh)this.g;
        o o0 = zzeh0.zzt.zzm();
        if(o0.a) {
            if(zzeh0.b == 0) {
                zzeh0.b = zzeh0.zzt.zzf().zzy() ? 'C' : 'c';
            }
            if(zzeh0.c < 0L) {
                zzeh0.zzt.zzf().zzh();
                zzeh0.c = 74029L;
            }
            int v = zzeh0.b;
            long v1 = zzeh0.c;
            String s = this.c;
            String s1 = zzeh.a(true, s, this.d, this.e, this.f);
            StringBuilder stringBuilder0 = new StringBuilder("2");
            stringBuilder0.append("01VDIWEA?".charAt(this.b));
            stringBuilder0.append(((char)v));
            stringBuilder0.append(v1);
            String s2 = a.o(stringBuilder0, ":", s1);
            if(s2.length() > 0x400) {
                s2 = s.substring(0, 0x400);
            }
            zzeu zzeu0 = o0.c;
            if(zzeu0 != null) {
                zzeu0.zzb(s2, 1L);
            }
        }
        else {
            Log.println(6, zzeh0.zzq(), "Persisted config not initialized. Not logging error/warn");
        }
    }
}

