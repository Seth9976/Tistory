package i8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.play.core.appupdate.internal.zzab;
import com.google.android.play.core.appupdate.internal.zzi;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.appupdate.internal.zzx;
import com.google.android.play.core.appupdate.internal.zzz;
import com.google.android.play.core.appupdate.zzl;
import java.util.Map;

public final class h {
    public final zzx a;
    public final String b;
    public final Context c;
    public final i d;
    public static final zzm e;
    public static final Intent f;

    static {
        h.e = new zzm("AppUpdateService");
        h.f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    }

    public h(Context context0, i i0) {
        this.b = "net.daum.android.tistoryapp";
        this.c = context0;
        this.d = i0;
        if(zzab.zza(context0)) {
            this.a = new zzx(zzz.zza(context0), h.e, "AppUpdateService", h.f, zzl.zza, null);
        }
    }

    public static Bundle a(h h0, String s) {
        Integer integer0;
        Bundle bundle0 = new Bundle();
        bundle0.putAll(h.b());
        bundle0.putString("package.name", s);
        try {
            integer0 = h0.c.getPackageManager().getPackageInfo("net.daum.android.tistoryapp", 0).versionCode;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            h.e.zzb("The current version of the app could not be retrieved", new Object[0]);
            integer0 = null;
        }
        if(integer0 != null) {
            bundle0.putInt("app.version.code", ((int)integer0));
        }
        return bundle0;
    }

    public static Bundle b() {
        Bundle bundle0 = new Bundle();
        Bundle bundle1 = new Bundle();
        Map map0 = zzi.zza("app_update");
        bundle1.putInt("playcore_version_code", ((int)(((Integer)map0.get("java")))));
        if(map0.containsKey("native")) {
            bundle1.putInt("playcore_native_version", ((int)(((Integer)map0.get("native")))));
        }
        if(map0.containsKey("unity")) {
            bundle1.putInt("playcore_unity_version", ((int)(((Integer)map0.get("unity")))));
        }
        bundle0.putAll(bundle1);
        bundle0.putInt("playcore.version.code", 11004);
        return bundle0;
    }
}

