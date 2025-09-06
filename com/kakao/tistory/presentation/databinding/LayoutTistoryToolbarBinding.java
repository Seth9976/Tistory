package com.kakao.tistory.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.viewmodel.TistoryToolbarViewModel;

public abstract class LayoutTistoryToolbarBinding extends ViewDataBinding {
    @NonNull
    public final ImageButton commonAppBarHomeAsUpButton;
    @NonNull
    public final ImageView commonAppBarLogoImage;
    @NonNull
    public final ComposeView commonAppBarUserImage;
    @NonNull
    public final ImageButton commonAppSearchButton;
    @NonNull
    public final ConstraintLayout commonToolbarMenuContainer;
    @NonNull
    public final ImageButton commonToolbarMenuImageButton;
    @NonNull
    public final TextView commonToolbarMenuText;
    @NonNull
    public final RelativeLayout commonToolbarSubContainer;
    @Bindable
    protected TistoryToolbarViewModel mViewModel;

    public LayoutTistoryToolbarBinding(Object object0, View view0, int v, ImageButton imageButton0, ImageView imageView0, ComposeView composeView0, ImageButton imageButton1, ConstraintLayout constraintLayout0, ImageButton imageButton2, TextView textView0, RelativeLayout relativeLayout0) {
        super(object0, view0, v);
        this.commonAppBarHomeAsUpButton = imageButton0;
        this.commonAppBarLogoImage = imageView0;
        this.commonAppBarUserImage = composeView0;
        this.commonAppSearchButton = imageButton1;
        this.commonToolbarMenuContainer = constraintLayout0;
        this.commonToolbarMenuImageButton = imageButton2;
        this.commonToolbarMenuText = textView0;
        this.commonToolbarSubContainer = relativeLayout0;
    }

    public static LayoutTistoryToolbarBinding bind(@NonNull View view0) {
        return LayoutTistoryToolbarBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutTistoryToolbarBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (LayoutTistoryToolbarBinding)ViewDataBinding.bind(object0, view0, layout.layout_tistory_toolbar);
    }

    @Nullable
    public TistoryToolbarViewModel getViewModel() {
        return this.mViewModel;
    }

    @NonNull
    public static LayoutTistoryToolbarBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return LayoutTistoryToolbarBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LayoutTistoryToolbarBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return LayoutTistoryToolbarBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static LayoutTistoryToolbarBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (LayoutTistoryToolbarBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.layout_tistory_toolbar, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static LayoutTistoryToolbarBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (LayoutTistoryToolbarBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.layout_tistory_toolbar, null, false, object0);
    }

    public abstract void setViewModel(@Nullable TistoryToolbarViewModel arg1);
}

