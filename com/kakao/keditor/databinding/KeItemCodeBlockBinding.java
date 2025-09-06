package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.common.widget.ScrollWrapperLinearLayout;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.itemspec.codeblock.CodeBlockItem;

public abstract class KeItemCodeBlockBinding extends ViewDataBinding {
    @NonNull
    public final TextView keCode;
    @NonNull
    public final ScrollWrapperLinearLayout keCodeBlockLayout;
    @NonNull
    public final HorizontalScrollView keCodeHorizontalScrollView;
    @Bindable
    protected boolean mHasFocus;
    @Bindable
    protected CodeBlockItem mItem;

    public KeItemCodeBlockBinding(Object object0, View view0, int v, TextView textView0, ScrollWrapperLinearLayout scrollWrapperLinearLayout0, HorizontalScrollView horizontalScrollView0) {
        super(object0, view0, v);
        this.keCode = textView0;
        this.keCodeBlockLayout = scrollWrapperLinearLayout0;
        this.keCodeHorizontalScrollView = horizontalScrollView0;
    }

    public static KeItemCodeBlockBinding bind(@NonNull View view0) {
        return KeItemCodeBlockBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemCodeBlockBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemCodeBlockBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_code_block);
    }

    public boolean getHasFocus() {
        return this.mHasFocus;
    }

    @Nullable
    public CodeBlockItem getItem() {
        return this.mItem;
    }

    @NonNull
    public static KeItemCodeBlockBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemCodeBlockBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemCodeBlockBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemCodeBlockBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemCodeBlockBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemCodeBlockBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_code_block, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemCodeBlockBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemCodeBlockBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_code_block, null, false, object0);
    }

    public abstract void setHasFocus(boolean arg1);

    public abstract void setItem(@Nullable CodeBlockItem arg1);
}

