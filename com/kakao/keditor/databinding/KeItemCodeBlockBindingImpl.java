package com.kakao.keditor.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.kakao.common.widget.ScrollWrapperLinearLayout;
import com.kakao.keditor.BR;
import com.kakao.keditor.R.id;
import com.kakao.keditor.plugin.itemspec.codeblock.CodeBlockItem;
import com.kakao.keditor.standard.BindingAdapters;

public class KeItemCodeBlockBindingImpl extends KeItemCodeBlockBinding {
    private long mDirtyFlags;
    @NonNull
    private final ImageView mboundView2;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeItemCodeBlockBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_code_horizontal_scroll_view, 3);
    }

    public KeItemCodeBlockBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 4, KeItemCodeBlockBindingImpl.sIncludes, KeItemCodeBlockBindingImpl.sViewsWithIds));
    }

    private KeItemCodeBlockBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((TextView)arr_object[1]), ((ScrollWrapperLinearLayout)arr_object[0]), ((HorizontalScrollView)arr_object[3]));
        this.mDirtyFlags = -1L;
        this.keCode.setTag(null);
        this.keCodeBlockLayout.setTag(null);
        this.mboundView2 = (ImageView)arr_object[2];
        ((ImageView)arr_object[2]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        int v3;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z = this.mHasFocus;
        CodeBlockItem codeBlockItem0 = this.mItem;
        int v1 = Long.compare(5L & v, 0L);
        int v2 = Long.compare(v & 6L, 0L);
        boolean z1 = false;
        String s = null;
        if(v2 != 0) {
            if(codeBlockItem0 == null) {
                v3 = 0;
            }
            else {
                s = codeBlockItem0.codeUntilLine(3);
                v3 = codeBlockItem0.getCodeLineCount();
            }
            if(v3 > 3) {
                z1 = true;
            }
        }
        if(v2 != 0) {
            TextViewBindingAdapter.setText(this.keCode, s);
            BindingAdapters.goneUnless(this.mboundView2, Boolean.valueOf(z1));
        }
        if(v1 != 0) {
            BindingAdapters.setSelected(this.keCodeBlockLayout, z);
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
            this.mDirtyFlags = 4L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // com.kakao.keditor.databinding.KeItemCodeBlockBinding
    public void setHasFocus(boolean z) {
        this.mHasFocus = z;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.hasFocus);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeItemCodeBlockBinding
    public void setItem(@Nullable CodeBlockItem codeBlockItem0) {
        this.mItem = codeBlockItem0;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.item);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.hasFocus == v) {
            this.setHasFocus(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.item == v) {
            this.setItem(((CodeBlockItem)object0));
            return true;
        }
        return false;
    }
}

