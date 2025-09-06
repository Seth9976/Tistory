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
import com.kakao.keditor.event.EventFlow;

public abstract class KeItemImageGridSingleBinding extends ViewDataBinding {
    @NonNull
    public final View keItemBorder;
    @NonNull
    public final ImageView keItemImage;
    @NonNull
    public final ImageView keItemImageRepresentImageBtn;
    @Bindable
    protected EventFlow mFlow;
    @Bindable
    protected boolean mHasFocus;
    @Bindable
    protected boolean mIsEditable;
    @Bindable
    protected boolean mIsRepresent;
    @Bindable
    protected boolean mRepresentativeImageEnabled;

    public KeItemImageGridSingleBinding(Object object0, View view0, int v, View view1, ImageView imageView0, ImageView imageView1) {
        super(object0, view0, v);
        this.keItemBorder = view1;
        this.keItemImage = imageView0;
        this.keItemImageRepresentImageBtn = imageView1;
    }

    public static KeItemImageGridSingleBinding bind(@NonNull View view0) {
        return KeItemImageGridSingleBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemImageGridSingleBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemImageGridSingleBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_image_grid_single);
    }

    @Nullable
    public EventFlow getFlow() {
        return this.mFlow;
    }

    public boolean getHasFocus() {
        return this.mHasFocus;
    }

    public boolean getIsEditable() {
        return this.mIsEditable;
    }

    public boolean getIsRepresent() {
        return this.mIsRepresent;
    }

    public boolean getRepresentativeImageEnabled() {
        return this.mRepresentativeImageEnabled;
    }

    @NonNull
    public static KeItemImageGridSingleBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemImageGridSingleBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemImageGridSingleBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemImageGridSingleBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemImageGridSingleBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemImageGridSingleBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_image_grid_single, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemImageGridSingleBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemImageGridSingleBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_image_grid_single, null, false, object0);
    }

    public abstract void setFlow(@Nullable EventFlow arg1);

    public abstract void setHasFocus(boolean arg1);

    public abstract void setIsEditable(boolean arg1);

    public abstract void setIsRepresent(boolean arg1);

    public abstract void setRepresentativeImageEnabled(boolean arg1);
}

