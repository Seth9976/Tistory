package b3;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class a {
    @DoNotInline
    @Nullable
    public static Signature[] a(@NonNull SigningInfo signingInfo0) {
        return signingInfo0.getApkContentsSigners();
    }

    @DoNotInline
    public static long b(PackageInfo packageInfo0) {
        return packageInfo0.getLongVersionCode();
    }

    @DoNotInline
    @Nullable
    public static Signature[] c(@NonNull SigningInfo signingInfo0) {
        return signingInfo0.getSigningCertificateHistory();
    }

    @DoNotInline
    public static boolean d(@NonNull SigningInfo signingInfo0) {
        return signingInfo0.hasMultipleSigners();
    }

    @DoNotInline
    public static boolean e(@NonNull PackageManager packageManager0, @NonNull String s, @NonNull byte[] arr_b, int v) {
        return packageManager0.hasSigningCertificate(s, arr_b, v);
    }
}

