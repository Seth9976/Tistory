package com.kakao.tistory.presentation.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

public class ActivityFragmentContainerBindingImpl extends ActivityFragmentContainerBinding {
    public long a;

    public ActivityFragmentContainerBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        super(dataBindingComponent0, view0, 0, ((FrameLayout)ViewDataBinding.mapBindings(dataBindingComponent0, view0, 1, null, null)[0]));
        this.a = -1L;
        this.fragmentContainer.setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized(this) {
            this.a = 0L;
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized(this) {
            if(this.a != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized(this) {
            this.a = 1L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        return true;
    }
}

