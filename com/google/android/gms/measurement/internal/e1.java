package com.google.android.gms.measurement.internal;

public final class e1 implements Runnable {
    public final int a;
    public final long b;
    public final zzkc c;

    public e1(zzkc zzkc0, long v, int v1) {
        this.a = v1;
        this.c = zzkc0;
        this.b = v;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            zzkc zzkc0 = this.c;
            zzkc0.zzg();
            zzkc0.a();
            zzkc0.zzt.zzay().zzj().zzb("Activity paused, time", this.b);
            long v = zzkc0.zzc.b.zzt.zzav().currentTimeMillis();
            f1 f10 = new f1(zzkc0.zzc, v, this.b);
            zzkc0.zzc.a = f10;
            zzkc0.zzc.b.b.postDelayed(f10, 2000L);
            if(zzkc0.zzt.zzf().zzu()) {
                zzkc0.zzb.c.a();
            }
            return;
        }
        zzkc zzkc1 = this.c;
        zzkc1.zzg();
        zzkc1.a();
        zzef zzef0 = zzkc1.zzt.zzay().zzj();
        long v1 = this.b;
        zzef0.zzb("Activity resumed, time", v1);
        if(zzkc1.zzt.zzf().zzu() || zzkc1.zzt.zzm().p.zzb()) {
            zzkc1.zzb.d.zzg();
            zzkc1.zzb.c.a();
            zzkc1.zzb.a = v1;
            zzkc1.zzb.b = v1;
        }
        zzkc zzkc2 = zzkc1.zzc.b;
        zzkc2.zzg();
        f1 f11 = zzkc1.zzc.a;
        if(f11 != null) {
            zzkc2.b.removeCallbacks(f11);
        }
        zzkc2.zzt.zzm().p.zza(false);
        j1 j10 = zzkc1.zza;
        j10.a.zzg();
        zzkc zzkc3 = j10.a;
        if(zzkc3.zzt.zzJ()) {
            j10.b(zzkc3.zzt.zzav().currentTimeMillis(), false);
        }
    }
}

