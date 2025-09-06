package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.wrappers.Wrappers;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@KeepForSdk
@ShowFirstParty
public class AndroidUtilsLight {
    @Nullable
    @KeepForSdk
    @Deprecated
    public static byte[] getPackageCertificateHashBytes(@NonNull Context context0, @NonNull String s) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo0 = Wrappers.packageManager(context0).getPackageInfo(s, 0x40);
        if(packageInfo0.signatures != null && packageInfo0.signatures.length == 1) {
            MessageDigest messageDigest0 = AndroidUtilsLight.zza("SHA1");
            return messageDigest0 == null ? null : messageDigest0.digest(packageInfo0.signatures[0].toByteArray());
        }
        return null;
    }

    @Nullable
    public static MessageDigest zza(@NonNull String s) {
        for(int v = 0; v < 2; ++v) {
            try {
                MessageDigest messageDigest0 = MessageDigest.getInstance(s);
                if(messageDigest0 != null) {
                    return messageDigest0;
                }
            }
            catch(NoSuchAlgorithmException unused_ex) {
            }
        }
        return null;
    }
}

