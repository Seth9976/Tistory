package com.google.android.gms.common;

import androidx.annotation.NonNull;
import com.google.errorprone.annotations.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
public class PackageVerificationResult {
    public final boolean a;
    public final String b;
    public final Throwable c;

    public PackageVerificationResult(boolean z, String s, Throwable throwable0) {
        this.a = z;
        this.b = s;
        this.c = throwable0;
    }

    @NonNull
    public static PackageVerificationResult zza(@NonNull String s, @NonNull String s1, @Nullable Throwable throwable0) {
        return new PackageVerificationResult(false, s1, throwable0);
    }

    public final void zzb() {
        if(!this.a) {
            String s = "PackageVerificationRslt: " + this.b;
            throw this.c == null ? new SecurityException(s) : new SecurityException(s, this.c);
        }
    }

    public final boolean zzc() {
        return this.a;
    }

    @NonNull
    public static PackageVerificationResult zzd(@NonNull String s, int v) {
        return new PackageVerificationResult(true, null, null);
    }
}

