package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;

public final class n1 implements Runnable {
    public final int a;
    public final Object b;

    public n1(n n0, boolean z) {
        this.a = 1;
        super();
        this.b = n0;
    }

    public n1(zzhx zzhx0) {
        this.a = 2;
        super();
        this.b = zzhx0;
    }

    public n1(zzkt zzkt0, zzku zzku0) {
        this.a = 0;
        super();
        this.b = zzkt0;
    }

    @Override
    public final void run() {
        switch(this.a) {
            case 0: {
                zzkt zzkt0 = (zzkt)this.b;
                zzkt0.zzaz().zzg();
                zzkt0.k = new zzez(zzkt0);
                e e0 = new e(zzkt0);
                e0.zzX();
                zzkt0.c = e0;
                zzag zzag0 = zzkt0.zzg();
                zzag0.b = (zzaf)Preconditions.checkNotNull(zzkt0.a);
                zzjo zzjo0 = new zzjo(zzkt0);
                zzjo0.zzX();
                zzkt0.i = zzjo0;
                b b0 = new b(zzkt0);  // 初始化器: Lcom/google/android/gms/measurement/internal/m1;-><init>(Lcom/google/android/gms/measurement/internal/zzkt;)V
                b0.zzX();
                zzkt0.f = b0;
                q0 q00 = new q0(zzkt0);  // 初始化器: Lcom/google/android/gms/measurement/internal/m1;-><init>(Lcom/google/android/gms/measurement/internal/zzkt;)V
                q00.zzX();
                zzkt0.h = q00;
                zzkf zzkf0 = new zzkf(zzkt0);
                zzkf0.zzX();
                zzkt0.e = zzkf0;
                zzkt0.d = new n(zzkt0);
                if(zzkt0.q != zzkt0.r) {
                    zzkt0.zzay().zzd().zzc("Not all upload components initialized", zzkt0.q, zzkt0.r);
                }
                zzkt0.m = true;
                zzkt0.zzS();
                return;
            }
            case 1: {
                ((n)this.b).a.y();
                return;
            }
            default: {
                zzs zzs0 = ((zzhx)this.b).l;
                zzfr zzfr0 = zzs0.a;
                zzfr0.zzaz().zzg();
                if(zzs0.b()) {
                    if(zzs0.c()) {
                        zzfr0.zzm().t.zzb(null);
                        Bundle bundle0 = new Bundle();
                        bundle0.putString("source", "(not set)");
                        bundle0.putString("medium", "(not set)");
                        bundle0.putString("_cis", "intent");
                        bundle0.putLong("_cc", 1L);
                        zzfr0.zzq().a("auto", "_cmpx", bundle0);
                    }
                    else {
                        String s = zzfr0.zzm().t.zza();
                        if(TextUtils.isEmpty(s)) {
                            zzfr0.zzay().zzh().zza("Cache still valid but referrer not found");
                        }
                        else {
                            long v = zzfr0.zzm().u.zza();
                            Uri uri0 = Uri.parse(s);
                            Bundle bundle1 = new Bundle();
                            Pair pair0 = new Pair(uri0.getPath(), bundle1);
                            for(Object object0: uri0.getQueryParameterNames()) {
                                bundle1.putString(((String)object0), uri0.getQueryParameter(((String)object0)));
                            }
                            ((Bundle)pair0.second).putLong("_cc", (v / 3600000L - 1L) * 3600000L);
                            String s1 = pair0.first == null ? "app" : ((String)pair0.first);
                            zzfr0.zzq().a(s1, "_cmp", ((Bundle)pair0.second));
                        }
                        zzfr0.zzm().t.zzb(null);
                    }
                    zzfr0.zzm().u.zzb(0L);
                }
            }
        }
    }
}

