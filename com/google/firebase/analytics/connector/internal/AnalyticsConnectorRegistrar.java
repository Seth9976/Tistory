package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.AnalyticsConnectorImpl;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.events.Subscriber;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

@Keep
@KeepForSdk
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    @SuppressLint({"MissingPermission"})
    @Keep
    @NonNull
    @KeepForSdk
    public List getComponents() {
        return Arrays.asList(new Component[]{Component.builder(AnalyticsConnector.class).add(Dependency.required(FirebaseApp.class)).add(Dependency.required(Context.class)).add(Dependency.required(Subscriber.class)).factory(zzb.zza).eagerInDefaultApp().build(), LibraryVersionComponent.create("fire-analytics", "21.2.0")});
    }

    public static AnalyticsConnector lambda$getComponents$0(ComponentContainer componentContainer0) {
        return AnalyticsConnectorImpl.getInstance(((FirebaseApp)componentContainer0.get(FirebaseApp.class)), ((Context)componentContainer0.get(Context.class)), ((Subscriber)componentContainer0.get(Subscriber.class)));
    }
}

