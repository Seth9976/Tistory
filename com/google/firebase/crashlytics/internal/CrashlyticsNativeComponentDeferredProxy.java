package com.google.firebase.crashlytics.internal;

import androidx.annotation.NonNull;
import androidx.core.app.h;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import j7.d;
import java.util.concurrent.atomic.AtomicReference;
import p8.a;

public final class CrashlyticsNativeComponentDeferredProxy implements CrashlyticsNativeComponent {
    public final Deferred a;
    public final AtomicReference b;
    public static final d c;

    static {
        CrashlyticsNativeComponentDeferredProxy.c = new d(9);
    }

    public CrashlyticsNativeComponentDeferredProxy(Deferred deferred0) {
        this.b = new AtomicReference(null);
        this.a = deferred0;
        deferred0.whenAvailable(new h(this, 22));
    }

    @Override  // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    @NonNull
    public NativeSessionFileProvider getSessionFileProvider(@NonNull String s) {
        CrashlyticsNativeComponent crashlyticsNativeComponent0 = (CrashlyticsNativeComponent)this.b.get();
        return crashlyticsNativeComponent0 == null ? CrashlyticsNativeComponentDeferredProxy.c : crashlyticsNativeComponent0.getSessionFileProvider(s);
    }

    @Override  // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForCurrentSession() {
        CrashlyticsNativeComponent crashlyticsNativeComponent0 = (CrashlyticsNativeComponent)this.b.get();
        return crashlyticsNativeComponent0 != null && crashlyticsNativeComponent0.hasCrashDataForCurrentSession();
    }

    @Override  // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForSession(@NonNull String s) {
        CrashlyticsNativeComponent crashlyticsNativeComponent0 = (CrashlyticsNativeComponent)this.b.get();
        return crashlyticsNativeComponent0 != null && crashlyticsNativeComponent0.hasCrashDataForSession(s);
    }

    @Override  // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public void prepareNativeSession(@NonNull String s, @NonNull String s1, long v, @NonNull StaticSessionData staticSessionData0) {
        Logger.getLogger().v("Deferring native open session: " + s);
        a a0 = new a(s, s1, v, staticSessionData0);
        this.a.whenAvailable(a0);
    }
}

