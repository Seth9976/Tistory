package com.kakao.keditor.databinding;

import android.text.SpannableStringBuilder;
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
import com.kakao.keditor.plugin.itemspec.textlist.ListType;
import com.kakao.keditor.widget.KeditorEditText;

public abstract class KeItemListContentBinding extends ViewDataBinding {
    @NonNull
    public final ImageView keListItemBullet;
    @NonNull
    public final KeditorEditText keListItemContent;
    @NonNull
    public final TextView keListItemIndex;
    @Bindable
    protected int mIndex;
    @Bindable
    protected SpannableStringBuilder mText;
    @Bindable
    protected ListType mType;

    public KeItemListContentBinding(Object object0, View view0, int v, ImageView imageView0, KeditorEditText keditorEditText0, TextView textView0) {
        super(object0, view0, v);
        this.keListItemBullet = imageView0;
        this.keListItemContent = keditorEditText0;
        this.keListItemIndex = textView0;
    }

    public static KeItemListContentBinding bind(@NonNull View view0) {
        return KeItemListContentBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemListContentBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemListContentBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_list_content);
    }

    public int getIndex() {
        return this.mIndex;
    }

    @Nullable
    public SpannableStringBuilder getText() {
        return this.mText;
    }

    @Nullable
    public ListType getType() {
        return this.mType;
    }

    @NonNull
    public static KeItemListContentBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemListContentBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemListContentBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemListContentBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemListContentBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemListContentBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_list_content, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemListContentBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemListContentBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_list_content, null, false, object0);
    }

    public abstract void setIndex(int arg1);

    public abstract void setText(@Nullable SpannableStringBuilder arg1);

    public abstract void setType(@Nullable ListType arg1);
}

