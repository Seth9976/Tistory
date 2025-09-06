package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;

public abstract class KeItemListBinding extends ViewDataBinding {
    @NonNull
    public final LinearLayout keListItems;

    public KeItemListBinding(Object object0, View view0, int v, LinearLayout linearLayout0) {
        super(object0, view0, v);
        this.keListItems = linearLayout0;
    }

    public static KeItemListBinding bind(@NonNull View view0) {
        return KeItemListBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemListBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemListBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_list);
    }

    @NonNull
    public static KeItemListBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemListBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemListBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemListBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemListBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemListBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_list, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemListBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemListBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_list, null, false, object0);
    }
}

