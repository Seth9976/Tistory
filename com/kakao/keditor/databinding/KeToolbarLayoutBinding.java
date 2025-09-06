package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.toolbar.category.OverlayCategory;
import com.kakao.keditor.toolbar.category.ToolbarCategory;

public abstract class KeToolbarLayoutBinding extends ViewDataBinding {
    @NonNull
    public final ImageView keBtnExtra;
    @NonNull
    public final LinearLayout keMenuContainer;
    @NonNull
    public final ImageView keMenuMore;
    @NonNull
    public final FrameLayout keMenuRoot;
    @Bindable
    protected ToolbarCategory mActiveCategory;
    @Bindable
    protected OverlayCategory mActiveOverlayCategory;
    @Bindable
    protected int mExtraButtonContentDescriptionSrc;
    @Bindable
    protected int mExtraButtonSrc;
    @Bindable
    protected boolean mIsEnableExtra;
    @NonNull
    public final FrameLayout overlay;

    public KeToolbarLayoutBinding(Object object0, View view0, int v, ImageView imageView0, LinearLayout linearLayout0, ImageView imageView1, FrameLayout frameLayout0, FrameLayout frameLayout1) {
        super(object0, view0, v);
        this.keBtnExtra = imageView0;
        this.keMenuContainer = linearLayout0;
        this.keMenuMore = imageView1;
        this.keMenuRoot = frameLayout0;
        this.overlay = frameLayout1;
    }

    public static KeToolbarLayoutBinding bind(@NonNull View view0) {
        return KeToolbarLayoutBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeToolbarLayoutBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeToolbarLayoutBinding)ViewDataBinding.bind(object0, view0, layout.ke_toolbar_layout);
    }

    @Nullable
    public ToolbarCategory getActiveCategory() {
        return this.mActiveCategory;
    }

    @Nullable
    public OverlayCategory getActiveOverlayCategory() {
        return this.mActiveOverlayCategory;
    }

    public int getExtraButtonContentDescriptionSrc() {
        return this.mExtraButtonContentDescriptionSrc;
    }

    public int getExtraButtonSrc() {
        return this.mExtraButtonSrc;
    }

    public boolean getIsEnableExtra() {
        return this.mIsEnableExtra;
    }

    @NonNull
    public static KeToolbarLayoutBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeToolbarLayoutBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeToolbarLayoutBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeToolbarLayoutBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeToolbarLayoutBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeToolbarLayoutBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_layout, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeToolbarLayoutBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeToolbarLayoutBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_layout, null, false, object0);
    }

    public abstract void setActiveCategory(@Nullable ToolbarCategory arg1);

    public abstract void setActiveOverlayCategory(@Nullable OverlayCategory arg1);

    public abstract void setExtraButtonContentDescriptionSrc(int arg1);

    public abstract void setExtraButtonSrc(int arg1);

    public abstract void setIsEnableExtra(boolean arg1);
}

