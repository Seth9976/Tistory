package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.room.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzei;
import com.google.android.gms.internal.measurement.zzej;
import com.google.android.gms.internal.measurement.zzek;
import com.google.android.gms.internal.measurement.zzel;
import com.google.android.gms.internal.measurement.zzem;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzet;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzgt;
import com.google.android.gms.internal.measurement.zzkp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import jeb.synthetic.TWR;

public final class zzfi extends m1 implements zzaf {
    public final ArrayMap b;
    public final ArrayMap c;
    public final ArrayMap d;
    public final ArrayMap e;
    public final ArrayMap f;
    public final ArrayMap g;
    public final q h;
    public final r i;
    public final ArrayMap j;
    public final ArrayMap k;
    public final ArrayMap l;

    public zzfi(zzkt zzkt0) {
        super(zzkt0);
        this.b = new ArrayMap();
        this.c = new ArrayMap();
        this.d = new ArrayMap();
        this.e = new ArrayMap();
        this.f = new ArrayMap();
        this.j = new ArrayMap();
        this.k = new ArrayMap();
        this.l = new ArrayMap();
        this.g = new ArrayMap();
        this.h = new q(this);
        this.i = new r(this);
    }

    public final zzff a(String s, byte[] arr_b) {
        if(arr_b == null) {
            return zzff.zzg();
        }
        try {
            zzff zzff0 = (zzff)((zzfe)zzkv.p(zzff.zze(), arr_b)).zzaC();
            zzef zzef0 = this.zzt.zzay().zzj();
            String s1 = null;
            Long long0 = zzff0.zzs() ? zzff0.zzc() : null;
            if(zzff0.zzr()) {
                s1 = zzff0.zzh();
            }
            zzef0.zzc("Parsed config. version, gmp_app_id", long0, s1);
            return zzff0;
        }
        catch(zzkp zzkp0) {
        }
        catch(RuntimeException runtimeException0) {
            this.zzt.zzay().zzk().zzc("Unable to merge remote config. appId", zzeh.zzn(s), runtimeException0);
            return zzff.zzg();
        }
        this.zzt.zzay().zzk().zzc("Unable to merge remote config. appId", zzeh.zzn(s), zzkp0);
        return zzff.zzg();
    }

    public final void b(String s, zzfe zzfe0) {
        HashSet hashSet0 = new HashSet();
        ArrayMap arrayMap0 = new ArrayMap();
        ArrayMap arrayMap1 = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        for(Object object0: zzfe0.zzg()) {
            hashSet0.add(((zzfb)object0).zzb());
        }
        for(int v = 0; v < zzfe0.zza(); ++v) {
            zzfc zzfc0 = (zzfc)zzfe0.zzb(v).zzby();
            if(zzfc0.zzc().isEmpty()) {
                a.A(this.zzt, "EventConfig contained null event name");
            }
            else {
                String s1 = zzfc0.zzc();
                String s2 = zzgo.zzb(zzfc0.zzc());
                if(!TextUtils.isEmpty(s2)) {
                    zzfc0.zzb(s2);
                    zzfe0.zzd(v, zzfc0);
                }
                if(zzfc0.zzf() && zzfc0.zzd()) {
                    arrayMap0.put(s1, Boolean.TRUE);
                }
                if(zzfc0.zzg() && zzfc0.zze()) {
                    arrayMap1.put(zzfc0.zzc(), Boolean.TRUE);
                }
                if(zzfc0.zzh()) {
                    if(zzfc0.zza() < 2 || zzfc0.zza() > 0xFFFF) {
                        this.zzt.zzay().zzk().zzc("Invalid sampling rate. Event name, sample rate", zzfc0.zzc(), zzfc0.zza());
                    }
                    else {
                        arrayMap2.put(zzfc0.zzc(), zzfc0.zza());
                    }
                }
            }
        }
        this.c.put(s, hashSet0);
        this.d.put(s, arrayMap0);
        this.e.put(s, arrayMap1);
        this.g.put(s, arrayMap2);
    }

