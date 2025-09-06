package com.google.android.gms.measurement.internal;

import a5.b;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

public final class zzar {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final zzau f;

    public zzar(zzfr zzfr0, String s, String s1, String s2, long v, long v1, zzau zzau0) {
        Preconditions.checkNotEmpty(s1);
        Preconditions.checkNotEmpty(s2);
        Preconditions.checkNotNull(zzau0);
        this.a = s1;
        this.b = s2;
        if(TextUtils.isEmpty(s)) {
            s = null;
        }
        this.c = s;
        this.d = v;
        this.e = v1;
        if(v1 != 0L && v1 > v) {
            zzfr0.zzay().zzk().zzc("Event created with reverse previous/current timestamps. appId, name", zzeh.zzn(s1), zzeh.zzn(s2));
        }
        this.f = zzau0;
    }

    public zzar(zzfr zzfr0, String s, String s1, String s2, long v, Bundle bundle0) {
        Preconditions.checkNotEmpty(s1);
        zzau zzau0;
        Preconditions.checkNotEmpty(s2);
        this.a = s1;
        this.b = s2;
        if(TextUtils.isEmpty(s)) {
            s = null;
        }
        this.c = s;
        this.d = v;
        this.e = 0L;
        if(bundle0 == null || bundle0.isEmpty()) {
            zzau0 = new zzau(new Bundle());
        }
        else {
            Bundle bundle1 = new Bundle(bundle0);
            Iterator iterator0 = bundle1.keySet().iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s3 = (String)object0;
                if(s3 == null) {
                    zzfr0.zzay().zzd().zza("Param name can\'t be null");
                    iterator0.remove();
                }
                else {
                    Object object1 = zzfr0.zzv().a(bundle1.get(s3), s3);
                    if(object1 == null) {
                        zzfr0.zzay().zzk().zzb("Param value can\'t be null", zzfr0.zzj().zze(s3));
                        iterator0.remove();
                    }
                    else {
                        zzfr0.zzv().j(bundle1, s3, object1);
                    }
                }
            }
            zzau0 = new zzau(bundle1);
        }
        this.f = zzau0;
    }

    public final zzar a(zzfr zzfr0, long v) {
        return new zzar(zzfr0, this.c, this.a, this.b, this.d, v, this.f);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Event{appId=\'");
        stringBuilder0.append(this.a);
        stringBuilder0.append("\', name=\'");
        return b.r(stringBuilder0, this.b, "\', params=", this.f.toString(), "}");
    }
}

