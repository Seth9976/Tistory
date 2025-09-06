package com.google.android.gms.internal.measurement;

import java.util.List;

public final class t0 implements zzng {
    public final zzjm a;

    public t0(zzjm zzjm0) {
        if(zzjm0 == null) {
            throw new NullPointerException("output");
        }
        this.a = zzjm0;
        zzjm0.a = this;
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzA(int v, int v1) {
        this.a.zzp(v, v1 >> 0x1F ^ v1 + v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzB(int v, List list0, boolean z) {
        int v1 = 0;
        zzjm zzjm0 = this.a;
        if(z) {
            zzjm0.zzo(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                int v4 = (int)(((Integer)list0.get(v2)));
                v3 += zzjm.zzA(v4 >> 0x1F ^ v4 + v4);
            }
            zzjm0.zzq(v3);
            while(v1 < list0.size()) {
                int v5 = (int)(((Integer)list0.get(v1)));
                zzjm0.zzq(v5 >> 0x1F ^ v5 + v5);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            int v6 = (int)(((Integer)list0.get(v1)));
            zzjm0.zzp(v, v6 >> 0x1F ^ v6 + v6);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzC(int v, long v1) {
        this.a.zzr(v, v1 >> 0x3F ^ v1 + v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzD(int v, List list0, boolean z) {
        int v1 = 0;
        zzjm zzjm0 = this.a;
        if(z) {
            zzjm0.zzo(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                long v4 = (long)(((Long)list0.get(v2)));
                v3 += zzjm.zzB(v4 >> 0x3F ^ v4 + v4);
            }
            zzjm0.zzq(v3);
            while(v1 < list0.size()) {
                long v5 = (long)(((Long)list0.get(v1)));
                zzjm0.zzs(v5 >> 0x3F ^ v5 + v5);
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            long v6 = (long)(((Long)list0.get(v1)));
            zzjm0.zzr(v, v6 >> 0x3F ^ v6 + v6);
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzE(int v) {
        this.a.zzo(v, 3);
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzF(int v, String s) {
        this.a.zzm(v, s);
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzG(int v, List list0) {
        int v1 = 0;
        zzjm zzjm0 = this.a;
        if(list0 instanceof zzku) {
            while(v1 < list0.size()) {
                Object object0 = ((zzku)list0).zzf(v1);
                if(object0 instanceof String) {
                    zzjm0.zzm(v, ((String)object0));
                }
                else {
                    zzjm0.zze(v, ((zzje)object0));
                }
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            zzjm0.zzm(v, ((String)list0.get(v1)));
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzH(int v, int v1) {
        this.a.zzp(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzI(int v, List list0, boolean z) {
        int v1 = 0;
        zzjm zzjm0 = this.a;
        if(z) {
            zzjm0.zzo(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzjm.zzA(((int)(((Integer)list0.get(v2)))));
            }
            zzjm0.zzq(v3);
            while(v1 < list0.size()) {
                zzjm0.zzq(((int)(((Integer)list0.get(v1)))));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            zzjm0.zzp(v, ((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzJ(int v, long v1) {
        this.a.zzr(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzK(int v, List list0, boolean z) {
        int v1 = 0;
        zzjm zzjm0 = this.a;
        if(z) {
            zzjm0.zzo(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzjm.zzB(((long)(((Long)list0.get(v2)))));
            }
            zzjm0.zzq(v3);
            while(v1 < list0.size()) {
                zzjm0.zzs(((long)(((Long)list0.get(v1)))));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            zzjm0.zzr(v, ((long)(((Long)list0.get(v1)))));
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzb(int v, boolean z) {
        this.a.zzd(v, z);
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzc(int v, List list0, boolean z) {
        int v1 = 0;
        zzjm zzjm0 = this.a;
        if(z) {
            zzjm0.zzo(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                ((Boolean)list0.get(v2)).getClass();
                ++v3;
            }
            zzjm0.zzq(v3);
            while(v1 < list0.size()) {
                zzjm0.zzb(((byte)((Boolean)list0.get(v1)).booleanValue()));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            zzjm0.zzd(v, ((Boolean)list0.get(v1)).booleanValue());
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzd(int v, zzje zzje0) {
        this.a.zze(v, zzje0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zze(int v, List list0) {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            zzje zzje0 = (zzje)list0.get(v1);
            this.a.zze(v, zzje0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzf(int v, double f) {
        this.a.zzh(v, Double.doubleToRawLongBits(f));
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzg(int v, List list0, boolean z) {
        int v1 = 0;
        zzjm zzjm0 = this.a;
        if(z) {
            zzjm0.zzo(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                ((Double)list0.get(v2)).getClass();
                v3 += 8;
            }
            zzjm0.zzq(v3);
            while(v1 < list0.size()) {
                zzjm0.zzi(Double.doubleToRawLongBits(((double)(((Double)list0.get(v1))))));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            zzjm0.zzh(v, Double.doubleToRawLongBits(((double)(((Double)list0.get(v1))))));
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzh(int v) {
        this.a.zzo(v, 4);
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzi(int v, int v1) {
        this.a.zzj(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzj(int v, List list0, boolean z) {
        int v1 = 0;
        zzjm zzjm0 = this.a;
        if(z) {
            zzjm0.zzo(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzjm.zzv(((int)(((Integer)list0.get(v2)))));
            }
            zzjm0.zzq(v3);
            while(v1 < list0.size()) {
                zzjm0.zzk(((int)(((Integer)list0.get(v1)))));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            zzjm0.zzj(v, ((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzk(int v, int v1) {
        this.a.zzf(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzl(int v, List list0, boolean z) {
        int v1 = 0;
        zzjm zzjm0 = this.a;
        if(z) {
            zzjm0.zzo(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                ((Integer)list0.get(v2)).getClass();
                v3 += 4;
            }
            zzjm0.zzq(v3);
            while(v1 < list0.size()) {
                zzjm0.zzg(((int)(((Integer)list0.get(v1)))));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            zzjm0.zzf(v, ((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzm(int v, long v1) {
        this.a.zzh(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzn(int v, List list0, boolean z) {
        int v1 = 0;
        zzjm zzjm0 = this.a;
        if(z) {
            zzjm0.zzo(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                ((Long)list0.get(v2)).getClass();
                v3 += 8;
            }
            zzjm0.zzq(v3);
            while(v1 < list0.size()) {
                zzjm0.zzi(((long)(((Long)list0.get(v1)))));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            zzjm0.zzh(v, ((long)(((Long)list0.get(v1)))));
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzo(int v, float f) {
        this.a.zzf(v, Float.floatToRawIntBits(f));
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzp(int v, List list0, boolean z) {
        int v1 = 0;
        zzjm zzjm0 = this.a;
        if(z) {
            zzjm0.zzo(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                ((Float)list0.get(v2)).getClass();
                v3 += 4;
            }
            zzjm0.zzq(v3);
            while(v1 < list0.size()) {
                zzjm0.zzg(Float.floatToRawIntBits(((float)(((Float)list0.get(v1))))));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            zzjm0.zzf(v, Float.floatToRawIntBits(((float)(((Float)list0.get(v1))))));
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzq(int v, Object object0, zzlx zzlx0) {
        this.a.zzo(v, 3);
        zzlx0.zzi(((zzlm)object0), this.a.a);
        this.a.zzo(v, 4);
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzr(int v, int v1) {
        this.a.zzj(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzs(int v, List list0, boolean z) {
        int v1 = 0;
        zzjm zzjm0 = this.a;
        if(z) {
            zzjm0.zzo(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzjm.zzv(((int)(((Integer)list0.get(v2)))));
            }
            zzjm0.zzq(v3);
            while(v1 < list0.size()) {
                zzjm0.zzk(((int)(((Integer)list0.get(v1)))));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            zzjm0.zzj(v, ((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzt(int v, long v1) {
        this.a.zzr(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzu(int v, List list0, boolean z) {
        int v1 = 0;
        zzjm zzjm0 = this.a;
        if(z) {
            zzjm0.zzo(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                v3 += zzjm.zzB(((long)(((Long)list0.get(v2)))));
            }
            zzjm0.zzq(v3);
            while(v1 < list0.size()) {
                zzjm0.zzs(((long)(((Long)list0.get(v1)))));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            zzjm0.zzr(v, ((long)(((Long)list0.get(v1)))));
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzv(int v, Object object0, zzlx zzlx0) {
        ((s0)this.a).zzq(v << 3 | 2);
        int v1 = ((zzio)(((zzlm)object0))).a(zzlx0);
        ((s0)this.a).zzq(v1);
        zzlx0.zzi(((zzlm)object0), ((s0)this.a).a);
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzw(int v, int v1) {
        this.a.zzf(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzx(int v, List list0, boolean z) {
        int v1 = 0;
        zzjm zzjm0 = this.a;
        if(z) {
            zzjm0.zzo(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                ((Integer)list0.get(v2)).getClass();
                v3 += 4;
            }
            zzjm0.zzq(v3);
            while(v1 < list0.size()) {
                zzjm0.zzg(((int)(((Integer)list0.get(v1)))));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            zzjm0.zzf(v, ((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzy(int v, long v1) {
        this.a.zzh(v, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzng
    public final void zzz(int v, List list0, boolean z) {
        int v1 = 0;
        zzjm zzjm0 = this.a;
        if(z) {
            zzjm0.zzo(v, 2);
            int v3 = 0;
            for(int v2 = 0; v2 < list0.size(); ++v2) {
                ((Long)list0.get(v2)).getClass();
                v3 += 8;
            }
            zzjm0.zzq(v3);
            while(v1 < list0.size()) {
                zzjm0.zzi(((long)(((Long)list0.get(v1)))));
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            zzjm0.zzh(v, ((long)(((Long)list0.get(v1)))));
            ++v1;
        }
    }
}

