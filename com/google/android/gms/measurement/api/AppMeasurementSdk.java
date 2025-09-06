package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.internal.zzgr;
import com.google.android.gms.measurement.internal.zzgs;
import java.util.List;
import java.util.Map;

@KeepForSdk
@ShowFirstParty
public class AppMeasurementSdk {
    @KeepForSdk
    public static final class ConditionalUserProperty {
        @NonNull
        @KeepForSdk
        public static final String ACTIVE = "active";
        @NonNull
        @KeepForSdk
        public static final String CREATION_TIMESTAMP = "creation_timestamp";
        @NonNull
        @KeepForSdk
        public static final String EXPIRED_EVENT_NAME = "expired_event_name";
        @NonNull
        @KeepForSdk
        public static final String EXPIRED_EVENT_PARAMS = "expired_event_params";
        @NonNull
        @KeepForSdk
        public static final String NAME = "name";
        @NonNull
        @KeepForSdk
        public static final String ORIGIN = "origin";
        @NonNull
        @KeepForSdk
        public static final String TIMED_OUT_EVENT_NAME = "timed_out_event_name";
        @NonNull
        @KeepForSdk
        public static final String TIMED_OUT_EVENT_PARAMS = "timed_out_event_params";
        @NonNull
        @KeepForSdk
        public static final String TIME_TO_LIVE = "time_to_live";
        @NonNull
        @KeepForSdk
        public static final String TRIGGERED_EVENT_NAME = "triggered_event_name";
        @NonNull
        @KeepForSdk
        public static final String TRIGGERED_EVENT_PARAMS = "triggered_event_params";
        @NonNull
        @KeepForSdk
        public static final String TRIGGERED_TIMESTAMP = "triggered_timestamp";
        @NonNull
        @KeepForSdk
        public static final String TRIGGER_EVENT_NAME = "trigger_event_name";
        @NonNull
        @KeepForSdk
        public static final String TRIGGER_TIMEOUT = "trigger_timeout";
        @NonNull
        @KeepForSdk
        public static final String VALUE = "value";

    }

    @KeepForSdk
    @ShowFirstParty
    public interface EventInterceptor extends zzgr {
        @Override  // com.google.android.gms.measurement.internal.zzgr
        @WorkerThread
        @KeepForSdk
        @ShowFirstParty
        void interceptEvent(@NonNull String arg1, @NonNull String arg2, @NonNull Bundle arg3, long arg4);
    }

    @KeepForSdk
    @ShowFirstParty
    public interface OnEventListener extends zzgs {
        @Override  // com.google.android.gms.measurement.internal.zzgs
        @WorkerThread
        @KeepForSdk
        @ShowFirstParty
        void onEvent(@NonNull String arg1, @NonNull String arg2, @NonNull Bundle arg3, long arg4);
    }

    public final zzef a;

    public AppMeasurementSdk(zzef zzef0) {
        this.a = zzef0;
    }

    @KeepForSdk
    public void beginAdUnitExposure(@NonNull @Size(min = 1L) String s) {
        this.a.zzv(s);
    }

    @KeepForSdk
    public void clearConditionalUserProperty(@NonNull @Size(max = 24L, min = 1L) String s, @Nullable String s1, @Nullable Bundle bundle0) {
        this.a.zzw(s, s1, bundle0);
    }

    @KeepForSdk
    public void endAdUnitExposure(@NonNull @Size(min = 1L) String s) {
        this.a.zzx(s);
    }

    @KeepForSdk
    public long generateEventId() {
        return this.a.zzb();
    }

    @Nullable
    @KeepForSdk
    public String getAppIdOrigin() {
        return this.a.zzk();
    }

    @Nullable
    @KeepForSdk
    public String getAppInstanceId() {
        return this.a.zzm();
    }

    @NonNull
    @WorkerThread
    @KeepForSdk
    public List getConditionalUserProperties(@Nullable String s, @Nullable @Size(max = 23L, min = 1L) String s1) {
        return this.a.zzq(s, s1);
    }

