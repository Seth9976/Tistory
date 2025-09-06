package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.BinderThread;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class zzgj extends zzdw {
    public final zzkt a;
    public Boolean b;
    public String c;

    public zzgj(zzkt zzkt0, String s) {
        Preconditions.checkNotNull(zzkt0);
        this.a = zzkt0;
        this.c = null;
    }

    public final void a(zzaw zzaw0, zzq zzq0) {
        this.a.a();
        this.a.e(zzaw0, zzq0);
    }

    public final void b(Runnable runnable0) {
        Preconditions.checkNotNull(runnable0);
        zzkt zzkt0 = this.a;
        if(zzkt0.zzaz().zzs()) {
            runnable0.run();
            return;
        }
        zzkt0.zzaz().zzp(runnable0);
    }

    public final void c(zzq zzq0) {
        Preconditions.checkNotNull(zzq0);
        Preconditions.checkNotEmpty(zzq0.zza);
        this.d(zzq0.zza, false);
        this.a.zzv().l(zzq0.zzb, zzq0.zzq);
    }

    public final void d(String s, boolean z) {
        boolean z1 = true;
        boolean z2 = TextUtils.isEmpty(s);
        zzkt zzkt0 = this.a;
        if(!z2) {
            try {
                if(z) {
                    if(this.b == null) {
                        if(!"com.google.android.gms".equals(this.c) && !UidVerifier.isGooglePlayServicesUid(zzkt0.zzau(), Binder.getCallingUid()) && !GoogleSignatureVerifier.getInstance(zzkt0.zzau()).isUidGoogleSigned(Binder.getCallingUid())) {
                            z1 = false;
                        }
                        this.b = Boolean.valueOf(z1);
                    }
                    if(!this.b.booleanValue()) {
                        goto label_10;
                    }
                    return;
                }
            label_10:
                if(this.c == null && GooglePlayServicesUtilLight.uidHasPackageName(zzkt0.zzau(), Binder.getCallingUid(), s)) {
                    this.c = s;
                }
                if(!s.equals(this.c)) {
                    throw new SecurityException("Unknown calling package name \'" + s + "\'.");
                }
                return;
            }
            catch(SecurityException securityException0) {
            }
            zzkt0.zzay().zzd().zzb("Measurement Service called with invalid calling package. appId", zzeh.zzn(s));
            throw securityException0;
        }
        zzkt0.zzay().zzd().zza("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @Override  // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final String zzd(zzq zzq0) {
        this.c(zzq0);
        zzkt zzkt0 = this.a;
        Future future0 = zzkt0.zzaz().zzh(new z(1, zzkt0, zzq0));
        try {
            return (String)future0.get(30000L, TimeUnit.MILLISECONDS);
        }
        catch(TimeoutException | InterruptedException | ExecutionException timeoutException0) {
            zzkt0.zzay().zzd().zzc("Failed to get app instance id. appId", zzeh.zzn(zzq0.zza), timeoutException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final List zze(zzq zzq0, boolean z) {
        this.c(zzq0);
        Preconditions.checkNotNull(zzq0.zza);
        zzkt zzkt0 = this.a;
        Future future0 = zzkt0.zzaz().zzh(new z(0, this, zzq0.zza));
        try {
            List list0 = (List)future0.get();
            List list1 = new ArrayList(list0.size());
            for(Object object0: list0) {
                r1 r10 = (r1)object0;
                if(z || !zzlb.v(r10.c)) {
                    ((ArrayList)list1).add(new zzkw(r10));
                }
            }
            return list1;
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
        }
        zzkt0.zzay().zzd().zzc("Failed to get user properties. appId", zzeh.zzn(zzq0.zza), interruptedException0);
        return null;
    }

    @Override  // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final List zzf(String s, String s1, zzq zzq0) {
        this.c(zzq0);
        Preconditions.checkNotNull(zzq0.zza);
        zzkt zzkt0 = this.a;
        Future future0 = zzkt0.zzaz().zzh(new w(this, zzq0.zza, s, s1, 2));
        try {
            return (List)future0.get();
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
            zzkt0.zzay().zzd().zzb("Failed to get conditional user properties", interruptedException0);
            return Collections.emptyList();
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final List zzg(String s, String s1, String s2) {
        this.d(s, true);
        zzkt zzkt0 = this.a;
        Future future0 = zzkt0.zzaz().zzh(new w(this, s, s1, s2, 3));
        try {
            return (List)future0.get();
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
            zzkt0.zzay().zzd().zzb("Failed to get conditional user properties as", interruptedException0);
            return Collections.emptyList();
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final List zzh(String s, String s1, boolean z, zzq zzq0) {
        this.c(zzq0);
        Preconditions.checkNotNull(zzq0.zza);
        zzkt zzkt0 = this.a;
        Future future0 = zzkt0.zzaz().zzh(new w(this, zzq0.zza, s, s1, 0));
        try {
            List list0 = (List)future0.get();
            List list1 = new ArrayList(list0.size());
            for(Object object0: list0) {
                r1 r10 = (r1)object0;
                if(z || !zzlb.v(r10.c)) {
                    ((ArrayList)list1).add(new zzkw(r10));
                }
            }
            return list1;
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
        }
        zzkt0.zzay().zzd().zzc("Failed to query user properties. appId", zzeh.zzn(zzq0.zza), interruptedException0);
        return Collections.emptyList();
    }

    @Override  // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final List zzi(String s, String s1, String s2, boolean z) {
        this.d(s, true);
        zzkt zzkt0 = this.a;
        Future future0 = zzkt0.zzaz().zzh(new w(this, s, s1, s2, 1));
        try {
            List list0 = (List)future0.get();
            List list1 = new ArrayList(list0.size());
            for(Object object0: list0) {
                r1 r10 = (r1)object0;
                if(z || !zzlb.v(r10.c)) {
                    ((ArrayList)list1).add(new zzkw(r10));
                }
            }
            return list1;
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
        }
        zzkt0.zzay().zzd().zzc("Failed to get user properties as. appId", zzeh.zzn(s), interruptedException0);
        return Collections.emptyList();
    }

    @Override  // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final void zzj(zzq zzq0) {
        this.c(zzq0);
        this.b(new x(this, zzq0, 3));
    }

    @Override  // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final void zzk(zzaw zzaw0, zzq zzq0) {
        Preconditions.checkNotNull(zzaw0);
        this.c(zzq0);
        this.b(new y0(this, zzaw0, 4, zzq0));
    }

    @Override  // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final void zzl(zzaw zzaw0, String s, String s1) {
        Preconditions.checkNotNull(zzaw0);
        Preconditions.checkNotEmpty(s);
        this.d(s, true);
        this.b(new y0(this, zzaw0, 5, s));
    }

    @Override  // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final void zzm(zzq zzq0) {
        Preconditions.checkNotEmpty(zzq0.zza);
        this.d(zzq0.zza, false);
        this.b(new x(this, zzq0, 0));
    }

    @Override  // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final void zzn(zzac zzac0, zzq zzq0) {
        Preconditions.checkNotNull(zzac0);
        Preconditions.checkNotNull(zzac0.zzc);
        this.c(zzq0);
        zzac zzac1 = new zzac(zzac0);
        zzac1.zza = zzq0.zza;
        this.b(new y0(this, zzac1, 3, zzq0));
    }

    @Override  // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final void zzo(zzac zzac0) {
        Preconditions.checkNotNull(zzac0);
        Preconditions.checkNotNull(zzac0.zzc);
        Preconditions.checkNotEmpty(zzac0.zza);
        this.d(zzac0.zza, true);
        this.b(new f(5, this, new zzac(zzac0)));
    }

    @Override  // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final void zzp(zzq zzq0) {
        Preconditions.checkNotEmpty(zzq0.zza);
        Preconditions.checkNotNull(zzq0.zzv);
        x x0 = new x(this, zzq0, 2);
        Preconditions.checkNotNull(x0);
        zzkt zzkt0 = this.a;
        if(zzkt0.zzaz().zzs()) {
            x0.run();
            return;
        }
        zzkt0.zzaz().zzq(x0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final void zzq(long v, String s, String s1, String s2) {
        this.b(new r0(this, s1, s2, s, v, 1));
    }

    @Override  // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final void zzr(Bundle bundle0, zzq zzq0) {
        this.c(zzq0);
        Preconditions.checkNotNull(zzq0.zza);
        this.b(new zzfs(this, zzq0.zza, bundle0));
    }

    @Override  // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final void zzs(zzq zzq0) {
        this.c(zzq0);
        this.b(new x(this, zzq0, 1));
    }

    @Override  // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final void zzt(zzkw zzkw0, zzq zzq0) {
        Preconditions.checkNotNull(zzkw0);
        this.c(zzq0);
        this.b(new y0(this, zzkw0, 6, zzq0));
    }

    @Override  // com.google.android.gms.measurement.internal.zzdx
    @BinderThread
    public final byte[] zzu(zzaw zzaw0, String s) {
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(zzaw0);
        this.d(s, true);
        zzkt zzkt0 = this.a;
        zzkt0.zzay().zzc().zzb("Log and bundle. event", zzkt0.zzj().zzd(zzaw0.zza));
        long v = zzkt0.zzav().nanoTime();
        Future future0 = zzkt0.zzaz().zzi(new y(this, zzaw0, s));
        try {
            byte[] arr_b = (byte[])future0.get();
            if(arr_b == null) {
                zzkt0.zzay().zzd().zzb("Log and bundle returned null. appId", zzeh.zzn(s));
                arr_b = new byte[0];
            }
            long v1 = zzkt0.zzav().nanoTime();
            zzkt0.zzay().zzc().zzd("Log and bundle processed. event, size, time_ms", zzkt0.zzj().zzd(zzaw0.zza), ((int)arr_b.length), ((long)(v1 / 1000000L - v / 1000000L)));
            return arr_b;
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
        }
        zzkt0.zzay().zzd().zzd("Failed to log and bundle. appId, event, error", zzeh.zzn(s), zzkt0.zzj().zzd(zzaw0.zza), interruptedException0);
        return null;
    }
}

