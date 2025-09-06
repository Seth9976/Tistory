package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import jeb.synthetic.TWR;

public final class zzan {
    public static void a(zzeh zzeh0, SQLiteDatabase sQLiteDatabase0, String s, String s1, String s2, String[] arr_s) {
        Cursor cursor0;
        if(zzeh0 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        try {
            cursor0 = null;
            cursor0 = sQLiteDatabase0.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{s}, null, null, null);
            goto label_7;
        }
        catch(SQLiteException sQLiteException0) {
            goto label_10;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
        try {
            try {
            label_7:
                boolean z = cursor0.moveToFirst();
                goto label_18;
            }
            catch(SQLiteException sQLiteException0) {
            }
        label_10:
            zzeh0.zzk().zzc("Error querying for table", s, sQLiteException0);
            if(cursor0 != null) {
                goto label_12;
            }
            goto label_13;
        }
        catch(Throwable throwable0) {
            goto label_16;
        }
    label_12:
        cursor0.close();
    label_13:
        sQLiteDatabase0.execSQL(s1);
        goto label_21;
    label_16:
        TWR.safeClose$NT(cursor0, throwable0);
        throw throwable0;
    label_18:
        cursor0.close();
        if(!z) {
            sQLiteDatabase0.execSQL(s1);
        }
        try {
        label_21:
            HashSet hashSet0 = new HashSet();
            Cursor cursor1 = sQLiteDatabase0.rawQuery("SELECT * FROM " + s + " LIMIT 0", null);
            try {
                Collections.addAll(hashSet0, cursor1.getColumnNames());
            }
            finally {
                cursor1.close();
            }
            String[] arr_s1 = s2.split(",");
            for(int v2 = 0; v2 < arr_s1.length; ++v2) {
                String s3 = arr_s1[v2];
                if(!hashSet0.remove(s3)) {
                    throw new SQLiteException("Table " + s + " is missing required column: " + s3);
                }
            }
            if(arr_s != null) {
                for(int v1 = 0; v1 < arr_s.length; v1 += 2) {
                    if(!hashSet0.remove(arr_s[v1])) {
                        sQLiteDatabase0.execSQL(arr_s[v1 + 1]);
                    }
                }
            }
            if(!hashSet0.isEmpty()) {
                zzeh0.zzk().zzc("Table has extra columns. table, columns", s, TextUtils.join(", ", hashSet0));
            }
            return;
        }
        catch(SQLiteException sQLiteException1) {
        }
        zzeh0.zzd().zzb("Failed to verify columns on table that was just created", s);
        throw sQLiteException1;
    }

    public static void b(zzeh zzeh0, SQLiteDatabase sQLiteDatabase0) {
        if(zzeh0 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file0 = new File(sQLiteDatabase0.getPath());
        if(!file0.setReadable(false, false)) {
            zzeh0.zzk().zza("Failed to turn off database read permission");
        }
        if(!file0.setWritable(false, false)) {
            zzeh0.zzk().zza("Failed to turn off database write permission");
        }
        if(!file0.setReadable(true, true)) {
            zzeh0.zzk().zza("Failed to turn on database read permission for owner");
        }
        if(!file0.setWritable(true, true)) {
            zzeh0.zzk().zza("Failed to turn on database write permission for owner");
        }
    }
}

