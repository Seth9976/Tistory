package androidx.core.hardware.fingerprint;

import android.hardware.fingerprint.FingerprintManager.AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager.AuthenticationResult;

public final class a extends FingerprintManager.AuthenticationCallback {
    public final AuthenticationCallback a;

    public a(AuthenticationCallback fingerprintManagerCompat$AuthenticationCallback0) {
        this.a = fingerprintManagerCompat$AuthenticationCallback0;
        super();
    }

    @Override  // android.hardware.fingerprint.FingerprintManager$AuthenticationCallback
    public final void onAuthenticationError(int v, CharSequence charSequence0) {
    }

    @Override  // android.hardware.fingerprint.FingerprintManager$AuthenticationCallback
    public final void onAuthenticationFailed() {
    }

    @Override  // android.hardware.fingerprint.FingerprintManager$AuthenticationCallback
    public final void onAuthenticationHelp(int v, CharSequence charSequence0) {
    }

    @Override  // android.hardware.fingerprint.FingerprintManager$AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult fingerprintManager$AuthenticationResult0) {
        new AuthenticationResult(b.f(b.b(fingerprintManager$AuthenticationResult0)));
    }
}

