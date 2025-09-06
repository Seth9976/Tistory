package com.kakao.tistory.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.domain.entity.entry.DaumLikeViewItemModel.DaumLikeCategoryTitle;
import com.kakao.tistory.presentation.R.layout;

public abstract class ItemDaumCategoryDialogSubjectBinding extends ViewDataBinding {
    @NonNull
    public final TextView blogCategoryDialogParentTitleText;
    @Bindable
    protected DaumLikeCategoryTitle mCategoryItem;
    @Bindable
    protected Boolean mIsSelected;

    public ItemDaumCategoryDialogSubjectBinding(Object object0, View view0, int v, TextView textView0) {
        super(object0, view0, v);
        this.blogCategoryDialogParentTitleText = textView0;
    }

    public static ItemDaumCategoryDialogSubjectBinding bind(@NonNull View view0) {
        return ItemDaumCategoryDialogSubjectBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemDaumCategoryDialogSubjectBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (ItemDaumCategoryDialogSubjectBinding)ViewDataBinding.bind(object0, view0, layout.item_daum_category_dialog_subject);
    }

    @Nullable
    public DaumLikeCategoryTitle getCategoryItem() {
        return this.mCategoryItem;
    }

    @Nullable
    public Boolean getIsSelected() {
        return this.mIsSelected;
    }

    @NonNull
    public static ItemDaumCategoryDialogSubjectBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return ItemDaumCategoryDialogSubjectBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemDaumCategoryDialogSubjectBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return ItemDaumCategoryDialogSubjectBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemDaumCategoryDialogSubjectBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (ItemDaumCategoryDialogSubjectBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.item_daum_category_dialog_subject, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static ItemDaumCategoryDialogSubjectBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (ItemDaumCategoryDialogSubjectBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.item_daum_category_dialog_subject, null, false, object0);
    }

    public abstract void setCategoryItem(@Nullable DaumLikeCategoryTitle arg1);

    public abstract void setIsSelected(@Nullable Boolean arg1);
}

