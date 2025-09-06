package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.pluginspec.contentsearch.webview.ContentSearchWebView;

public abstract class KeActivityContentSearchBinding extends ViewDataBinding {
    @NonNull
    public final ContentSearchWebView keContentSearchWebView;
    @NonNull
    public final View keContentSearchWebViewLoadingView;
    @NonNull
    public final FrameLayout keContentSearchWebViewWrapper;

    public KeActivityContentSearchBinding(Object object0, View view0, int v, ContentSearchWebView contentSearchWebView0, View view1, FrameLayout frameLayout0) {
        super(object0, view0, v);
        this.keContentSearchWebView = contentSearchWebView0;
        this.keContentSearchWebViewLoadingView = view1;
        this.keContentSearchWebViewWrapper = frameLayout0;
    }

    public static KeActivityContentSearchBinding bind(@NonNull View view0) {
        return KeActivityContentSearchBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeActivityContentSearchBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeActivityContentSearchBinding)ViewDataBinding.bind(object0, view0, layout.ke_activity_content_search);
    }

    @NonNull
    public static KeActivityContentSearchBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeActivityContentSearchBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeActivityContentSearchBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeActivityContentSearchBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeActivityContentSearchBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeActivityContentSearchBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_activity_content_search, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeActivityContentSearchBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeActivityContentSearchBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_activity_content_search, null, false, object0);
    }
}

