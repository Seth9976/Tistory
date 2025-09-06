package com.kakao.tistory.presentation.view.comment.guestbook;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModelProvider.Factory;
import com.kakao.tistory.presentation.view.comment.CommentFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;

public abstract class Hilt_GuestbookFragment extends CommentFragment implements GeneratedComponentManagerHolder {
    public ContextWrapper i;
    public boolean j;
    public volatile FragmentComponentManager k;
    public final Object l;
    public boolean m;

    public Hilt_GuestbookFragment() {
        this.l = new Object();
        this.m = false;
    }

    public final FragmentComponentManager componentManager() {
        if(this.k == null) {
            Object object0 = this.l;
            synchronized(object0) {
                if(this.k == null) {
                    this.k = this.createComponentManager();
                }
            }
        }
        return this.k;
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
        if(super.getContext() == null && !this.j) {
            return null;
        }
        if(this.i == null) {
            this.i = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.j = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
        return this.i;
    }

    @Override  // androidx.fragment.app.Fragment
    public Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if(!this.m) {
            this.m = true;
            ((GuestbookFragment_GeneratedInjector)this.generatedComponent()).injectGuestbookFragment(((GuestbookFragment)this));
        }
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    @MainThread
    public void onAttach(Activity activity0) {
        super.onAttach(activity0);
        Preconditions.checkState(this.i == null || FragmentComponentManager.findActivity(this.i) == activity0, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        if(this.i == null) {
            this.i = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.j = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
        this.inject();
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    public void onAttach(Context context0) {
        super.onAttach(context0);
        if(this.i == null) {
            this.i = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.j = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
        this.inject();
    }

    @Override  // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle0) {
        LayoutInflater layoutInflater0 = super.onGetLayoutInflater(bundle0);
        return layoutInflater0.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflater0, this));
    }
}

