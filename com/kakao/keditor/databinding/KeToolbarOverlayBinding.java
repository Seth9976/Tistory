package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.keditor.R.layout;

public abstract class KeToolbarOverlayBinding extends ViewDataBinding {
    @NonNull
    public final FrameLayout flRoot;
    @NonNull
    public final RecyclerView list;

    public KeToolbarOverlayBinding(Object object0, View view0, int v, FrameLayout frameLayout0, RecyclerView recyclerView0) {
        super(object0, view0, v);
        this.flRoot = frameLayout0;
        this.list = recyclerView0;
    }

    public static KeToolbarOverlayBinding bind(@NonNull View view0) {
        return KeToolbarOverlayBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeToolbarOverlayBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeToolbarOverlayBinding)ViewDataBinding.bind(object0, view0, layout.ke_toolbar_overlay);
    }

    @NonNull
    public static KeToolbarOverlayBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeToolbarOverlayBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeToolbarOverlayBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeToolbarOverlayBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeToolbarOverlayBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeToolbarOverlayBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_overlay, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeToolbarOverlayBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeToolbarOverlayBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_overlay, null, false, object0);
    }
}

