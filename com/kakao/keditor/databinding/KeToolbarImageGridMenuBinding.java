package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridItem;
import com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener;

public abstract class KeToolbarImageGridMenuBinding extends ViewDataBinding {
    @NonNull
    public final ImageView keBtnDelete;
    @NonNull
    public final HorizontalScrollView keMenuHorizontalRuleScrollView;
    @NonNull
    public final ImageView keMenuImageGridOpenEditor;
    @Bindable
    protected boolean mDisplayMenu;
    @Bindable
    protected ImageGridItem mImageGrid;
    @Bindable
    protected MediaMenuClickListener mMediaMenuListener;

    public KeToolbarImageGridMenuBinding(Object object0, View view0, int v, ImageView imageView0, HorizontalScrollView horizontalScrollView0, ImageView imageView1) {
        super(object0, view0, v);
        this.keBtnDelete = imageView0;
        this.keMenuHorizontalRuleScrollView = horizontalScrollView0;
        this.keMenuImageGridOpenEditor = imageView1;
    }

    public static KeToolbarImageGridMenuBinding bind(@NonNull View view0) {
        return KeToolbarImageGridMenuBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeToolbarImageGridMenuBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeToolbarImageGridMenuBinding)ViewDataBinding.bind(object0, view0, layout.ke_toolbar_image_grid_menu);
    }

    public boolean getDisplayMenu() {
        return this.mDisplayMenu;
    }

    @Nullable
    public ImageGridItem getImageGrid() {
        return this.mImageGrid;
    }

    @Nullable
    public MediaMenuClickListener getMediaMenuListener() {
        return this.mMediaMenuListener;
    }

    @NonNull
    public static KeToolbarImageGridMenuBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeToolbarImageGridMenuBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeToolbarImageGridMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeToolbarImageGridMenuBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeToolbarImageGridMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeToolbarImageGridMenuBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_image_grid_menu, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeToolbarImageGridMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeToolbarImageGridMenuBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_image_grid_menu, null, false, object0);
    }

    public abstract void setDisplayMenu(boolean arg1);

    public abstract void setImageGrid(@Nullable ImageGridItem arg1);

    public abstract void setMediaMenuListener(@Nullable MediaMenuClickListener arg1);
}

