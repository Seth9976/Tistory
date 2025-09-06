package com.kakao.tistory.presentation.view.entry;

import androidx.lifecycle.ViewModelProvider.Factory;
import com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

public abstract class Hilt_EntryViewActivity extends TistoryToolbarComposeActivity implements GeneratedComponentManagerHolder {
    public volatile ActivityComponentManager p;
    public final Object q;
    public boolean r;

    public Hilt_EntryViewActivity() {
        this.q = new Object();
        this.r = false;
        this.addOnContextAvailableListener(new j1(this));
    }

    public final ActivityComponentManager componentManager() {
        if(this.p == null) {
            Object object0 = this.q;
            synchronized(object0) {
                if(this.p == null) {
                    this.p = this.createComponentManager();
                }
            }
        }
        return this.p;
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
        if(!this.r) {
            this.r = true;
            ((EntryViewActivity_GeneratedInjector)this.generatedComponent()).injectEntryViewActivity(((EntryViewActivity)this));
        }
    }
}

