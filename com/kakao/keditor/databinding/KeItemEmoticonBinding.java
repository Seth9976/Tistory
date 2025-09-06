package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.itemspec.emoticon.EmoticonItem;
import com.kakao.kemoticon.EmoticonView;

public abstract class KeItemEmoticonBinding extends ViewDataBinding {
    @NonNull
    public final EmoticonView keItemEmoticon;
    @NonNull
    public final View keItemEmoticonBorder;
    @Bindable
    protected boolean mHasFocus;
    @Bindable
    protected EmoticonItem mItem;

    public KeItemEmoticonBinding(Object object0, View view0, int v, EmoticonView emoticonView0, View view1) {
        super(object0, view0, v);
        this.keItemEmoticon = emoticonView0;
        this.keItemEmoticonBorder = view1;
    }

    public static KeItemEmoticonBinding bind(@NonNull View view0) {
        return KeItemEmoticonBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemEmoticonBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemEmoticonBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_emoticon);
    }

    public boolean getHasFocus() {
        return this.mHasFocus;
    }

    @Nullable
    public EmoticonItem getItem() {
        return this.mItem;
    }

    @NonNull
    public static KeItemEmoticonBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemEmoticonBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemEmoticonBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemEmoticonBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemEmoticonBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemEmoticonBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_emoticon, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemEmoticonBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemEmoticonBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_emoticon, null, false, object0);
    }

    public abstract void setHasFocus(boolean arg1);

    public abstract void setItem(@Nullable EmoticonItem arg1);
}

