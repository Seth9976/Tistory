package com.bumptech.glide.signature;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import java.util.concurrent.ConcurrentHashMap;

public final class ApplicationVersionSignature {
    public static final ConcurrentHashMap a;

    static {
        ApplicationVersionSignature.a = new ConcurrentHashMap();
    }

    @NonNull
    public static Key obtain(@NonNull Context context0) {
        PackageInfo packageInfo0;
        ConcurrentHashMap concurrentHashMap0 = ApplicationVersionSignature.a;
        Key key0 = (Key)concurrentHashMap0.get("net.daum.android.tistoryapp");
        if(key0 == null) {
            try {
                packageInfo0 = context0.getPackageManager().getPackageInfo("net.daum.android.tistoryapp", 0);
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                Log.e("AppVersionSignature", "Cannot resolve info fornet.daum.android.tistoryapp", packageManager$NameNotFoundException0);
                packageInfo0 = null;
            }
            key0 = new ObjectKey((packageInfo0 == null ? "df047904-a460-4d94-bff5-d9bc3e4d3d3b" : String.valueOf(packageInfo0.versionCode)));
            Key key1 = (Key)concurrentHashMap0.putIfAbsent("net.daum.android.tistoryapp", key0);
            return key1 == null ? key0 : key1;
        }
        return key0;
    }
}

