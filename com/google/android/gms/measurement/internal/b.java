package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzej;
import com.google.android.gms.internal.measurement.zzek;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzet;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgi;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zznz;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.TWR;

public final class b extends m1 {
    public String b;
    public HashSet c;
    public ArrayMap d;
    public Long e;
    public Long f;

    public final ArrayList a(String s, List list0, List list1, Long long0, Long long1) {
        Integer integer8;
        Map map8;
        List list8;
        ArrayMap arrayMap9;
        zzet zzet0;
        Cursor cursor4;
        h h3;
        Iterator iterator8;
        Integer integer5;
        Map map6;
        List list5;
        Integer integer3;
        zzek zzek1;
        u1 u11;
        h h2;
        Cursor cursor3;
        h h1;
        Map map4;
        Map map3;
        ArrayMap arrayMap2;
        zzgi zzgi0;
        Cursor cursor1;
        Map map1;
        List list3;
        zzek zzek0;
        Cursor cursor0;
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(list0);
        Preconditions.checkNotNull(list1);
        this.b = s;
        this.c = new HashSet();
        this.d = new ArrayMap();
        this.e = long0;
        this.f = long1;
        Iterator iterator0 = list0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
        }
        zznz.zzc();
        boolean z = this.zzt.zzf().zzs(this.b, zzdu.zzW);
        zznz.zzc();
        boolean z1 = this.zzt.zzf().zzs(this.b, zzdu.zzV);
        Map map0 = Collections.emptyMap();
        if(!z1 || !z) {
        label_56:
            map1 = map0;
        }
        else {
            e e0 = this.zzf.zzi();
            String s1 = this.b;
            Preconditions.checkNotEmpty(s1);
            ArrayMap arrayMap0 = new ArrayMap();
            SQLiteDatabase sQLiteDatabase0 = e0.o();
            try {
                cursor0 = null;
                cursor0 = sQLiteDatabase0.query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{s1}, null, null, null);
                if(cursor0.moveToFirst()) {
                    while(true) {
                        byte[] arr_b = cursor0.getBlob(1);
                        try {
                            zzek0 = (zzek)((zzej)zzkv.p(zzek.zzc(), arr_b)).zzaC();
                        }
                        catch(IOException iOException0) {
                            e0.zzt.zzay().zzd().zzc("Failed to merge filter. appId", zzeh.zzn(s1), iOException0);
                            goto label_41;
                        }
                        if(zzek0.zzo()) {
                            Integer integer0 = cursor0.getInt(0);
                            List list2 = (List)arrayMap0.get(integer0);
                            if(list2 == null) {
                                list3 = new ArrayList();
                                arrayMap0.put(integer0, list3);
                            }
                            else {
                                list3 = list2;
                            }
                            list3.add(zzek0);
                        }
                    label_41:
                        if(cursor0.moveToNext()) {
                            continue;
                        }
                        goto label_42;
                    }
                }
                else {
                    goto label_45;
                }
                goto label_57;
            }
            catch(SQLiteException sQLiteException0) {
                goto label_48;
            }
            catch(Throwable throwable0) {
                goto label_53;
            }
        label_42:
            cursor0.close();
            map1 = arrayMap0;
            goto label_57;
            try {
                try {
                label_45:
                    map0 = Collections.emptyMap();
                }
                catch(SQLiteException sQLiteException0) {
                label_48:
                    e0.zzt.zzay().zzd().zzc("Database error querying filters. appId", zzeh.zzn(s1), sQLiteException0);
                    map0 = Collections.emptyMap();
                    if(cursor0 != null) {
                        goto label_55;
                    }
                    goto label_56;
                }
            }
            catch(Throwable throwable0) {
            label_53:
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
        label_55:
            cursor0.close();
            goto label_56;
        }
    label_57:
        e e1 = this.zzf.zzi();
        String s2 = this.b;
        e1.zzW();
        e1.zzg();
        Preconditions.checkNotEmpty(s2);
        SQLiteDatabase sQLiteDatabase1 = e1.o();
        try {
            cursor1 = null;
            cursor1 = sQLiteDatabase1.query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{s2}, null, null, null);
            goto label_69;
        }
        catch(SQLiteException sQLiteException1) {
            goto label_90;
        }
        catch(Throwable throwable1) {
        }
        Cursor cursor2 = null;
        goto label_98;
        try {
        label_69:
            if(cursor1.moveToFirst()) {
                ArrayMap arrayMap1 = new ArrayMap();
                while(true) {
                    int v = cursor1.getInt(0);
                    byte[] arr_b1 = cursor1.getBlob(1);
                    try {
                        zzgi0 = (zzgi)((zzgh)zzkv.p(zzgi.zzf(), arr_b1)).zzaC();
                    }
                    catch(IOException iOException1) {
                        arrayMap2 = arrayMap1;
                        e1.zzt.zzay().zzd().zzd("Failed to merge filter results. appId, audienceId, error", zzeh.zzn(s2), v, iOException1);
                        goto label_81;
                    }
                    arrayMap1.put(v, zzgi0);
                    arrayMap2 = arrayMap1;
                label_81:
                    if(!cursor1.moveToNext()) {
                        goto label_84;
                    }
                    arrayMap1 = arrayMap2;
                }
            }
            else {
                goto label_87;
            }
            goto label_103;
        }
        catch(SQLiteException sQLiteException1) {
            goto label_90;
        }
        catch(Throwable throwable1) {
            goto label_97;
        }
    label_84:
        cursor1.close();
        Map map2 = arrayMap2;
        goto label_103;
        try {
            try {
            label_87:
                map3 = Collections.emptyMap();
                goto label_101;
            }
            catch(SQLiteException sQLiteException1) {
            }
        label_90:
            e1.zzt.zzay().zzd().zzc("Database error querying filter results. appId", zzeh.zzn(s2), sQLiteException1);
            map4 = Collections.emptyMap();
            if(cursor1 != null) {
                goto label_93;
            }
            goto label_94;
        }
        catch(Throwable throwable1) {
            goto label_97;
        }
    label_93:
        cursor1.close();
    label_94:
        map2 = map4;
        goto label_103;
    label_97:
        cursor2 = cursor1;
    label_98:
        if(cursor2 != null) {
            cursor2.close();
        }
        throw throwable1;
    label_101:
        cursor1.close();
        map2 = map3;
    label_103:
        if(!map2.isEmpty()) {
            for(Object object0: new HashSet(map2.keySet())) {
                Integer integer1 = (Integer)object0;
                integer1.getClass();
                zzgi zzgi1 = (zzgi)map2.get(integer1);
                BitSet bitSet0 = new BitSet();
                BitSet bitSet1 = new BitSet();
                ArrayMap arrayMap3 = new ArrayMap();
                if(zzgi1 != null && zzgi1.zza() != 0) {
                    for(Object object1: zzgi1.zzj()) {
                        zzfr zzfr0 = (zzfr)object1;
                        if(zzfr0.zzh()) {
                            arrayMap3.put(zzfr0.zza(), (zzfr0.zzg() ? zzfr0.zzb() : null));
                        }
                    }
                }
                ArrayMap arrayMap4 = new ArrayMap();
                if(zzgi1 != null && zzgi1.zzc() != 0) {
                    for(Object object2: zzgi1.zzm()) {
                        zzgk zzgk0 = (zzgk)object2;
                        if(zzgk0.zzi() && zzgk0.zza() > 0) {
                            arrayMap4.put(zzgk0.zzb(), zzgk0.zzc(zzgk0.zza() - 1));
                        }
                    }
                }
                if(zzgi1 != null) {
                    for(int v1 = 0; v1 < zzgi1.zzd() * 0x40; ++v1) {
                        if(zzkv.w(v1, zzgi1.zzn())) {
                            this.zzt.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", integer1, v1);
                            bitSet1.set(v1);
                            if(zzkv.w(v1, zzgi1.zzk())) {
                                bitSet0.set(v1);
                            }
                        }
                        else {
                            arrayMap3.remove(v1);
                        }
                    }
                }
                zzgi zzgi2 = (zzgi)map2.get(integer1);
                if(z1 && z) {
                    List list4 = (List)map1.get(integer1);
                    if(list4 != null && this.f != null && this.e != null) {
                        for(Object object3: list4) {
                            int v2 = ((zzek)object3).zzb();
                            long v3 = ((long)this.f) / 1000L;
                            if(((zzek)object3).zzm()) {
                                v3 = ((long)this.e) / 1000L;
                            }
                            Integer integer2 = v2;
                            if(arrayMap3.containsKey(integer2)) {
                                arrayMap3.put(integer2, v3);
                            }
                            if(arrayMap4.containsKey(integer2)) {
                                arrayMap4.put(integer2, v3);
                            }
                        }
                    }
                }
                t1 t10 = new t1(this, this.b, zzgi2, bitSet0, bitSet1, arrayMap3, arrayMap4);
                this.d.put(integer1, t10);
            }
        }
        if(!list0.isEmpty()) {
            u1 u10 = new u1(this);
            ArrayMap arrayMap5 = new ArrayMap();
            for(Object object4: list0) {
                zzft zzft0 = (zzft)object4;
                zzft zzft1 = u10.a(zzft0, this.b);
                if(zzft1 != null) {
                    e e2 = this.zzf.zzi();
                    String s3 = this.b;
                    h h0 = e2.s(s3, "");
                    if(h0 == null) {
                        e2.zzt.zzay().zzk().zzc("Event aggregate wasn\'t created during raw event logging. appId, event", zzeh.zzn(s3), e2.zzt.zzj().zzd(""));
                        h1 = new h(s3, "", 1L, 1L, 1L, zzft0.zzd(), 0L, null, null, null, null);
                    }
                    else {
                        h1 = new h(h0.a, h0.b, h0.c + 1L, h0.d + 1L, h0.e + 1L, h0.f, h0.g, h0.h, h0.i, h0.j, h0.k);
                    }
                    this.zzf.zzi().c(h1);
                    Map map5 = (Map)arrayMap5.get("");
                    if(map5 == null) {
                        e e3 = this.zzf.zzi();
                        String s4 = this.b;
                        e3.zzW();
                        e3.zzg();
                        Preconditions.checkNotEmpty(s4);
                        Preconditions.checkNotEmpty("");
                        ArrayMap arrayMap6 = new ArrayMap();
                        SQLiteDatabase sQLiteDatabase2 = e3.o();
                        try {
                            cursor3 = null;
                            cursor3 = sQLiteDatabase2.query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{s4, ""}, null, null, null);
                            goto label_197;
                        }
                        catch(SQLiteException sQLiteException2) {
                            h2 = h1;
                            u11 = u10;
                            goto label_235;
                            try {
                            label_197:
                                if(cursor3.moveToFirst()) {
                                    goto label_202;
                                }
                                else {
                                    goto label_230;
                                }
                                goto label_243;
                            }
                            catch(SQLiteException sQLiteException2) {
                            }
                            catch(Throwable throwable2) {
                                goto label_240;
                            }
                            h2 = h1;
                            goto label_214;
                        label_202:
                            h2 = h1;
                            while(true) {
                                try {
                                    try {
                                        byte[] arr_b2 = cursor3.getBlob(1);
                                        try {
                                            zzek1 = (zzek)((zzej)zzkv.p(zzek.zzc(), arr_b2)).zzaC();
                                            goto label_210;
                                        }
                                        catch(IOException iOException2) {
                                        }
                                    }
                                    catch(SQLiteException sQLiteException2) {
                                        goto label_214;
                                    }
                                    try {
                                        u11 = u10;
                                        e3.zzt.zzay().zzd().zzc("Failed to merge filter. appId", zzeh.zzn(s4), iOException2);
                                        goto label_224;
                                    }
                                    catch(SQLiteException sQLiteException2) {
                                        goto label_235;
                                    }
                                    try {
                                    label_210:
                                        integer3 = cursor3.getInt(0);
                                        list5 = (List)arrayMap6.get(integer3);
                                    }
                                    catch(SQLiteException sQLiteException2) {
                                        try {
                                        label_214:
                                            u11 = u10;
                                        }
                                        catch(SQLiteException sQLiteException2) {
                                        }
                                        goto label_235;
                                    }
                                }
                                catch(Throwable throwable2) {
                                    goto label_240;
                                }
                                if(list5 == null) {
                                    try {
                                        u11 = u10;
                                        List list6 = new ArrayList();
                                        arrayMap6.put(integer3, list6);
                                        goto label_223;
                                    label_221:
                                        u11 = u10;
                                        list6 = list5;
                                    label_223:
                                        list6.add(zzek1);
                                    label_224:
                                        if(!cursor3.moveToNext()) {
                                            goto label_225;
                                        }
                                        goto label_228;
                                    }
                                    catch(SQLiteException sQLiteException2) {
                                        goto label_235;
                                    }
                                    catch(Throwable throwable2) {
                                        goto label_240;
                                    }
                                }
                                else {
                                    goto label_221;
                                }
                                goto label_223;
                            label_225:
                                cursor3.close();
                                map5 = arrayMap6;
                                goto label_243;
                            label_228:
                                u10 = u11;
                            }
                            try {
                                try {
                                label_230:
                                    h2 = h1;
                                    u11 = u10;
                                    map5 = Collections.emptyMap();
                                    goto label_242;
                                }
                                catch(SQLiteException sQLiteException2) {
                                }
                            label_235:
                                e3.zzt.zzay().zzd().zzc("Database error querying filters. appId", zzeh.zzn(s4), sQLiteException2);
                                map5 = Collections.emptyMap();
                                if(cursor3 == null) {
                                    goto label_243;
                                }
                            }
                            catch(Throwable throwable2) {
                                goto label_240;
                            }
                        }
                        catch(Throwable throwable2) {
                        label_240:
                            TWR.safeClose$NT(cursor3, throwable2);
                            throw throwable2;
                        }
                    label_242:
                        cursor3.close();
                    label_243:
                        arrayMap5.put("", map5);
                    }
                    else {
                        h2 = h1;
                        u11 = u10;
                    }
                    Iterator iterator6 = map5.keySet().iterator();
                    while(iterator6.hasNext()) {
                        Object object5 = iterator6.next();
                        Integer integer4 = (Integer)object5;
                        int v4 = (int)integer4;
                        if(this.c.contains(integer4)) {
                            this.zzt.zzay().zzj().zzb("Skipping failed audience ID", integer4);
                        }
                        else {
                            boolean z2 = true;
                            for(Object object6: ((List)map5.get(integer4))) {
                                map6 = map5;
                                integer5 = integer4;
                                iterator8 = iterator6;
                                h3 = h2;
                                v1 v10 = new v1(this, this.b, v4, ((zzek)object6), 0);
                                Long long2 = this.e;
                                Long long3 = this.f;
                                t1 t11 = (t1)this.d.get(integer5);
                                boolean z3 = t11 == null ? false : t11.d.get(((zzek)object6).zzb());
                                z2 = v10.a(long2, long3, zzft1, h3.c, h3, z3);
                                if(z2) {
                                    this.b(integer5).b(v10);
                                    integer4 = integer5;
                                    h2 = h3;
                                    iterator6 = iterator8;
                                    map5 = map6;
                                    continue;
                                }
                                this.c.add(integer5);
                                goto label_282;
                            }
                            map6 = map5;
                            integer5 = integer4;
                            iterator8 = iterator6;
                            h3 = h2;
                        label_282:
                            if(!z2) {
                                this.c.add(integer5);
                            }
                            h2 = h3;
                            iterator6 = iterator8;
                            map5 = map6;
                        }
                    }
                    u10 = u11;
                }
            }
        }
        if(!list1.isEmpty()) {
            ArrayMap arrayMap7 = new ArrayMap();
            for(Object object7: list1) {
                zzgm zzgm0 = (zzgm)object7;
                Map map7 = (Map)arrayMap7.get("");
                if(map7 == null) {
                    e e4 = this.zzf.zzi();
                    String s5 = this.b;
                    e4.zzW();
                    e4.zzg();
                    Preconditions.checkNotEmpty(s5);
                    Preconditions.checkNotEmpty("");
                    ArrayMap arrayMap8 = new ArrayMap();
                    SQLiteDatabase sQLiteDatabase3 = e4.o();
                    try {
                        cursor4 = null;
                        cursor4 = sQLiteDatabase3.query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{s5, ""}, null, null, null);
                        if(cursor4.moveToFirst()) {
                            while(true) {
                                byte[] arr_b3 = cursor4.getBlob(1);
                                try {
                                    zzet0 = (zzet)((zzes)zzkv.p(zzet.zzc(), arr_b3)).zzaC();
                                }
                                catch(IOException iOException3) {
                                    arrayMap9 = arrayMap8;
                                    e4.zzt.zzay().zzd().zzc("Failed to merge filter", zzeh.zzn(s5), iOException3);
                                    goto label_325;
                                }
                                Integer integer6 = cursor4.getInt(0);
                                List list7 = (List)arrayMap8.get(integer6);
                                if(list7 == null) {
                                    list8 = new ArrayList();
                                    arrayMap8.put(integer6, list8);
                                }
                                else {
                                    list8 = list7;
                                }
                                list8.add(zzet0);
                                arrayMap9 = arrayMap8;
                            label_325:
                                if(!cursor4.moveToNext()) {
                                    goto label_328;
                                }
                                arrayMap8 = arrayMap9;
                            }
                        }
                        else {
                            goto label_331;
                        }
                        goto label_342;
                    }
                    catch(SQLiteException sQLiteException3) {
                        goto label_334;
                    }
                    catch(Throwable throwable3) {
                        goto label_339;
                    }
                label_328:
                    cursor4.close();
                    map7 = arrayMap9;
                    goto label_342;
                    try {
                        try {
                        label_331:
                            map7 = Collections.emptyMap();
                        }
                        catch(SQLiteException sQLiteException3) {
                        label_334:
                            e4.zzt.zzay().zzd().zzc("Database error querying filters. appId", zzeh.zzn(s5), sQLiteException3);
                            map7 = Collections.emptyMap();
                            if(cursor4 == null) {
                                goto label_342;
                            }
                        }
                    }
                    catch(Throwable throwable3) {
                    label_339:
                        TWR.safeClose$NT(cursor4, throwable3);
                        throw throwable3;
                    }
                    cursor4.close();
                label_342:
                    arrayMap7.put("", map7);
                }
                Iterator iterator10 = map7.keySet().iterator();
            label_344:
                if(iterator10.hasNext()) {
                    Object object8 = iterator10.next();
                    Integer integer7 = (Integer)object8;
                    int v5 = (int)integer7;
                    if(this.c.contains(integer7)) {
                        this.zzt.zzay().zzj().zzb("Skipping failed audience ID", integer7);
                        continue;
                    }
                    else {
                        boolean z4 = true;
                        for(Object object9: ((List)map7.get(integer7))) {
                            zzet zzet1 = (zzet)object9;
                            if(Log.isLoggable(this.zzt.zzay().zzq(), 2)) {
                                this.zzt.zzay().zzj().zzd("Evaluating filter. audience, filter, property", integer7, (zzet1.zzj() ? zzet1.zza() : null), this.zzt.zzj().zzf(""));
                                this.zzt.zzay().zzj().zzb("Filter definition", this.zzf.zzu().r(zzet1));
                            }
                            if(!zzet1.zzj() || zzet1.zza() > 0x100) {
                                map8 = map7;
                                this.zzt.zzay().zzk().zzc("Invalid property filter ID. appId, id", zzeh.zzn(this.b), String.valueOf((zzet1.zzj() ? zzet1.zza() : null)));
                                this.c.add(integer7);
                                goto label_382;
                            }
                            map8 = map7;
                            integer8 = integer7;
                            v1 v11 = new v1(this, this.b, v5, zzet1, 1);
                            Long long4 = this.e;
                            Long long5 = this.f;
                            t1 t12 = (t1)this.d.get(integer8);
                            z4 = v11.b(long4, long5, zzgm0, (t12 == null ? false : t12.d.get(zzet1.zza())));
                            if(z4) {
                                this.b(integer8).b(v11);
                                integer7 = integer8;
                                map7 = map8;
                                continue;
                            }
                            this.c.add(integer8);
                            goto label_380;
                        }
                        map8 = map7;
                        integer8 = integer7;
                    label_380:
                        if(!z4) {
                            this.c.add(integer8);
                        }
                    label_382:
                        map7 = map8;
                        goto label_344;
                    }
                    break;
                }
            }
        }
        ArrayList arrayList0 = new ArrayList();
        Set set0 = this.d.keySet();
        set0.removeAll(this.c);
        for(Object object10: set0) {
            t1 t13 = (t1)this.d.get(((Integer)object10));
            Preconditions.checkNotNull(t13);
            zzfp zzfp0 = t13.a(((int)(((Integer)object10))));
            arrayList0.add(zzfp0);
            e e5 = this.zzf.zzi();
            String s6 = this.b;
            zzgi zzgi3 = zzfp0.zzd();
            e5.zzW();
            e5.zzg();
            Preconditions.checkNotEmpty(s6);
            Preconditions.checkNotNull(zzgi3);
            byte[] arr_b4 = zzgi3.zzbu();
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("app_id", s6);
            contentValues0.put("audience_id", ((Integer)object10));
            contentValues0.put("current_results", arr_b4);
            try {
                if(e5.o().insertWithOnConflict("audience_filter_values", null, contentValues0, 5) != -1L) {
                    continue;
                }
                e5.zzt.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeh.zzn(s6));
            }
            catch(SQLiteException sQLiteException4) {
                e5.zzt.zzay().zzd().zzc("Error storing filter results. appId", zzeh.zzn(s6), sQLiteException4);
            }
        }
        return arrayList0;
    }

    public final t1 b(Integer integer0) {
        if(this.d.containsKey(integer0)) {
            return (t1)this.d.get(integer0);
        }
        t1 t10 = new t1(this, this.b);
        this.d.put(integer0, t10);
        return t10;
    }

    @Override  // com.google.android.gms.measurement.internal.m1
    public final boolean zzb() {
        return false;
    }
}

