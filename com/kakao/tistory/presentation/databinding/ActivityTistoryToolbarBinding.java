package com.kakao.tistory.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.view.common.widget.TistoryToolbar;

public abstract class ActivityTistoryToolbarBinding extends ViewDataBinding {
    @NonNull
    public final ComposeView blogSwitchDialog;
    @NonNull
    public final TextView commonAppBarTitle;
    @NonNull
    public final ViewStubProxy commonBottomViewStub;
    @NonNull
    public final CoordinatorLayout commonContainer;
    @NonNull
    public final ViewStubProxy commonContentViewStub;
    @NonNull
    public final TistoryToolbar commonToolbar;

    public ActivityTistoryToolbarBinding(Object object0, View view0, int v, ComposeView composeView0, TextView textView0, ViewStubProxy viewStubProxy0, CoordinatorLayout coordinatorLayout0, ViewStubProxy viewStubProxy1, TistoryToolbar tistoryToolbar0) {
        super(object0, view0, v);
        this.blogSwitchDialog = composeView0;
        this.commonAppBarTitle = textView0;
        this.commonBottomViewStub = viewStubProxy0;
        this.commonContainer = coordinatorLayout0;
        this.commonContentViewStub = viewStubProxy1;
        this.commonToolbar = tistoryToolbar0;
    }

    public static ActivityTistoryToolbarBinding bind(@NonNull View view0) {
        return ActivityTistoryToolbarBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityTistoryToolbarBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (ActivityTistoryToolbarBinding)ViewDataBinding.bind(object0, view0, layout.activity_tistory_toolbar);
    }

    @NonNull
    public static ActivityTistoryToolbarBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return ActivityTistoryToolbarBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ActivityTistoryToolbarBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return ActivityTistoryToolbarBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityTistoryToolbarBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (ActivityTistoryToolbarBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.activity_tistory_toolbar, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static ActivityTistoryToolbarBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (ActivityTistoryToolbarBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.activity_tistory_toolbar, null, false, object0);
    }
}

