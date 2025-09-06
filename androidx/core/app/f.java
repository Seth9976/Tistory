package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.pm.PackageManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;

public abstract class f {
    @DoNotInline
    public static boolean a(@NonNull Activity activity0) {
        return activity0.isLaunchedFromBubble();
    }

    @SuppressLint({"BanUncheckedReflection"})
    @DoNotInline
    public static boolean b(Activity activity0, String s) {
        try {
            PackageManager packageManager0 = activity0.getApplication().getPackageManager();
            return ((Boolean)PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(packageManager0, s)).booleanValue();
        }
        catch(NoSuchMethodException | InvocationTargetException | IllegalAccessException unused_ex) {
            return activity0.shouldShowRequestPermissionRationale(s);
        }
    }
}

