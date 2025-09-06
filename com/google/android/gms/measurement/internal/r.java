package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzr;
import java.util.List;

public final class r implements zzr, zzeb, zzla {
    public final zzgm a;

    public r(zzgm zzgm0) {
        this.a = zzgm0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzr
    public void zza(int v, String s, List list0, boolean z, boolean z1) {
        zzef zzef0;
        zzfi zzfi0 = (zzfi)this.a;
        switch(v - 1) {
            case 0: {
                zzef0 = zzfi0.zzt.zzay().zzc();
                break;
            }
            case 1: {
                if(z) {
                    zzef0 = zzfi0.zzt.zzay().zzh();
                }
                else if(z1) {
                    zzef0 = zzfi0.zzt.zzay().zzd();
                }
                else {
                    zzef0 = zzfi0.zzt.zzay().zze();
                }
                break;
            }
            case 3: {
                zzef0 = zzfi0.zzt.zzay().zzj();
                break;
            }
            default: {
                if(v - 1 != 4) {
                    zzef0 = zzfi0.zzt.zzay().zzi();
                }
                else if(z) {
                    zzef0 = zzfi0.zzt.zzay().zzm();
                }
                else if(z1) {
                    zzef0 = zzfi0.zzt.zzay().zzk();
                }
                else {
                    zzef0 = zzfi0.zzt.zzay().zzl();
                }
            }
        }
        int v1 = list0.size();
        if(v1 != 1) {
            switch(v1) {
                case 2: {
                    zzef0.zzc(s, list0.get(0), list0.get(1));
                    return;
                }
                case 3: {
                    zzef0.zzd(s, list0.get(0), list0.get(1), list0.get(2));
                    return;
                }
                default: {
                    zzef0.zza(s);
                    return;
                }
            }
        }
        zzef0.zzb(s, list0.get(0));
    }

    @Override  // com.google.android.gms.measurement.internal.zzla
    public void zza(String s, String s1, Bundle bundle0) {
        boolean z = TextUtils.isEmpty(s);
        zzhx zzhx0 = (zzhx)this.a;
        if(!z) {
            zzhx0.zzF("auto", "_err", bundle0, s);
            return;
        }
        zzhx0.zzD("auto", "_err", bundle0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzeb
    public boolean zza() {
        zzfr zzfr0 = (zzfr)this.a;
        return zzfr0.zzL() && Log.isLoggable(zzfr0.zzay().zzq(), 3);
    }
}

