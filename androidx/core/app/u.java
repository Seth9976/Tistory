package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import androidx.annotation.DoNotInline;

public abstract class u {
    @DoNotInline
    public static Object a(Context context0, Class class0) {
        return context0.getSystemService(class0);
    }

    @DoNotInline
    public static int b(AppOpsManager appOpsManager0, String s, String s1) {
        return appOpsManager0.noteProxyOp(s, s1);
    }

    @DoNotInline
    public static int c(AppOpsManager appOpsManager0, String s, String s1) {
        return appOpsManager0.noteProxyOpNoThrow(s, s1);
    }

    @DoNotInline
    public static String d(String s) {
        return AppOpsManager.permissionToOp(s);
    }
}

