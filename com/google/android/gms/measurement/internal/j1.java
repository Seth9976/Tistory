package com.google.android.gms.measurement.internal;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.room.a;
import com.google.android.gms.internal.measurement.zznw;
import com.google.android.gms.internal.measurement.zzpd;

public final class j1 {
    public final zzkc a;

    public j1(zzkc zzkc0) {
        this.a = zzkc0;
    }

    public final void a() {
        zzkc zzkc0 = this.a;
        zzkc0.zzg();
        if(zzkc0.zzt.zzm().d(zzkc0.zzt.zzav().currentTimeMillis())) {
            zzkc0.zzt.zzm().j.zza(true);
            ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo0);
            if(activityManager$RunningAppProcessInfo0.importance == 100) {
                a.B(zzkc0.zzt, "Detected application was in foreground");
                this.c(zzkc0.zzt.zzav().currentTimeMillis(), false);
            }
        }
    }

    public final void b(long v, boolean z) {
        zzkc zzkc0 = this.a;
        zzkc0.zzg();
        zzkc0.a();
        if(zzkc0.zzt.zzm().d(v)) {
            zzkc0.zzt.zzm().j.zza(true);
            zzpd.zzc();
            if(zzkc0.zzt.zzf().zzs(null, zzdu.zzam)) {
                zzkc0.zzt.zzh().a();
            }
        }
        zzkc0.zzt.zzm().m.zzb(v);
        if(zzkc0.zzt.zzm().j.zzb()) {
            this.c(v, z);
        }
    }

    public final void c(long v, boolean z) {
        zzkc zzkc0 = this.a;
        zzkc0.zzg();
        if(!zzkc0.zzt.zzJ()) {
            return;
        }
        zzkc0.zzt.zzm().m.zzb(v);
        long v1 = zzkc0.zzt.zzav().elapsedRealtime();
        zzkc0.zzt.zzay().zzj().zzb("Session started, time", v1);
        zzkc0.zzt.zzq().e(v, ((long)(v / 1000L)), "auto", "_sid");
        zzkc0.zzt.zzm().n.zzb(v / 1000L);
        zzkc0.zzt.zzm().j.zza(false);
        Bundle bundle0 = new Bundle();
        bundle0.putLong("_sid", v / 1000L);
        if(zzkc0.zzt.zzf().zzs(null, zzdu.zzZ) && z) {
            bundle0.putLong("_aib", 1L);
        }
        zzkc0.zzt.zzq().b("auto", "_s", bundle0, v);
        zznw.zzc();
        if(zzkc0.zzt.zzf().zzs(null, zzdu.zzac)) {
            String s = zzkc0.zzt.zzm().s.zza();
            if(!TextUtils.isEmpty(s)) {
                Bundle bundle1 = new Bundle();
                bundle1.putString("_ffr", s);
                zzkc0.zzt.zzq().b("auto", "_ssr", bundle1, v);
            }
        }
    }
}

