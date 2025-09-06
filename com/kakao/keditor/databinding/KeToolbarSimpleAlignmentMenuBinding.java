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
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.itemspec.menulistener.SimpleAlignMenuClickListener;

public abstract class KeToolbarSimpleAlignmentMenuBinding extends ViewDataBinding {
    @NonNull
    public final ImageView keBtnAlign;
    @NonNull
    public final ImageView keBtnDelete;
    @Bindable
    protected SimpleAlignMenuClickListener mAlignMenuClickListener;
    @Bindable
    protected Alignment mAlignment;
    @Bindable
    protected boolean mDisplayMenu;

    public KeToolbarSimpleAlignmentMenuBinding(Object object0, View view0, int v, ImageView imageView0, ImageView imageView1) {
        super(object0, view0, v);
        this.keBtnAlign = imageView0;
        this.keBtnDelete = imageView1;
    }

    public static KeToolbarSimpleAlignmentMenuBinding bind(@NonNull View view0) {
        return KeToolbarSimpleAlignmentMenuBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeToolbarSimpleAlignmentMenuBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeToolbarSimpleAlignmentMenuBinding)ViewDataBinding.bind(object0, view0, layout.ke_toolbar_simple_alignment_menu);
    }

    @Nullable
    public SimpleAlignMenuClickListener getAlignMenuClickListener() {
        return this.mAlignMenuClickListener;
    }

    @Nullable
    public Alignment getAlignment() {
        return this.mAlignment;
    }

    public boolean getDisplayMenu() {
        return this.mDisplayMenu;
    }

    @NonNull
    public static KeToolbarSimpleAlignmentMenuBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeToolbarSimpleAlignmentMenuBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeToolbarSimpleAlignmentMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeToolbarSimpleAlignmentMenuBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeToolbarSimpleAlignmentMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeToolbarSimpleAlignmentMenuBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_simple_alignment_menu, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeToolbarSimpleAlignmentMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeToolbarSimpleAlignmentMenuBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_simple_alignment_menu, null, false, object0);
    }

    public abstract void setAlignMenuClickListener(@Nullable SimpleAlignMenuClickListener arg1);

    public abstract void setAlignment(@Nullable Alignment arg1);

    public abstract void setDisplayMenu(boolean arg1);
}

