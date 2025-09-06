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
import com.kakao.tistory.domain.entity.entry.DaumLikeViewItemModel.SelectNothingItem;
import com.kakao.tistory.presentation.R.layout;

public abstract class ItemDaumCategoryDialogSelectNothingBinding extends ViewDataBinding {
    @NonNull
    public final TextView daumCategoryDialogParentTitleText;
    @NonNull
    public final ImageView daumSwitchDialogCheckButton;
    @Bindable
    protected Boolean mIsSelected;
    @Bindable
    protected SelectNothingItem mSelectNoItem;

    public ItemDaumCategoryDialogSelectNothingBinding(Object object0, View view0, int v, TextView textView0, ImageView imageView0) {
        super(object0, view0, v);
        this.daumCategoryDialogParentTitleText = textView0;
        this.daumSwitchDialogCheckButton = imageView0;
    }

    public static ItemDaumCategoryDialogSelectNothingBinding bind(@NonNull View view0) {
        return ItemDaumCategoryDialogSelectNothingBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemDaumCategoryDialogSelectNothingBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (ItemDaumCategoryDialogSelectNothingBinding)ViewDataBinding.bind(object0, view0, layout.item_daum_category_dialog_select_nothing);
    }

    @Nullable
    public Boolean getIsSelected() {
        return this.mIsSelected;
    }

    @Nullable
    public SelectNothingItem getSelectNoItem() {
        return this.mSelectNoItem;
    }

    @NonNull
    public static ItemDaumCategoryDialogSelectNothingBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return ItemDaumCategoryDialogSelectNothingBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemDaumCategoryDialogSelectNothingBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return ItemDaumCategoryDialogSelectNothingBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemDaumCategoryDialogSelectNothingBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (ItemDaumCategoryDialogSelectNothingBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.item_daum_category_dialog_select_nothing, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static ItemDaumCategoryDialogSelectNothingBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (ItemDaumCategoryDialogSelectNothingBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.item_daum_category_dialog_select_nothing, null, false, object0);
    }

    public abstract void setIsSelected(@Nullable Boolean arg1);

    public abstract void setSelectNoItem(@Nullable SelectNothingItem arg1);
}

