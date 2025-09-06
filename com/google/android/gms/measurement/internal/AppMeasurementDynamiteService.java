package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.room.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzcb;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.internal.measurement.zzck;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.Map;

@DynamiteApi
public class AppMeasurementDynamiteService extends zzcb {
    public zzfr a;
    public final ArrayMap b;

    public AppMeasurementDynamiteService() {
        this.a = null;
        this.b = new ArrayMap();
    }

    public final void a() {
        if(this.a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void beginAdUnitExposure(@NonNull String s, long v) throws RemoteException {
        this.a();
        this.a.zzd().zzd(s, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void clearConditionalUserProperty(@NonNull String s, @NonNull String s1, @NonNull Bundle bundle0) throws RemoteException {
        this.a();
        this.a.zzq().zzA(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void clearMeasurementEnabled(long v) throws RemoteException {
        this.a();
        this.a.zzq().zzU(null);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void endAdUnitExposure(@NonNull String s, long v) throws RemoteException {
        this.a();
        this.a.zzd().zze(s, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void generateEventId(zzcf zzcf0) throws RemoteException {
        this.a();
        long v = this.a.zzv().zzq();
        this.a();
        this.a.zzv().zzU(zzcf0, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void getAppInstanceId(zzcf zzcf0) throws RemoteException {
        this.a();
        this.a.zzaz().zzp(new o0(this, zzcf0, 0));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void getCachedAppInstanceId(zzcf zzcf0) throws RemoteException {
        this.a();
        String s = this.a.zzq().zzo();
        this.a();
        this.a.zzv().zzV(zzcf0, s);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void getConditionalUserProperties(String s, String s1, zzcf zzcf0) throws RemoteException {
        this.a();
        this.a.zzaz().zzp(new h0(3, s, this, zzcf0, s1));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenClass(zzcf zzcf0) throws RemoteException {
        this.a();
        String s = this.a.zzq().zzp();
        this.a();
        this.a.zzv().zzV(zzcf0, s);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenName(zzcf zzcf0) throws RemoteException {
        this.a();
        String s = this.a.zzq().zzq();
        this.a();
        this.a.zzv().zzV(zzcf0, s);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void getGmpAppId(zzcf zzcf0) throws RemoteException {
        String s;
        this.a();
        zzhx zzhx0 = this.a.zzq();
        if(zzhx0.zzt.zzw() == null) {
            try {
                s = zzid.zzc(zzhx0.zzt.zzau(), "google_app_id", zzhx0.zzt.zzz());
            }
            catch(IllegalStateException illegalStateException0) {
                zzhx0.zzt.zzay().zzd().zzb("getGoogleAppId failed with exception", illegalStateException0);
                s = null;
            }
        }
        else {
            s = zzhx0.zzt.zzw();
        }
        this.a();
        this.a.zzv().zzV(zzcf0, s);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void getMaxUserProperties(String s, zzcf zzcf0) throws RemoteException {
        this.a();
        this.a.zzq().zzh(s);
        this.a();
        this.a.zzv().zzT(zzcf0, 25);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void getSessionId(zzcf zzcf0) throws RemoteException {
        this.a();
        zzhx zzhx0 = this.a.zzq();
        zzhx0.zzt.zzaz().zzp(new f(2, zzhx0, zzcf0));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void getTestFlag(zzcf zzcf0, int v) throws RemoteException {
        this.a();
        switch(v) {
            case 0: {
                this.a.zzv().zzV(zzcf0, this.a.zzq().zzr());
                return;
            }
            case 1: {
                this.a.zzv().zzU(zzcf0, ((long)this.a.zzq().zzm()));
                return;
            }
            case 2: {
                zzlb zzlb0 = this.a.zzv();
                double f = (double)this.a.zzq().zzj();
                Bundle bundle0 = new Bundle();
                bundle0.putDouble("r", f);
                try {
                    zzcf0.zze(bundle0);
                }
                catch(RemoteException remoteException0) {
                    zzlb0.zzt.zzay().zzk().zzb("Error returning double value to wrapper", remoteException0);
                }
                return;
            }
            case 3: {
                this.a.zzv().zzT(zzcf0, ((int)this.a.zzq().zzl()));
                return;
            }
            case 4: {
                this.a.zzv().zzP(zzcf0, this.a.zzq().zzi().booleanValue());
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void getUserProperties(String s, String s1, boolean z, zzcf zzcf0) throws RemoteException {
        this.a();
        this.a.zzaz().zzp(new j0(this, zzcf0, s, s1, z, 2));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void initForTests(@NonNull Map map0) throws RemoteException {
        this.a();
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void initialize(IObjectWrapper iObjectWrapper0, zzcl zzcl0, long v) throws RemoteException {
        zzfr zzfr0 = this.a;
        if(zzfr0 == null) {
            this.a = zzfr.zzp(((Context)Preconditions.checkNotNull(((Context)ObjectWrapper.unwrap(iObjectWrapper0)))), zzcl0, v);
            return;
        }
        a.A(zzfr0, "Attempting to initialize multiple times");
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void isDataCollectionEnabled(zzcf zzcf0) throws RemoteException {
        this.a();
        this.a.zzaz().zzp(new o0(this, zzcf0, 1));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void logEvent(@NonNull String s, @NonNull String s1, @NonNull Bundle bundle0, boolean z, boolean z1, long v) throws RemoteException {
        this.a();
        this.a.zzq().zzE(s, s1, bundle0, z, z1, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void logEventAndBundle(String s, String s1, Bundle bundle0, zzcf zzcf0, long v) throws RemoteException {
        this.a();
        Preconditions.checkNotEmpty(s1);
        (bundle0 == null ? new Bundle() : new Bundle(bundle0)).putString("_o", "app");
        zzaw zzaw0 = new zzaw(s1, new zzau(bundle0), "app", v);
        this.a.zzaz().zzp(new h0(this, zzcf0, zzaw0, s));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void logHealthData(int v, @NonNull String s, @NonNull IObjectWrapper iObjectWrapper0, @NonNull IObjectWrapper iObjectWrapper1, @NonNull IObjectWrapper iObjectWrapper2) throws RemoteException {
        this.a();
        Object object0 = null;
        Object object1 = iObjectWrapper0 == null ? null : ObjectWrapper.unwrap(iObjectWrapper0);
        Object object2 = iObjectWrapper1 == null ? null : ObjectWrapper.unwrap(iObjectWrapper1);
        if(iObjectWrapper2 != null) {
            object0 = ObjectWrapper.unwrap(iObjectWrapper2);
        }
        this.a.zzay().zzt(v, true, false, s, object1, object2, object0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void onActivityCreated(@NonNull IObjectWrapper iObjectWrapper0, @NonNull Bundle bundle0, long v) throws RemoteException {
        this.a();
        n0 n00 = this.a.zzq().zza;
        if(n00 != null) {
            this.a.zzq().zzB();
            n00.onActivityCreated(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)), bundle0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void onActivityDestroyed(@NonNull IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        this.a();
        n0 n00 = this.a.zzq().zza;
        if(n00 != null) {
            this.a.zzq().zzB();
            n00.onActivityDestroyed(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)));
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void onActivityPaused(@NonNull IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        this.a();
        n0 n00 = this.a.zzq().zza;
        if(n00 != null) {
            this.a.zzq().zzB();
            n00.onActivityPaused(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)));
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void onActivityResumed(@NonNull IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        this.a();
        n0 n00 = this.a.zzq().zza;
        if(n00 != null) {
            this.a.zzq().zzB();
            n00.onActivityResumed(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)));
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper0, zzcf zzcf0, long v) throws RemoteException {
        this.a();
        n0 n00 = this.a.zzq().zza;
        Bundle bundle0 = new Bundle();
        if(n00 != null) {
            this.a.zzq().zzB();
            n00.onActivitySaveInstanceState(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)), bundle0);
        }
        try {
            zzcf0.zze(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.a.zzay().zzk().zzb("Error returning bundle value to wrapper", remoteException0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStarted(@NonNull IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        this.a();
        if(this.a.zzq().zza != null) {
            this.a.zzq().zzB();
            Activity activity0 = (Activity)ObjectWrapper.unwrap(iObjectWrapper0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStopped(@NonNull IObjectWrapper iObjectWrapper0, long v) throws RemoteException {
        this.a();
        if(this.a.zzq().zza != null) {
            this.a.zzq().zzB();
            Activity activity0 = (Activity)ObjectWrapper.unwrap(iObjectWrapper0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void performAction(Bundle bundle0, zzcf zzcf0, long v) throws RemoteException {
        this.a();
        zzcf0.zze(null);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void registerOnMeasurementEventListener(zzci zzci0) throws RemoteException {
        zzgs zzgs0;
        this.a();
        synchronized(this.b) {
            Integer integer0 = zzci0.zzd();
            zzgs0 = (zzgs)this.b.get(integer0);
            if(zzgs0 == null) {
                zzgs0 = new s1(this, zzci0);
                Integer integer1 = zzci0.zzd();
                this.b.put(integer1, zzgs0);
            }
        }
        this.a.zzq().zzJ(zzgs0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void resetAnalyticsData(long v) throws RemoteException {
        this.a();
        this.a.zzq().zzK(v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setConditionalUserProperty(@NonNull Bundle bundle0, long v) throws RemoteException {
        this.a();
        if(bundle0 == null) {
            a.v(this.a, "Conditional user property must not be null");
            return;
        }
        this.a.zzq().zzQ(bundle0, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setConsent(@NonNull Bundle bundle0, long v) throws RemoteException {
        this.a();
        zzhx zzhx0 = this.a.zzq();
        zzhx0.zzt.zzaz().zzq(new zzgv(zzhx0, bundle0, v));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setConsentThirdParty(@NonNull Bundle bundle0, long v) throws RemoteException {
        this.a();
        this.a.zzq().zzR(bundle0, -20, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setCurrentScreen(@NonNull IObjectWrapper iObjectWrapper0, @NonNull String s, @NonNull String s1, long v) throws RemoteException {
        this.a();
        this.a.zzs().zzw(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)), s, s1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        this.a();
        zzhx zzhx0 = this.a.zzq();
        zzhx0.zza();
        zzhx0.zzt.zzaz().zzp(new m0(zzhx0, z));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setDefaultEventParameters(@NonNull Bundle bundle0) {
        this.a();
        zzhx zzhx0 = this.a.zzq();
        Bundle bundle1 = bundle0 == null ? null : new Bundle(bundle0);
        zzhx0.zzt.zzaz().zzp(new zzgw(zzhx0, bundle1));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setEventInterceptor(zzci zzci0) throws RemoteException {
        this.a();
        s s0 = new s(this, zzci0);
        if(this.a.zzaz().zzs()) {
            this.a.zzq().zzT(s0);
            return;
        }
        this.a.zzaz().zzp(new f(9, this, s0));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setInstanceIdProvider(zzck zzck0) throws RemoteException {
        this.a();
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setMeasurementEnabled(boolean z, long v) throws RemoteException {
        this.a();
        this.a.zzq().zzU(Boolean.valueOf(z));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setMinimumSessionDuration(long v) throws RemoteException {
        this.a();
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setSessionTimeoutDuration(long v) throws RemoteException {
        this.a();
        zzhx zzhx0 = this.a.zzq();
        zzhx0.zzt.zzaz().zzp(new d0(zzhx0, v, 0));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setUserId(@NonNull String s, long v) throws RemoteException {
        this.a();
        zzhx zzhx0 = this.a.zzq();
        if(s != null && TextUtils.isEmpty(s)) {
            a.A(zzhx0.zzt, "User ID must be non-empty or null");
            return;
        }
        zzhx0.zzt.zzaz().zzp(new zzgx(zzhx0, s));
        zzhx0.zzX(null, "_id", s, true, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void setUserProperty(@NonNull String s, @NonNull String s1, @NonNull IObjectWrapper iObjectWrapper0, boolean z, long v) throws RemoteException {
        this.a();
        Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
        this.a.zzq().zzX(s, s1, object0, z, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcc
    public void unregisterOnMeasurementEventListener(zzci zzci0) throws RemoteException {
        zzgs zzgs0;
        this.a();
        synchronized(this.b) {
            Integer integer0 = zzci0.zzd();
            zzgs0 = (zzgs)this.b.remove(integer0);
        }
        if(zzgs0 == null) {
            zzgs0 = new s1(this, zzci0);
        }
        this.a.zzq().zzZ(zzgs0);
    }
}

