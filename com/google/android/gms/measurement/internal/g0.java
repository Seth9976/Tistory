package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.room.a;
import com.google.android.gms.common.internal.Preconditions;

public final class g0 implements Runnable {
    public final int a;
    public final Bundle b;
    public final zzhx c;

    public g0(zzhx zzhx0, Bundle bundle0, int v) {
        this.a = v;
        this.c = zzhx0;
        this.b = bundle0;
        super();
    }

    @Override
    public final void run() {
        zzaw zzaw3;
        zzaw zzaw2;
        zzaw zzaw1;
        zzaw zzaw0;
        if(this.a != 0) {
            zzhx zzhx0 = this.c;
            zzhx0.zzg();
            zzhx0.zza();
            Bundle bundle0 = this.b;
            Preconditions.checkNotNull(bundle0);
            String s = Preconditions.checkNotEmpty(bundle0.getString("name"));
            if(!zzhx0.zzt.zzJ()) {
                a.B(zzhx0.zzt, "Conditional property not cleared since app measurement is disabled");
                return;
            }
            zzkw zzkw0 = new zzkw(0L, null, s, "");
            try {
                zzlb zzlb0 = zzhx0.zzt.zzv();
                bundle0.getString("app_id");
                zzaw0 = zzlb0.M(bundle0.getString("expired_event_name"), bundle0.getBundle("expired_event_params"), "", bundle0.getLong("creation_timestamp"), true);
            }
            catch(IllegalArgumentException unused_ex) {
                return;
            }
            zzac zzac0 = new zzac(bundle0.getString("app_id"), "", zzkw0, bundle0.getLong("creation_timestamp"), bundle0.getBoolean("active"), bundle0.getString("trigger_event_name"), null, bundle0.getLong("trigger_timeout"), null, bundle0.getLong("time_to_live"), zzaw0);
            zzhx0.zzt.zzt().zzE(zzac0);
            return;
        }
        zzhx zzhx1 = this.c;
        zzhx1.zzg();
        zzhx1.zza();
        Bundle bundle1 = this.b;
        Preconditions.checkNotNull(bundle1);
        String s1 = bundle1.getString("name");
        String s2 = bundle1.getString("origin");
        Preconditions.checkNotEmpty(s1);
        Preconditions.checkNotEmpty(s2);
        Preconditions.checkNotNull(bundle1.get("value"));
        if(!zzhx1.zzt.zzJ()) {
            a.B(zzhx1.zzt, "Conditional property not set since app measurement is disabled");
            return;
        }
        zzkw zzkw1 = new zzkw(bundle1.getLong("triggered_timestamp"), bundle1.get("value"), s1, s2);
        try {
            zzlb zzlb1 = zzhx1.zzt.zzv();
            bundle1.getString("app_id");
            zzaw1 = zzlb1.M(bundle1.getString("triggered_event_name"), bundle1.getBundle("triggered_event_params"), s2, 0L, true);
            zzlb zzlb2 = zzhx1.zzt.zzv();
            bundle1.getString("app_id");
            zzaw2 = zzlb2.M(bundle1.getString("timed_out_event_name"), bundle1.getBundle("timed_out_event_params"), s2, 0L, true);
            zzlb zzlb3 = zzhx1.zzt.zzv();
            bundle1.getString("app_id");
            zzaw3 = zzlb3.M(bundle1.getString("expired_event_name"), bundle1.getBundle("expired_event_params"), s2, 0L, true);
        }
        catch(IllegalArgumentException unused_ex) {
            return;
        }
        zzac zzac1 = new zzac(bundle1.getString("app_id"), s2, zzkw1, bundle1.getLong("creation_timestamp"), false, bundle1.getString("trigger_event_name"), zzaw2, bundle1.getLong("trigger_timeout"), zzaw1, bundle1.getLong("time_to_live"), zzaw3);
        zzhx1.zzt.zzt().zzE(zzac1);
    }
}

