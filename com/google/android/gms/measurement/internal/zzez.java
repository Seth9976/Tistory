package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

public final class zzez {
    public final zzfr a;

    public zzez(zzkt zzkt0) {
        this.a = zzkt0.l;
    }

    public final boolean a() {
        zzfr zzfr0;
        try {
            zzfr0 = this.a;
            PackageManagerWrapper packageManagerWrapper0 = Wrappers.packageManager(zzfr0.zzau());
            if(packageManagerWrapper0 == null) {
                zzfr0.zzay().zzj().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            }
            return packageManagerWrapper0.getPackageInfo("com.android.vending", 0x80).versionCode >= 80837300;
        }
        catch(Exception exception0) {
        }
        zzfr0.zzay().zzj().zzb("Failed to retrieve Play Store version for Install Referrer", exception0);
        return false;
    }
}

