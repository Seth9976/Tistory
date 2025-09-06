package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuClickedListener;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuItem;

public abstract class KeToolbarOverlayItemBinding extends ViewDataBinding {
    @Bindable
    protected boolean mIsSelected;
    @Bindable
    protected ToolbarOverlayMenuItem mItem;
    @Bindable
    protected ToolbarOverlayMenuClickedListener mListener;

    public KeToolbarOverlayItemBinding(Object object0, View view0, int v) {
        super(object0, view0, v);
    }

    public static KeToolbarOverlayItemBinding bind(@NonNull View view0) {
        return KeToolbarOverlayItemBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeToolbarOverlayItemBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeToolbarOverlayItemBinding)ViewDataBinding.bind(object0, view0, layout.ke_toolbar_overlay_item);
    }

    public boolean getIsSelected() {
        return this.mIsSelected;
    }

    @Nullable
    public ToolbarOverlayMenuItem getItem() {
        return this.mItem;
    }

    @Nullable
    public ToolbarOverlayMenuClickedListener getListener() {
        return this.mListener;
    }

    @NonNull
    public static KeToolbarOverlayItemBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeToolbarOverlayItemBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeToolbarOverlayItemBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeToolbarOverlayItemBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeToolbarOverlayItemBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeToolbarOverlayItemBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_overlay_item, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeToolbarOverlayItemBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeToolbarOverlayItemBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_overlay_item, null, false, object0);
    }

    public abstract void setIsSelected(boolean arg1);

    public abstract void setItem(@Nullable ToolbarOverlayMenuItem arg1);

    public abstract void setListener(@Nullable ToolbarOverlayMenuClickedListener arg1);
}

