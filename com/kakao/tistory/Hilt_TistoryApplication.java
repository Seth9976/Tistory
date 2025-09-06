package com.kakao.tistory;

import android.app.Application;
import androidx.annotation.CallSuper;
import dagger.hilt.android.internal.managers.ApplicationComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

public abstract class Hilt_TistoryApplication extends Application implements GeneratedComponentManagerHolder {
    public boolean a;
    public final ApplicationComponentManager b;

    public Hilt_TistoryApplication() {
        this.a = false;
        this.b = new ApplicationComponentManager(new v(this));
    }

    public final ApplicationComponentManager componentManager() {
        return this.b;
    }

    @Override  // dagger.hilt.internal.GeneratedComponentManagerHolder
    public GeneratedComponentManager componentManager() {
        return this.componentManager();
    }

    @Override  // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return this.componentManager().generatedComponent();
    }

    public void hiltInternalInject() {
        if(!this.a) {
            this.a = true;
            ((TistoryApplication_GeneratedInjector)this.generatedComponent()).injectTistoryApplication(((TistoryApplication)this));
        }
    }

    @Override  // android.app.Application
    @CallSuper
    public void onCreate() {
        this.hiltInternalInject();
        super.onCreate();
    }
}

