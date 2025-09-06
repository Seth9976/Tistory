package com.kakao.tistory.presentation.view.statistics;

import androidx.lifecycle.ViewModelProvider.Factory;
import com.kakao.tistory.presentation.view.common.base.TistoryToolbarActivity;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

public abstract class Hilt_RefererEtcListActivity extends TistoryToolbarActivity implements GeneratedComponentManagerHolder {
    public volatile ActivityComponentManager o;
    public final Object p;
    public boolean q;

    public Hilt_RefererEtcListActivity() {
        this.p = new Object();
        this.q = false;
        this.addOnContextAvailableListener(new a(this));
    }

    public final ActivityComponentManager componentManager() {
        if(this.o == null) {
            Object object0 = this.p;
            synchronized(object0) {
                if(this.o == null) {
                    this.o = this.createComponentManager();
                }
            }
        }
        return this.o;
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
        if(!this.q) {
            this.q = true;
            ((RefererEtcListActivity_GeneratedInjector)this.generatedComponent()).injectRefererEtcListActivity(((RefererEtcListActivity)this));
        }
    }
}

