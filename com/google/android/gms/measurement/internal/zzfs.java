package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;

public final class zzfs implements Runnable {
    public final zzgj zza;
    public final String zzb;
    public final Bundle zzc;

    public zzfs(zzgj zzgj0, String s, Bundle bundle0) {
        this.zza = zzgj0;
        this.zzb = s;
        this.zzc = bundle0;
    }

    @Override
    public final void run() {
        String s = this.zzb;
        e e0 = this.zza.a.zzi();
        e0.zzg();
        e0.zzW();
        zzar zzar0 = new zzar(e0.zzt, "", s, "dep", 0L, this.zzc);
        byte[] arr_b = e0.zzf.zzu().o(zzar0).zzbu();
        e0.zzt.zzay().zzj().zzc("Saving default event parameters, appId, data size", e0.zzt.zzj().zzd(s), ((int)arr_b.length));
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("parameters", arr_b);
        try {
            if(e0.o().insertWithOnConflict("default_event_params", null, contentValues0, 5) == -1L) {
                e0.zzt.zzay().zzd().zzb("Failed to insert default event parameters (got -1). appId", zzeh.zzn(s));
            }
        }
        catch(SQLiteException sQLiteException0) {
            e0.zzt.zzay().zzd().zzc("Error storing default event parameters. appId", zzeh.zzn(s), sQLiteException0);
        }
    }
}

