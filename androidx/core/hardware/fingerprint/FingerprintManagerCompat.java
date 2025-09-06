package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Deprecated
public class FingerprintManagerCompat {
    public static abstract class AuthenticationCallback {
        public void onAuthenticationError(int v, @NonNull CharSequence charSequence0) {
        }

        public void onAuthenticationFailed() {
        }

        public void onAuthenticationHelp(int v, @NonNull CharSequence charSequence0) {
        }

        public void onAuthenticationSucceeded(@NonNull AuthenticationResult fingerprintManagerCompat$AuthenticationResult0) {
        }
    }

    public static final class AuthenticationResult {
        public final CryptoObject a;

        public AuthenticationResult(@NonNull CryptoObject fingerprintManagerCompat$CryptoObject0) {
            this.a = fingerprintManagerCompat$CryptoObject0;
        }

        @NonNull
        public CryptoObject getCryptoObject() {
            return this.a;
        }
    }

    public static class CryptoObject {
        public final Signature a;
        public final Cipher b;
        public final Mac c;

        public CryptoObject(@NonNull Signature signature0) {
            this.a = signature0;
            this.b = null;
            this.c = null;
        }

        public CryptoObject(@NonNull Cipher cipher0) {
            this.b = cipher0;
            this.a = null;
            this.c = null;
        }

        public CryptoObject(@NonNull Mac mac0) {
            this.c = mac0;
            this.b = null;
            this.a = null;
        }

        @Nullable
        public Cipher getCipher() {
            return this.b;
        }

        @Nullable
        public Mac getMac() {
            return this.c;
        }

        @Nullable
        public Signature getSignature() {
            return this.a;
        }
    }

    public final Context a;

    public FingerprintManagerCompat(Context context0) {
        this.a = context0;
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    public void authenticate(@Nullable CryptoObject fingerprintManagerCompat$CryptoObject0, int v, @Nullable CancellationSignal cancellationSignal0, @NonNull AuthenticationCallback fingerprintManagerCompat$AuthenticationCallback0, @Nullable Handler handler0) {
        FingerprintManager fingerprintManager0 = b.c(this.a);
        if(fingerprintManager0 != null) {
            b.a(fingerprintManager0, b.g(fingerprintManagerCompat$CryptoObject0), cancellationSignal0, v, new a(fingerprintManagerCompat$AuthenticationCallback0), handler0);
        }
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public void authenticate(@Nullable CryptoObject fingerprintManagerCompat$CryptoObject0, int v, @Nullable androidx.core.os.CancellationSignal cancellationSignal0, @NonNull AuthenticationCallback fingerprintManagerCompat$AuthenticationCallback0, @Nullable Handler handler0) {
        this.authenticate(fingerprintManagerCompat$CryptoObject0, v, (cancellationSignal0 == null ? null : ((CancellationSignal)cancellationSignal0.getCancellationSignalObject())), fingerprintManagerCompat$AuthenticationCallback0, handler0);
    }

    @NonNull
    public static FingerprintManagerCompat from(@NonNull Context context0) {
        return new FingerprintManagerCompat(context0);
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    public boolean hasEnrolledFingerprints() {
        FingerprintManager fingerprintManager0 = b.c(this.a);
        return fingerprintManager0 != null && b.d(fingerprintManager0);
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    public boolean isHardwareDetected() {
        FingerprintManager fingerprintManager0 = b.c(this.a);
        return fingerprintManager0 != null && b.e(fingerprintManager0);
    }
}

