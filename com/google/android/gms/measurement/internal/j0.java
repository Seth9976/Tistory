package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcf;
import java.util.concurrent.atomic.AtomicReference;

public final class j0 implements Runnable {
    public final int a;
    public final boolean b;
    public final String c;
    public final String d;
    public final Object e;
    public final Object f;

    public j0(n0 n00, boolean z, Uri uri0, String s, String s1) {
        this.a = 1;
        super();
        this.f = n00;
        this.b = z;
        this.e = uri0;
        this.c = s;
        this.d = s1;
    }

    public j0(Object object0, Object object1, String s, String s1, boolean z, int v) {
        this.a = v;
        this.f = object0;
        this.e = object1;
        this.c = s;
        this.d = s1;
        this.b = z;
        super();
    }

    @Override
    public final void run() {
        Bundle bundle0;
        switch(this.a) {
            case 0: {
                ((zzhx)this.f).zzt.zzt().zzz(((AtomicReference)this.e), null, this.c, this.d, this.b);
                return;
            }
            case 1: {
                Uri uri0 = (Uri)this.e;
                String s = this.d;
                zzhx zzhx0 = ((n0)this.f).a;
                ((n0)this.f).a.zzg();
                try {
                    zzlb zzlb0 = zzhx0.zzt.zzv();
                    if(TextUtils.isEmpty(s)) {
                        bundle0 = null;
                    }
                    else if(!s.contains("gclid") && !s.contains("utm_campaign") && !s.contains("utm_source") && !s.contains("utm_medium") && !s.contains("utm_id") && !s.contains("dclid") && !s.contains("srsltid")) {
                        zzlb0.zzt.zzay().zzc().zza("Activity created with data \'referrer\' without required params");
                        bundle0 = null;
                    }
                    else {
                        bundle0 = zzlb0.J(Uri.parse(("https://google.com/search?" + s)));
                        if(bundle0 != null) {
                            bundle0.putString("_cis", "referrer");
                        }
                    }
                    String s1 = this.c;
                    if(this.b) {
                        Bundle bundle1 = zzhx0.zzt.zzv().J(uri0);
                        if(bundle1 != null) {
                            bundle1.putString("_cis", "intent");
                            if(!bundle1.containsKey("gclid") && bundle0 != null && bundle0.containsKey("gclid")) {
                                bundle1.putString("_cer", "gclid=" + bundle0.getString("gclid"));
                            }
                            zzhx0.a(s1, "_cmp", bundle1);
                            zzhx0.l.a(s1, bundle1);
                        }
                    }
                    if(!TextUtils.isEmpty(s)) {
                        zzhx0.zzt.zzay().zzc().zzb("Activity created with referrer", s);
                        if(zzhx0.zzt.zzf().zzs(null, zzdu.zzY)) {
                            if(bundle0 == null) {
                                zzhx0.zzt.zzay().zzc().zzb("Referrer does not contain valid parameters", s);
                            }
                            else {
                                zzhx0.a(s1, "_cmp", bundle0);
                                zzhx0.l.a(s1, bundle0);
                            }
                            zzhx0.zzW("auto", "_ldl", null, true);
                            return;
                        }
                        if(!s.contains("gclid") || !s.contains("utm_campaign") && !s.contains("utm_source") && !s.contains("utm_medium") && !s.contains("utm_term") && !s.contains("utm_content")) {
                            zzhx0.zzt.zzay().zzc().zza("Activity created with data \'referrer\' without required params");
                            return;
                        }
                        if(!TextUtils.isEmpty(s)) {
                            zzhx0.zzW("auto", "_ldl", s, true);
                            return;
                        }
                    }
                }
                catch(RuntimeException runtimeException0) {
                    zzhx0.zzt.zzay().zzd().zzb("Throwable caught in handleReferrerForOnActivityCreated", runtimeException0);
                }
                return;
            }
            default: {
                ((AppMeasurementDynamiteService)this.f).a.zzt().zzy(((zzcf)this.e), this.c, this.d, this.b);
            }
        }
    }
}

