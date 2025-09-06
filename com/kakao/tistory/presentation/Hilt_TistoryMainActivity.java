package com.kakao.tistory.presentation;

import androidx.lifecycle.ViewModelProvider.Factory;
import com.kakao.tistory.presentation.view.common.base.TistoryAppCompatActivity;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

public abstract class Hilt_TistoryMainActivity extends TistoryAppCompatActivity implements GeneratedComponentManagerHolder {
    public volatile ActivityComponentManager d;
    public final Object e;
    public boolean f;

    public Hilt_TistoryMainActivity() {
        this.e = new Object();
        this.f = false;
        this.addOnContextAvailableListener(new h(this));
    }

    public final ActivityComponentManager componentManager() {
        if(this.d == null) {
            Object object0 = this.e;
            synchronized(object0) {
                if(this.d == null) {
                    this.d = this.createComponentManager();
                }
            }
        }
        return this.d;
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
        if(!this.f) {
            this.f = true;
            ((TistoryMainActivity_GeneratedInjector)this.generatedComponent()).injectTistoryMainActivity(((TistoryMainActivity)this));
        }
    }
}

