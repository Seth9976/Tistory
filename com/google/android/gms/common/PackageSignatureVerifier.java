package com.google.android.gms.common;

import a7.b;
import a7.c;
import a7.h;
import a7.j;
import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.RestrictedInheritance;

@KeepForSdk
@ShowFirstParty
@CheckReturnValue
@RestrictedInheritance(allowedOnPath = ".*javatests.*/com/google/android/gms/common/.*", explanation = "Sub classing of GMS Core\'s APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class PackageSignatureVerifier {
    public volatile b a;
    public static c b;

    public static void a() {
        synchronized(c.class) {
            if(PackageSignatureVerifier.b == null) {
                PackageSignatureVerifier.b = new c(0);
            }
        }
    }

    @NonNull
    @KeepForSdk
    @ShowFirstParty
    public PackageVerificationResult queryPackageSignatureVerified(@NonNull Context context0, @NonNull String s) {
        boolean z1;
        boolean z = GooglePlayServicesUtilLight.honorsDebugCertificates(context0);
        PackageSignatureVerifier.a();
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
        try {
            h.c();
            z1 = h.e.zzg();
        }
        catch(LoadingException | RemoteException dynamiteModule$LoadingException0) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", dynamiteModule$LoadingException0);
            z1 = false;
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
        if(!z1) {
            throw new zzae();
        }
        String s1 = s + (z ? "-1" : "-0");
        if(this.a != null && ((String)this.a.b).equals(s1)) {
            return (PackageVerificationResult)this.a.c;
        }
        PackageSignatureVerifier.a();
        j j0 = h.b(s, z, false);
        if(j0.a) {
            this.a = new b(0, s1, PackageVerificationResult.zzd(s, j0.d));
            return (PackageVerificationResult)this.a.c;
        }
        Preconditions.checkNotNull(j0.b);
        return PackageVerificationResult.zza(s, j0.b, j0.c);
    }

    @NonNull
    @KeepForSdk
    @ShowFirstParty
    public PackageVerificationResult queryPackageSignatureVerifiedWithRetry(@NonNull Context context0, @NonNull String s) {
        try {
            PackageVerificationResult packageVerificationResult0 = this.queryPackageSignatureVerified(context0, s);
            packageVerificationResult0.zzb();
            return packageVerificationResult0;
        }
        catch(SecurityException securityException0) {
            PackageVerificationResult packageVerificationResult1 = this.queryPackageSignatureVerified(context0, s);
            if(packageVerificationResult1.zzc()) {
                Log.e("PkgSignatureVerifier", "Got flaky result during package signature verification", securityException0);
                return packageVerificationResult1;
            }
            return packageVerificationResult1;
        }
    }
}

