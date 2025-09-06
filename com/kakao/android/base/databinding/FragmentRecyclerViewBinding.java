package com.kakao.android.base.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.kakao.android.base.R.layout;

public abstract class FragmentRecyclerViewBinding extends ViewDataBinding {
    @NonNull
    public final RecyclerView recyclerView;
    @NonNull
    public final FrameLayout recyclerViewContainer;
    @NonNull
    public final SwipeRefreshLayout swipeRefreshLayout;

    public FragmentRecyclerViewBinding(Object object0, View view0, int v, RecyclerView recyclerView0, FrameLayout frameLayout0, SwipeRefreshLayout swipeRefreshLayout0) {
        super(object0, view0, v);
        this.recyclerView = recyclerView0;
        this.recyclerViewContainer = frameLayout0;
        this.swipeRefreshLayout = swipeRefreshLayout0;
    }

    public static FragmentRecyclerViewBinding bind(@NonNull View view0) {
        return FragmentRecyclerViewBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentRecyclerViewBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (FragmentRecyclerViewBinding)ViewDataBinding.bind(object0, view0, layout.fragment_recycler_view);
    }

    @NonNull
    public static FragmentRecyclerViewBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return FragmentRecyclerViewBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentRecyclerViewBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return FragmentRecyclerViewBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentRecyclerViewBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (FragmentRecyclerViewBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.fragment_recycler_view, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static FragmentRecyclerViewBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (FragmentRecyclerViewBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.fragment_recycler_view, null, false, object0);
    }
}

