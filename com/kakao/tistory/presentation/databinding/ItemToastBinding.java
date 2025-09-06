package com.kakao.tistory.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.presentation.R.layout;

public abstract class ItemToastBinding extends ViewDataBinding {
    @NonNull
    public final TextView toastTitleText;

    public ItemToastBinding(Object object0, View view0, int v, TextView textView0) {
        super(object0, view0, v);
        this.toastTitleText = textView0;
    }

    public static ItemToastBinding bind(@NonNull View view0) {
        return ItemToastBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemToastBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (ItemToastBinding)ViewDataBinding.bind(object0, view0, layout.item_toast);
    }

    @NonNull
    public static ItemToastBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return ItemToastBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemToastBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return ItemToastBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemToastBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (ItemToastBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.item_toast, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static ItemToastBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (ItemToastBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.item_toast, null, false, object0);
    }
}

