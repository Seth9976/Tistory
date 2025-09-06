package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.f;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.Arrays;
import java.util.List;

@Keep
@KeepForSdk
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static FirebaseMessaging a(ComponentContainer componentContainer0) {
        return FirebaseMessagingRegistrar.lambda$getComponents$0(componentContainer0);
    }

    @Override  // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List getComponents() {
        return Arrays.asList(new Component[]{Component.builder(FirebaseMessaging.class).name("fire-fcm").add(Dependency.required(FirebaseApp.class)).add(Dependency.optional(FirebaseInstanceIdInternal.class)).add(Dependency.optionalProvider(UserAgentPublisher.class)).add(Dependency.optionalProvider(HeartBeatInfo.class)).add(Dependency.optional(TransportFactory.class)).add(Dependency.required(FirebaseInstallationsApi.class)).add(Dependency.required(Subscriber.class)).factory(new f(1)).alwaysEager().build(), LibraryVersionComponent.create("fire-fcm", "23.1.0")});
    }

    private static FirebaseMessaging lambda$getComponents$0(ComponentContainer componentContainer0) {
        return new FirebaseMessaging(((FirebaseApp)componentContainer0.get(FirebaseApp.class)), ((FirebaseInstanceIdInternal)componentContainer0.get(FirebaseInstanceIdInternal.class)), componentContainer0.getProvider(UserAgentPublisher.class), componentContainer0.getProvider(HeartBeatInfo.class), ((FirebaseInstallationsApi)componentContainer0.get(FirebaseInstallationsApi.class)), ((TransportFactory)componentContainer0.get(TransportFactory.class)), ((Subscriber)componentContainer0.get(Subscriber.class)));
    }
}

