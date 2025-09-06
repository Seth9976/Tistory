package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.itemspec.opengraph.OpenGraphItem;

public abstract class KeItemOpengraphBinding extends ViewDataBinding {
    @NonNull
    public final View keItemOpengraphBorder;
    @NonNull
    public final TextView keItemOpengraphHostText;
    @NonNull
    public final View keItemOpengraphLine;
    @NonNull
    public final TextView keItemOpengraphLoading;
    @NonNull
    public final ImageView keItemOpengraphThumbnail;
    @NonNull
    public final TextView keItemOpengraphTitleText;
    @NonNull
    public final RelativeLayout keItemOpengraphWrapper;
    @Bindable
    protected boolean mHasFocus;
    @Bindable
    protected boolean mIsNowLoading;
    @Bindable
    protected OpenGraphItem mItem;

    public KeItemOpengraphBinding(Object object0, View view0, int v, View view1, TextView textView0, View view2, TextView textView1, ImageView imageView0, TextView textView2, RelativeLayout relativeLayout0) {
        super(object0, view0, v);
        this.keItemOpengraphBorder = view1;
        this.keItemOpengraphHostText = textView0;
        this.keItemOpengraphLine = view2;
        this.keItemOpengraphLoading = textView1;
        this.keItemOpengraphThumbnail = imageView0;
        this.keItemOpengraphTitleText = textView2;
        this.keItemOpengraphWrapper = relativeLayout0;
    }

    public static KeItemOpengraphBinding bind(@NonNull View view0) {
        return KeItemOpengraphBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemOpengraphBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemOpengraphBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_opengraph);
    }

    public boolean getHasFocus() {
        return this.mHasFocus;
    }

    public boolean getIsNowLoading() {
        return this.mIsNowLoading;
    }

    @Nullable
    public OpenGraphItem getItem() {
        return this.mItem;
    }

    @NonNull
    public static KeItemOpengraphBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemOpengraphBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemOpengraphBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemOpengraphBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemOpengraphBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemOpengraphBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_opengraph, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemOpengraphBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemOpengraphBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_opengraph, null, false, object0);
    }

    public abstract void setHasFocus(boolean arg1);

    public abstract void setIsNowLoading(boolean arg1);

    public abstract void setItem(@Nullable OpenGraphItem arg1);
}

