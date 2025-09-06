package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class a {
    public final HashMap a;
    public final int b;
    public final int c;

    public a(int v) {
        this.a = new HashMap();
        this.b = 0x40;
        this.c = v;
    }

    public static String a(int v, String s) {
        if(s != null) {
            s = s.trim();
            return s.length() <= v ? s : s.substring(0, v);
        }
        return null;
    }

    public final boolean b(String s, String s1) {
        synchronized(this) {
            if(s != null) {
                String s2 = a.a(this.c, s);
                if(this.a.size() >= this.b && !this.a.containsKey(s2)) {
                    Logger.getLogger().w("Ignored entry \"" + s + "\" when adding custom keys. Maximum allowable: " + this.b);
                    return false;
                }
                String s3 = a.a(this.c, s1);
                if(CommonUtils.nullSafeEquals(((String)this.a.get(s2)), s3)) {
                    return false;
                }
                HashMap hashMap0 = this.a;
                if(s1 == null) {
                    s3 = "";
                }
                hashMap0.put(s2, s3);
                return true;
            }
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public final void c(Map map0) {
        synchronized(this) {
            int v1 = 0;
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                String s = (String)map$Entry0.getKey();
                if(s == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String s1 = a.a(this.c, s);
                if(this.a.size() >= this.b && !this.a.containsKey(s1)) {
                    ++v1;
                }
                else {
                    String s2 = (String)map$Entry0.getValue();
                    this.a.put(s1, (s2 == null ? "" : a.a(this.c, s2)));
                }
            }
            if(v1 > 0) {
                Logger.getLogger().w("Ignored " + v1 + " entries when adding custom keys. Maximum allowable: " + this.b);
            }
        }
    }
}

