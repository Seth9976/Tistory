package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.ArrayMap;

public final class zzhq {
    public static final ArrayMap a;

    static {
        zzhq.a = new ArrayMap();
    }

    public static Uri zza(String s) {
        synchronized(zzhq.class) {
            ArrayMap arrayMap0 = zzhq.a;
            Uri uri0 = (Uri)arrayMap0.get("com.google.android.gms.measurement");
            if(uri0 == null) {
                Uri uri1 = Uri.parse(("content://com.google.android.gms.phenotype/" + Uri.encode("com.google.android.gms.measurement")));
                arrayMap0.put("com.google.android.gms.measurement", uri1);
                return uri1;
            }
            return uri0;
        }
    }
}

