package com.google.android.gms.measurement.internal;

import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

public final class zzjo extends m1 {
    public final HashMap b;
    public final zzes zza;
    public final zzes zzb;
    public final zzes zzc;
    public final zzes zzd;
    public final zzes zze;

    public zzjo(zzkt zzkt0) {
        super(zzkt0);
        this.b = new HashMap();
        o o0 = this.zzt.zzm();
        o0.getClass();
        this.zza = new zzes(o0, "last_delete_stale", 0L);
        o o1 = this.zzt.zzm();
        o1.getClass();
        this.zzb = new zzes(o1, "backoff", 0L);
        o o2 = this.zzt.zzm();
        o2.getClass();
        this.zzc = new zzes(o2, "last_upload", 0L);
        o o3 = this.zzt.zzm();
        o3.getClass();
        this.zzd = new zzes(o3, "last_upload_attempt", 0L);
        o o4 = this.zzt.zzm();
        o4.getClass();
        this.zze = new zzes(o4, "midnight_offset", 0L);
    }

    public final Pair a(String s) {
        d1 d11;
        this.zzg();
        long v = this.zzt.zzav().elapsedRealtime();
        HashMap hashMap0 = this.b;
        d1 d10 = (d1)hashMap0.get(s);
        if(d10 != null && v < d10.c) {
            return new Pair(d10.a, Boolean.valueOf(d10.b));
        }
        long v1 = this.zzt.zzf().zzi(s, zzdu.zza) + v;
        try {
            Info advertisingIdClient$Info0 = AdvertisingIdClient.getAdvertisingIdInfo(this.zzt.zzau());
            if(advertisingIdClient$Info0 == null) {
                return new Pair("", Boolean.FALSE);
            }
            String s1 = advertisingIdClient$Info0.getId();
            d11 = s1 == null ? new d1(v1, "", advertisingIdClient$Info0.isLimitAdTrackingEnabled()) : new d1(v1, s1, advertisingIdClient$Info0.isLimitAdTrackingEnabled());
        }
        catch(Exception exception0) {
            this.zzt.zzay().zzc().zzb("Unable to get advertising id", exception0);
            d11 = new d1(v1, "", false);
        }
        hashMap0.put(s, d11);
        return new Pair(d11.a, Boolean.valueOf(d11.b));
    }

    public final String b(String s, boolean z) {
        this.zzg();
        String s1 = z ? ((String)this.a(s).first) : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigest0 = zzlb.c();
        return messageDigest0 == null ? null : String.format(Locale.US, "%032X", new BigInteger(1, messageDigest0.digest(s1.getBytes())));
    }

    @Override  // com.google.android.gms.measurement.internal.m1
    public final boolean zzb() {
        return false;
    }
}

