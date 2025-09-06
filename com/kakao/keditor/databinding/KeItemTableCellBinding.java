package com.kakao.keditor.databinding;

import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.itemspec.table.TableCellBackgroundView;
import com.kakao.keditor.widget.KeditorEditText;

public abstract class KeItemTableCellBinding extends ViewDataBinding {
    @NonNull
    public final TableCellBackgroundView keTableCellBackground;
    @NonNull
    public final KeditorEditText keTableCellContent;
    @Bindable
    protected double mCellWidth;
    @Bindable
    protected int mFontColor;
    @Bindable
    protected SpannableStringBuilder mText;

    public KeItemTableCellBinding(Object object0, View view0, int v, TableCellBackgroundView tableCellBackgroundView0, KeditorEditText keditorEditText0) {
        super(object0, view0, v);
        this.keTableCellBackground = tableCellBackgroundView0;
        this.keTableCellContent = keditorEditText0;
    }

    public static KeItemTableCellBinding bind(@NonNull View view0) {
        return KeItemTableCellBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeItemTableCellBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeItemTableCellBinding)ViewDataBinding.bind(object0, view0, layout.ke_item_table_cell);
    }

    public double getCellWidth() {
        return this.mCellWidth;
    }

    public int getFontColor() {
        return this.mFontColor;
    }

    @Nullable
    public SpannableStringBuilder getText() {
        return this.mText;
    }

    @NonNull
    public static KeItemTableCellBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeItemTableCellBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeItemTableCellBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeItemTableCellBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeItemTableCellBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeItemTableCellBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_table_cell, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeItemTableCellBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeItemTableCellBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_item_table_cell, null, false, object0);
    }

    public abstract void setCellWidth(double arg1);

    public abstract void setFontColor(int arg1);

    public abstract void setText(@Nullable SpannableStringBuilder arg1);
}

