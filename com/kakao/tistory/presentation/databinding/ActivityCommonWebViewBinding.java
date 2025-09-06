package com.kakao.tistory.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.view.webview.CommonWebView;
import com.kakao.tistory.presentation.viewmodel.CommonWebViewModel;

public abstract class ActivityCommonWebViewBinding extends ViewDataBinding {
    @NonNull
    public final CommonWebView commonWebView;
    @NonNull
    public final ConstraintLayout commonWebViewNavigationBar;
    @NonNull
    public final Toolbar commonWebViewToolbar;
    @NonNull
    public final ImageButton commonWebViewToolbarHomeAsUpButton;
    @Bindable
    protected CommonWebViewModel mViewModel;
    @NonNull
    public final ImageButton webViewNavigationBackButton;
    @NonNull
    public final FrameLayout webViewNavigationBackButtonContainer;
    @NonNull
    public final ImageButton webViewNavigationCloseButton;
    @NonNull
    public final FrameLayout webViewNavigationCloseButtonContainer;
    @NonNull
    public final ImageButton webViewNavigationForwardButton;
    @NonNull
    public final FrameLayout webViewNavigationForwardButtonContainer;
    @NonNull
    public final ImageButton webViewNavigationReloadButton;
    @NonNull
    public final FrameLayout webViewNavigationReloadButtonContainer;
    @NonNull
    public final ImageButton webViewNavigationShareButton;
    @NonNull
    public final FrameLayout webViewNavigationShareButtonContainer;

    public ActivityCommonWebViewBinding(Object object0, View view0, int v, CommonWebView commonWebView0, ConstraintLayout constraintLayout0, Toolbar toolbar0, ImageButton imageButton0, ImageButton imageButton1, FrameLayout frameLayout0, ImageButton imageButton2, FrameLayout frameLayout1, ImageButton imageButton3, FrameLayout frameLayout2, ImageButton imageButton4, FrameLayout frameLayout3, ImageButton imageButton5, FrameLayout frameLayout4) {
        super(object0, view0, v);
        this.commonWebView = commonWebView0;
        this.commonWebViewNavigationBar = constraintLayout0;
        this.commonWebViewToolbar = toolbar0;
        this.commonWebViewToolbarHomeAsUpButton = imageButton0;
        this.webViewNavigationBackButton = imageButton1;
        this.webViewNavigationBackButtonContainer = frameLayout0;
        this.webViewNavigationCloseButton = imageButton2;
        this.webViewNavigationCloseButtonContainer = frameLayout1;
        this.webViewNavigationForwardButton = imageButton3;
        this.webViewNavigationForwardButtonContainer = frameLayout2;
        this.webViewNavigationReloadButton = imageButton4;
        this.webViewNavigationReloadButtonContainer = frameLayout3;
        this.webViewNavigationShareButton = imageButton5;
        this.webViewNavigationShareButtonContainer = frameLayout4;
    }

    public static ActivityCommonWebViewBinding bind(@NonNull View view0) {
        return ActivityCommonWebViewBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityCommonWebViewBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (ActivityCommonWebViewBinding)ViewDataBinding.bind(object0, view0, layout.activity_common_web_view);
    }

    @Nullable
    public CommonWebViewModel getViewModel() {
        return this.mViewModel;
    }

    @NonNull
    public static ActivityCommonWebViewBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return ActivityCommonWebViewBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ActivityCommonWebViewBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return ActivityCommonWebViewBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityCommonWebViewBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (ActivityCommonWebViewBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.activity_common_web_view, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static ActivityCommonWebViewBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (ActivityCommonWebViewBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.activity_common_web_view, null, false, object0);
    }

    public abstract void setViewModel(@Nullable CommonWebViewModel arg1);
}

