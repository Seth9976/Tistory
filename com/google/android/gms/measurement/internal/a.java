package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;

public final class a implements Runnable {
    public final int a;
    public final Object b;
    public final long c;
    public final j d;

    public a(j j0, Object object0, long v, int v1) {
        this.a = v1;
        this.d = j0;
        this.b = object0;
        this.c = v;
        super();
    }

    @Override
    public final void run() {
        switch(this.a) {
            case 0: {
                zzd zzd0 = (zzd)this.d;
                zzd0.zzg();
                String s = (String)this.b;
                Preconditions.checkNotEmpty(s);
                ArrayMap arrayMap0 = zzd0.b;
                long v = this.c;
                if(arrayMap0.isEmpty()) {
                    zzd0.c = v;
                }
                Integer integer0 = (Integer)arrayMap0.get(s);
                if(integer0 != null) {
                    arrayMap0.put(s, ((int)(((int)integer0) + 1)));
                    return;
                }
                if(arrayMap0.size() >= 100) {
                    androidx.room.a.A(zzd0.zzt, "Too many ads visible");
                    return;
                }
                arrayMap0.put(s, 1);
                zzd0.a.put(s, v);
                return;
            }
            case 1: {
                zzd zzd1 = (zzd)this.d;
                zzd1.zzg();
                String s1 = (String)this.b;
                Preconditions.checkNotEmpty(s1);
                ArrayMap arrayMap1 = zzd1.b;
                Integer integer1 = (Integer)arrayMap1.get(s1);
                if(integer1 == null) {
                    zzd1.zzt.zzay().zzd().zzb("Call to endAdUnitExposure for unknown ad unit id", s1);
                }
                else {
                    zzie zzie0 = zzd1.zzt.zzs().zzj(false);
                    int v1 = (int)integer1;
                    if(v1 - 1 != 0) {
                        arrayMap1.put(s1, ((int)(v1 - 1)));
                        return;
                    }
                    arrayMap1.remove(s1);
                    ArrayMap arrayMap2 = zzd1.a;
                    Long long0 = (Long)arrayMap2.get(s1);
                    long v2 = this.c;
                    if(long0 == null) {
                        androidx.room.a.v(zzd1.zzt, "First ad unit exposure time was never set");
                    }
                    else {
                        arrayMap2.remove(s1);
                        zzd1.b(s1, v2 - ((long)long0), zzie0);
                    }
                    if(arrayMap1.isEmpty()) {
                        long v3 = zzd1.c;
                        if(v3 == 0L) {
                            androidx.room.a.v(zzd1.zzt, "First ad exposure time was never set");
                            return;
                        }
                        zzd1.a(v2 - v3, zzie0);
                        zzd1.c = 0L;
                        return;
                    }
                }
                return;
            }
            default: {
                ((zzim)this.d).b(((zzie)this.b), false, this.c);
                ((zzim)this.d).zza = null;
                ((zzim)this.d).zzt.zzt().zzG(null);
            }
        }
    }
}

