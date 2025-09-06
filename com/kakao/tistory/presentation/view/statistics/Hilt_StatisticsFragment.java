package com.kakao.tistory.presentation.view.statistics;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModelProvider.Factory;
import com.kakao.tistory.presentation.view.common.base.TistoryRecyclerFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;

public abstract class Hilt_StatisticsFragment extends TistoryRecyclerFragment implements GeneratedComponentManagerHolder {
    public ContextWrapper d;
    public boolean e;
    public volatile FragmentComponentManager f;
    public final Object g;
    public boolean h;

    public Hilt_StatisticsFragment() {
        this.g = new Object();
        this.h = false;
    }

    public final FragmentComponentManager componentManager() {
        if(this.f == null) {
            Object object0 = this.g;
            synchronized(object0) {
                if(this.f == null) {
                    this.f = this.createComponentManager();
                }
            }
        }
        return this.f;
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
        if(super.getContext() == null && !this.e) {
            return null;
        }
        if(this.d == null) {
            this.d = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.e = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
        return this.d;
    }

    @Override  // androidx.fragment.app.Fragment
    public Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if(!this.h) {
            this.h = true;
            ((StatisticsFragment_GeneratedInjector)this.generatedComponent()).injectStatisticsFragment(((StatisticsFragment)this));
        }
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    @MainThread
    public void onAttach(Activity activity0) {
        super.onAttach(activity0);
        Preconditions.checkState(this.d == null || FragmentComponentManager.findActivity(this.d) == activity0, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        if(this.d == null) {
            this.d = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.e = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
        this.inject();
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    public void onAttach(Context context0) {
        super.onAttach(context0);
        if(this.d == null) {
            this.d = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.e = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
        this.inject();
    }

    @Override  // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle0) {
        LayoutInflater layoutInflater0 = super.onGetLayoutInflater(bundle0);
        return layoutInflater0.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflater0, this));
    }
}

