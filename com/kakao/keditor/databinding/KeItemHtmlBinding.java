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

public abstract class KeItemHtmlBinding extends ViewDataBinding {
    @NonNull
    public final View keItemBorderView;
    @NonNull
    public final ImageView kePluginHtmlImage;
    @NonNull
    public final TextView kePluginHtmlText;
    @Bindable
    protected boolean mHasFocus;

    public KeItemHtmlBinding(Object object0, View view0, int v, View view1, ImageView imageView0, TextView textView0) {
        super(object0, view0, v);
        this.keItemBorderView = view1;
        this.kePluginHtmlImage = imageView0;
        this.kePluginHtmlText = textView0;
    }

    public static KeItemHtmlBinding bind(@NonNull View view0) {
        return KeItemHtmlBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemHtmlBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemHtmlBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_html);
    }

    public boolean getHasFocus() {
        return this.mHasFocus;
    }

    @NonNull
    public static KeItemHtmlBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemHtmlBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemHtmlBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemHtmlBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemHtmlBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemHtmlBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_html, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemHtmlBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemHtmlBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_html, null, false, object0);
    }

    public abstract void setHasFocus(boolean arg1);
}

