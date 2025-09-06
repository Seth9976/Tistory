package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.itemspec.table.TableStyle;

public abstract class KeItemTableBinding extends ViewDataBinding {
    @NonNull
    public final GridLayout keTableItems;
    @NonNull
    public final HorizontalScrollView keTableScrollview;
    @Bindable
    protected TableStyle mStyle;

    public KeItemTableBinding(Object object0, View view0, int v, GridLayout gridLayout0, HorizontalScrollView horizontalScrollView0) {
        super(object0, view0, v);
        this.keTableItems = gridLayout0;
        this.keTableScrollview = horizontalScrollView0;
    }

    public static KeItemTableBinding bind(@NonNull View view0) {
        return KeItemTableBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemTableBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemTableBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_table);
    }

    @Nullable
    public TableStyle getStyle() {
        return this.mStyle;
    }

    @NonNull
    public static KeItemTableBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemTableBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemTableBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemTableBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemTableBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemTableBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_table, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemTableBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemTableBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_table, null, false, object0);
    }

    public abstract void setStyle(@Nullable TableStyle arg1);
}

