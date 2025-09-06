package com.kakao.android.base.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.android.base.R.layout;

public abstract class FragmentBaseBottomRecyclerDialogBinding extends ViewDataBinding {
    @NonNull
    public final RecyclerView bottomDialogRecyclerView;

    public FragmentBaseBottomRecyclerDialogBinding(Object object0, View view0, int v, RecyclerView recyclerView0) {
        super(object0, view0, v);
        this.bottomDialogRecyclerView = recyclerView0;
    }

    public static FragmentBaseBottomRecyclerDialogBinding bind(@NonNull View view0) {
        return FragmentBaseBottomRecyclerDialogBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentBaseBottomRecyclerDialogBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (FragmentBaseBottomRecyclerDialogBinding)ViewDataBinding.bind(object0, view0, layout.fragment_base_bottom_recycler_dialog);
    }

    @NonNull
    public static FragmentBaseBottomRecyclerDialogBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return FragmentBaseBottomRecyclerDialogBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentBaseBottomRecyclerDialogBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return FragmentBaseBottomRecyclerDialogBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentBaseBottomRecyclerDialogBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (FragmentBaseBottomRecyclerDialogBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.fragment_base_bottom_recycler_dialog, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static FragmentBaseBottomRecyclerDialogBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (FragmentBaseBottomRecyclerDialogBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.fragment_base_bottom_recycler_dialog, null, false, object0);
    }
}

