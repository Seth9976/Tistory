package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.itemspec.menulistener.SimpleDeleteMenuClickListener;

public abstract class KeToolbarSimpleDeletionMenuBinding extends ViewDataBinding {
    @NonNull
    public final ImageView keBtnDelete;
    @Bindable
    protected SimpleDeleteMenuClickListener mDeleteListener;
    @Bindable
    protected boolean mDisplayMenu;

    public KeToolbarSimpleDeletionMenuBinding(Object object0, View view0, int v, ImageView imageView0) {
        super(object0, view0, v);
        this.keBtnDelete = imageView0;
    }

    public static KeToolbarSimpleDeletionMenuBinding bind(@NonNull View view0) {
        return KeToolbarSimpleDeletionMenuBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeToolbarSimpleDeletionMenuBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeToolbarSimpleDeletionMenuBinding)ViewDataBinding.bind(object0, view0, layout.ke_toolbar_simple_deletion_menu);
    }

    @Nullable
    public SimpleDeleteMenuClickListener getDeleteListener() {
        return this.mDeleteListener;
    }

    public boolean getDisplayMenu() {
        return this.mDisplayMenu;
    }

    @NonNull
    public static KeToolbarSimpleDeletionMenuBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeToolbarSimpleDeletionMenuBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeToolbarSimpleDeletionMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeToolbarSimpleDeletionMenuBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeToolbarSimpleDeletionMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeToolbarSimpleDeletionMenuBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_simple_deletion_menu, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeToolbarSimpleDeletionMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeToolbarSimpleDeletionMenuBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_simple_deletion_menu, null, false, object0);
    }

    public abstract void setDeleteListener(@Nullable SimpleDeleteMenuClickListener arg1);

    public abstract void setDisplayMenu(boolean arg1);
}

