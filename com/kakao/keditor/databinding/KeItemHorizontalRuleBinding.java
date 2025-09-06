package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.itemspec.horizontalrule.HorizontalRuleItem;

public abstract class KeItemHorizontalRuleBinding extends ViewDataBinding {
    @NonNull
    public final ImageView keItemHorizontalRule;
    @NonNull
    public final View keItemHorizontalRuleBorderView;
    @Bindable
    protected boolean mHasFocus;
    @Bindable
    protected HorizontalRuleItem mHorizontalRule;

    public KeItemHorizontalRuleBinding(Object object0, View view0, int v, ImageView imageView0, View view1) {
        super(object0, view0, v);
        this.keItemHorizontalRule = imageView0;
        this.keItemHorizontalRuleBorderView = view1;
    }

    public static KeItemHorizontalRuleBinding bind(@NonNull View view0) {
        return KeItemHorizontalRuleBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemHorizontalRuleBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemHorizontalRuleBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_horizontal_rule);
    }

    public boolean getHasFocus() {
        return this.mHasFocus;
    }

    @Nullable
    public HorizontalRuleItem getHorizontalRule() {
        return this.mHorizontalRule;
    }

    @NonNull
    public static KeItemHorizontalRuleBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemHorizontalRuleBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemHorizontalRuleBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemHorizontalRuleBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemHorizontalRuleBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemHorizontalRuleBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_horizontal_rule, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemHorizontalRuleBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemHorizontalRuleBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_horizontal_rule, null, false, object0);
    }

    public abstract void setHasFocus(boolean arg1);

    public abstract void setHorizontalRule(@Nullable HorizontalRuleItem arg1);
}