    public final void c(String s) {
        c c0;
        String s2;
        String s1;
        byte[] arr_b;
        Cursor cursor0;
        this.zzW();
        this.zzg();
        Preconditions.checkNotEmpty(s);
        ArrayMap arrayMap0 = this.f;
        if(arrayMap0.get(s) == null) {
            e e0 = this.zzf.zzi();
            Preconditions.checkNotEmpty(s);
            e0.zzg();
            e0.zzW();
            try {
                cursor0 = null;
                cursor0 = e0.o().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{s}, null, null, null);
            }
            catch(SQLiteException sQLiteException0) {
                try {
                    e0.zzt.zzay().zzd().zzc("Error querying remote config. appId", zzeh.zzn(s), sQLiteException0);
                    goto label_29;
                }
                catch(Throwable throwable0) {
                    goto label_34;
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(null, throwable0);
                throw throwable0;
            }
            try {
                if(cursor0.moveToFirst()) {
                    arr_b = cursor0.getBlob(0);
                    s1 = cursor0.getString(1);
                    s2 = e0.zzt.zzf().zzs(null, zzdu.zzao) ? cursor0.getString(2) : null;
                    if(cursor0.moveToNext()) {
                        e0.zzt.zzay().zzd().zzb("Got multiple records for app config, expected one. appId", zzeh.zzn(s));
                    }
                    goto label_24;
                }
                else {
                    goto label_41;
                }
                goto label_43;
            }
            catch(SQLiteException sQLiteException1) {
                goto label_28;
            }
            catch(Throwable throwable0) {
                goto label_34;
            }
        label_24:
            if(arr_b == null) {
                cursor0.close();
                c0 = null;
                goto label_43;
            label_41:
                cursor0.close();
                c0 = null;
            }
            else {
                try {
                    try {
                        c0 = new c(arr_b, s1, s2);
                        goto label_36;
                    }
                    catch(SQLiteException sQLiteException1) {
                    }
                label_28:
                    e0.zzt.zzay().zzd().zzc("Error querying remote config. appId", zzeh.zzn(s), sQLiteException1);
                }
                catch(Throwable throwable0) {
                    goto label_34;
                }
            label_29:
                if(cursor0 != null) {
                    cursor0.close();
                }
                c0 = null;
                goto label_43;
            label_34:
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            label_36:
                cursor0.close();
            }
        label_43:
            ArrayMap arrayMap1 = this.l;
            ArrayMap arrayMap2 = this.k;
            ArrayMap arrayMap3 = this.j;
            ArrayMap arrayMap4 = this.b;
            if(c0 == null) {
                arrayMap4.put(s, null);
                this.d.put(s, null);
                this.c.put(s, null);
                this.e.put(s, null);
                arrayMap0.put(s, null);
                arrayMap3.put(s, null);
                arrayMap2.put(s, null);
                arrayMap1.put(s, null);
                this.g.put(s, null);
                return;
            }
            zzfe zzfe0 = (zzfe)this.a(s, c0.a).zzby();
            this.b(s, zzfe0);
            arrayMap4.put(s, zzfi.e(((zzff)zzfe0.zzaC())));
            arrayMap0.put(s, ((zzff)zzfe0.zzaC()));
            this.d(s, ((zzff)zzfe0.zzaC()));
            arrayMap3.put(s, zzfe0.zze());
            arrayMap2.put(s, c0.b);
            arrayMap1.put(s, c0.c);
        }
    }

