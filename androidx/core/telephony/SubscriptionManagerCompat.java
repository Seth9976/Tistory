package androidx.core.telephony;

import android.os.Build.VERSION;
import android.telephony.SubscriptionManager;
import androidx.annotation.RequiresApi;
import j3.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(22)
public class SubscriptionManagerCompat {
    public static Method a;

    public static int getSlotIndex(int v) {
        if(v == -1) {
            return -1;
        }
        if(Build.VERSION.SDK_INT >= 29) {
            return a.a(v);
        }
        try {
            if(SubscriptionManagerCompat.a == null) {
                Method method0 = SubscriptionManager.class.getDeclaredMethod("getSlotIndex", Integer.TYPE);
                SubscriptionManagerCompat.a = method0;
                method0.setAccessible(true);
            }
            Integer integer0 = (Integer)SubscriptionManagerCompat.a.invoke(null, v);
            return integer0 == null ? -1 : ((int)integer0);
        }
        catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException unused_ex) {
        }
        return -1;
    }
}

