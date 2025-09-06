package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.emoji2.text.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public final class zzhf implements zzhk {
    public final ContentResolver a;
    public final Uri b;
    public final Runnable c;
    public final v d;
    public final Object e;
    public volatile Map f;
    public final ArrayList g;
    public static final ArrayMap h;
    public static final String[] zza;

    static {
        zzhf.h = new ArrayMap();
        zzhf.zza = new String[]{"key", "value"};
    }

    public zzhf(ContentResolver contentResolver0, Uri uri0, Runnable runnable0) {
        v v0 = new v(this);
        this.d = v0;
        this.e = new Object();
        this.g = new ArrayList();
        contentResolver0.getClass();
        uri0.getClass();
        this.a = contentResolver0;
        this.b = uri0;
        this.c = runnable0;
        contentResolver0.registerContentObserver(uri0, false, v0);
    }

    public static void a() {
        synchronized(zzhf.class) {
            for(Object object0: zzhf.h.values()) {
                ((zzhf)object0).a.unregisterContentObserver(((zzhf)object0).d);
            }
            zzhf.h.clear();
        }
    }

    public static zzhf zza(ContentResolver contentResolver0, Uri uri0, Runnable runnable0) {
        synchronized(zzhf.class) {
            ArrayMap arrayMap0 = zzhf.h;
            zzhf zzhf0 = (zzhf)arrayMap0.get(uri0);
            if(zzhf0 == null) {
                try {
                    zzhf zzhf1 = new zzhf(contentResolver0, uri0, runnable0);
                    try {
                        arrayMap0.put(uri0, zzhf1);
                    }
                    catch(SecurityException unused_ex) {
                    }
                    zzhf0 = zzhf1;
                }
                catch(SecurityException unused_ex) {
                }
            }
            return zzhf0;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzhk
    public final Object zzb(String s) {
        return (String)this.zzc().get(s);
    }

    public final Map zzc() {
        Map map1;
        Map map0 = this.f;
        if(map0 == null) {
            synchronized(this.e) {
                map0 = this.f;
                if(map0 == null) {
                    StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map1 = (Map)zzhi.zza(new zzhd(this));
                            goto label_18;
                        }
                        catch(SecurityException | SQLiteException | IllegalStateException unused_ex) {
                        }
                        Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                    }
                    catch(Throwable throwable0) {
                        StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
                        throw throwable0;
                    }
                    StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
                    map1 = null;
                    this.f = map1;
                    map0 = map1;
                    return map0 == null ? Collections.emptyMap() : map0;
                label_18:
                    StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
                    this.f = map1;
                    map0 = map1;
                }
            }
        }
        return map0 == null ? Collections.emptyMap() : map0;
    }

    public final void zzf() {
        synchronized(this.e) {
            this.f = null;
            this.c.run();
        }
        synchronized(this) {
            for(Object object0: this.g) {
                ((zzhg)object0).zza();
            }
        }
    }
}

