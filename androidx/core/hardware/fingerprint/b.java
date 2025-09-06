package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager.AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager.AuthenticationResult;
import android.hardware.fingerprint.FingerprintManager.CryptoObject;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;

public abstract class b {
    @DoNotInline
    @RequiresPermission("android.permission.USE_FINGERPRINT")
    public static void a(Object object0, Object object1, CancellationSignal cancellationSignal0, int v, Object object2, Handler handler0) {
        ((FingerprintManager)object0).authenticate(((FingerprintManager.CryptoObject)object1), cancellationSignal0, v, ((FingerprintManager.AuthenticationCallback)object2), handler0);
    }

    @DoNotInline
    public static FingerprintManager.CryptoObject b(Object object0) {
        return ((FingerprintManager.AuthenticationResult)object0).getCryptoObject();
    }

    // 去混淆评级： 低(20)
    @DoNotInline
    public static FingerprintManager c(Context context0) {
        return context0.getPackageManager().hasSystemFeature("android.hardware.fingerprint") ? ((FingerprintManager)context0.getSystemService(FingerprintManager.class)) : null;
    }

    @DoNotInline
    @RequiresPermission("android.permission.USE_FINGERPRINT")
    public static boolean d(Object object0) {
        return ((FingerprintManager)object0).hasEnrolledFingerprints();
    }

    @DoNotInline
    @RequiresPermission("android.permission.USE_FINGERPRINT")
    public static boolean e(Object object0) {
        return ((FingerprintManager)object0).isHardwareDetected();
    }

    @DoNotInline
    public static CryptoObject f(Object object0) {
        if(((FingerprintManager.CryptoObject)object0) == null) {
            return null;
        }
        if(((FingerprintManager.CryptoObject)object0).getCipher() != null) {
            return new CryptoObject(((FingerprintManager.CryptoObject)object0).getCipher());
        }
        if(((FingerprintManager.CryptoObject)object0).getSignature() != null) {
            return new CryptoObject(((FingerprintManager.CryptoObject)object0).getSignature());
        }
        return ((FingerprintManager.CryptoObject)object0).getMac() == null ? null : new CryptoObject(((FingerprintManager.CryptoObject)object0).getMac());
    }

    @DoNotInline
    public static FingerprintManager.CryptoObject g(CryptoObject fingerprintManagerCompat$CryptoObject0) {
        if(fingerprintManagerCompat$CryptoObject0 == null) {
            return null;
        }
        if(fingerprintManagerCompat$CryptoObject0.getCipher() != null) {
            return new FingerprintManager.CryptoObject(fingerprintManagerCompat$CryptoObject0.getCipher());
        }
        if(fingerprintManagerCompat$CryptoObject0.getSignature() != null) {
            return new FingerprintManager.CryptoObject(fingerprintManagerCompat$CryptoObject0.getSignature());
        }
        return fingerprintManagerCompat$CryptoObject0.getMac() == null ? null : new FingerprintManager.CryptoObject(fingerprintManagerCompat$CryptoObject0.getMac());
    }
}

