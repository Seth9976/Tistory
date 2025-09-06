package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zznt;
import com.google.android.gms.internal.measurement.zzpd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jeb.synthetic.TWR;
import wb.a;

public final class e extends m1 {
    public final d b;
    public final k1 c;
    public static final String[] d;
    public static final String[] e;
    public static final String[] f;
    public static final String[] g;
    public static final String[] h;
    public static final String[] i;
    public static final String[] j;
    public static final String[] k;

    static {
        e.d = new String[]{"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
        e.e = new String[]{"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
        e.f = new String[]{"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};
        e.g = new String[]{"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
        e.h = new String[]{"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
        e.i = new String[]{"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
        e.j = new String[]{"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
        e.k = new String[]{"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    }

    public e(zzkt zzkt0) {
        super(zzkt0);
        this.c = new k1(this.zzt.zzav());
        this.b = new d(this, this.zzt.zzau());
    }

    public final void A(List list0) {
        this.zzg();
        this.zzW();
        Preconditions.checkNotNull(list0);
        Preconditions.checkNotZero(list0.size());
        if(!this.d()) {
            return;
        }
        String s = a.d("(", TextUtils.join(",", list0), ")");
        if(this.j("SELECT COUNT(1) FROM queue WHERE rowid IN " + s + " AND retry_count =  2147483647 LIMIT 1", null) > 0L) {
            androidx.room.a.A(this.zzt, "The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            this.o().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + s + " AND (retry_count IS NULL OR retry_count < 2147483647)");
        }
        catch(SQLiteException sQLiteException0) {
            this.zzt.zzay().zzd().zzb("Error incrementing retry count. error", sQLiteException0);
        }
    }

    public final void a(String s, String s1) {
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzg();
        this.zzW();
        try {
            this.o().delete("user_attributes", "app_id=? and name=?", new String[]{s, s1});
        }
        catch(SQLiteException sQLiteException0) {
            this.zzt.zzay().zzd().zzd("Error deleting user property. appId", zzeh.zzn(s), this.zzt.zzj().zzf(s1), sQLiteException0);
        }
    }

    public final void b(c0 c00) {
        Preconditions.checkNotNull(c00);
        this.zzg();
        this.zzW();
        String s = c00.w();
        Preconditions.checkNotNull(s);
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("app_instance_id", c00.x());
        contentValues0.put("gmp_app_id", c00.A());
        zzfr zzfr0 = c00.a;
        zzfr0.zzaz().zzg();
        contentValues0.put("resettable_device_id_hash", c00.e);
        zzfr0.zzaz().zzg();
        contentValues0.put("last_bundle_index", c00.g);
        zzfr0.zzaz().zzg();
        contentValues0.put("last_bundle_start_timestamp", c00.h);
        zzfr0.zzaz().zzg();
        contentValues0.put("last_bundle_end_timestamp", c00.i);
        contentValues0.put("app_version", c00.y());
        zzfr0.zzaz().zzg();
        contentValues0.put("app_store", c00.l);
        zzfr0.zzaz().zzg();
        contentValues0.put("gmp_version", c00.m);
        zzfr0.zzaz().zzg();
        contentValues0.put("dev_cert_hash", c00.n);
        zzfr0.zzaz().zzg();
        contentValues0.put("measurement_enabled", Boolean.valueOf(c00.o));
        zzfr0.zzaz().zzg();
        contentValues0.put("day", c00.v);
        zzfr0.zzaz().zzg();
        contentValues0.put("daily_public_events_count", c00.w);
        zzfr0.zzaz().zzg();
        contentValues0.put("daily_events_count", c00.x);
        zzfr0.zzaz().zzg();
        contentValues0.put("daily_conversions_count", c00.y);
        zzfr0.zzaz().zzg();
        contentValues0.put("config_fetched_time", c00.D);
        zzfr0.zzaz().zzg();
        contentValues0.put("failed_config_fetch_time", c00.E);
        contentValues0.put("app_version_int", c00.t());
        contentValues0.put("firebase_instance_id", c00.z());
        zzfr0.zzaz().zzg();
        contentValues0.put("daily_error_events_count", c00.z);
        zzfr0.zzaz().zzg();
        contentValues0.put("daily_realtime_events_count", c00.A);
        zzfr0.zzaz().zzg();
        contentValues0.put("health_monitor_sample", c00.B);
        zzfr0.zzaz().zzg();
        contentValues0.put("android_id", 0L);
        zzfr0.zzaz().zzg();
        contentValues0.put("adid_reporting_enabled", Boolean.valueOf(c00.p));
        contentValues0.put("admob_app_id", c00.u());
        zzfr0.zzaz().zzg();
        contentValues0.put("dynamite_version", c00.s);
        zzfr0.zzaz().zzg();
        contentValues0.put("session_stitching_token", c00.u);
        zzfr0.zzaz().zzg();
        ArrayList arrayList0 = c00.t;
        if(arrayList0 != null) {
            if(arrayList0.isEmpty()) {
                this.zzt.zzay().zzk().zzb("Safelisted events should not be an empty list. appId", s);
            }
            else {
                contentValues0.put("safelisted_events", TextUtils.join(",", arrayList0));
            }
        }
        zznt.zzc();
        if(this.zzt.zzf().zzs(null, zzdu.zzai) && !contentValues0.containsKey("safelisted_events")) {
            contentValues0.put("safelisted_events", null);
        }
        try {
            SQLiteDatabase sQLiteDatabase0 = this.o();
            if(((long)sQLiteDatabase0.update("apps", contentValues0, "app_id = ?", new String[]{s})) == 0L && sQLiteDatabase0.insertWithOnConflict("apps", null, contentValues0, 5) == -1L) {
                this.zzt.zzay().zzd().zzb("Failed to insert/update app (got -1). appId", zzeh.zzn(s));
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.zzt.zzay().zzd().zzc("Error storing app. appId", zzeh.zzn(s), sQLiteException0);
        }
    }

    public final void c(h h0) {
        Preconditions.checkNotNull(h0);
        this.zzg();
        this.zzW();
        ContentValues contentValues0 = new ContentValues();
        String s = h0.a;
        contentValues0.put("app_id", h0.a);
        contentValues0.put("name", h0.b);
        contentValues0.put("lifetime_count", h0.c);
        contentValues0.put("current_bundle_count", h0.d);
        contentValues0.put("last_fire_timestamp", h0.f);
        contentValues0.put("last_bundled_timestamp", h0.g);
        contentValues0.put("last_bundled_day", h0.h);
        contentValues0.put("last_sampled_complex_event_id", h0.i);
        contentValues0.put("last_sampling_rate", h0.j);
        contentValues0.put("current_session_count", h0.e);
        contentValues0.put("last_exempt_from_sampling", (h0.k == null || !h0.k.booleanValue() ? null : 1L));
        try {
            if(this.o().insertWithOnConflict("events", null, contentValues0, 5) == -1L) {
                this.zzt.zzay().zzd().zzb("Failed to insert/update event aggregates (got -1). appId", zzeh.zzn(s));
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.zzt.zzay().zzd().zzc("Error storing event aggregates. appId", zzeh.zzn(s), sQLiteException0);
        }
    }

    public final boolean d() {
        return this.zzt.zzau().getDatabasePath("google_app_measurement.db").exists();
    }

    public final void e(String s, Long long0, long v, zzft zzft0) {
        this.zzg();
        this.zzW();
        Preconditions.checkNotNull(zzft0);
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(long0);
        byte[] arr_b = zzft0.zzbu();
        this.zzt.zzay().zzj().zzc("Saving complex main event, appId, data size", this.zzt.zzj().zzd(s), ((int)arr_b.length));
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("event_id", long0);
        contentValues0.put("children_to_process", v);
        contentValues0.put("main_event", arr_b);
        try {
            if(this.o().insertWithOnConflict("main_event_params", null, contentValues0, 5) == -1L) {
                this.zzt.zzay().zzd().zzb("Failed to insert complex main event (got -1). appId", zzeh.zzn(s));
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.zzt.zzay().zzd().zzc("Error storing complex main event. appId", zzeh.zzn(s), sQLiteException0);
        }
    }

    public final boolean f(zzac zzac0) {
        Preconditions.checkNotNull(zzac0);
        this.zzg();
        this.zzW();
        String s = zzac0.zza;
        Preconditions.checkNotNull(s);
        if(this.t(s, zzac0.zzc.zzb) == null && this.j("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{s}) >= 1000L) {
            return false;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("origin", zzac0.zzb);
        contentValues0.put("name", zzac0.zzc.zzb);
        e.i(contentValues0, Preconditions.checkNotNull(zzac0.zzc.zza()));
        contentValues0.put("active", Boolean.valueOf(zzac0.zze));
        contentValues0.put("trigger_event_name", zzac0.zzf);
        contentValues0.put("trigger_timeout", zzac0.zzh);
        this.zzt.zzv().getClass();
        contentValues0.put("timed_out_event", zzlb.z(zzac0.zzg));
        contentValues0.put("creation_timestamp", zzac0.zzd);
        zzlb zzlb0 = this.zzt.zzv();
        zzaw zzaw0 = zzac0.zzi;
        zzlb0.getClass();
        contentValues0.put("triggered_event", zzlb.z(zzaw0));
        contentValues0.put("triggered_timestamp", zzac0.zzc.zzc);
        contentValues0.put("time_to_live", zzac0.zzj);
        this.zzt.zzv().getClass();
        contentValues0.put("expired_event", zzlb.z(zzac0.zzk));
        try {
            if(this.o().insertWithOnConflict("conditional_properties", null, contentValues0, 5) == -1L) {
                this.zzt.zzay().zzd().zzb("Failed to insert/update conditional user property (got -1)", zzeh.zzn(s));
                return true;
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.zzt.zzay().zzd().zzc("Error storing conditional user property", zzeh.zzn(s), sQLiteException0);
        }
        return true;
    }

    public final boolean g(r1 r10) {
        Preconditions.checkNotNull(r10);
        this.zzg();
        this.zzW();
        String s = r10.a;
        String s1 = r10.c;
        r1 r11 = this.t(s, s1);
        String s2 = r10.b;
        if(r11 == null) {
            if(zzlb.w(s1)) {
                if(this.j("select count(1) from user_attributes where app_id=? and name not like \'!_%\' escape \'!\'", new String[]{s}) >= ((long)this.zzt.zzf().zzf(s, zzdu.zzF, 25, 100))) {
                    return false;
                }
            }
            else if(!"_npa".equals(s1) && this.j("select count(1) from user_attributes where app_id=? and origin=? AND name like \'!_%\' escape \'!\'", new String[]{s, s2}) >= 25L) {
                return false;
            }
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("app_id", s);
        contentValues0.put("origin", s2);
        contentValues0.put("name", s1);
        contentValues0.put("set_timestamp", r10.d);
        e.i(contentValues0, r10.e);
        try {
            if(this.o().insertWithOnConflict("user_attributes", null, contentValues0, 5) == -1L) {
                this.zzt.zzay().zzd().zzb("Failed to insert/update user property (got -1). appId", zzeh.zzn(s));
                return true;
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.zzt.zzay().zzd().zzc("Error storing user property. appId", zzeh.zzn(s), sQLiteException0);
        }
        return true;
    }

    public final void h(long v, long v1, p1 p10) {
        zzfs zzfs0;
        String[] arr_s2;
        String s3;
        zzgd zzgd0;
        String s2;
        Cursor cursor0;
        SQLiteDatabase sQLiteDatabase0;
        String s1;
        Preconditions.checkNotNull(p10);
        this.zzg();
        this.zzW();
        String s = null;
        try {
            s1 = "";
            sQLiteDatabase0 = this.o();
            if(TextUtils.isEmpty(null)) {
                int v2 = Long.compare(v1, -1L);
                String[] arr_s = v2 == 0 ? new String[]{String.valueOf(v)} : new String[]{String.valueOf(v1), String.valueOf(v)};
                if(v2 != 0) {
                    s1 = "rowid <= ? and ";
                }
                cursor0 = sQLiteDatabase0.rawQuery("select app_id, metadata_fingerprint from raw_events where " + s1 + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", arr_s);
                goto label_12;
            }
            goto label_19;
        }
        catch(SQLiteException sQLiteException0) {
            cursor0 = null;
            goto label_77;
        }
        catch(Throwable throwable0) {
            goto label_83;
        }
        try {
        label_12:
            if(cursor0.moveToFirst()) {
                s = cursor0.getString(0);
                s2 = cursor0.getString(1);
                cursor0.close();
                goto label_33;
            }
        }
        catch(SQLiteException sQLiteException0) {
            goto label_77;
        }
        catch(Throwable throwable0) {
            goto label_82;
        }
        cursor0.close();
        return;
        try {
        label_19:
            int v3 = Long.compare(v1, -1L);
            String[] arr_s1 = v3 == 0 ? new String[]{0} : new String[]{0, String.valueOf(v1)};
            if(v3 != 0) {
                s1 = " and rowid <= ?";
            }
            cursor0 = sQLiteDatabase0.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + s1 + " order by rowid limit 1;", arr_s1);
        }
        catch(SQLiteException sQLiteException0) {
            cursor0 = null;
            goto label_77;
        }
        catch(Throwable throwable0) {
            goto label_83;
        }
        try {
            if(cursor0.moveToFirst()) {
                s2 = cursor0.getString(0);
                cursor0.close();
            label_33:
                cursor0 = sQLiteDatabase0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{s, s2}, null, null, "rowid", "2");
                if(!cursor0.moveToFirst()) {
                    this.zzt.zzay().zzd().zzb("Raw event metadata record is missing. appId", zzeh.zzn(s));
                    goto label_36;
                }
                goto label_38;
            }
            goto label_88;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_77;
        }
        catch(Throwable throwable0) {
            goto label_82;
        }
    label_36:
        cursor0.close();
        return;
        try {
        label_38:
            byte[] arr_b = cursor0.getBlob(0);
            try {
                zzgd0 = (zzgd)((zzgc)zzkv.p(zzgd.zzt(), arr_b)).zzaC();
                goto label_45;
            }
            catch(IOException iOException0) {
            }
            this.zzt.zzay().zzd().zzc("Data loss. Failed to merge raw event metadata. appId", zzeh.zzn(s), iOException0);
        }
        catch(SQLiteException sQLiteException0) {
            goto label_77;
        }
        catch(Throwable throwable0) {
            goto label_82;
        }
        cursor0.close();
        return;
        try {
        label_45:
            if(cursor0.moveToNext()) {
                this.zzt.zzay().zzk().zzb("Get multiple raw event metadata records, expected one. appId", zzeh.zzn(s));
            }
            cursor0.close();
            Preconditions.checkNotNull(zzgd0);
            p10.a = zzgd0;
            if(v1 == -1L) {
                s3 = "app_id = ? and metadata_fingerprint = ?";
                arr_s2 = new String[]{s, s2};
            }
            else {
                s3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                arr_s2 = new String[]{s, s2, String.valueOf(v1)};
            }
            cursor0 = sQLiteDatabase0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, s3, arr_s2, null, null, "rowid", null);
            if(cursor0.moveToFirst()) {
                while(true) {
                    long v4 = cursor0.getLong(0);
                    byte[] arr_b1 = cursor0.getBlob(3);
                    try {
                        zzfs0 = (zzfs)zzkv.p(zzft.zze(), arr_b1);
                    }
                    catch(IOException iOException1) {
                        this.zzt.zzay().zzd().zzc("Data loss. Failed to merge raw event. appId", zzeh.zzn(s), iOException1);
                        goto label_68;
                    }
                    zzfs0.zzi(cursor0.getString(1));
                    zzfs0.zzm(cursor0.getLong(2));
                    if(!p10.a(v4, ((zzft)zzfs0.zzaC()))) {
                        goto label_72;
                    }
                label_68:
                    if(!cursor0.moveToNext()) {
                        goto label_69;
                    }
                }
            }
            goto label_74;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_77;
        }
        catch(Throwable throwable0) {
            goto label_82;
        }
    label_69:
        cursor0.close();
        return;
    label_72:
        cursor0.close();
        return;
        try {
        label_74:
            this.zzt.zzay().zzk().zzb("Raw event data disappeared while in transaction. appId", zzeh.zzn(s));
            goto label_86;
        }
        catch(SQLiteException sQLiteException0) {
            try {
            label_77:
                this.zzt.zzay().zzd().zzc("Data loss. Error selecting raw event. appId", zzeh.zzn(s), sQLiteException0);
                if(cursor0 != null) {
                    goto label_79;
                }
                return;
            }
            catch(Throwable throwable0) {
                goto label_82;
            }
        label_79:
            cursor0.close();
            return;
        }
        catch(Throwable throwable0) {
        label_82:
            s = cursor0;
        }
    label_83:
        if(s != null) {
            ((Cursor)s).close();
        }
        throw throwable0;
    label_86:
        cursor0.close();
        return;
    label_88:
        cursor0.close();
    }

    public static final void i(ContentValues contentValues0, Object object0) {
        new String("value");
        Preconditions.checkNotNull(object0);
        if(object0 instanceof String) {
            contentValues0.put("value", ((String)object0));
            return;
        }
        if(object0 instanceof Long) {
            contentValues0.put("value", ((Long)object0));
            return;
        }
        if(!(object0 instanceof Double)) {
            throw new IllegalArgumentException("Invalid value type");
        }
        contentValues0.put("value", ((Double)object0));
    }

    public final long j(String s, String[] arr_s) {
        long v;
        SQLiteDatabase sQLiteDatabase0 = this.o();
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = sQLiteDatabase0.rawQuery(s, arr_s);
                if(!cursor0.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                v = cursor0.getLong(0);
            }
            catch(SQLiteException sQLiteException0) {
                this.zzt.zzay().zzd().zzc("Database error", s, sQLiteException0);
                throw sQLiteException0;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return v;
    }

    public final void k(String s, String s1) {
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzg();
        this.zzW();
        try {
            this.o().delete("conditional_properties", "app_id=? and name=?", new String[]{s, s1});
        }
        catch(SQLiteException sQLiteException0) {
            this.zzt.zzay().zzd().zzd("Error deleting conditional property", zzeh.zzn(s), this.zzt.zzj().zzf(s1), sQLiteException0);
        }
    }

    public final long l(String s, String[] arr_s, long v) {
        long v1;
        SQLiteDatabase sQLiteDatabase0 = this.o();
        Cursor cursor0 = null;
        try {
            try {
                cursor0 = sQLiteDatabase0.rawQuery(s, arr_s);
                if(cursor0.moveToFirst()) {
                    v1 = cursor0.getLong(0);
                    goto label_12;
                }
                goto label_14;
            }
            catch(SQLiteException sQLiteException0) {
                this.zzt.zzay().zzd().zzc("Database error", s, sQLiteException0);
                throw sQLiteException0;
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_12:
        cursor0.close();
        return v1;
    label_14:
        cursor0.close();
        return v;
    }

    public final long m(String s) {
        SQLiteException sQLiteException1;
        long v1;
        Preconditions.checkNotEmpty(s);
        new String("first_open_count");
        this.zzg();
        this.zzW();
        SQLiteDatabase sQLiteDatabase0 = this.o();
        sQLiteDatabase0.beginTransaction();
        try {
            v1 = this.l("select first_open_count from app2 where app_id=?", new String[]{s}, -1L);
            if(Long.compare(v1, -1L) == 0) {
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("app_id", s);
                contentValues0.put("first_open_count", 0);
                contentValues0.put("previous_install_count", 0);
                if(sQLiteDatabase0.insertWithOnConflict("app2", null, contentValues0, 5) == -1L) {
                    this.zzt.zzay().zzd().zzc("Failed to insert column (got -1). appId", zzeh.zzn(s), "first_open_count");
                    return -1L;
                }
                goto label_19;
            }
            goto label_25;
        }
        catch(SQLiteException sQLiteException0) {
            sQLiteException1 = sQLiteException0;
            this.zzt.zzay().zzd().zzd("Error inserting column. appId", zzeh.zzn(s), "first_open_count", sQLiteException1);
            return 0L;
        }
        finally {
            sQLiteDatabase0.endTransaction();
        }
        try {
        label_19:
            v1 = 0L;
        }
        catch(SQLiteException sQLiteException0) {
            sQLiteException1 = sQLiteException0;
            this.zzt.zzay().zzd().zzd("Error inserting column. appId", zzeh.zzn(s), "first_open_count", sQLiteException1);
            return 0L;
        }
        try {
        label_25:
            ContentValues contentValues1 = new ContentValues();
            contentValues1.put("app_id", s);
            contentValues1.put("first_open_count", ((long)(v1 + 1L)));
            if(((long)sQLiteDatabase0.update("app2", contentValues1, "app_id = ?", new String[]{s})) == 0L) {
                this.zzt.zzay().zzd().zzc("Failed to update column (got 0). appId", zzeh.zzn(s), "first_open_count");
                return -1L;
            }
            sQLiteDatabase0.setTransactionSuccessful();
            return v1;
        }
        catch(SQLiteException sQLiteException1) {
        }
        this.zzt.zzay().zzd().zzd("Error inserting column. appId", zzeh.zzn(s), "first_open_count", sQLiteException1);
        return v1;
    }

    public final long n(String s) {
        Preconditions.checkNotEmpty(s);
        return this.l("select count(1) from events where app_id=? and name not like \'!_%\' escape \'!\'", new String[]{s}, 0L);
    }

    public final SQLiteDatabase o() {
        this.zzg();
        try {
            return this.b.getWritableDatabase();
        }
        catch(SQLiteException sQLiteException0) {
            this.zzt.zzay().zzk().zzb("Error opening database", sQLiteException0);
            throw sQLiteException0;
        }
    }

    public final c0 p(String s) {
        c0 c00;
        Cursor cursor0;
        Preconditions.checkNotEmpty(s);
        this.zzg();
        this.zzW();
        try {
            cursor0 = null;
            cursor0 = this.o().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token"}, "app_id=?", new String[]{s}, null, null, null);
            goto label_9;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_76;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
            try {
            label_9:
                if(cursor0.moveToFirst()) {
                    c00 = new c0(this.zzf.l, s);
                    zzfr zzfr0 = c00.a;
                    c00.c(cursor0.getString(0));
                    c00.k(cursor0.getString(1));
                    c00.r(cursor0.getString(2));
                    c00.o(cursor0.getLong(3));
                    c00.p(cursor0.getLong(4));
                    c00.n(cursor0.getLong(5));
                    c00.e(cursor0.getString(6));
                    c00.d(cursor0.getString(7));
                    c00.l(cursor0.getLong(8));
                    c00.h(cursor0.getLong(9));
                    c00.q(cursor0.isNull(10) || cursor0.getInt(10) != 0);
                    long v = cursor0.getLong(11);
                    zzfr0.zzaz().zzg();
                    c00.C |= c00.v != v;
                    c00.v = v;
                    long v1 = cursor0.getLong(12);
                    zzfr0.zzaz().zzg();
                    c00.C |= c00.w != v1;
                    c00.w = v1;
                    long v2 = cursor0.getLong(13);
                    zzfr0.zzaz().zzg();
                    c00.C |= c00.x != v2;
                    c00.x = v2;
                    long v3 = cursor0.getLong(14);
                    zzfr0.zzaz().zzg();
                    c00.C |= c00.y != v3;
                    c00.y = v3;
                    c00.g(cursor0.getLong(15));
                    long v4 = cursor0.getLong(16);
                    zzfr0.zzaz().zzg();
                    c00.C |= c00.E != v4;
                    c00.E = v4;
                    c00.f((cursor0.isNull(17) ? 0xFFFFFFFF80000000L : ((long)cursor0.getInt(17))));
                    c00.j(cursor0.getString(18));
                    long v5 = cursor0.getLong(19);
                    zzfr0.zzaz().zzg();
                    c00.C |= c00.z != v5;
                    c00.z = v5;
                    long v6 = cursor0.getLong(20);
                    zzfr0.zzaz().zzg();
                    c00.C |= c00.A != v6;
                    c00.A = v6;
                    c00.m(cursor0.getString(21));
                    boolean z = cursor0.isNull(23) || cursor0.getInt(23) != 0;
                    zzfr0.zzaz().zzg();
                    c00.C |= c00.p != z;
                    c00.p = z;
                    c00.b(cursor0.getString(24));
                    c00.i((cursor0.isNull(25) ? 0L : cursor0.getLong(25)));
                    if(!cursor0.isNull(26)) {
                        c00.s(Arrays.asList(cursor0.getString(26).split(",", -1)));
                    }
                    zzpd.zzc();
                    if(this.zzt.zzf().zzs(null, zzdu.zzal) && this.zzt.zzf().zzs(s, zzdu.zzan)) {
                        String s1 = cursor0.getString(28);
                        zzfr0.zzaz().zzg();
                        boolean z1 = c00.C;
                        c00.C = true ^ zzg.zza(c00.u, s1) | z1;
                        c00.u = s1;
                    }
                    zzfr0.zzaz().zzg();
                    c00.C = false;
                    if(cursor0.moveToNext()) {
                        this.zzt.zzay().zzd().zzb("Got multiple records for app, expected one. appId", zzeh.zzn(s));
                    }
                    goto label_83;
                }
                goto label_85;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_76:
            this.zzt.zzay().zzd().zzc("Error querying app. appId", zzeh.zzn(s), sQLiteException0);
            if(cursor0 != null) {
                goto label_78;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_81;
        }
    label_78:
        cursor0.close();
        return null;
    label_81:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_83:
        cursor0.close();
        return c00;
    label_85:
        cursor0.close();
        return null;
    }

    public final zzac q(String s, String s1) {
        zzac zzac0;
        Cursor cursor0;
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzg();
        this.zzW();
        try {
            cursor0 = null;
            cursor0 = this.o().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{s, s1}, null, null, null);
            goto label_10;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_29;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
            try {
            label_10:
                if(cursor0.moveToFirst()) {
                    String s2 = cursor0.getString(0);
                    if(s2 == null) {
                        s2 = "";
                    }
                    Object object0 = this.u(cursor0, 1);
                    boolean z = cursor0.getInt(2) != 0;
                    String s3 = cursor0.getString(3);
                    long v = cursor0.getLong(4);
                    Parcelable parcelable0 = this.zzf.zzu().m(cursor0.getBlob(5), zzaw.CREATOR);
                    long v1 = cursor0.getLong(6);
                    Parcelable parcelable1 = this.zzf.zzu().m(cursor0.getBlob(7), zzaw.CREATOR);
                    long v2 = cursor0.getLong(8);
                    long v3 = cursor0.getLong(9);
                    Parcelable parcelable2 = this.zzf.zzu().m(cursor0.getBlob(10), zzaw.CREATOR);
                    zzac0 = new zzac(s, s2, new zzkw(v2, object0, s1, s2), v1, z, s3, ((zzaw)parcelable0), v, ((zzaw)parcelable1), v3, ((zzaw)parcelable2));
                    if(cursor0.moveToNext()) {
                        this.zzt.zzay().zzd().zzc("Got multiple records for conditional property, expected one", zzeh.zzn(s), this.zzt.zzj().zzf(s1));
                    }
                    goto label_36;
                }
                goto label_38;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_29:
            this.zzt.zzay().zzd().zzd("Error querying conditional property", zzeh.zzn(s), this.zzt.zzj().zzf(s1), sQLiteException0);
            if(cursor0 != null) {
                goto label_31;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_34;
        }
    label_31:
        cursor0.close();
        return null;
    label_34:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_36:
        cursor0.close();
        return zzac0;
    label_38:
        cursor0.close();
        return null;
    }

    public final zzak r(long v, String s, long v1, boolean z, boolean z1, boolean z2, boolean z3, boolean z4) {
        Preconditions.checkNotEmpty(s);
        this.zzg();
        this.zzW();
        String[] arr_s = {s};
        zzak zzak0 = new zzak();
        Cursor cursor0 = null;
        try {
            SQLiteDatabase sQLiteDatabase0 = this.o();
            cursor0 = sQLiteDatabase0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{s}, null, null, null);
            if(cursor0.moveToFirst()) {
                if(cursor0.getLong(0) == v) {
                    zzak0.b = cursor0.getLong(1);
                    zzak0.a = cursor0.getLong(2);
                    zzak0.c = cursor0.getLong(3);
                    zzak0.d = cursor0.getLong(4);
                    zzak0.e = cursor0.getLong(5);
                }
                if(z) {
                    zzak0.b += v1;
                }
                if(z1) {
                    zzak0.a += v1;
                }
                if(z2) {
                    zzak0.c += v1;
                }
                if(z3) {
                    zzak0.d += v1;
                }
                if(z4) {
                    zzak0.e += v1;
                }
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("day", v);
                contentValues0.put("daily_public_events_count", zzak0.a);
                contentValues0.put("daily_events_count", zzak0.b);
                contentValues0.put("daily_conversions_count", zzak0.c);
                contentValues0.put("daily_error_events_count", zzak0.d);
                contentValues0.put("daily_realtime_events_count", zzak0.e);
                sQLiteDatabase0.update("apps", contentValues0, "app_id=?", arr_s);
                goto label_33;
            }
            goto label_35;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_38;
        }
        catch(Throwable throwable0) {
            goto label_43;
        }
    label_33:
        cursor0.close();
        return zzak0;
        try {
            try {
            label_35:
                this.zzt.zzay().zzk().zzb("Not updating daily counts, app is not known. appId", zzeh.zzn(s));
                goto label_45;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_38:
            this.zzt.zzay().zzd().zzc("Error updating daily counts. appId", zzeh.zzn(s), sQLiteException0);
            if(cursor0 != null) {
                goto label_40;
            }
            return zzak0;
        }
        catch(Throwable throwable0) {
            goto label_43;
        }
    label_40:
        cursor0.close();
        return zzak0;
    label_43:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_45:
        cursor0.close();
        return zzak0;
    }

    public final h s(String s, String s1) {
        h h0;
        Boolean boolean0;
        Cursor cursor0;
        boolean z;
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzg();
        this.zzW();
        ArrayList arrayList0 = new ArrayList(Arrays.asList(new String[]{"lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"}));
        try {
            z = false;
            cursor0 = null;
            cursor0 = this.o().query("events", ((String[])arrayList0.toArray(new String[0])), "app_id=? and name=?", new String[]{s, s1}, null, null, null);
            goto label_12;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_31;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
            try {
            label_12:
                if(cursor0.moveToFirst()) {
                    long v = cursor0.getLong(0);
                    long v1 = cursor0.getLong(1);
                    long v2 = cursor0.getLong(2);
                    long v3 = cursor0.isNull(3) ? 0L : cursor0.getLong(3);
                    Long long0 = cursor0.isNull(4) ? null : cursor0.getLong(4);
                    Long long1 = cursor0.isNull(5) ? null : cursor0.getLong(5);
                    Long long2 = cursor0.isNull(6) ? null : cursor0.getLong(6);
                    if(cursor0.isNull(7)) {
                        boolean0 = null;
                    }
                    else {
                        if(cursor0.getLong(7) == 1L) {
                            z = true;
                        }
                        boolean0 = Boolean.valueOf(z);
                    }
                    h0 = new h(s, s1, v, v1, (cursor0.isNull(8) ? 0L : cursor0.getLong(8)), v2, v3, long0, long1, long2, boolean0);
                    if(cursor0.moveToNext()) {
                        this.zzt.zzay().zzd().zzb("Got multiple records for event aggregates, expected one. appId", zzeh.zzn(s));
                    }
                    goto label_38;
                }
                goto label_40;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_31:
            this.zzt.zzay().zzd().zzd("Error querying events. appId", zzeh.zzn(s), this.zzt.zzj().zzd(s1), sQLiteException0);
            if(cursor0 != null) {
                goto label_33;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_36;
        }
    label_33:
        cursor0.close();
        return null;
    label_36:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_38:
        cursor0.close();
        return h0;
    label_40:
        cursor0.close();
        return null;
    }

    public final r1 t(String s, String s1) {
        r1 r10;
        SQLiteException sQLiteException1;
        Cursor cursor0;
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotEmpty(s1);
        this.zzg();
        this.zzW();
        try {
            cursor0 = this.o().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{s, s1}, null, null, null);
        }
        catch(SQLiteException sQLiteException0) {
            sQLiteException1 = sQLiteException0;
            cursor0 = null;
            goto label_22;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(null, throwable0);
            throw throwable0;
        }
        try {
            if(cursor0.moveToFirst()) {
                long v = cursor0.getLong(0);
                Object object0 = this.u(cursor0, 1);
                if(object0 != null) {
                    r10 = new r1(s, cursor0.getString(2), s1, v, object0);
                    if(cursor0.moveToNext()) {
                        this.zzt.zzay().zzd().zzb("Got multiple records for user property, expected one. appId", zzeh.zzn(s));
                    }
                    goto label_29;
                }
                goto label_31;
            }
            goto label_33;
        }
        catch(SQLiteException sQLiteException1) {
            try {
            label_22:
                this.zzt.zzay().zzd().zzd("Error querying user property. appId", zzeh.zzn(s), this.zzt.zzj().zzf(s1), sQLiteException1);
                if(cursor0 != null) {
                    goto label_24;
                }
                return null;
            }
            catch(Throwable throwable0) {
                goto label_27;
            }
        label_24:
            cursor0.close();
            return null;
        }
        catch(Throwable throwable0) {
        label_27:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_29:
        cursor0.close();
        return r10;
    label_31:
        cursor0.close();
        return null;
    label_33:
        cursor0.close();
        return null;
    }

    public final Object u(Cursor cursor0, int v) {
        int v1 = cursor0.getType(v);
        switch(v1) {
            case 0: {
                androidx.room.a.v(this.zzt, "Loaded invalid null value from database");
                return null;
            }
            case 1: {
                return cursor0.getLong(v);
            }
            case 2: {
                return cursor0.getDouble(v);
            }
            case 3: {
                return cursor0.getString(v);
            }
            case 4: {
                androidx.room.a.v(this.zzt, "Loaded invalid blob type value, ignoring it");
                return null;
            }
            default: {
                this.zzt.zzay().zzd().zzb("Loaded invalid unknown value type, ignoring it", v1);
                return null;
            }
        }
    }

    public final List v(String s, String s1, String s2) {
        Preconditions.checkNotEmpty(s);
        this.zzg();
        this.zzW();
        ArrayList arrayList0 = new ArrayList(3);
        arrayList0.add(s);
        StringBuilder stringBuilder0 = new StringBuilder("app_id=?");
        if(!TextUtils.isEmpty(s1)) {
            arrayList0.add(s1);
            stringBuilder0.append(" and origin=?");
        }
        if(!TextUtils.isEmpty(s2)) {
            arrayList0.add(s2 + "*");
            stringBuilder0.append(" and name glob ?");
        }
        return this.w(stringBuilder0.toString(), ((String[])arrayList0.toArray(new String[arrayList0.size()])));
    }

    public final List w(String s, String[] arr_s) {
        List list1;
        this.zzg();
        this.zzW();
        List list0 = new ArrayList();
        Cursor cursor0 = null;
        try {
            cursor0 = this.o().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, s, arr_s, null, null, "rowid", "1001");
            if(cursor0.moveToFirst()) {
                while(true) {
                label_6:
                    if(((ArrayList)list0).size() >= 1000) {
                        this.zzt.zzay().zzd().zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
                        goto label_35;
                    }
                    String s1 = cursor0.getString(0);
                    String s2 = cursor0.getString(1);
                    String s3 = cursor0.getString(2);
                    Object object0 = this.u(cursor0, 3);
                    boolean z = cursor0.getInt(4) != 0;
                    String s4 = cursor0.getString(5);
                    long v = cursor0.getLong(6);
                    Parcelable parcelable0 = this.zzf.zzu().m(cursor0.getBlob(7), zzaw.CREATOR);
                    long v1 = cursor0.getLong(8);
                    Parcelable parcelable1 = this.zzf.zzu().m(cursor0.getBlob(9), zzaw.CREATOR);
                    long v2 = cursor0.getLong(10);
                    long v3 = cursor0.getLong(11);
                    Parcelable parcelable2 = this.zzf.zzu().m(cursor0.getBlob(12), zzaw.CREATOR);
                    ((ArrayList)list0).add(new zzac(s1, s2, new zzkw(v2, object0, s3, s2), v1, z, s4, ((zzaw)parcelable0), v, ((zzaw)parcelable1), v3, ((zzaw)parcelable2)));
                    if(!cursor0.moveToNext()) {
                        goto label_35;
                    }
                }
            }
            goto label_37;
        }
        catch(SQLiteException sQLiteException0) {
            try {
                try {
                }
                catch(SQLiteException sQLiteException0) {
                }
                this.zzt.zzay().zzd().zzb("Error querying conditional user property value", sQLiteException0);
                list1 = Collections.emptyList();
                if(cursor0 != null) {
                    goto label_29;
                }
                return list1;
            }
            catch(Throwable throwable0) {
                goto label_32;
            }
        label_29:
            cursor0.close();
            return list1;
        }
        catch(Throwable throwable0) {
        label_32:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        goto label_6;
    label_35:
        cursor0.close();
        return list0;
    label_37:
        cursor0.close();
        return list0;
    }

    public final List x(String s) {
        List list1;
        Preconditions.checkNotEmpty(s);
        this.zzg();
        this.zzW();
        List list0 = new ArrayList();
        Cursor cursor0 = null;
        try {
            cursor0 = this.o().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{s}, null, null, "rowid", "1000");
            if(cursor0.moveToFirst()) {
                do {
                    String s1 = cursor0.getString(0);
                    String s2 = cursor0.getString(1);
                    if(s2 == null) {
                        s2 = "";
                    }
                    long v = cursor0.getLong(2);
                    Object object0 = this.u(cursor0, 3);
                    if(object0 == null) {
                        this.zzt.zzay().zzd().zzb("Read invalid user property value, ignoring it. appId", zzeh.zzn(s));
                    }
                    else {
                        ((ArrayList)list0).add(new r1(s, s2, s1, v, object0));
                    }
                }
                while(cursor0.moveToNext());
                goto label_28;
            }
            goto label_30;
        }
        catch(SQLiteException sQLiteException0) {
            try {
                try {
                }
                catch(SQLiteException sQLiteException0) {
                }
                this.zzt.zzay().zzd().zzc("Error querying user properties. appId", zzeh.zzn(s), sQLiteException0);
                list1 = Collections.emptyList();
                if(cursor0 != null) {
                    goto label_23;
                }
                return list1;
            }
            catch(Throwable throwable0) {
                goto label_26;
            }
        label_23:
            cursor0.close();
            return list1;
        }
        catch(Throwable throwable0) {
        label_26:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_28:
        cursor0.close();
        return list0;
    label_30:
        cursor0.close();
        return list0;
    }

    public final List y(String s, String s1, String s2) {
        List list1;
        StringBuilder stringBuilder0;
        ArrayList arrayList0;
        Preconditions.checkNotEmpty(s);
        this.zzg();
        this.zzW();
        List list0 = new ArrayList();
        Cursor cursor0 = null;
        try {
            arrayList0 = new ArrayList(3);
            arrayList0.add(s);
            stringBuilder0 = new StringBuilder("app_id=?");
            if(TextUtils.isEmpty(s1)) {
                goto label_17;
            }
            else {
                goto label_13;
            }
            goto label_18;
        }
        catch(SQLiteException sQLiteException0) {
            String s3 = s1;
            goto label_38;
            try {
            label_13:
                s3 = s1;
                arrayList0.add(s3);
                stringBuilder0.append(" and origin=?");
                goto label_18;
            label_17:
                s3 = s1;
            label_18:
                if(!TextUtils.isEmpty(s2)) {
                    arrayList0.add(s2 + "*");
                    stringBuilder0.append(" and name glob ?");
                }
                Object[] arr_object = arrayList0.toArray(new String[arrayList0.size()]);
                cursor0 = this.o().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, stringBuilder0.toString(), ((String[])arr_object), null, null, "rowid", "1001");
                if(cursor0.moveToFirst()) {
                    while(true) {
                        if(((ArrayList)list0).size() >= 1000) {
                            goto label_35;
                        }
                        String s4 = cursor0.getString(0);
                        long v = cursor0.getLong(1);
                        Object object0 = this.u(cursor0, 2);
                        s3 = cursor0.getString(3);
                        if(object0 == null) {
                            this.zzt.zzay().zzd().zzd("(2)Read invalid user property value, ignoring it", zzeh.zzn(s), s3, s2);
                        }
                        else {
                            ((ArrayList)list0).add(new r1(s, s3, s4, v, object0));
                        }
                        if(!cursor0.moveToNext()) {
                            goto label_34;
                        }
                    }
                }
                goto label_48;
            }
            catch(SQLiteException sQLiteException0) {
                goto label_38;
            }
            catch(Throwable throwable0) {
                goto label_44;
            }
        label_34:
            goto label_46;
            try {
                try {
                label_35:
                    this.zzt.zzay().zzd().zzb("Read more than the max allowed user properties, ignoring excess", 1000);
                    goto label_46;
                }
                catch(SQLiteException sQLiteException0) {
                }
            label_38:
                this.zzt.zzay().zzd().zzd("(2)Error querying user properties", zzeh.zzn(s), s3, sQLiteException0);
                list1 = Collections.emptyList();
                if(cursor0 != null) {
                    goto label_41;
                }
                return list1;
            }
            catch(Throwable throwable0) {
                goto label_44;
            }
        label_41:
            cursor0.close();
            return list1;
        }
        catch(Throwable throwable0) {
        label_44:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
    label_46:
        cursor0.close();
        return list0;
    label_48:
        cursor0.close();
        return list0;
    }

    public final void z() {
        this.zzW();
        this.o().endTransaction();
    }

    public final void zzC() {
        this.zzW();
        this.o().setTransactionSuccessful();
    }

    @Override  // com.google.android.gms.measurement.internal.m1
    public final boolean zzb() {
        return false;
    }

    public final String zzr() {
        String s;
        SQLiteException sQLiteException1;
        Cursor cursor0;
        SQLiteDatabase sQLiteDatabase0 = this.o();
        try {
            cursor0 = sQLiteDatabase0.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
        }
        catch(SQLiteException sQLiteException0) {
            sQLiteException1 = sQLiteException0;
            cursor0 = null;
            goto label_14;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(null, throwable0);
            throw throwable0;
        }
        try {
            if(cursor0.moveToFirst()) {
                s = cursor0.getString(0);
                goto label_21;
            }
            goto label_23;
        }
        catch(SQLiteException sQLiteException1) {
            try {
            label_14:
                this.zzt.zzay().zzd().zzb("Database error getting next bundle app id", sQLiteException1);
                if(cursor0 != null) {
                    goto label_16;
                }
                return null;
            }
            catch(Throwable throwable1) {
                goto label_19;
            }
        label_16:
            cursor0.close();
            return null;
        }
        catch(Throwable throwable1) {
        label_19:
            TWR.safeClose$NT(cursor0, throwable1);
            throw throwable1;
        }
    label_21:
        cursor0.close();
        return s;
    label_23:
        cursor0.close();
        return null;
    }

    public final void zzw() {
        this.zzW();
        this.o().beginTransaction();
    }

    public final void zzz() {
        this.zzg();
        this.zzW();
        if(this.d()) {
            long v = this.zzf.zzs().zza.zza();
            long v1 = this.zzt.zzav().elapsedRealtime();
            if(Math.abs(v1 - v) > ((long)(((Long)zzdu.zzx.zza(null))))) {
                this.zzf.zzs().zza.zzb(v1);
                this.zzg();
                this.zzW();
                if(this.d()) {
                    int v2 = this.o().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.zzt.zzav().currentTimeMillis()), "2419200000"});
                    if(v2 > 0) {
                        this.zzt.zzay().zzj().zzb("Deleted stale rows. rowsDeleted", v2);
                    }
                }
            }
        }
    }
}

