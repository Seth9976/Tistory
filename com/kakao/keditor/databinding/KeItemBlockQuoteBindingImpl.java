package com.kakao.keditor.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.BR;
import com.kakao.keditor.R.id;
import com.kakao.keditor.plugin.itemspec.blockquote.BlockQuoteItem;
import com.kakao.keditor.widget.KeditorEditText;

public class KeItemBlockQuoteBindingImpl extends KeItemBlockQuoteBinding {
    private long mDirtyFlags;
    @NonNull
    private final LinearLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeItemBlockQuoteBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.quote_image, 1);
        sparseIntArray0.put(id.ke_item_edit, 2);
    }

    public KeItemBlockQuoteBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 3, KeItemBlockQuoteBindingImpl.sIncludes, KeItemBlockQuoteBindingImpl.sViewsWithIds));
    }

    private KeItemBlockQuoteBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((KeditorEditText)arr_object[2]), ((ImageView)arr_object[1]));
        this.mDirtyFlags = -1L;
        this.mboundView0 = (LinearLayout)arr_object[0];
        ((LinearLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized(this) {
            this.mDirtyFlags = 0L;
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
            this.mDirtyFlags = 2L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // com.kakao.keditor.databinding.KeItemBlockQuoteBinding
    public void setItem(@Nullable BlockQuoteItem blockQuoteItem0) {
        this.mItem = blockQuoteItem0;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.item == v) {
            this.setItem(((BlockQuoteItem)object0));
            return true;
        }
        return false;
    }
}

