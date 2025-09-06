package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridItem;
import com.kakao.keditor.plugin.pluginspec.imagegrid.layout.KeditorImageGridLayout;

public abstract class KeItemImageGridBinding extends ViewDataBinding {
    @NonNull
    public final KeditorImageGridLayout keImageGridLayout;
    @NonNull
    public final View keItemImageGridBorderView;
    @NonNull
    public final EditText keItemImageGridCaptionEditText;
    @NonNull
    public final FrameLayout keItemImageGridLayoutWrapper;
    @Bindable
    protected boolean mHasFocus;
    @Bindable
    protected ImageGridItem mImageGridItem;

    public KeItemImageGridBinding(Object object0, View view0, int v, KeditorImageGridLayout keditorImageGridLayout0, View view1, EditText editText0, FrameLayout frameLayout0) {
        super(object0, view0, v);
        this.keImageGridLayout = keditorImageGridLayout0;
        this.keItemImageGridBorderView = view1;
        this.keItemImageGridCaptionEditText = editText0;
        this.keItemImageGridLayoutWrapper = frameLayout0;
    }

    public static KeItemImageGridBinding bind(@NonNull View view0) {
        return KeItemImageGridBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemImageGridBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemImageGridBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_image_grid);
    }

    public boolean getHasFocus() {
        return this.mHasFocus;
    }

    @Nullable
    public ImageGridItem getImageGridItem() {
        return this.mImageGridItem;
    }

    @NonNull
    public static KeItemImageGridBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemImageGridBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemImageGridBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemImageGridBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemImageGridBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemImageGridBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_image_grid, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemImageGridBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemImageGridBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_image_grid, null, false, object0);
    }

    public abstract void setHasFocus(boolean arg1);

    public abstract void setImageGridItem(@Nullable ImageGridItem arg1);
}

