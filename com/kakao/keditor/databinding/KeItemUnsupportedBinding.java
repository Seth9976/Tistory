package com.kakao.keditor.databinding;

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
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.itemspec.unsupport.UnSupportedItem;

public abstract class KeItemUnsupportedBinding extends ViewDataBinding {
    @NonNull
    public final View keItemHorizontalRuleBorderView;
    @NonNull
    public final ImageView kePluginUnknownImage;
    @NonNull
    public final TextView kePluginUnknownText;
    @Bindable
    protected boolean mHasFocus;
    @Bindable
    protected UnSupportedItem mUnSupportedItem;

    public KeItemUnsupportedBinding(Object object0, View view0, int v, View view1, ImageView imageView0, TextView textView0) {
        super(object0, view0, v);
        this.keItemHorizontalRuleBorderView = view1;
        this.kePluginUnknownImage = imageView0;
        this.kePluginUnknownText = textView0;
    }

    public static KeItemUnsupportedBinding bind(@NonNull View view0) {
        return KeItemUnsupportedBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemUnsupportedBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemUnsupportedBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_unsupported);
    }

    public boolean getHasFocus() {
        return this.mHasFocus;
    }

    @Nullable
    public UnSupportedItem getUnSupportedItem() {
        return this.mUnSupportedItem;
    }

    @NonNull
    public static KeItemUnsupportedBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemUnsupportedBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemUnsupportedBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemUnsupportedBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemUnsupportedBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemUnsupportedBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_unsupported, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemUnsupportedBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemUnsupportedBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_unsupported, null, false, object0);
    }

    public abstract void setHasFocus(boolean arg1);

    public abstract void setUnSupportedItem(@Nullable UnSupportedItem arg1);
}

