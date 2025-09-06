package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.util.Log;

public final class d0 implements zzhk {
    public final Context a;
    public final b0 b;
    public static d0 c;

    public d0() {
        this.a = null;
        this.b = null;
    }

    public d0(Context context0) {
        this.a = context0;
        b0 b00 = new b0(1, null);
        this.b = b00;
        context0.getContentResolver().registerContentObserver(zzha.zza, true, b00);
    }

    public final String a(String s) {
        if(this.a != null && !zzhb.zza(this.a)) {
            try {
                return (String)zzhi.zza(new zzhl(this, s));
            }
            catch(IllegalStateException | SecurityException | NullPointerException illegalStateException0) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + s, illegalStateException0);
            }
        }
        return null;
    }

    // 检测为 Lambda 实现
    @Override  // com.google.android.gms.internal.measurement.zzhk
    public final Object zzb(String s) [...]
}

