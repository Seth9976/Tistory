package com.kakao.tistory.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.presentation.R.layout;

public abstract class ComposeContainerBinding extends ViewDataBinding {
    @NonNull
    public final ComposeView composeContainer;

    public ComposeContainerBinding(Object object0, View view0, int v, ComposeView composeView0) {
        super(object0, view0, v);
        this.composeContainer = composeView0;
    }

    public static ComposeContainerBinding bind(@NonNull View view0) {
        return ComposeContainerBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ComposeContainerBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (ComposeContainerBinding)ViewDataBinding.bind(object0, view0, layout.compose_container);
    }

    @NonNull
    public static ComposeContainerBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return ComposeContainerBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ComposeContainerBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return ComposeContainerBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ComposeContainerBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (ComposeContainerBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.compose_container, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static ComposeContainerBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (ComposeContainerBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.compose_container, null, false, object0);
    }
}

