package com.kakao.tistory.presentation.view.comment.entry;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.Preconditions;

public abstract class Hilt_PostPinCommentFragment extends PostCommentFragment {
    public ContextWrapper t;
    public boolean u;
    public boolean v;

    public Hilt_PostPinCommentFragment() {
        this.v = false;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.entry.Hilt_PostCommentFragment
    public Context getContext() {
        if(super.getContext() == null && !this.u) {
            return null;
        }
        if(this.t == null) {
            this.t = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.u = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
        return this.t;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.entry.Hilt_PostCommentFragment
    public void inject() {
        if(!this.v) {
            this.v = true;
            ((PostPinCommentFragment_GeneratedInjector)this.generatedComponent()).injectPostPinCommentFragment(((PostPinCommentFragment)this));
        }
    }

    @Override  // com.kakao.tistory.presentation.view.comment.entry.Hilt_PostCommentFragment
    @CallSuper
    @MainThread
    public void onAttach(Activity activity0) {
        super.onAttach(activity0);
        Preconditions.checkState(this.t == null || FragmentComponentManager.findActivity(this.t) == activity0, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        if(this.t == null) {
            this.t = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.u = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
        this.inject();
    }

    @Override  // com.kakao.tistory.presentation.view.comment.entry.Hilt_PostCommentFragment
    @CallSuper
    public void onAttach(Context context0) {
        super.onAttach(context0);
        if(this.t == null) {
            this.t = FragmentComponentManager.createContextWrapper(super.getContext(), this);
            this.u = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.getContext());
        }
        this.inject();
    }

    @Override  // com.kakao.tistory.presentation.view.comment.entry.Hilt_PostCommentFragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle0) {
        LayoutInflater layoutInflater0 = super.onGetLayoutInflater(bundle0);
        return layoutInflater0.cloneInContext(FragmentComponentManager.createContextWrapper(layoutInflater0, this));
    }
}

