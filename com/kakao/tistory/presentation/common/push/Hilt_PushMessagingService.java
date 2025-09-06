package com.kakao.tistory.presentation.common.push;

import androidx.annotation.CallSuper;
import com.google.firebase.messaging.FirebaseMessagingService;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

public abstract class Hilt_PushMessagingService extends FirebaseMessagingService implements GeneratedComponentManagerHolder {
    public volatile ServiceComponentManager a;
    public final Object b;
    public boolean c;

    public Hilt_PushMessagingService() {
        this.b = new Object();
        this.c = false;
    }

    public final ServiceComponentManager componentManager() {
        if(this.a == null) {
            Object object0 = this.b;
            synchronized(object0) {
                if(this.a == null) {
                    this.a = this.createComponentManager();
                }
            }
        }
        return this.a;
    }

    @Override  // dagger.hilt.internal.GeneratedComponentManagerHolder
    public GeneratedComponentManager componentManager() {
        return this.componentManager();
    }

    public ServiceComponentManager createComponentManager() {
        return new ServiceComponentManager(this);
    }

    @Override  // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return this.componentManager().generatedComponent();
    }

    public void inject() {
        if(!this.c) {
            this.c = true;
            ((PushMessagingService_GeneratedInjector)this.generatedComponent()).injectPushMessagingService(((PushMessagingService)this));
        }
    }

    @Override  // android.app.Service
    @CallSuper
    public void onCreate() {
        this.inject();
        super.onCreate();
    }
}

