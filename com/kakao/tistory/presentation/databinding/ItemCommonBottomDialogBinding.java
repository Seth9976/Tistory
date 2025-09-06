package com.kakao.tistory.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.domain.entity.SortItem;
import com.kakao.tistory.presentation.R.layout;

public abstract class ItemCommonBottomDialogBinding extends ViewDataBinding {
    @NonNull
    public final ImageView commonBottomDialogCheckButton;
    @NonNull
    public final TextView commonBottomDialogDescText;
    @NonNull
    public final TextView commonBottomDialogTitleText;
    @Bindable
    protected SortItem mSortItem;

    public ItemCommonBottomDialogBinding(Object object0, View view0, int v, ImageView imageView0, TextView textView0, TextView textView1) {
        super(object0, view0, v);
        this.commonBottomDialogCheckButton = imageView0;
        this.commonBottomDialogDescText = textView0;
        this.commonBottomDialogTitleText = textView1;
    }

    public static ItemCommonBottomDialogBinding bind(@NonNull View view0) {
        return ItemCommonBottomDialogBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemCommonBottomDialogBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (ItemCommonBottomDialogBinding)ViewDataBinding.bind(object0, view0, layout.item_common_bottom_dialog);
    }

    @Nullable
    public SortItem getSortItem() {
        return this.mSortItem;
    }

    @NonNull
    public static ItemCommonBottomDialogBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return ItemCommonBottomDialogBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemCommonBottomDialogBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return ItemCommonBottomDialogBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemCommonBottomDialogBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (ItemCommonBottomDialogBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.item_common_bottom_dialog, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static ItemCommonBottomDialogBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (ItemCommonBottomDialogBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.item_common_bottom_dialog, null, false, object0);
    }

    public abstract void setSortItem(@Nullable SortItem arg1);
}

