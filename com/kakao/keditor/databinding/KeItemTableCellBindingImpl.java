package com.kakao.keditor.databinding;

import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.kakao.keditor.BR;
import com.kakao.keditor.plugin.itemspec.table.BindingAdapter;
import com.kakao.keditor.plugin.itemspec.table.TableCellBackgroundView;
import com.kakao.keditor.widget.KeditorEditText;

public class KeItemTableCellBindingImpl extends KeItemTableCellBinding {
    private long mDirtyFlags;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    public KeItemTableCellBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 2, KeItemTableCellBindingImpl.sIncludes, KeItemTableCellBindingImpl.sViewsWithIds));
    }

    private KeItemTableCellBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((TableCellBackgroundView)arr_object[0]), ((KeditorEditText)arr_object[1]));
        this.mDirtyFlags = -1L;
        this.keTableCellBackground.setTag(null);
        this.keTableCellContent.setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        double f = this.mCellWidth;
        int v1 = this.mFontColor;
        SpannableStringBuilder spannableStringBuilder0 = this.mText;
        int v2 = Long.compare(10L & v, 0L);
        int v3 = Long.compare(v & 12L, 0L);
        if(Long.compare(9L & v, 0L) != 0) {
            BindingAdapter.setLayoutWidth(this.keTableCellBackground, f);
        }
        if(v3 != 0) {
            TextViewBindingAdapter.setText(this.keTableCellContent, spannableStringBuilder0);
        }
        if(v2 != 0) {
            this.keTableCellContent.setTextColor(v1);
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized(this) {
            if(this.mDirtyFlags != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized(this) {
            this.mDirtyFlags = 8L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // com.kakao.keditor.databinding.KeItemTableCellBinding
    public void setCellWidth(double f) {
        this.mCellWidth = f;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.cellWidth);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeItemTableCellBinding
    public void setFontColor(int v) {
        this.mFontColor = v;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.fontColor);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeItemTableCellBinding
    public void setText(@Nullable SpannableStringBuilder spannableStringBuilder0) {
        this.mText = spannableStringBuilder0;
        synchronized(this) {
            this.mDirtyFlags |= 4L;
        }
        this.notifyPropertyChanged(BR.text);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.cellWidth == v) {
            this.setCellWidth(((double)(((Double)object0))));
            return true;
        }
        if(BR.fontColor == v) {
            this.setFontColor(((int)(((Integer)object0))));
            return true;
        }
        if(BR.text == v) {
            this.setText(((SpannableStringBuilder)object0));
            return true;
        }
        return false;
    }
}

