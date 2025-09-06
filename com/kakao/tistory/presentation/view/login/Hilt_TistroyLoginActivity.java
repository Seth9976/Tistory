package com.kakao.tistory.presentation.view.login;

import androidx.lifecycle.ViewModelProvider.Factory;
import com.kakao.tistory.presentation.view.common.base.TistoryComposeActivity;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

public abstract class Hilt_TistroyLoginActivity extends TistoryComposeActivity implements GeneratedComponentManagerHolder {
    public volatile ActivityComponentManager h;
    public final Object i;
    public boolean j;

    public Hilt_TistroyLoginActivity() {
        this.i = new Object();
        this.j = false;
        this.addOnContextAvailableListener(new d(this));
    }

    public final ActivityComponentManager componentManager() {
        if(this.h == null) {
            Object object0 = this.i;
            synchronized(object0) {
                if(this.h == null) {
                    this.h = this.createComponentManager();
                }
            }
        }
        return this.h;
    }

    @Override  // dagger.hilt.internal.GeneratedComponentManagerHolder
    public GeneratedComponentManager componentManager() {
        return this.componentManager();
    }

    public ActivityComponentManager createComponentManager() {
        return new ActivityComponentManager(this);
    }

    @Override  // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return this.componentManager().generatedComponent();
    }

    @Override  // androidx.activity.ComponentActivity
    public Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getActivityFactory(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if(!this.j) {
            this.j = true;
            ((TistroyLoginActivity_GeneratedInjector)this.generatedComponent()).injectTistroyLoginActivity(((TistroyLoginActivity)this));
        }
    }
}

