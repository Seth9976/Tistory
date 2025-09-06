package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import androidx.annotation.Nullable;
import com.google.android.gms.common.R.string;

public final class zzfj {
    public static String zza(Context context0) {
        try {
            return context0.getResources().getResourcePackageName(string.common_google_play_services_unknown_issue);
        }
        catch(Resources.NotFoundException unused_ex) {
            return "net.daum.android.tistoryapp";
        }
    }

    @Nullable
    public static final String zzb(String s, Resources resources0, String s1) {
        int v = resources0.getIdentifier(s, "string", s1);
        if(v != 0) {
            try {
                return resources0.getString(v);
            }
            catch(Resources.NotFoundException unused_ex) {
            }
        }
        return null;
    }
}

