package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

public final class i0 implements Runnable {
    public final int a;
    public final AtomicReference b;
    public final zzhx c;

    public i0(zzhx zzhx0, AtomicReference atomicReference0, int v) {
        this.a = v;
        this.c = zzhx0;
        this.b = atomicReference0;
        super();
    }

    private final void a() {
        synchronized(this.b) {
            try {
                String s = this.c.zzt.zzh().zzl();
                Integer integer0 = this.c.zzt.zzf().zze(s, zzdu.zzM);
                this.b.set(integer0);
            }
            catch(Throwable throwable0) {
                this.b.notify();
                throw throwable0;
            }
        }
        this.b.notify();
    }

    @Override
    public final void run() {
        switch(this.a) {
            case 0: {
                AtomicReference atomicReference1 = this.b;
                synchronized(atomicReference1) {
                    try {
                        String s1 = this.c.zzt.zzh().zzl();
                        Boolean boolean0 = Boolean.valueOf(this.c.zzt.zzf().zzs(s1, zzdu.zzJ));
                        this.b.set(boolean0);
                    }
                    catch(Throwable throwable1) {
                        this.b.notify();
                        throw throwable1;
                    }
                }
                this.b.notify();
                return;
            }
            case 1: {
                AtomicReference atomicReference2 = this.b;
                synchronized(atomicReference2) {
                    try {
                        String s2 = this.c.zzt.zzh().zzl();
                        String s3 = this.c.zzt.zzf().zzo(s2, zzdu.zzK);
                        this.b.set(s3);
                    }
                    catch(Throwable throwable2) {
                        this.b.notify();
                        throw throwable2;
                    }
                }
                this.b.notify();
                return;
            }
            case 2: {
                AtomicReference atomicReference3 = this.b;
                synchronized(atomicReference3) {
                    try {
                        String s4 = this.c.zzt.zzh().zzl();
                        Long long0 = this.c.zzt.zzf().zzi(s4, zzdu.zzL);
                        this.b.set(long0);
                    }
                    catch(Throwable throwable3) {
                        this.b.notify();
                        throw throwable3;
                    }
                }
                this.b.notify();
                return;
            }
            case 3: {
                this.a();
                return;
            }
            default: {
                AtomicReference atomicReference0 = this.b;
                synchronized(atomicReference0) {
                    try {
                        String s = this.c.zzt.zzh().zzl();
                        Double double0 = this.c.zzt.zzf().zza(s, zzdu.zzN);
                        this.b.set(double0);
                    }
                    catch(Throwable throwable0) {
                        this.b.notify();
                        throw throwable0;
                    }
                }
                this.b.notify();
            }
        }
    }
}

