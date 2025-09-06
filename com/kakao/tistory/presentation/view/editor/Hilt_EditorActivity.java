package com.kakao.tistory.presentation.view.editor;

import androidx.lifecycle.ViewModelProvider.Factory;
import com.kakao.tistory.presentation.view.common.base.TistoryActivity;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

public abstract class Hilt_EditorActivity extends TistoryActivity implements GeneratedComponentManagerHolder {
    public volatile ActivityComponentManager g;
    public final Object h;
    public boolean i;

    public Hilt_EditorActivity() {
        this.h = new Object();
        this.i = false;
        this.addOnContextAvailableListener(new g6(this));
    }

    public final ActivityComponentManager componentManager() {
        if(this.g == null) {
            Object object0 = this.h;
            synchronized(object0) {
                if(this.g == null) {
                    this.g = this.createComponentManager();
                }
            }
        }
        return this.g;
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
        if(!this.i) {
            this.i = true;
            ((EditorActivity_GeneratedInjector)this.generatedComponent()).injectEditorActivity(((EditorActivity)this));
        }
    }
}

