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
import com.kakao.keditor.plugin.attrs.text.ColorType;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuClickedListener;

public abstract class KeToolbarColorItemBinding extends ViewDataBinding {
    @NonNull
    public final ImageView itemCheck;
    @Bindable
    protected boolean mIsSelected;
    @Bindable
    protected ColorType mItem;
    @Bindable
    protected ToolbarOverlayMenuClickedListener mListener;
    @NonNull
    public final ImageView selectorImage;

    public KeToolbarColorItemBinding(Object object0, View view0, int v, ImageView imageView0, ImageView imageView1) {
        super(object0, view0, v);
        this.itemCheck = imageView0;
        this.selectorImage = imageView1;
    }

    public static KeToolbarColorItemBinding bind(@NonNull View view0) {
        return KeToolbarColorItemBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeToolbarColorItemBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeToolbarColorItemBinding)ViewDataBinding.bind(object0, view0, layout.ke_toolbar_color_item);
    }

    public boolean getIsSelected() {
        return this.mIsSelected;
    }

    @Nullable
    public ColorType getItem() {
        return this.mItem;
    }

    @Nullable
    public ToolbarOverlayMenuClickedListener getListener() {
        return this.mListener;
    }

    @NonNull
    public static KeToolbarColorItemBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeToolbarColorItemBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeToolbarColorItemBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeToolbarColorItemBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeToolbarColorItemBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeToolbarColorItemBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_color_item, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeToolbarColorItemBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeToolbarColorItemBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_color_item, null, false, object0);
    }

    public abstract void setIsSelected(boolean arg1);

    public abstract void setItem(@Nullable ColorType arg1);

    public abstract void setListener(@Nullable ToolbarOverlayMenuClickedListener arg1);
}

