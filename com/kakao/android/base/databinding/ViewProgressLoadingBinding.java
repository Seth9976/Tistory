package com.kakao.android.base.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kakao.android.base.R.id;
import com.kakao.android.base.R.layout;

public final class ViewProgressLoadingBinding implements ViewBinding {
    public final RelativeLayout a;
    @NonNull
    public final ProgressBar loadingPaogressBar;

    public ViewProgressLoadingBinding(RelativeLayout relativeLayout0, ProgressBar progressBar0) {
        this.a = relativeLayout0;
        this.loadingPaogressBar = progressBar0;
    }

    @NonNull
    public static ViewProgressLoadingBinding bind(@NonNull View view0) {
        int v = id.loading_paogress_bar;
        ProgressBar progressBar0 = (ProgressBar)ViewBindings.findChildViewById(view0, v);
        if(progressBar0 == null) {
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
        }
        return new ViewProgressLoadingBinding(((RelativeLayout)view0), progressBar0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.getRoot();
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }

    @NonNull
    public static ViewProgressLoadingBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return ViewProgressLoadingBinding.inflate(layoutInflater0, null, false);
    }

    @NonNull
    public static ViewProgressLoadingBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(layout.view_progress_loading, viewGroup0, false);
        if(z) {
            viewGroup0.addView(view0);
        }
        return ViewProgressLoadingBinding.bind(view0);
    }
}

