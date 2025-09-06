package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.widget.KeditorEditText;

public abstract class KeItemParagraphBinding extends ViewDataBinding {
    @NonNull
    public final KeditorEditText keParagraphEdit;

    public KeItemParagraphBinding(Object object0, View view0, int v, KeditorEditText keditorEditText0) {
        super(object0, view0, v);
        this.keParagraphEdit = keditorEditText0;
    }

    public static KeItemParagraphBinding bind(@NonNull View view0) {
        return KeItemParagraphBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemParagraphBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemParagraphBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_paragraph);
    }

    @NonNull
    public static KeItemParagraphBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemParagraphBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemParagraphBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemParagraphBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemParagraphBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemParagraphBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_paragraph, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemParagraphBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemParagraphBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_paragraph, null, false, object0);
    }
}

