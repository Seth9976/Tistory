package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import jeb.synthetic.TWR;

public final class zzha {
    public static final AtomicBoolean a;
    public static HashMap b;
    public static final HashMap c;
    public static final HashMap d;
    public static final HashMap e;
    public static final HashMap f;
    public static Object g;
    public static final String[] h;
    public static final Uri zza;
    public static final Uri zzb;
    public static final Pattern zzc;
    public static final Pattern zzd;

    static {
        zzha.zza = Uri.parse("content://com.google.android.gsf.gservices");
        zzha.zzb = Uri.parse("content://com.google.android.gsf.gservices/prefix");
        zzha.zzc = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        zzha.zzd = Pattern.compile("^(0|false|f|off|no|n)$", 2);
        zzha.a = new AtomicBoolean();
        zzha.c = new HashMap();
        zzha.d = new HashMap();
        zzha.e = new HashMap();
        zzha.f = new HashMap();
        zzha.h = new String[0];
    }

    public static String zza(ContentResolver contentResolver0, String s, String s1) {
        String s4;
        String s2 = null;
        synchronized(zzha.class) {
            if(zzha.b == null) {
                zzha.a.set(false);
                zzha.b = new HashMap();
                zzha.g = new Object();
                b0 b00 = new b0(0, null);
                contentResolver0.registerContentObserver(zzha.zza, true, b00);
            }
            else if(zzha.a.getAndSet(false)) {
                zzha.b.clear();
                zzha.c.clear();
                zzha.d.clear();
                zzha.e.clear();
                zzha.f.clear();
                zzha.g = new Object();
            }
            Object object0 = zzha.g;
            if(zzha.b.containsKey(s)) {
                String s3 = (String)zzha.b.get(s);
                if(s3 != null) {
                    s2 = s3;
                }
                return s2;
            }
        }
        Cursor cursor0 = contentResolver0.query(zzha.zza, null, null, new String[]{s}, null);
        if(cursor0 == null) {
            return null;
        }
        try {
            if(cursor0.moveToFirst()) {
                s4 = cursor0.getString(1);
                if(s4 != null && s4.equals(null)) {
                    s4 = null;
                }
                Class class1 = zzha.class;
                synchronized(class1) {
                    if(object0 == zzha.g) {
                        zzha.b.put(s, s4);
                    }
                }
                if(s4 != null) {
                    goto label_44;
                }
                goto label_45;
            }
            goto label_47;
        }
        catch(Throwable throwable0) {
            goto label_57;
        }
    label_44:
        s2 = s4;
    label_45:
        cursor0.close();
        return s2;
        try {
        label_47:
            synchronized(zzha.class) {
                if(object0 == zzha.g) {
                    zzha.b.put(s, null);
                }
            }
        }
        catch(Throwable throwable0) {
        label_57:
            TWR.safeClose$NT(cursor0, throwable0);
            throw throwable0;
        }
        cursor0.close();
        return null;
    }
}