    @Nullable
    @KeepForSdk
    public String getCurrentScreenClass() {
        return this.a.zzn();
    }

    @Nullable
    @KeepForSdk
    public String getCurrentScreenName() {
        return this.a.zzo();
    }

    @Nullable
    @KeepForSdk
    public String getGmpAppId() {
        return this.a.zzp();
    }

    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @KeepForSdk
    @ShowFirstParty
    public static AppMeasurementSdk getInstance(@NonNull Context context0) {
        return zzef.zzg(context0, null, null, null, null).zzd();
    }

    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @KeepForSdk
    public static AppMeasurementSdk getInstance(@NonNull Context context0, @NonNull String s, @NonNull String s1, @Nullable String s2, @NonNull Bundle bundle0) {
        return zzef.zzg(context0, s, s1, s2, bundle0).zzd();
    }

    @WorkerThread
    @KeepForSdk
    public int getMaxUserProperties(@NonNull @Size(min = 1L) String s) {
        return this.a.zza(s);
    }

    @NonNull
    @WorkerThread
    @KeepForSdk
    public Map getUserProperties(@Nullable String s, @Nullable @Size(max = 24L, min = 1L) String s1, boolean z) {
        return this.a.zzr(s, s1, z);
    }

    @KeepForSdk
    public void logEvent(@NonNull String s, @NonNull String s1, @NonNull Bundle bundle0) {
        this.a.zzz(s, s1, bundle0);
    }

    @KeepForSdk
    public void logEventNoInterceptor(@NonNull String s, @NonNull String s1, @NonNull Bundle bundle0, long v) {
        this.a.zzA(s, s1, bundle0, v);
    }

    @Nullable
    @KeepForSdk
    public void performAction(@NonNull Bundle bundle0) {
        this.a.zzc(bundle0, false);
    }

    @Nullable
    @KeepForSdk
    public Bundle performActionWithResponse(@NonNull Bundle bundle0) {
        return this.a.zzc(bundle0, true);
    }

    @KeepForSdk
    @ShowFirstParty
    public void registerOnMeasurementEventListener(@NonNull OnEventListener appMeasurementSdk$OnEventListener0) {
        this.a.zzC(appMeasurementSdk$OnEventListener0);
    }

    @KeepForSdk
    public void setConditionalUserProperty(@NonNull Bundle bundle0) {
        this.a.zzE(bundle0);
    }

    @KeepForSdk
    public void setConsent(@NonNull Bundle bundle0) {
        this.a.zzF(bundle0);
    }

    @KeepForSdk
    public void setCurrentScreen(@NonNull Activity activity0, @Nullable @Size(max = 36L, min = 1L) String s, @Nullable @Size(max = 36L, min = 1L) String s1) {
        this.a.zzH(activity0, s, s1);
    }

    @WorkerThread
    @KeepForSdk
    @ShowFirstParty
    public void setEventInterceptor(@NonNull EventInterceptor appMeasurementSdk$EventInterceptor0) {
        this.a.zzK(appMeasurementSdk$EventInterceptor0);
    }

    @KeepForSdk
    public void setMeasurementEnabled(@Nullable Boolean boolean0) {
        this.a.zzL(boolean0);
    }

    @KeepForSdk
    public void setMeasurementEnabled(boolean z) {
        this.a.zzL(Boolean.valueOf(z));
    }

    @KeepForSdk
    public void setUserProperty(@NonNull String s, @NonNull String s1, @NonNull Object object0) {
        this.a.zzO(s, s1, object0, true);
    }

    @KeepForSdk
    @ShowFirstParty
    public void unregisterOnMeasurementEventListener(@NonNull OnEventListener appMeasurementSdk$OnEventListener0) {
        this.a.zzP(appMeasurementSdk$OnEventListener0);
    }

    public final void zza(boolean z) {
        this.a.zzI(z);
    }
}

