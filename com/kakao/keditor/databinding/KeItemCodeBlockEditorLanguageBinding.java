package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;

public abstract class KeItemCodeBlockEditorLanguageBinding extends ViewDataBinding {
    @NonNull
    public final TextView languageName;
    @Bindable
    protected boolean mIsSelected;
    @Bindable
    protected String mLanguage;

    public KeItemCodeBlockEditorLanguageBinding(Object object0, View view0, int v, TextView textView0) {
        super(object0, view0, v);
        this.languageName = textView0;
    }

    public static KeItemCodeBlockEditorLanguageBinding bind(@NonNull View view0) {
        return KeItemCodeBlockEditorLanguageBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemCodeBlockEditorLanguageBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemCodeBlockEditorLanguageBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_code_block_editor_language);
    }

    public boolean getIsSelected() {
        return this.mIsSelected;
    }

    @Nullable
    public String getLanguage() {
        return this.mLanguage;
    }

    @NonNull
    public static KeItemCodeBlockEditorLanguageBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemCodeBlockEditorLanguageBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemCodeBlockEditorLanguageBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemCodeBlockEditorLanguageBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemCodeBlockEditorLanguageBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemCodeBlockEditorLanguageBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_code_block_editor_language, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemCodeBlockEditorLanguageBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemCodeBlockEditorLanguageBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_code_block_editor_language, null, false, object0);
    }

    public abstract void setIsSelected(boolean arg1);

    public abstract void setLanguage(@Nullable String arg1);
}

