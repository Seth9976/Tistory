package com.google.android.gms.common;

import a7.d;
import a7.h;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.common.zzag;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.HashMap;

@KeepForSdk
@ShowFirstParty
@RestrictedInheritance(allowedOnPath = ".*javatests/com/google/android/gmscore/integ/client/common/robolectric/.*", explanation = "Sub classing of GMS Core\'s APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class GmsSignatureVerifier {
    static {
        d d0 = h.d;
        zzag zzag0 = zzag.zzn(d0.b(), h.b.b());
        Preconditions.checkNotNull(zzag0);
        zzag zzag1 = zzag.zzk(zzag0);
        d d1 = h.c;
        zzag zzag2 = zzag.zzn(d1.b(), h.a.b());
        Preconditions.checkNotNull(zzag2);
        if(zzag1.isEmpty() && zzag.zzk(zzag2).isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        zzag zzag3 = zzag.zzm(d0.b());
        Preconditions.checkNotNull(zzag3);
        zzag zzag4 = zzag.zzk(zzag3);
        zzag zzag5 = zzag.zzm(d1.b());
        Preconditions.checkNotNull(zzag5);
        if(zzag4.isEmpty() && zzag.zzk(zzag5).isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        new HashMap();
    }
}