    public final void d(String s, zzff zzff0) {
        q q0 = this.h;
        if(zzff0.zza() != 0) {
            this.zzt.zzay().zzj().zzb("EES programs found", zzff0.zza());
            zzgt zzgt0 = (zzgt)zzff0.zzm().get(0);
            try {
                zzc zzc0 = new zzc();
                zzc0.zzd("internal.remoteConfig", new com.google.android.gms.measurement.internal.zzfc(this, s));
                zzc0.zzd("internal.appMetadata", new zzfd(this, s));
                zzc0.zzd("internal.logger", new com.google.android.gms.measurement.internal.zzfe(this));
                zzc0.zzc(zzgt0);
                q0.put(s, zzc0);
                this.zzt.zzay().zzj().zzc("EES program loaded for appId, activities", s, zzgt0.zza().zza());
                Iterator iterator0 = zzgt0.zza().zzd().iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    this.zzt.zzay().zzj().zzb("EES program activity", "");
                }
            }
            catch(zzd unused_ex) {
                this.zzt.zzay().zzd().zzb("Failed to load EES program. appId", s);
            }
            return;
        }
        q0.remove(s);
    }

    public static final ArrayMap e(zzff zzff0) {
        ArrayMap arrayMap0 = new ArrayMap();
        if(zzff0 != null) {
            Iterator iterator0 = zzff0.zzn().iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                arrayMap0.put("", "");
            }
        }
        return arrayMap0;
    }

    public final int f(String s, String s1) {
        this.zzg();
        this.c(s);
        Map map0 = (Map)this.g.get(s);
        if(map0 != null) {
            Integer integer0 = (Integer)map0.get(s1);
            return integer0 == null ? 1 : ((int)integer0);
        }
        return 1;
    }

    public final String g(String s) {
        this.zzg();
        this.c(s);
        return (String)this.j.get(s);
    }

    public final boolean h(String s) {
        this.zzg();
        zzff zzff0 = this.zze(s);
        return zzff0 == null ? false : zzff0.zzq();
    }

    public final boolean i(String s, String s1) {
        this.zzg();
        this.c(s);
        if("ecommerce_purchase".equals(s1)) {
            return true;
        }
        if(!"purchase".equals(s1) && !"refund".equals(s1)) {
            Map map0 = (Map)this.e.get(s);
            if(map0 != null) {
                Boolean boolean0 = (Boolean)map0.get(s1);
                return boolean0 == null ? false : boolean0.booleanValue();
            }
            return false;
        }
        return true;
    }

    public final boolean j(String s, String s1) {
        this.zzg();
        this.c(s);
        if("1".equals(this.zza(s, "measurement.upload.blacklist_internal")) && zzlb.v(s1)) {
            return true;
        }
        if("1".equals(this.zza(s, "measurement.upload.blacklist_public")) && zzlb.w(s1)) {
            return true;
        }
        Map map0 = (Map)this.d.get(s);
        if(map0 != null) {
            Boolean boolean0 = (Boolean)map0.get(s1);
            return boolean0 == null ? false : boolean0.booleanValue();
        }
        return false;
    }

    @Override  // com.google.android.gms.measurement.internal.zzaf
    @WorkerThread
    public final String zza(String s, String s1) {
        this.zzg();
        this.c(s);
        Map map0 = (Map)this.b.get(s);
        return map0 == null ? null : ((String)map0.get(s1));
    }

    @Override  // com.google.android.gms.measurement.internal.m1
    public final boolean zzb() {
        return false;
    }

    @WorkerThread
    public final zzff zze(String s) {
        this.zzW();
        this.zzg();
        Preconditions.checkNotEmpty(s);
        this.c(s);
        return (zzff)this.f.get(s);
    }

    @WorkerThread
    public final String zzf(String s) {
        this.zzg();
        return (String)this.l.get(s);
    }

    @WorkerThread
    public final String zzh(String s) {
        this.zzg();
        return (String)this.k.get(s);
    }

    @WorkerThread
    public final void zzl(String s) {
        this.zzg();
        this.k.put(s, null);
    }

    public final boolean zzo(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        zzff zzff0 = (zzff)this.f.get(s);
        return zzff0 == null ? false : zzff0.zza() != 0;
    }

    @WorkerThread
    public final boolean zzt(String s, byte[] arr_b, String s1, String s2) {
        byte[] arr_b1;
        Iterator iterator4;
        boolean z;
        this.zzW();
        this.zzg();
        Preconditions.checkNotEmpty(s);
        zzfe zzfe0 = (zzfe)this.a(s, arr_b).zzby();
        this.b(s, zzfe0);
        this.d(s, ((zzff)zzfe0.zzaC()));
        ArrayMap arrayMap0 = this.f;
        arrayMap0.put(s, ((zzff)zzfe0.zzaC()));
        String s3 = zzfe0.zze();
        this.j.put(s, s3);
        this.k.put(s, s1);
        this.l.put(s, s2);
        ArrayMap arrayMap1 = zzfi.e(((zzff)zzfe0.zzaC()));
        this.b.put(s, arrayMap1);
        e e0 = this.zzf.zzi();
        ArrayList arrayList0 = new ArrayList(zzfe0.zzf());
        e0.getClass();
        Preconditions.checkNotNull(arrayList0);
        for(int v = 0; v < arrayList0.size(); ++v) {
            com.google.android.gms.internal.measurement.zzeh zzeh0 = (com.google.android.gms.internal.measurement.zzeh)((zzei)arrayList0.get(v)).zzby();
            if(zzeh0.zza() != 0) {
                for(int v1 = 0; v1 < zzeh0.zza(); ++v1) {
                    zzej zzej0 = (zzej)zzeh0.zze(v1).zzby();
                    zzej zzej1 = (zzej)zzej0.zzaz();
                    String s4 = zzgo.zzb(zzej0.zze());
                    if(s4 == null) {
                        z = false;
                    }
                    else {
                        zzej1.zzb(s4);
                        z = true;
                    }
                    for(int v2 = 0; v2 < zzej0.zza(); ++v2) {
                        zzem zzem0 = zzej0.zzd(v2);
                        String s5 = zzid.zzb("", zzgp.zza, zzgp.zzb);
                        if(s5 != null) {
                            zzel zzel0 = (zzel)zzem0.zzby();
                            zzel0.zza(s5);
                            zzej1.zzc(v2, ((zzem)zzel0.zzaC()));
                            z = true;
                        }
                    }
                    if(z) {
                        zzeh0.zzc(v1, zzej1);
                        arrayList0.set(v, ((zzei)zzeh0.zzaC()));
                    }
                }
            }
            if(zzeh0.zzb() != 0) {
                for(int v3 = 0; v3 < zzeh0.zzb(); ++v3) {
                    zzet zzet0 = zzeh0.zzf(v3);
                    String s6 = zzid.zzb("", zzgq.zza, zzgq.zzb);
                    if(s6 != null) {
                        zzes zzes0 = (zzes)zzet0.zzby();
                        zzes0.zza(s6);
                        zzeh0.zzd(v3, zzes0);
                        arrayList0.set(v, ((zzei)zzeh0.zzaC()));
                    }
                }
            }
        }
        e0.zzW();
        e0.zzg();
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(arrayList0);
        SQLiteDatabase sQLiteDatabase0 = e0.o();
        sQLiteDatabase0.beginTransaction();
        try {
            e0.zzW();
            e0.zzg();
            Preconditions.checkNotEmpty(s);
            SQLiteDatabase sQLiteDatabase1 = e0.o();
            sQLiteDatabase1.delete("property_filters", "app_id=?", new String[]{s});
            sQLiteDatabase1.delete("event_filters", "app_id=?", new String[]{s});
            Iterator iterator0 = arrayList0.iterator();
        label_76:
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                zzei zzei0 = (zzei)object0;
                e0.zzW();
                e0.zzg();
                Preconditions.checkNotEmpty(s);
                Preconditions.checkNotNull(zzei0);
                if(zzei0.zzk()) {
                    int v5 = zzei0.zza();
                    for(Object object1: zzei0.zzg()) {
                        if(!((zzek)object1).zzp()) {
                            e0.zzt.zzay().zzk().zzc("Event filter with no ID. Audience definition ignored. appId, audienceId", zzeh.zzn(s), v5);
                            continue label_76;
                        }
                        if(false) {
                            break;
                        }
                    }
                    for(Object object2: zzei0.zzh()) {
                        if(!((zzet)object2).zzj()) {
                            e0.zzt.zzay().zzk().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", zzeh.zzn(s), v5);
                            continue label_76;
                        }
                        if(false) {
                            break;
                        }
                    }
                    Iterator iterator3 = zzei0.zzg().iterator();
                    if(iterator3.hasNext()) {
                        Object object3 = iterator3.next();
                        zzek zzek0 = (zzek)object3;
                        e0.zzW();
                        e0.zzg();
                        Preconditions.checkNotEmpty(s);
                        Preconditions.checkNotNull(zzek0);
                        e0.zzt.zzay().zzk().zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzeh.zzn(s), v5, String.valueOf((zzek0.zzp() ? zzek0.zzb() : null)));
                        iterator4 = iterator0;
                        goto label_122;
                    }
                    else {
                        iterator4 = iterator0;
                        Iterator iterator5 = zzei0.zzh().iterator();
                        if(iterator5.hasNext()) {
                            Object object4 = iterator5.next();
                            zzet zzet1 = (zzet)object4;
                            e0.zzW();
                            e0.zzg();
                            Preconditions.checkNotEmpty(s);
                            Preconditions.checkNotNull(zzet1);
                            e0.zzt.zzay().zzk().zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzeh.zzn(s), v5, String.valueOf((zzet1.zzj() ? zzet1.zza() : null)));
                        label_122:
                            e0.zzW();
                            e0.zzg();
                            Preconditions.checkNotEmpty(s);
                            SQLiteDatabase sQLiteDatabase2 = e0.o();
                            sQLiteDatabase2.delete("property_filters", "app_id=? and audience_id=?", new String[]{s, String.valueOf(v5)});
                            sQLiteDatabase2.delete("event_filters", "app_id=? and audience_id=?", new String[]{s, String.valueOf(v5)});
                        }
                    }
                    iterator0 = iterator4;
                }
                else {
                    e0.zzt.zzay().zzk().zzb("Audience with no ID. appId", zzeh.zzn(s));
                }
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object5: arrayList0) {
                zzei zzei1 = (zzei)object5;
                arrayList1.add((zzei1.zzk() ? zzei1.zza() : null));
            }
            Preconditions.checkNotEmpty(s);
            e0.zzW();
            e0.zzg();
            SQLiteDatabase sQLiteDatabase3 = e0.o();
            try {
                long v6 = e0.j("select count(1) from audience_filter_values where app_id=?", new String[]{s});
            }
            catch(SQLiteException sQLiteException0) {
                e0.zzt.zzay().zzd().zzc("Database error querying filters. appId", zzeh.zzn(s), sQLiteException0);
                goto label_158;
            }
            int v7 = Math.max(0, Math.min(2000, e0.zzt.zzf().zze(s, zzdu.zzE)));
            if(v6 > ((long)v7)) {
                ArrayList arrayList2 = new ArrayList();
                for(int v8 = 0; true; ++v8) {
                    if(v8 >= arrayList1.size()) {
                        sQLiteDatabase3.delete("audience_filter_values", "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in " + ("(" + TextUtils.join(",", arrayList2) + ")") + " order by rowid desc limit -1 offset ?)", new String[]{s, Integer.toString(v7)});
                        break;
                    }
                    Integer integer0 = (Integer)arrayList1.get(v8);
                    if(integer0 == null) {
                        break;
                    }
                    arrayList2.add(Integer.toString(((int)integer0)));
                }
            }
        label_158:
            sQLiteDatabase0.setTransactionSuccessful();
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
        try {
            zzfe0.zzc();
            arr_b1 = ((zzff)zzfe0.zzaC()).zzbu();
        }
        catch(RuntimeException runtimeException0) {
            this.zzt.zzay().zzk().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzeh.zzn(s), runtimeException0);
            arr_b1 = arr_b;
        }
        e e1 = this.zzf.zzi();
        Preconditions.checkNotEmpty(s);
        e1.zzg();
        e1.zzW();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("remote_config", arr_b1);
        contentValues0.put("config_last_modified_time", s1);
        if(e1.zzt.zzf().zzs(null, zzdu.zzao)) {
            contentValues0.put("e_tag", s2);
        }
        try {
            if(((long)e1.o().update("apps", contentValues0, "app_id = ?", new String[]{s})) == 0L) {
                e1.zzt.zzay().zzd().zzb("Failed to update remote config (got 0). appId", zzeh.zzn(s));
            }
        }
        catch(SQLiteException sQLiteException1) {
            e1.zzt.zzay().zzd().zzc("Error storing remote config. appId", zzeh.zzn(s), sQLiteException1);
        }
        arrayMap0.put(s, ((zzff)zzfe0.zzaC()));
        return true;
    }
}

