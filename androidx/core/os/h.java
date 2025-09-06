package androidx.core.os;

import android.content.Context;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.telephony.mbms.ServiceInfo;
import java.util.Locale;
import java.util.Set;

public abstract class h {
    public static Handler a(Looper looper0) {
        return Handler.createAsync(looper0);
    }

    public static Handler b(Looper looper0, Handler.Callback handler$Callback0) {
        return Handler.createAsync(looper0, handler$Callback0);
    }

    public static Handler c(Looper looper0) {
        return Handler.createAsync(looper0);
    }

    public static CharSequence d(Context context0, ServiceInfo serviceInfo0) {
        Set set0 = serviceInfo0.getNamedContentLocales();
        if(set0.isEmpty()) {
            return null;
        }
        String[] arr_s = new String[set0.size()];
        int v = 0;
        for(Object object0: serviceInfo0.getNamedContentLocales()) {
            arr_s[v] = ((Locale)object0).toLanguageTag();
            ++v;
        }
        Locale locale0 = context0.getResources().getConfiguration().getLocales().getFirstMatch(arr_s);
        return locale0 == null ? null : serviceInfo0.getNameForLocale(locale0);
    }

    public static boolean e(Handler handler0, Runnable runnable0, Object object0, long v) {
        return handler0.postDelayed(runnable0, object0, v);
    }
}

