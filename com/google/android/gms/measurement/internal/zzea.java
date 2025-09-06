package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import java.util.ArrayList;
import java.util.List;
import jeb.synthetic.TWR;

public final class zzea extends p {
    public final d b;
    public boolean c;

    public zzea(zzfr zzfr0) {
        super(zzfr0);
        this.b = new d(this, this.zzt.zzau());
    }

    public final SQLiteDatabase a() {
        if(this.c) {
            return null;
        }
        SQLiteDatabase sQLiteDatabase0 = this.b.getWritableDatabase();
        if(sQLiteDatabase0 == null) {
            this.c = true;
            return null;
        }
        return sQLiteDatabase0;
    }

    public final boolean b(int v, byte[] arr_b) {
        long v3;
        Cursor cursor0;
        SQLiteDatabase sQLiteDatabase1;
        SQLiteDatabase sQLiteDatabase0;
        this.zzg();
        if(this.c) {
            return false;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("type", v);
        contentValues0.put("entry", arr_b);
        int v1 = 5;
        int v2 = 0;
        while(true) {
            try {
                sQLiteDatabase0 = null;
                sQLiteDatabase1 = null;
                sQLiteDatabase1 = this.a();
                goto label_18;
            }
            catch(SQLiteFullException sQLiteFullException0) {
            }
            catch(SQLiteDatabaseLockedException unused_ex) {
                goto label_39;
            }
            catch(SQLiteException sQLiteException0) {
                cursor0 = null;
                goto label_65;
            }
            catch(Throwable throwable0) {
                goto label_81;
            }
            cursor0 = null;
            goto label_49;
        label_18:
            if(sQLiteDatabase1 == null) {
                try {
                    this.c = true;
                    return false;
                label_21:
                    v3 = 0L;
                    sQLiteDatabase1.beginTransaction();
                    cursor0 = sQLiteDatabase1.rawQuery("select count(1) from messages", null);
                    if(cursor0 != null) {
                        goto label_25;
                    }
                    goto label_27;
                }
                catch(SQLiteFullException sQLiteFullException0) {
                    goto label_47;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    goto label_39;
                }
                catch(SQLiteException sQLiteException0) {
                    cursor0 = null;
                    goto label_64;
                }
                catch(Throwable throwable0) {
                    goto label_81;
                }
            }
            goto label_21;
            try {
            label_25:
                if(cursor0.moveToFirst()) {
                    v3 = cursor0.getLong(0);
                }
            label_27:
                if(Long.compare(v3, 100000L) >= 0) {
                    this.zzt.zzay().zzd().zza("Data loss, local db full");
                    long v4 = (long)sQLiteDatabase1.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(100001L - v3)});
                    if(v4 != 100001L - v3) {
                        this.zzt.zzay().zzd().zzd("Different delete count than expected in local db. expected, received, difference", ((long)(100001L - v3)), v4, ((long)(100001L - v3 - v4)));
                    }
                }
                sQLiteDatabase1.insertOrThrow("messages", null, contentValues0);
                sQLiteDatabase1.setTransactionSuccessful();
                sQLiteDatabase1.endTransaction();
                goto label_86;
            }
            catch(SQLiteFullException sQLiteFullException0) {
            }
            catch(SQLiteDatabaseLockedException unused_ex) {
                goto label_38;
            }
            catch(SQLiteException sQLiteException0) {
                goto label_64;
            }
            catch(Throwable throwable0) {
                break;
            }
            goto label_48;
        label_38:
            sQLiteDatabase0 = cursor0;
            try {
            label_39:
                SystemClock.sleep(v1);
                v1 += 20;
                goto label_58;
                try {
                    goto label_81;
                label_47:
                    cursor0 = null;
                }
                catch(SQLiteFullException sQLiteFullException0) {
                    goto label_47;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    goto label_39;
                }
                catch(SQLiteException sQLiteException0) {
                    cursor0 = null;
                    goto label_64;
                }
            }
            catch(Throwable throwable0) {
                goto label_81;
            }
        label_48:
            sQLiteDatabase0 = sQLiteDatabase1;
            try {
            label_49:
                this.zzt.zzay().zzd().zzb("Error writing entry; local database full", sQLiteFullException0);
                this.c = true;
                if(cursor0 != null) {
                    goto label_52;
                }
                goto label_53;
            }
            catch(Throwable throwable0) {
                sQLiteDatabase1 = sQLiteDatabase0;
                break;
            }
        label_52:
            cursor0.close();
        label_53:
            if(sQLiteDatabase0 != null) {
                sQLiteDatabase0.close();
                goto label_77;
            label_58:
                if(sQLiteDatabase0 != null) {
                    ((Cursor)sQLiteDatabase0).close();
                }
                if(sQLiteDatabase1 != null) {
                    sQLiteDatabase1.close();
                    goto label_77;
                label_64:
                    sQLiteDatabase0 = sQLiteDatabase1;
                    try {
                    label_65:
                        if(sQLiteDatabase0 != null && sQLiteDatabase0.inTransaction()) {
                            sQLiteDatabase0.endTransaction();
                        }
                        this.zzt.zzay().zzd().zzb("Error writing entry to local database", sQLiteException0);
                        this.c = true;
                    }
                    catch(Throwable throwable0) {
                        sQLiteDatabase1 = sQLiteDatabase0;
                        break;
                    }
                    if(cursor0 != null) {
                        cursor0.close();
                    }
                    if(sQLiteDatabase0 != null) {
                        sQLiteDatabase0.close();
                    }
                }
            }
        label_77:
            ++v2;
        }
        sQLiteDatabase0 = cursor0;
    label_81:
        if(sQLiteDatabase0 != null) {
            ((Cursor)sQLiteDatabase0).close();
        }
        if(sQLiteDatabase1 != null) {
            sQLiteDatabase1.close();
        }
        throw throwable0;
    label_86:
        if(cursor0 != null) {
            cursor0.close();
        }
        sQLiteDatabase1.close();
        return true;
    }

    @Override  // com.google.android.gms.measurement.internal.p
    public final boolean zzf() {
        return false;
    }

    public final List zzi(int v) {
        zzac zzac0;
        Parcel parcel2;
        zzkw zzkw0;
        Parcel parcel1;
        zzaw zzaw0;
        Parcel parcel0;
        byte[] arr_b;
        String[] arr_s;
        String s;
        long v4;
        Cursor cursor2;
        long v3;
        SQLiteDatabase sQLiteDatabase3;
        SQLiteDatabase sQLiteDatabase2;
        SQLiteDatabase sQLiteDatabase1;
        Cursor cursor1;
        SQLiteDatabase sQLiteDatabase0;
        this.zzg();
        Cursor cursor0 = null;
        if(this.c) {
            return null;
        }
        List list0 = new ArrayList();
        if(this.zzt.zzau().getDatabasePath("google_app_measurement_local.db").exists()) {
            int v1 = 5;
            int v2 = 0;
            while(true) {
                try {
                    sQLiteDatabase0 = this.a();
                }
                catch(SQLiteFullException sQLiteFullException0) {
                    cursor1 = null;
                    sQLiteDatabase1 = null;
                    goto label_170;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    cursor1 = null;
                    sQLiteDatabase1 = null;
                    goto label_177;
                }
                catch(SQLiteException sQLiteException0) {
                    cursor1 = null;
                    sQLiteDatabase1 = null;
                    goto label_185;
                }
                catch(Throwable throwable0) {
                    sQLiteDatabase1 = null;
                    goto label_201;
                }
                if(sQLiteDatabase0 == null) {
                    try {
                        this.c = true;
                        return null;
                    label_27:
                        sQLiteDatabase0.beginTransaction();
                        sQLiteDatabase2 = sQLiteDatabase0;
                        goto label_41;
                    }
                    catch(SQLiteFullException sQLiteFullException0) {
                        sQLiteDatabase3 = sQLiteDatabase0;
                        cursor1 = null;
                        goto label_169;
                    }
                    catch(SQLiteDatabaseLockedException unused_ex) {
                        sQLiteDatabase3 = sQLiteDatabase0;
                        cursor1 = null;
                        goto label_176;
                    }
                    catch(SQLiteException sQLiteException0) {
                        sQLiteDatabase3 = sQLiteDatabase0;
                        cursor1 = null;
                        goto label_184;
                    }
                    catch(Throwable throwable0) {
                        sQLiteDatabase3 = sQLiteDatabase0;
                        goto label_200;
                    }
                }
                goto label_27;
                try {
                label_41:
                    v3 = -1L;
                    cursor2 = sQLiteDatabase0.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                }
                catch(Throwable throwable1) {
                    sQLiteDatabase3 = sQLiteDatabase2;
                    cursor2 = null;
                    goto label_53;
                }
                try {
                    if(cursor2.moveToFirst()) {
                        v4 = cursor2.getLong(0);
                        goto label_62;
                    }
                    else {
                        goto label_64;
                    }
                    goto label_66;
                }
                catch(Throwable throwable1) {
                    try {
                        sQLiteDatabase3 = sQLiteDatabase2;
                    }
                    catch(SQLiteFullException sQLiteFullException0) {
                        sQLiteDatabase3 = sQLiteDatabase2;
                        cursor1 = null;
                        goto label_169;
                    }
                    catch(SQLiteDatabaseLockedException unused_ex) {
                        sQLiteDatabase3 = sQLiteDatabase2;
                        cursor1 = null;
                        goto label_176;
                    }
                    catch(SQLiteException sQLiteException0) {
                        sQLiteDatabase3 = sQLiteDatabase2;
                        cursor1 = null;
                        goto label_184;
                    }
                    catch(Throwable throwable0) {
                        sQLiteDatabase3 = sQLiteDatabase2;
                        goto label_200;
                    }
                }
                try {
                label_53:
                    if(cursor2 != null) {
                        cursor2.close();
                    }
                    throw throwable1;
                }
                catch(SQLiteFullException sQLiteFullException0) {
                    cursor1 = null;
                    goto label_169;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    cursor1 = null;
                    goto label_176;
                }
                catch(SQLiteException sQLiteException0) {
                    cursor1 = null;
                    goto label_184;
                }
                catch(Throwable throwable0) {
                    goto label_200;
                }
                try {
                label_62:
                    cursor2.close();
                    goto label_66;
                label_64:
                    cursor2.close();
                    v4 = -1L;
                label_66:
                    if(v4 == -1L) {
                        s = null;
                        arr_s = null;
                    }
                    else {
                        s = "rowid<?";
                        arr_s = new String[]{String.valueOf(v4)};
                    }
                    cursor1 = sQLiteDatabase2.query("messages", new String[]{"rowid", "type", "entry"}, s, arr_s, null, null, "rowid asc", "100");
                    goto label_90;
                }
                catch(SQLiteFullException sQLiteFullException0) {
                    sQLiteDatabase3 = sQLiteDatabase2;
                    cursor1 = null;
                    goto label_169;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    sQLiteDatabase3 = sQLiteDatabase2;
                    cursor1 = null;
                    goto label_176;
                }
                catch(SQLiteException sQLiteException0) {
                    sQLiteDatabase3 = sQLiteDatabase2;
                    cursor1 = null;
                    goto label_184;
                }
                catch(Throwable throwable0) {
                    sQLiteDatabase3 = sQLiteDatabase2;
                    goto label_200;
                }
                cursor1 = null;
                goto label_169;
                try {
                alab1:
                    while(true) {
                    label_90:
                        if(!cursor1.moveToNext()) {
                            goto label_146;
                        }
                        v3 = cursor1.getLong(0);
                        int v5 = cursor1.getInt(1);
                        arr_b = cursor1.getBlob(2);
                        switch(v5) {
                            case 0: {
                                parcel0 = Parcel.obtain();
                                break alab1;
                            }
                            case 1: {
                                goto label_112;
                            }
                            case 2: {
                                goto label_128;
                            }
                            case 3: {
                                goto label_144;
                            }
                            default: {
                                this.zzt.zzay().zzd().zza("Unknown record type in local database");
                            }
                        }
                    }
                }
                catch(SQLiteFullException sQLiteFullException0) {
                    sQLiteDatabase3 = sQLiteDatabase2;
                    goto label_169;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    sQLiteDatabase3 = sQLiteDatabase2;
                    goto label_176;
                }
                catch(SQLiteException sQLiteException0) {
                    sQLiteDatabase3 = sQLiteDatabase2;
                    goto label_184;
                }
                catch(Throwable throwable0) {
                    sQLiteDatabase3 = sQLiteDatabase2;
                    break;
                }
                try {
                    try {
                        parcel0.unmarshall(arr_b, 0, arr_b.length);
                        parcel0.setDataPosition(0);
                        zzaw0 = (zzaw)zzaw.CREATOR.createFromParcel(parcel0);
                        goto label_108;
                    }
                    catch(ParseException unused_ex) {
                    }
                    this.zzt.zzay().zzd().zza("Failed to load event from local database");
                }
                catch(Throwable throwable2) {
                    goto label_106;
                }
                try {
                    parcel0.recycle();
                    goto label_90;
                label_106:
                    parcel0.recycle();
                    throw throwable2;
                label_108:
                    parcel0.recycle();
                    if(zzaw0 == null) {
                        goto label_90;
                    }
                    ((ArrayList)list0).add(zzaw0);
                    goto label_90;
                label_112:
                    parcel1 = Parcel.obtain();
                }
                catch(SQLiteFullException sQLiteFullException0) {
                    sQLiteDatabase3 = sQLiteDatabase2;
                    goto label_169;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    sQLiteDatabase3 = sQLiteDatabase2;
                    goto label_176;
                }
                catch(SQLiteException sQLiteException0) {
                    sQLiteDatabase3 = sQLiteDatabase2;
                    goto label_184;
                }
                catch(Throwable throwable0) {
                    sQLiteDatabase3 = sQLiteDatabase2;
                    break;
                }
                try {
                    try {
                        parcel1.unmarshall(arr_b, 0, arr_b.length);
                        parcel1.setDataPosition(0);
                        zzkw0 = (zzkw)zzkw.CREATOR.createFromParcel(parcel1);
                        goto label_124;
                    }
                    catch(ParseException unused_ex) {
                    }
                    this.zzt.zzay().zzd().zza("Failed to load user property from local database");
                }
                catch(Throwable throwable3) {
                    goto label_122;
                }
                try {
                    parcel1.recycle();
                    zzkw0 = null;
                    goto label_125;
                label_122:
                    parcel1.recycle();
                    throw throwable3;
                label_124:
                    parcel1.recycle();
                label_125:
                    if(zzkw0 == null) {
                        goto label_90;
                    }
                    ((ArrayList)list0).add(zzkw0);
                    goto label_90;
                label_128:
                    parcel2 = Parcel.obtain();
                }
                catch(SQLiteFullException sQLiteFullException0) {
                    sQLiteDatabase3 = sQLiteDatabase2;
                    goto label_169;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    sQLiteDatabase3 = sQLiteDatabase2;
                    goto label_176;
                }
                catch(SQLiteException sQLiteException0) {
                    sQLiteDatabase3 = sQLiteDatabase2;
                    goto label_184;
                }
                catch(Throwable throwable0) {
                    sQLiteDatabase3 = sQLiteDatabase2;
                    break;
                }
                try {
                    try {
                        parcel2.unmarshall(arr_b, 0, arr_b.length);
                        parcel2.setDataPosition(0);
                        zzac0 = (zzac)zzac.CREATOR.createFromParcel(parcel2);
                        goto label_140;
                    }
                    catch(ParseException unused_ex) {
                    }
                    this.zzt.zzay().zzd().zza("Failed to load conditional user property from local database");
                }
                catch(Throwable throwable4) {
                    goto label_138;
                }
                try {
                    parcel2.recycle();
                    zzac0 = null;
                    goto label_141;
                label_138:
                    parcel2.recycle();
                    throw throwable4;
                label_140:
                    parcel2.recycle();
                label_141:
                    if(zzac0 == null) {
                        goto label_90;
                    }
                    ((ArrayList)list0).add(zzac0);
                    goto label_90;
                label_144:
                    this.zzt.zzay().zzk().zza("Skipping app launch break");
                    goto label_90;
                label_146:
                    sQLiteDatabase3 = sQLiteDatabase2;
                }
                catch(SQLiteFullException sQLiteFullException0) {
                    sQLiteDatabase3 = sQLiteDatabase2;
                    goto label_169;
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    sQLiteDatabase3 = sQLiteDatabase2;
                    goto label_176;
                }
                catch(SQLiteException sQLiteException0) {
                    sQLiteDatabase3 = sQLiteDatabase2;
                    goto label_184;
                }
                catch(Throwable throwable0) {
                    sQLiteDatabase3 = sQLiteDatabase2;
                    break;
                }
                try {
                    if(sQLiteDatabase3.delete("messages", "rowid <= ?", new String[]{Long.toString(v3)}) < ((ArrayList)list0).size()) {
                        this.zzt.zzay().zzd().zza("Fewer entries removed from local database than expected");
                    }
                    sQLiteDatabase3.setTransactionSuccessful();
                    sQLiteDatabase3.endTransaction();
                    goto label_206;
                }
                catch(SQLiteFullException sQLiteFullException0) {
                }
                catch(SQLiteDatabaseLockedException unused_ex) {
                    goto label_176;
                }
                catch(SQLiteException sQLiteException0) {
                    goto label_184;
                }
                catch(Throwable throwable0) {
                    break;
                }
            label_169:
                sQLiteDatabase1 = sQLiteDatabase3;
                try {
                label_170:
                    this.zzt.zzay().zzd().zzb("Error reading entries from local database", sQLiteFullException0);
                    this.c = true;
                    if(cursor1 != null) {
                        goto label_173;
                    }
                    goto label_174;
                }
                catch(Throwable throwable0) {
                    cursor0 = cursor1;
                    goto label_201;
                }
            label_173:
                cursor1.close();
            label_174:
                if(sQLiteDatabase1 == null) {
                    goto label_197;
                label_176:
                    sQLiteDatabase1 = sQLiteDatabase3;
                    try {
                    label_177:
                        SystemClock.sleep(v1);
                        v1 += 20;
                        if(cursor1 != null) {
                            goto label_180;
                        }
                        goto label_181;
                    }
                    catch(Throwable throwable0) {
                        cursor0 = cursor1;
                        goto label_201;
                    }
                label_180:
                    cursor1.close();
                label_181:
                    if(sQLiteDatabase1 != null) {
                        sQLiteDatabase1.close();
                    }
                }
                else {
                    sQLiteDatabase1.close();
                    goto label_197;
                label_184:
                    sQLiteDatabase1 = sQLiteDatabase3;
                    try {
                    label_185:
                        if(sQLiteDatabase1 != null && sQLiteDatabase1.inTransaction()) {
                            sQLiteDatabase1.endTransaction();
                        }
                        this.zzt.zzay().zzd().zzb("Error reading entries from local database", sQLiteException0);
                        this.c = true;
                    }
                    catch(Throwable throwable0) {
                        cursor0 = cursor1;
                        goto label_201;
                    }
                    if(cursor1 != null) {
                        cursor1.close();
                    }
                    if(sQLiteDatabase1 != null) {
                        sQLiteDatabase1.close();
                    }
                }
            label_197:
                ++v2;
            }
            cursor0 = cursor1;
        label_200:
            sQLiteDatabase1 = sQLiteDatabase3;
        label_201:
            if(cursor0 != null) {
                cursor0.close();
            }
            if(sQLiteDatabase1 != null) {
                sQLiteDatabase1.close();
            }
            throw throwable0;
        label_206:
            cursor1.close();
            sQLiteDatabase3.close();
            return list0;
        }
        return list0;
    }

    @WorkerThread
    public final void zzj() {
        this.zzg();
        try {
            SQLiteDatabase sQLiteDatabase0 = this.a();
            if(sQLiteDatabase0 != null) {
                int v = sQLiteDatabase0.delete("messages", null, null);
                if(v > 0) {
                    this.zzt.zzay().zzj().zzb("Reset local analytics data. records", v);
                }
            }
        }
        catch(SQLiteException sQLiteException0) {
            this.zzt.zzay().zzd().zzb("Error resetting local analytics data. error", sQLiteException0);
        }
    }

    @WorkerThread
    public final boolean zzk() {
        return this.b(3, new byte[0]);
    }

    @WorkerThread
    public final boolean zzm() {
        SQLiteDatabase sQLiteDatabase0;
        this.zzg();
        if(this.c) {
            return false;
        }
        if(this.zzt.zzau().getDatabasePath("google_app_measurement_local.db").exists()) {
            int v = 5;
            int v1 = 0;
            while(true) {
                try {
                    try {
                    label_6:
                        sQLiteDatabase0 = null;
                        sQLiteDatabase0 = this.a();
                        if(sQLiteDatabase0 == null) {
                            this.c = true;
                            return false;
                        }
                        sQLiteDatabase0.beginTransaction();
                        sQLiteDatabase0.delete("messages", "type == ?", new String[]{"3"});
                        sQLiteDatabase0.setTransactionSuccessful();
                        sQLiteDatabase0.endTransaction();
                        break;
                    label_17:
                        goto label_29;
                    }
                    catch(SQLiteFullException sQLiteFullException0) {
                    }
                    catch(SQLiteDatabaseLockedException unused_ex) {
                        goto label_24;
                    }
                    catch(SQLiteException sQLiteException0) {
                        goto label_17;
                    }
                    this.zzt.zzay().zzd().zzb("Error deleting app launch break from local database", sQLiteFullException0);
                    this.c = true;
                    if(sQLiteDatabase0 != null) {
                        goto label_22;
                    }
                    goto label_35;
                }
                catch(Throwable throwable0) {
                    goto label_38;
                }
            label_22:
                sQLiteDatabase0.close();
                goto label_35;
                try {
                label_24:
                    SystemClock.sleep(v);
                    v += 20;
                    if(sQLiteDatabase0 != null) {
                        goto label_27;
                    }
                    goto label_35;
                }
                catch(Throwable throwable0) {
                    goto label_38;
                }
            label_27:
                sQLiteDatabase0.close();
                goto label_35;
                try {
                label_29:
                    if(sQLiteDatabase0 != null && sQLiteDatabase0.inTransaction()) {
                        sQLiteDatabase0.endTransaction();
                    }
                    this.zzt.zzay().zzd().zzb("Error deleting app launch break from local database", sQLiteException0);
                    this.c = true;
                    if(sQLiteDatabase0 != null) {
                        goto label_34;
                    }
                    goto label_35;
                }
                catch(Throwable throwable0) {
                    goto label_38;
                }
            label_34:
                sQLiteDatabase0.close();
            label_35:
                ++v1;
                goto label_6;
            label_38:
                TWR.safeClose$NT(sQLiteDatabase0, throwable0);
                throw throwable0;
            }
            sQLiteDatabase0.close();
            return true;
        }
        return false;
    }

    public final boolean zzn(zzac zzac0) {
        this.zzt.zzv().getClass();
        byte[] arr_b = zzlb.z(zzac0);
        if(arr_b.length > 0x20000) {
            this.zzt.zzay().zzh().zza("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return this.b(2, arr_b);
    }

    public final boolean zzo(zzaw zzaw0) {
        Parcel parcel0 = Parcel.obtain();
        zzax.a(zzaw0, parcel0, 0);
        byte[] arr_b = parcel0.marshall();
        parcel0.recycle();
        if(arr_b.length > 0x20000) {
            this.zzt.zzay().zzh().zza("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return this.b(0, arr_b);
    }

    public final boolean zzp(zzkw zzkw0) {
        Parcel parcel0 = Parcel.obtain();
        zzkx.a(zzkw0, parcel0);
        byte[] arr_b = parcel0.marshall();
        parcel0.recycle();
        if(arr_b.length > 0x20000) {
            this.zzt.zzay().zzh().zza("User property too long for local database. Sending directly to service");
            return false;
        }
        return this.b(1, arr_b);
    }
}

