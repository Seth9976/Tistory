package com.google.firebase.analytics.ktx;

import com.google.firebase.analytics.FirebaseAnalytics.ConsentStatus;
import com.google.firebase.analytics.FirebaseAnalytics.ConsentType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u00040\rR\u001C\u0010\u0003\u001A\u0004\u0018\u00010\u0004X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001C\u0010\t\u001A\u0004\u0018\u00010\u0004X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\n\u0010\u0006\"\u0004\b\u000B\u0010\b¨\u0006\u000F"}, d2 = {"Lcom/google/firebase/analytics/ktx/ConsentBuilder;", "", "()V", "adStorage", "Lcom/google/firebase/analytics/FirebaseAnalytics$ConsentStatus;", "getAdStorage", "()Lcom/google/firebase/analytics/FirebaseAnalytics$ConsentStatus;", "setAdStorage", "(Lcom/google/firebase/analytics/FirebaseAnalytics$ConsentStatus;)V", "analyticsStorage", "getAnalyticsStorage", "setAnalyticsStorage", "asMap", "", "Lcom/google/firebase/analytics/FirebaseAnalytics$ConsentType;", "java.com.google.android.libraries.firebase.firebase_analytics_ktx_granule"}, k = 1, mv = {1, 7, 1}, xi = 0x30)
public final class ConsentBuilder {
    public ConsentStatus a;
    public ConsentStatus b;

    @NotNull
    public final Map asMap() {
        Map map0 = new LinkedHashMap();
        ConsentStatus firebaseAnalytics$ConsentStatus0 = this.a;
        if(firebaseAnalytics$ConsentStatus0 != null) {
            map0.put(ConsentType.AD_STORAGE, firebaseAnalytics$ConsentStatus0);
        }
        ConsentStatus firebaseAnalytics$ConsentStatus1 = this.b;
        if(firebaseAnalytics$ConsentStatus1 != null) {
            map0.put(ConsentType.ANALYTICS_STORAGE, firebaseAnalytics$ConsentStatus1);
        }
        return map0;
    }

    @Nullable
    public final ConsentStatus getAdStorage() {
        return this.a;
    }

    @Nullable
    public final ConsentStatus getAnalyticsStorage() {
        return this.b;
    }

    public final void setAdStorage(@Nullable ConsentStatus firebaseAnalytics$ConsentStatus0) {
        this.a = firebaseAnalytics$ConsentStatus0;
    }

    public final void setAnalyticsStorage(@Nullable ConsentStatus firebaseAnalytics$ConsentStatus0) {
        this.b = firebaseAnalytics$ConsentStatus0;
    }
}

