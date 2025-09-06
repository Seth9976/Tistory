package v4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager.PackageInfoFlags;
import android.content.pm.PackageManager;
import androidx.annotation.DoNotInline;

public abstract class e {
    @DoNotInline
    public static PackageInfo a(PackageManager packageManager0, Context context0) throws PackageManager.NameNotFoundException {
        return packageManager0.getPackageInfo("net.daum.android.tistoryapp", PackageManager.PackageInfoFlags.of(0L));
    }
}

