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
import com.kakao.keditor.plugin.itemspec.file.FileItem;

public abstract class KeItemFileBinding extends ViewDataBinding {
    @NonNull
    public final TextView keItemFileName;
    @NonNull
    public final TextView keItemFileSize;
    @NonNull
    public final View keItemItemBorder;
    @Bindable
    protected FileItem mFileItem;
    @Bindable
    protected boolean mHasFocus;

    public KeItemFileBinding(Object object0, View view0, int v, TextView textView0, TextView textView1, View view1) {
        super(object0, view0, v);
        this.keItemFileName = textView0;
        this.keItemFileSize = textView1;
        this.keItemItemBorder = view1;
    }

    public static KeItemFileBinding bind(@NonNull View view0) {
        return KeItemFileBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemFileBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemFileBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_file);
    }

    @Nullable
    public FileItem getFileItem() {
        return this.mFileItem;
    }

    public boolean getHasFocus() {
        return this.mHasFocus;
    }

    @NonNull
    public static KeItemFileBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemFileBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemFileBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemFileBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemFileBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemFileBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_file, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemFileBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemFileBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_file, null, false, object0);
    }

    public abstract void setFileItem(@Nullable FileItem arg1);

    public abstract void setHasFocus(boolean arg1);
}

