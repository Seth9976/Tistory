package com.kakao.tistory.presentation.view.bottomsheet;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModelProvider.Factory;
import com.kakao.android.base.ui.bottomsheet.BaseBottomSheetDialogFragment;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;

public abstract class Hilt_DaumCategoryDialogFragment extends BaseBottomSheetDialogFragment implements GeneratedComponentManagerHolder {
    public ContextWrapper a;
    public boolean b;
    public volatile FragmentComponentManager c;
    public final Object d;
    public boolean e;

    public Hilt_DaumCategoryDialogFragment() {
        this.d = new Object();
        this.e = false;
    }

    public final FragmentComponentManager componentManager() {
        if(this.c == null) {
            Object object0 = this.d;
            synchronized(object0) {
                if(this.c == null) {
                    this.c = this.createComponentManager();
                }
            }
        }
        return this.c;
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
        if(super.getContext() == null && !this.b) {
            return null;
        }
        if(this.a == null) {
            this.a = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.b = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
        return this.a;
    }

    @Override  // androidx.fragment.app.Fragment
    public Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if(!this.e) {
            this.e = true;
            ((DaumCategoryDialogFragment_GeneratedInjector)this.generatedComponent()).injectDaumCategoryDialogFragment(((DaumCategoryDialogFragment)this));
        }
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    @MainThread
    public void onAttach(Activity activity0) {
        super.onAttach(activity0);
        Preconditions.checkState(this.a == null || FragmentComponentManager.findActivity(this.a) == activity0, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        if(this.a == null) {
            this.a = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.b = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
        this.inject();
    }

    @Override  // androidx.fragment.app.DialogFragment
    @CallSuper
    public void onAttach(Context context0) {
        super.onAttach(context0);
        if(this.a == null) {
            this.a = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.b = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
        this.inject();
    }

    @Override  // androidx.fragment.app.DialogFragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle0) {
        LayoutInflater layoutInflater0 = super.onGetLayoutInflater(bundle0);
        return layoutInflater0.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflater0, this));
    }
}

