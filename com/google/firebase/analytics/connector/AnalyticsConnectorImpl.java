package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zze;
import com.google.firebase.analytics.connector.internal.zzg;
import com.google.firebase.events.Subscriber;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AnalyticsConnectorImpl implements AnalyticsConnector {
    public final AppMeasurementSdk a;
    public final ConcurrentHashMap b;
    public static volatile AnalyticsConnectorImpl c;

    public AnalyticsConnectorImpl(AppMeasurementSdk appMeasurementSdk0) {
        Preconditions.checkNotNull(appMeasurementSdk0);
        this.a = appMeasurementSdk0;
        this.b = new ConcurrentHashMap();
    }

    // 去混淆评级： 低(20)
    public final boolean a(String s) {
        return !s.isEmpty() && (this.b.containsKey(s) && this.b.get(s) != null);
    }

    @Override  // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void clearConditionalUserProperty(@NonNull @Size(max = 24L, min = 1L) String s, @NonNull String s1, @NonNull Bundle bundle0) {
        if(s1 != null && !zzc.zzj(s1, bundle0)) {
            return;
        }
        this.a.clearConditionalUserProperty(s, s1, bundle0);
    }

    @Override  // com.google.firebase.analytics.connector.AnalyticsConnector
    @NonNull
    @WorkerThread
    @KeepForSdk
    public List getConditionalUserProperties(@NonNull String s, @NonNull @Size(max = 23L, min = 1L) String s1) {
        List list0 = new ArrayList();
        for(Object object0: this.a.getConditionalUserProperties(s, s1)) {
            ((ArrayList)list0).add(zzc.zzb(((Bundle)object0)));
        }
        return list0;
    }

    @NonNull
    @KeepForSdk
    public static AnalyticsConnector getInstance() {
        return AnalyticsConnectorImpl.getInstance(FirebaseApp.getInstance());
    }

    @NonNull
    @KeepForSdk
    public static AnalyticsConnector getInstance(@NonNull FirebaseApp firebaseApp0) {
        return (AnalyticsConnector)firebaseApp0.get(AnalyticsConnector.class);
    }

    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @KeepForSdk
    public static AnalyticsConnector getInstance(@NonNull FirebaseApp firebaseApp0, @NonNull Context context0, @NonNull Subscriber subscriber0) {
        Preconditions.checkNotNull(firebaseApp0);
        Preconditions.checkNotNull(context0);
        Preconditions.checkNotNull(subscriber0);
        Preconditions.checkNotNull(context0.getApplicationContext());
        if(AnalyticsConnectorImpl.c == null) {
            synchronized(AnalyticsConnectorImpl.class) {
                if(AnalyticsConnectorImpl.c == null) {
                    Bundle bundle0 = new Bundle(1);
                    if(firebaseApp0.isDefaultApp()) {
                        subscriber0.subscribe(DataCollectionDefaultChange.class, zza.zza, zzb.zza);
                        bundle0.putBoolean("dataCollectionDefaultEnabled", firebaseApp0.isDataCollectionDefaultEnabled());
                    }
                    AnalyticsConnectorImpl.c = new AnalyticsConnectorImpl(zzef.zzg(context0, null, null, null, bundle0).zzd());
                }
            }
        }
        return AnalyticsConnectorImpl.c;
    }

    @Override  // com.google.firebase.analytics.connector.AnalyticsConnector
    @WorkerThread
    @KeepForSdk
    public int getMaxUserProperties(@NonNull @Size(min = 1L) String s) {
        return this.a.getMaxUserProperties(s);
    }

    @Override  // com.google.firebase.analytics.connector.AnalyticsConnector
    @NonNull
    @WorkerThread
    @KeepForSdk
    public Map getUserProperties(boolean z) {
        return this.a.getUserProperties(null, null, z);
    }

    @Override  // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void logEvent(@NonNull String s, @NonNull String s1, @NonNull Bundle bundle0) {
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        if(!zzc.zzl(s)) {
            return;
        }
        if(!zzc.zzj(s1, bundle0)) {
            return;
        }
        if(!zzc.zzh(s, s1, bundle0)) {
            return;
        }
        zzc.zze(s, s1, bundle0);
        this.a.logEvent(s, s1, bundle0);
    }

    @Override  // com.google.firebase.analytics.connector.AnalyticsConnector
    @NonNull
    @WorkerThread
    @KeepForSdk
    public AnalyticsConnectorHandle registerAnalyticsConnectorListener(@NonNull String s, @NonNull AnalyticsConnectorListener analyticsConnector$AnalyticsConnectorListener0) {
        zze zze0;
        Preconditions.checkNotNull(analyticsConnector$AnalyticsConnectorListener0);
        if(!zzc.zzl(s)) {
            return null;
        }
        if(this.a(s)) {
            return null;
        }
        AppMeasurementSdk appMeasurementSdk0 = this.a;
        if("fiam".equals(s)) {
            zze0 = new zze(appMeasurementSdk0, analyticsConnector$AnalyticsConnectorListener0);
        }
        else if("clx".equals(s)) {
            zze0 = new zzg(appMeasurementSdk0, analyticsConnector$AnalyticsConnectorListener0);
        }
        else {
            zze0 = null;
        }
        if(zze0 != null) {
            this.b.put(s, zze0);
            return new a(this, s);
        }
        return null;
    }

    @Override  // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void setConditionalUserProperty(@NonNull ConditionalUserProperty analyticsConnector$ConditionalUserProperty0) {
        if(!zzc.zzi(analyticsConnector$ConditionalUserProperty0)) {
            return;
        }
        Bundle bundle0 = zzc.zza(analyticsConnector$ConditionalUserProperty0);
        this.a.setConditionalUserProperty(bundle0);
    }

    @Override  // com.google.firebase.analytics.connector.AnalyticsConnector
    @KeepForSdk
    public void setUserProperty(@NonNull String s, @NonNull String s1, @NonNull Object object0) {
        if(!zzc.zzl(s)) {
            return;
        }
        if(!zzc.zzm(s, s1)) {
            return;
        }
        this.a.setUserProperty(s, s1, object0);
    }
}

