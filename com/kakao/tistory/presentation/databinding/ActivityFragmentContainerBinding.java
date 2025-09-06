package com.kakao.tistory.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.presentation.R.layout;

public abstract class ActivityFragmentContainerBinding extends ViewDataBinding {
    @NonNull
    public final FrameLayout fragmentContainer;

    public ActivityFragmentContainerBinding(Object object0, View view0, int v, FrameLayout frameLayout0) {
        super(object0, view0, v);
        this.fragmentContainer = frameLayout0;
    }

    public static ActivityFragmentContainerBinding bind(@NonNull View view0) {
        return ActivityFragmentContainerBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityFragmentContainerBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (ActivityFragmentContainerBinding)ViewDataBinding.bind(object0, view0, layout.activity_fragment_container);
    }

    @NonNull
    public static ActivityFragmentContainerBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return ActivityFragmentContainerBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ActivityFragmentContainerBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return ActivityFragmentContainerBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityFragmentContainerBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (ActivityFragmentContainerBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.activity_fragment_container, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static ActivityFragmentContainerBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (ActivityFragmentContainerBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.activity_fragment_container, null, false, object0);
    }
}

