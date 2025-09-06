package androidx.core.content;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.app.AppOpsManagerCompat;
import androidx.core.util.ObjectsCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class PermissionChecker {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface PermissionResult {
    }

    public static final int PERMISSION_DENIED = -1;
    public static final int PERMISSION_DENIED_APP_OP = -2;
    public static final int PERMISSION_GRANTED;

    public static int checkCallingOrSelfPermission(@NonNull Context context0, @NonNull String s) {
        return Binder.getCallingPid() == Process.myPid() ? PermissionChecker.checkPermission(context0, s, Binder.getCallingPid(), Binder.getCallingUid(), "net.daum.android.tistoryapp") : PermissionChecker.checkPermission(context0, s, Binder.getCallingPid(), Binder.getCallingUid(), null);
    }

    public static int checkCallingPermission(@NonNull Context context0, @NonNull String s, @Nullable String s1) {
        return Binder.getCallingPid() == Process.myPid() ? -1 : PermissionChecker.checkPermission(context0, s, Binder.getCallingPid(), Binder.getCallingUid(), s1);
    }

    public static int checkPermission(@NonNull Context context0, @NonNull String s, int v, int v1, @Nullable String s1) {
        if(context0.checkPermission(s, v, v1) == -1) {
            return -1;
        }
        String s2 = AppOpsManagerCompat.permissionToOp(s);
        if(s2 == null) {
            return 0;
        }
        if(s1 == null) {
            String[] arr_s = context0.getPackageManager().getPackagesForUid(v1);
            if(arr_s != null && arr_s.length > 0) {
                s1 = arr_s[0];
                return (Process.myUid() != v1 || !ObjectsCompat.equals("net.daum.android.tistoryapp", s1) ? AppOpsManagerCompat.noteProxyOpNoThrow(context0, s2, s1) : AppOpsManagerCompat.checkOrNoteProxyOp(context0, v1, s2, s1)) == 0 ? 0 : -2;
            }
            return -1;
        }
        return (Process.myUid() != v1 || !ObjectsCompat.equals("net.daum.android.tistoryapp", s1) ? AppOpsManagerCompat.noteProxyOpNoThrow(context0, s2, s1) : AppOpsManagerCompat.checkOrNoteProxyOp(context0, v1, s2, s1)) == 0 ? 0 : -2;
    }

    public static int checkSelfPermission(@NonNull Context context0, @NonNull String s) {
        return PermissionChecker.checkPermission(context0, s, Process.myPid(), Process.myUid(), "net.daum.android.tistoryapp");
    }
}

