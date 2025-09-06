package com.kakao.tistory.presentation.view.editor;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModelProvider.Factory;
import com.kakao.tistory.presentation.view.common.base.TistoryFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;

public abstract class Hilt_EditorFragment extends TistoryFragment implements GeneratedComponentManagerHolder {
    public ContextWrapper b;
    public boolean c;
    public volatile FragmentComponentManager d;
    public final Object e;
    public boolean f;

    public Hilt_EditorFragment() {
        this.e = new Object();
        this.f = false;
    }

    public final FragmentComponentManager componentManager() {
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

    public FragmentComponentManager createComponentManager() {
        return new FragmentComponentManager(this);
    }

    @Override  // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return this.componentManager().generatedComponent();
    }

    @Override  // androidx.fragment.app.Fragment
    public Context getContext() {
        if(super.getContext() == null && !this.c) {
            return null;
        }
        if(this.b == null) {
            this.b = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.c = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
        return this.b;
    }

    @Override  // androidx.fragment.app.Fragment
    public Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if(!this.f) {
            this.f = true;
            ((EditorFragment_GeneratedInjector)this.generatedComponent()).injectEditorFragment(((EditorFragment)this));
        }
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    @MainThread
    public void onAttach(Activity activity0) {
        super.onAttach(activity0);
        Preconditions.checkState(this.b == null || FragmentComponentManager.findActivity(this.b) == activity0, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        if(this.b == null) {
            this.b = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.c = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
        this.inject();
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    public void onAttach(Context context0) {
        super.onAttach(context0);
        if(this.b == null) {
            this.b = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.c = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
        this.inject();
    }

    @Override  // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle0) {
        LayoutInflater layoutInflater0 = super.onGetLayoutInflater(bundle0);
        return layoutInflater0.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflater0, this));
    }
}

