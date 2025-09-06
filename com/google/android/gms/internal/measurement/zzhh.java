package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.SimpleArrayMap;
import javax.annotation.Nullable;

public final class zzhh {
    public final SimpleArrayMap a;

    public zzhh(SimpleArrayMap simpleArrayMap0) {
        this.a = simpleArrayMap0;
    }

    @Nullable
    public final String zza(@Nullable Uri uri0, @Nullable String s, @Nullable String s1, String s2) {
        if(uri0 != null) {
            SimpleArrayMap simpleArrayMap0 = (SimpleArrayMap)this.a.get(uri0.toString());
            return simpleArrayMap0 == null ? null : ((String)simpleArrayMap0.get("" + s2));
        }
        return null;
    }
}

