package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import java.io.Serializable;
import java.util.List;

public final class u1 {
    public zzft a;
    public Long b;
    public long c;
    public final b d;

    public u1(b b0) {
        this.d = b0;
    }

    public final zzft a(zzft zzft0, String s) {
        List list0 = zzft0.zzi();
        b b0 = this.d;
        b0.zzf.zzu();
        Long long0 = (Long)zzkv.b(zzft0, "_eid");
        if(long0 != null) {
            this.b = long0;
            this.a = zzft0;
            b0.zzf.zzu();
            Serializable serializable0 = 0L;
            Serializable serializable1 = zzkv.b(zzft0, "_epc");
            if(serializable1 != null) {
                serializable0 = serializable1;
            }
            long v = (long)(((Long)serializable0));
            this.c = v;
            if(v <= 0L) {
                b0.zzt.zzay().zzh().zzb("Complex event with zero extra param count. eventName", "");
            }
            else {
                b0.zzf.zzi().e(s, ((Long)Preconditions.checkNotNull(long0)), this.c, zzft0);
            }
        }
        zzfs zzfs0 = (zzfs)zzft0.zzby();
        zzfs0.zzi("");
        zzfs0.zzg();
        zzfs0.zzd(list0);
        return (zzft)zzfs0.zzaC();
    }
}

