package com.kakao.keditor.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.BR;
import com.kakao.keditor.R.id;
import com.kakao.keditor.standard.BindingAdapters;

public class KeDialogAlertBindingImpl extends KeDialogAlertBinding {
    private long mDirtyFlags;
    @NonNull
    private final View mboundView3;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeDialogAlertBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_edit_link_title_layout, 4);
        sparseIntArray0.put(id.ke_dialog_title_text_view, 5);
        sparseIntArray0.put(id.ke_dialog_confirm, 6);
    }

    public KeDialogAlertBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 7, KeDialogAlertBindingImpl.sIncludes, KeDialogAlertBindingImpl.sViewsWithIds));
    }

    private KeDialogAlertBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((TextView)arr_object[2]), ((TextView)arr_object[6]), ((TextView)arr_object[1]), ((FrameLayout)arr_object[0]), ((TextView)arr_object[5]), ((LinearLayout)arr_object[4]));
        this.mDirtyFlags = -1L;
        this.keDialogCancel.setTag(null);
        this.keDialogContentTextView.setTag(null);
        this.keDialogOutsideClickArea.setTag(null);
        this.mboundView3 = (View)arr_object[3];
        ((View)arr_object[3]).setTag(null);
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
        boolean z = this.mIsCancelable;
        int v1 = Long.compare(v & 6L, 0L);
        boolean z1 = v1 != 0 && !this.mIsTitleOnly;
        if(Long.compare(5L & v, 0L) != 0) {
            BindingAdapters.goneUnless(this.keDialogCancel, Boolean.valueOf(z));
            BindingAdapters.goneUnless(this.mboundView3, Boolean.valueOf(z));
        }
        if(v1 != 0) {
            BindingAdapters.goneUnless(this.keDialogContentTextView, Boolean.valueOf(z1));
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

    @Override  // com.kakao.keditor.databinding.KeDialogAlertBinding
    public void setIsCancelable(boolean z) {
        this.mIsCancelable = z;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.isCancelable);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeDialogAlertBinding
    public void setIsTitleOnly(boolean z) {
        this.mIsTitleOnly = z;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.isTitleOnly);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.isCancelable == v) {
            this.setIsCancelable(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.isTitleOnly == v) {
            this.setIsTitleOnly(((Boolean)object0).booleanValue());
            return true;
        }
        return false;
    }
}

