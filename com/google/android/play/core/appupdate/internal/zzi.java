package com.google.android.play.core.appupdate.internal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public final class zzi {
    public static final HashMap a;

    static {
        new HashSet(Arrays.asList(new String[]{"app_update", "review"}));
        new HashSet(Arrays.asList(new String[]{"native", "unity"}));
        zzi.a = new HashMap();
        new zzm("PlayCoreVersion");
    }

    public static Map zza(String s) {
        synchronized(zzi.class) {
            HashMap hashMap0 = zzi.a;
            if(!hashMap0.containsKey("app_update")) {
                HashMap hashMap1 = new HashMap();
                hashMap1.put("java", 11004);
                hashMap0.put("app_update", hashMap1);
            }
            return (Map)hashMap0.get("app_update");
        }
    }
}

