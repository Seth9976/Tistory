package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener;
import com.kakao.keditor.plugin.pluginspec.image.ImageItem;
import java.util.List;

public abstract class KeToolbarImageMenuBinding extends ViewDataBinding {
    @NonNull
    public final ImageView imageAlign;
    @NonNull
    public final ImageView keBtnDelete;
    @NonNull
    public final ImageView keBtnImageEdit;
    @NonNull
    public final ImageView keBtnImageFitContent;
    @NonNull
    public final ImageView keBtnImageMatchParent;
    @NonNull
    public final ImageView keBtnImageOriginCenter;
    @NonNull
    public final ImageView keBtnLink;
    @NonNull
    public final LinearLayout keMenuImageEditLayout;
    @Bindable
    protected boolean mDisplayMenu;
    @Bindable
    protected ImageItem mImageItem;
    @Bindable
    protected List mImageStyles;
    @Bindable
    protected boolean mIsEnableImageEdit;
    @Bindable
    protected MediaMenuClickListener mMediaMenuListener;

    public KeToolbarImageMenuBinding(Object object0, View view0, int v, ImageView imageView0, ImageView imageView1, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, LinearLayout linearLayout0) {
        super(object0, view0, v);
        this.imageAlign = imageView0;
        this.keBtnDelete = imageView1;
        this.keBtnImageEdit = imageView2;
        this.keBtnImageFitContent = imageView3;
        this.keBtnImageMatchParent = imageView4;
        this.keBtnImageOriginCenter = imageView5;
        this.keBtnLink = imageView6;
        this.keMenuImageEditLayout = linearLayout0;
    }

    public static KeToolbarImageMenuBinding bind(@NonNull View view0) {
        return KeToolbarImageMenuBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeToolbarImageMenuBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeToolbarImageMenuBinding)ViewDataBinding.bind(object0, view0, layout.ke_toolbar_image_menu);
    }

    public boolean getDisplayMenu() {
        return this.mDisplayMenu;
    }

    @Nullable
    public ImageItem getImageItem() {
        return this.mImageItem;
    }

    @Nullable
    public List getImageStyles() {
        return this.mImageStyles;
    }

    public boolean getIsEnableImageEdit() {
        return this.mIsEnableImageEdit;
    }

    @Nullable
    public MediaMenuClickListener getMediaMenuListener() {
        return this.mMediaMenuListener;
    }

    @NonNull
    public static KeToolbarImageMenuBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeToolbarImageMenuBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeToolbarImageMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeToolbarImageMenuBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeToolbarImageMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeToolbarImageMenuBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_image_menu, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeToolbarImageMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeToolbarImageMenuBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_image_menu, null, false, object0);
    }

    public abstract void setDisplayMenu(boolean arg1);

    public abstract void setImageItem(@Nullable ImageItem arg1);

    public abstract void setImageStyles(@Nullable List arg1);

    public abstract void setIsEnableImageEdit(boolean arg1);

    public abstract void setMediaMenuListener(@Nullable MediaMenuClickListener arg1);
}

