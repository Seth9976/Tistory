package com.google.android.gms.common;

import a7.e;
import a7.f;
import a7.g;
import a7.h;
import a7.j;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
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
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core\'s APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class GoogleSignatureVerifier {
    public final Context a;
    public volatile String b;
    public static GoogleSignatureVerifier c;

    public GoogleSignatureVerifier(@NonNull Context context0) {
        this.a = context0.getApplicationContext();
    }

    public static final e a(PackageInfo packageInfo0, e[] arr_e) {
        Signature[] arr_signature = packageInfo0.signatures;
        if(arr_signature == null) {
            return null;
        }
        if(arr_signature.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        f f0 = new f(packageInfo0.signatures[0].toByteArray());
        for(int v = 0; v < arr_e.length; ++v) {
            if(arr_e[v].equals(f0)) {
                return arr_e[v];
            }
        }
        return null;
    }

    public final j b(String s) {
        j j2;
        j j1;
        PackageInfo packageInfo0;
        j j0;
        boolean z;
        if(s == null) {
            return new j(false, 1, "null pkg", null);
        }
        if(!s.equals(this.b)) {
            StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
            try {
                h.c();
                z = h.e.zzi();
            }
            catch(LoadingException | RemoteException dynamiteModule$LoadingException0) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", dynamiteModule$LoadingException0);
                z = false;
            }
            finally {
                StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
            }
            if(z) {
                j0 = h.b(s, GooglePlayServicesUtilLight.honorsDebugCertificates(this.a), true);
            }
            else {
                try {
                    packageInfo0 = this.a.getPackageManager().getPackageInfo(s, 0x40);
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    return new j(false, 1, "no pkg " + s, packageManager$NameNotFoundException0);
                }
                boolean z1 = GooglePlayServicesUtilLight.honorsDebugCertificates(this.a);
                if(packageInfo0 == null) {
                    j0 = new j(false, 1, "null pkg", null);
                }
                else if(packageInfo0.signatures == null || packageInfo0.signatures.length != 1) {
                    j0 = new j(false, 1, "single cert required", null);
                }
                else {
                    f f0 = new f(packageInfo0.signatures[0].toByteArray());
                    String s1 = packageInfo0.packageName;
                    StrictMode.ThreadPolicy strictMode$ThreadPolicy1 = StrictMode.allowThreadDiskReads();
                    try {
                        j1 = h.a(s1, f0, z1, false);
                    }
                    finally {
                        StrictMode.setThreadPolicy(strictMode$ThreadPolicy1);
                    }
                    if(!j1.a || (packageInfo0.applicationInfo == null || (packageInfo0.applicationInfo.flags & 2) == 0)) {
                        j0 = j1;
                    }
                    else {
                        StrictMode.ThreadPolicy strictMode$ThreadPolicy2 = StrictMode.allowThreadDiskReads();
                        try {
                            j2 = h.a(s1, f0, false, true);
                        }
                        finally {
                            StrictMode.setThreadPolicy(strictMode$ThreadPolicy2);
                        }
                        j0 = j2.a ? new j(false, 1, "debuggable release cert app rejected", null) : j1;
                    }
                }
            }
            if(j0.a) {
                this.b = s;
            }
            return j0;
        }
        return j.e;
    }

    @NonNull
    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(@NonNull Context context0) {
        Preconditions.checkNotNull(context0);
        synchronized(GoogleSignatureVerifier.class) {
            if(GoogleSignatureVerifier.c == null) {
                Class class1 = h.class;
                synchronized(class1) {
                    if(h.g != null) {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                    else if(context0 != null) {
                        h.g = context0.getApplicationContext();
                    }
                }
                GoogleSignatureVerifier.c = new GoogleSignatureVerifier(context0);
            }
            return GoogleSignatureVerifier.c;
        }
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(@NonNull PackageInfo packageInfo0) {
        if(packageInfo0 == null) {
            return false;
        }
        if(GoogleSignatureVerifier.zzb(packageInfo0, false)) {
            return true;
        }
        if(GoogleSignatureVerifier.zzb(packageInfo0, true)) {
            if(GooglePlayServicesUtilLight.honorsDebugCertificates(this.a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren\'t accepted on this build.");
        }
        return false;
    }

    @KeepForSdk
    @ShowFirstParty
    public boolean isPackageGoogleSigned(@NonNull String s) {
        j j0 = this.b(s);
        j0.b();
        return j0.a;
    }

    @KeepForSdk
    @ShowFirstParty
    public boolean isUidGoogleSigned(int v) {
        String[] arr_s = this.a.getPackageManager().getPackagesForUid(v);
        j j0 = null;
        if(arr_s == null || arr_s.length == 0) {
            j0 = new j(false, 1, "no pkgs", null);
        }
        else {
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                j0 = this.b(arr_s[v1]);
                if(j0.a) {
                    j0.b();
                    return j0.a;
                }
            }
            Preconditions.checkNotNull(j0);
        }
        j0.b();
        return j0.a;
    }

    public static final boolean zzb(@NonNull PackageInfo packageInfo0, boolean z) {
        if(z && packageInfo0 != null && ("com.android.vending".equals(packageInfo0.packageName) || "com.google.android.gms".equals(packageInfo0.packageName))) {
            if(packageInfo0.applicationInfo != null && (packageInfo0.applicationInfo.flags & 0x81) != 0) {
                return packageInfo0 == null || packageInfo0.signatures == null ? false : GoogleSignatureVerifier.a(packageInfo0, g.a) != null;
            }
            return packageInfo0 == null || packageInfo0.signatures == null ? false : GoogleSignatureVerifier.a(packageInfo0, new e[]{g.a[0]}) != null;
        }
        return packageInfo0 == null || packageInfo0.signatures == null ? false : (z ? GoogleSignatureVerifier.a(packageInfo0, g.a) : GoogleSignatureVerifier.a(packageInfo0, new e[]{g.a[0]})) != null;
    }
}

