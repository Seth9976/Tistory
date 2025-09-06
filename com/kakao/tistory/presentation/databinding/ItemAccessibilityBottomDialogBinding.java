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
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.view.common.bottomsheet.AccessibilitySwipeItemType;

public abstract class ItemAccessibilityBottomDialogBinding extends ViewDataBinding {
    @NonNull
    public final TextView commonBottomDialogTitleText;
    @Bindable
    protected AccessibilitySwipeItemType mSwipeItem;

    public ItemAccessibilityBottomDialogBinding(Object object0, View view0, int v, TextView textView0) {
        super(object0, view0, v);
        this.commonBottomDialogTitleText = textView0;
    }

    public static ItemAccessibilityBottomDialogBinding bind(@NonNull View view0) {
        return ItemAccessibilityBottomDialogBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemAccessibilityBottomDialogBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (ItemAccessibilityBottomDialogBinding)ViewDataBinding.bind(object0, view0, layout.item_accessibility_bottom_dialog);
    }

    @Nullable
    public AccessibilitySwipeItemType getSwipeItem() {
        return this.mSwipeItem;
    }

    @NonNull
    public static ItemAccessibilityBottomDialogBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return ItemAccessibilityBottomDialogBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ItemAccessibilityBottomDialogBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return ItemAccessibilityBottomDialogBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemAccessibilityBottomDialogBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (ItemAccessibilityBottomDialogBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.item_accessibility_bottom_dialog, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static ItemAccessibilityBottomDialogBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (ItemAccessibilityBottomDialogBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.item_accessibility_bottom_dialog, null, false, object0);
    }

    public abstract void setSwipeItem(@Nullable AccessibilitySwipeItemType arg1);
}

