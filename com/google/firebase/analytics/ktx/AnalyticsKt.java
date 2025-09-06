package com.google.firebase.analytics.ktx;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.ktx.FirebaseKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A3\u0010\u0010\u001A\u00020\u0011*\u00020\u00012\u0006\u0010\u0012\u001A\u00020\u00072\u0019\b\u0004\u0010\u0013\u001A\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00110\u0014¢\u0006\u0002\b\u0016H\u0086\bø\u0001\u0000\u001A+\u0010\u0017\u001A\u00020\u0011*\u00020\u00012\u0019\b\u0004\u0010\u0013\u001A\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00110\u0014¢\u0006\u0002\b\u0016H\u0086\bø\u0001\u0000\"\u001C\u0010\u0000\u001A\u0004\u0018\u00010\u0001X\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\"\u000E\u0010\u0006\u001A\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u0014\u0010\b\u001A\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000B\"\u0015\u0010\f\u001A\u00020\u0001*\u00020\r8F¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000F\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"ANALYTICS", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "getANALYTICS", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "setANALYTICS", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "LIBRARY_NAME", "", "LOCK", "", "getLOCK", "()Ljava/lang/Object;", "analytics", "Lcom/google/firebase/ktx/Firebase;", "getAnalytics", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/analytics/FirebaseAnalytics;", "logEvent", "", "name", "block", "Lkotlin/Function1;", "Lcom/google/firebase/analytics/ktx/ParametersBuilder;", "Lkotlin/ExtensionFunctionType;", "setConsent", "Lcom/google/firebase/analytics/ktx/ConsentBuilder;", "java.com.google.android.libraries.firebase.firebase_analytics_ktx_granule"}, k = 2, mv = {1, 7, 1}, xi = 0x30)
public final class AnalyticsKt {
    @NotNull
    public static final String LIBRARY_NAME = "fire-analytics-ktx";
    public static volatile FirebaseAnalytics a;
    public static final Object b;

    static {
        AnalyticsKt.b = new Object();
    }

    @Nullable
    public static final FirebaseAnalytics getANALYTICS() {
        return AnalyticsKt.a;
    }

    @NotNull
    public static final FirebaseAnalytics getAnalytics(@NotNull Firebase firebase0) {
        Intrinsics.checkNotNullParameter(firebase0, "<this>");
        if(AnalyticsKt.a == null) {
            synchronized(AnalyticsKt.b) {
                if(AnalyticsKt.a == null) {
                    AnalyticsKt.a = FirebaseAnalytics.getInstance(FirebaseKt.getApp(Firebase.INSTANCE).getApplicationContext());
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics0 = AnalyticsKt.a;
        Intrinsics.checkNotNull(firebaseAnalytics0);
        return firebaseAnalytics0;
    }

    @NotNull
    public static final Object getLOCK() {
        return AnalyticsKt.b;
    }

    public static final void logEvent(@NotNull FirebaseAnalytics firebaseAnalytics0, @NotNull String s, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(firebaseAnalytics0, "<this>");
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(function10, "block");
        ParametersBuilder parametersBuilder0 = new ParametersBuilder();
        function10.invoke(parametersBuilder0);
        firebaseAnalytics0.logEvent(s, parametersBuilder0.getBundle());
    }

    public static final void setANALYTICS(@Nullable FirebaseAnalytics firebaseAnalytics0) {
        AnalyticsKt.a = firebaseAnalytics0;
    }

    public static final void setConsent(@NotNull FirebaseAnalytics firebaseAnalytics0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(firebaseAnalytics0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "block");
        ConsentBuilder consentBuilder0 = new ConsentBuilder();
        function10.invoke(consentBuilder0);
        firebaseAnalytics0.setConsent(consentBuilder0.asMap());
    }
}

