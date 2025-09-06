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
import com.kakao.keditor.plugin.itemspec.blockquote.BlockQuoteItem;
import com.kakao.keditor.widget.KeditorEditText;

public abstract class KeItemBlockQuoteBinding extends ViewDataBinding {
    @NonNull
    public final KeditorEditText keItemEdit;
    @Bindable
    protected BlockQuoteItem mItem;
    @NonNull
    public final ImageView quoteImage;

    public KeItemBlockQuoteBinding(Object object0, View view0, int v, KeditorEditText keditorEditText0, ImageView imageView0) {
        super(object0, view0, v);
        this.keItemEdit = keditorEditText0;
        this.quoteImage = imageView0;
    }

    public static KeItemBlockQuoteBinding bind(@NonNull View view0) {
        return KeItemBlockQuoteBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemBlockQuoteBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemBlockQuoteBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_block_quote);
    }

    @Nullable
    public BlockQuoteItem getItem() {
        return this.mItem;
    }

    @NonNull
    public static KeItemBlockQuoteBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemBlockQuoteBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemBlockQuoteBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemBlockQuoteBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemBlockQuoteBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemBlockQuoteBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_block_quote, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemBlockQuoteBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemBlockQuoteBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_block_quote, null, false, object0);
    }

    public abstract void setItem(@Nullable BlockQuoteItem arg1);
}

