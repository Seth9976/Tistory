package b3;

import android.content.pm.PermissionInfo;
import androidx.annotation.DoNotInline;

public abstract class b {
    @DoNotInline
    public static int a(PermissionInfo permissionInfo0) {
        return permissionInfo0.getProtection();
    }

    @DoNotInline
    public static int b(PermissionInfo permissionInfo0) {
        return permissionInfo0.getProtectionFlags();
    }
}

