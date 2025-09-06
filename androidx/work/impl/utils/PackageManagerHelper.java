package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.Logger;

public class PackageManagerHelper {
    public static final String a;

    static {
        PackageManagerHelper.a = "WM-PackageManagerHelper";
    }

    public static boolean isComponentExplicitlyEnabled(@NonNull Context context0, @NonNull Class class0) {
        int v = context0.getPackageManager().getComponentEnabledSetting(new ComponentName(context0, class0.getName()));
        return v != 0 && v == 1;
    }

    public static boolean isComponentExplicitlyEnabled(@NonNull Context context0, @NonNull String s) {
        return context0.getPackageManager().getComponentEnabledSetting(new ComponentName(context0, s)) == 1;
    }

    public static void setComponentEnabled(@NonNull Context context0, @NonNull Class class0, boolean z) {
        String s = "disabled";
        try {
            int v = context0.getPackageManager().getComponentEnabledSetting(new ComponentName(context0, class0.getName()));
            if(z == (v != 0 && v == 1)) {
                Logger.get().debug("WM-PackageManagerHelper", "Skipping component enablement for " + class0.getName());
                return;
            }
            context0.getPackageManager().setComponentEnabledSetting(new ComponentName(context0, class0.getName()), (z ? 1 : 2), 1);
            Logger.get().debug("WM-PackageManagerHelper", class0.getName() + " " + (z ? "enabled" : "disabled"));
            return;
        }
        catch(Exception exception0) {
        }
        Logger logger0 = Logger.get();
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(class0.getName());
        stringBuilder0.append("could not be ");
        if(z) {
            s = "enabled";
        }
        stringBuilder0.append(s);
        logger0.debug("WM-PackageManagerHelper", stringBuilder0.toString(), exception0);
    }
}

