package com.kakao.tistory.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.domain.entity.entry.DaumLikeViewItemModel.PairChild;
import com.kakao.tistory.presentation.R.layout;

public abstract class ItemDaumCategoryDialogChildBinding extends ViewDataBinding {
    @NonNull
    public final TextView daumCategoryDialogParentTitleText;
    @NonNull
    public final ConstraintLayout daumChildLeftContainer;
    @NonNull
    public final TextView daumChildRightCategoryDialogParentTitleText;
    @NonNull
    public final ConstraintLayout daumChildRightContainer;
    @NonNull
    public final ImageView daumChildRightSwitchDialogCheckButton;
    @NonNull
    public final ImageView daumSwitchDialogCheckButton;
    @Bindable
    protected int mSelectId;
    @Bindable
    protected PairChild mSubjectItem;

    public ItemDaumCategoryDialogChildBinding(Object object0, View view0, int v, TextView textView0, ConstraintLayout constraintLayout0, TextView textView1, ConstraintLayout constraintLayout1, ImageView imageView0, ImageView imageView1) {
        super(object0, view0, v);
        this.daumCategoryDialogParentTitleText = textView0;
        this.daumChildLeftContainer = constraintLayout0;
        this.daumChildRightCategoryDialogParentTitleText = textView1;
        this.daumChildRightContainer = constraintLayout1;
        this.daumChildRightSwitchDialogCheckButton = imageView0;
        this.daumSwitchDialogCheckButton = imageView1;
    }

    public static ItemDaumCategoryDialogChildBinding bind(@NonNull View view0) {
        return ItemDaumCategoryDialogChildBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemDaumCategoryDialogChildBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (ItemDaumCategoryDialogChildBinding)ViewDataBinding.bind(object0, view0, layout.item_daum_category_dialog_child);
    }

    public int getSelectId() {
        return this.mSelectId;
    }

    @Nullable
    public PairChild getSubjectItem() {
        return this.mSubjectItem;
    }

    @NonNull
    public static ItemDaumCategoryDialogChildBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return ItemDaumCategoryDialogChildBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemDaumCategoryDialogChildBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return ItemDaumCategoryDialogChildBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemDaumCategoryDialogChildBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (ItemDaumCategoryDialogChildBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.item_daum_category_dialog_child, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static ItemDaumCategoryDialogChildBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (ItemDaumCategoryDialogChildBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.item_daum_category_dialog_child, null, false, object0);
    }

    public abstract void setSelectId(int arg1);

    public abstract void setSubjectItem(@Nullable PairChild arg1);
}

