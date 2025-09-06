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
import com.kakao.keditor.plugin.itemspec.menulistener.CodeMenuClickListener;
import com.kakao.keditor.plugin.itemspec.menulistener.SimpleAlignMenuClickListener;

public abstract class KeToolbarPollMenuBinding extends ViewDataBinding {
    @NonNull
    public final ImageView keBtnAlign;
    @NonNull
    public final ImageView keBtnDelete;
    @NonNull
    public final ImageView keBtnEditPoll;
    @Bindable
    protected SimpleAlignMenuClickListener mAlignMenuClickListener;
    @Bindable
    protected Alignment mAlignment;
    @Bindable
    protected CodeMenuClickListener mCodeMenuListener;
    @Bindable
    protected boolean mDisplayMenu;

    public KeToolbarPollMenuBinding(Object object0, View view0, int v, ImageView imageView0, ImageView imageView1, ImageView imageView2) {
        super(object0, view0, v);
        this.keBtnAlign = imageView0;
        this.keBtnDelete = imageView1;
        this.keBtnEditPoll = imageView2;
    }

    public static KeToolbarPollMenuBinding bind(@NonNull View view0) {
        return KeToolbarPollMenuBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeToolbarPollMenuBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeToolbarPollMenuBinding)ViewDataBinding.bind(object0, view0, layout.ke_toolbar_poll_menu);
    }

    @Nullable
    public SimpleAlignMenuClickListener getAlignMenuClickListener() {
        return this.mAlignMenuClickListener;
    }

    @Nullable
    public Alignment getAlignment() {
        return this.mAlignment;
    }

    @Nullable
    public CodeMenuClickListener getCodeMenuListener() {
        return this.mCodeMenuListener;
    }

    public boolean getDisplayMenu() {
        return this.mDisplayMenu;
    }

    @NonNull
    public static KeToolbarPollMenuBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeToolbarPollMenuBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeToolbarPollMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeToolbarPollMenuBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeToolbarPollMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeToolbarPollMenuBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_poll_menu, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeToolbarPollMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeToolbarPollMenuBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_poll_menu, null, false, object0);
    }

    public abstract void setAlignMenuClickListener(@Nullable SimpleAlignMenuClickListener arg1);

    public abstract void setAlignment(@Nullable Alignment arg1);

    public abstract void setCodeMenuListener(@Nullable CodeMenuClickListener arg1);

    public abstract void setDisplayMenu(boolean arg1);
}

