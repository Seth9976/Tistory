package androidx.webkit.internal;

import android.content.ComponentName;
import android.content.pm.PackageManager.ComponentInfoFlags;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(33)
public class ApiHelperForTiramisu {
    @DoNotInline
    public static ServiceInfo a(PackageManager packageManager0, ComponentName componentName0, PackageManager.ComponentInfoFlags packageManager$ComponentInfoFlags0) throws PackageManager.NameNotFoundException {
        return packageManager0.getServiceInfo(componentName0, packageManager$ComponentInfoFlags0);
    }

    @DoNotInline
    public static PackageManager.ComponentInfoFlags b(long v) {
        return PackageManager.ComponentInfoFlags.of(v);
    }
}

