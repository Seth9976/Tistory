package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class AppOpsManagerCompat {
    public static final int MODE_ALLOWED = 0;
    public static final int MODE_DEFAULT = 3;
    public static final int MODE_ERRORED = 2;
    public static final int MODE_IGNORED = 1;

    public static int checkOrNoteProxyOp(@NonNull Context context0, int v, @NonNull String s, @NonNull String s1) {
        if(Build.VERSION.SDK_INT >= 29) {
            AppOpsManager appOpsManager0 = v.c(context0);
            int v1 = v.a(appOpsManager0, s, Binder.getCallingUid(), s1);
            return v1 == 0 ? v.a(appOpsManager0, s, v, v.b(context0)) : v1;
        }
        return AppOpsManagerCompat.noteProxyOpNoThrow(context0, s, s1);
    }

    public static int noteOp(@NonNull Context context0, @NonNull String s, int v, @NonNull String s1) {
        return ((AppOpsManager)context0.getSystemService("appops")).noteOp(s, v, s1);
    }

    public static int noteOpNoThrow(@NonNull Context context0, @NonNull String s, int v, @NonNull String s1) {
        return ((AppOpsManager)context0.getSystemService("appops")).noteOpNoThrow(s, v, s1);
    }

    public static int noteProxyOp(@NonNull Context context0, @NonNull String s, @NonNull String s1) {
        return u.b(((AppOpsManager)u.a(context0, AppOpsManager.class)), s, s1);
    }

    public static int noteProxyOpNoThrow(@NonNull Context context0, @NonNull String s, @NonNull String s1) {
        return u.c(((AppOpsManager)u.a(context0, AppOpsManager.class)), s, s1);
    }

    @Nullable
    public static String permissionToOp(@NonNull String s) {
        return u.d(s);
    }
}

