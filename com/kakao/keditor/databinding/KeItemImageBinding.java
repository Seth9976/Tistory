package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.event.EventFlow;
import com.kakao.keditor.plugin.pluginspec.image.ImageItem;

public abstract class KeItemImageBinding extends ViewDataBinding {
    @NonNull
    public final ImageView keItemImage;
    @NonNull
    public final EditText keItemImageCaptionEditText;
    @NonNull
    public final ImageView keItemImageGifBadge;
    @NonNull
    public final FrameLayout keItemImageLayout;
    @NonNull
    public final LinearLayout keItemImageLayoutWrapper;
    @NonNull
    public final View keItemImageLoadingLayout;
    @NonNull
    public final ImageView keItemImageRepresentImageBtn;
    @NonNull
    public final FrameLayout keItemImageWrapper;
    @Bindable
    protected EventFlow mFlow;
    @Bindable
    protected boolean mHasFocus;
    @Bindable
    protected ImageItem mImageItem;
    @Bindable
    protected int mPosition;
    @Bindable
    protected boolean mRepresentativeImageEnable;
    @Bindable
    protected boolean mTooSmallToShow;

    public KeItemImageBinding(Object object0, View view0, int v, ImageView imageView0, EditText editText0, ImageView imageView1, FrameLayout frameLayout0, LinearLayout linearLayout0, View view1, ImageView imageView2, FrameLayout frameLayout1) {
        super(object0, view0, v);
        this.keItemImage = imageView0;
        this.keItemImageCaptionEditText = editText0;
        this.keItemImageGifBadge = imageView1;
        this.keItemImageLayout = frameLayout0;
        this.keItemImageLayoutWrapper = linearLayout0;
        this.keItemImageLoadingLayout = view1;
        this.keItemImageRepresentImageBtn = imageView2;
        this.keItemImageWrapper = frameLayout1;
    }

    public static KeItemImageBinding bind(@NonNull View view0) {
        return KeItemImageBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemImageBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemImageBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_image);
    }

    @Nullable
    public EventFlow getFlow() {
        return this.mFlow;
    }

    public boolean getHasFocus() {
        return this.mHasFocus;
    }

    @Nullable
    public ImageItem getImageItem() {
        return this.mImageItem;
    }

    public int getPosition() {
        return this.mPosition;
    }

    public boolean getRepresentativeImageEnable() {
        return this.mRepresentativeImageEnable;
    }

    public boolean getTooSmallToShow() {
        return this.mTooSmallToShow;
    }

    @NonNull
    public static KeItemImageBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemImageBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemImageBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemImageBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemImageBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemImageBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_image, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemImageBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemImageBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_image, null, false, object0);
    }

    public abstract void setFlow(@Nullable EventFlow arg1);

    public abstract void setHasFocus(boolean arg1);

    public abstract void setImageItem(@Nullable ImageItem arg1);

    public abstract void setPosition(int arg1);

    public abstract void setRepresentativeImageEnable(boolean arg1);

    public abstract void setTooSmallToShow(boolean arg1);
}

