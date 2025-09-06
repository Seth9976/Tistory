package com.kakao.tistory.presentation.view.accountMigration;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModelProvider.Factory;
import com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;

public abstract class Hilt_MigrationFragment extends TistoryComposeFragment implements GeneratedComponentManagerHolder {
    public ContextWrapper f;
    public boolean g;
    public volatile FragmentComponentManager h;
    public final Object i;
    public boolean j;

    public Hilt_MigrationFragment() {
        this.i = new Object();
        this.j = false;
    }

    public final FragmentComponentManager componentManager() {
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

    public FragmentComponentManager createComponentManager() {
        return new FragmentComponentManager(this);
    }

    @Override  // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return this.componentManager().generatedComponent();
    }

    @Override  // androidx.fragment.app.Fragment
    public Context getContext() {
        if(super.getContext() == null && !this.g) {
            return null;
        }
        if(this.f == null) {
            this.f = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.g = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
        return this.f;
    }

    @Override  // androidx.fragment.app.Fragment
    public Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if(!this.j) {
            this.j = true;
            ((MigrationFragment_GeneratedInjector)this.generatedComponent()).injectMigrationFragment(((MigrationFragment)this));
        }
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    @MainThread
    public void onAttach(Activity activity0) {
        super.onAttach(activity0);
        Preconditions.checkState(this.f == null || FragmentComponentManager.findActivity(this.f) == activity0, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        if(this.f == null) {
            this.f = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.g = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
        this.inject();
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    public void onAttach(Context context0) {
        super.onAttach(context0);
        if(this.f == null) {
            this.f = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.g = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
        this.inject();
    }

    @Override  // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle0) {
        LayoutInflater layoutInflater0 = super.onGetLayoutInflater(bundle0);
        return layoutInflater0.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflater0, this));
    }
}

