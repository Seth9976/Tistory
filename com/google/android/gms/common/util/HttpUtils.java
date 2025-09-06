package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zzo;
import com.google.android.gms.internal.common.zzx;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@KeepForSdk
public class HttpUtils {
    static {
        Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
        Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
        Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");
    }

    @NonNull
    @KeepForSdk
    public static Map parse(@NonNull URI uRI0, @NonNull String s) {
        String s6;
        String s4;
        Map map0 = Collections.emptyMap();
        String s1 = uRI0.getRawQuery();
        if(s1 != null && s1.length() > 0) {
            map0 = new HashMap();
            zzx zzx0 = zzx.zzc(zzo.zzb('='));
            for(Object object0: zzx.zzc(zzo.zzb('&')).zzb().zzd(s1)) {
                List list0 = zzx0.zzf(((String)object0));
                if(list0.isEmpty() || list0.size() > 2) {
                    throw new IllegalArgumentException("bad parameter");
                }
                String s2 = (String)list0.get(0);
                String s3 = "ISO-8859-1";
                try {
                    s4 = URLDecoder.decode(s2, (s == null ? "ISO-8859-1" : s));
                }
                catch(UnsupportedEncodingException unsupportedEncodingException0) {
                    throw new IllegalArgumentException(unsupportedEncodingException0);
                }
                if(list0.size() == 2) {
                    String s5 = (String)list0.get(1);
                    if(s != null) {
                        s3 = s;
                    }
                    try {
                        s6 = URLDecoder.decode(s5, s3);
                    }
                    catch(UnsupportedEncodingException unsupportedEncodingException1) {
                        throw new IllegalArgumentException(unsupportedEncodingException1);
                    }
                }
                else {
                    s6 = null;
                }
                ((HashMap)map0).put(s4, s6);
            }
        }
        return map0;
    }
}

