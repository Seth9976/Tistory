package com.google.firebase.installations;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatConsumer;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.GlobalLibraryVersionRegistrar;
import com.google.firebase.platforminfo.UserAgentPublisher;
import y8.a;

public final class f implements ComponentFactory {
    public final int a;

    public f(int v) {
        this.a = v;
        super();
    }

    @Override  // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer0) {
        switch(this.a) {
            case 0: {
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(componentContainer0);
            }
            case 1: {
                return FirebaseMessagingRegistrar.a(componentContainer0);
            }
            case 2: {
                return TransportRegistrar.lambda$getComponents$0(componentContainer0);
            }
            case 3: {
                return new DefaultHeartBeatController(((Context)componentContainer0.get(Context.class)), ((FirebaseApp)componentContainer0.get(FirebaseApp.class)).getPersistenceKey(), componentContainer0.setOf(HeartBeatConsumer.class), componentContainer0.getProvider(UserAgentPublisher.class));
            }
            default: {
                return new DefaultUserAgentPublisher(componentContainer0.setOf(a.class), GlobalLibraryVersionRegistrar.getInstance());
            }
        }
    }
}

