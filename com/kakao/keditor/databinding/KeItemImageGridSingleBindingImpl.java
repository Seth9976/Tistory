package com.kakao.keditor.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.BR;
import com.kakao.keditor.R.id;
import com.kakao.keditor.event.EventFlow;
import com.kakao.keditor.standard.BindingAdapters;

public class KeItemImageGridSingleBindingImpl extends KeItemImageGridSingleBinding {
    private long mDirtyFlags;
    @NonNull
    private final FrameLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeItemImageGridSingleBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_item_image, 3);
    }

    public KeItemImageGridSingleBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 4, KeItemImageGridSingleBindingImpl.sIncludes, KeItemImageGridSingleBindingImpl.sViewsWithIds));
    }

    private KeItemImageGridSingleBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((View)arr_object[2]), ((ImageView)arr_object[3]), ((ImageView)arr_object[1]));
        this.mDirtyFlags = -1L;
        this.keItemBorder.setTag(null);
        this.keItemImageRepresentImageBtn.setTag(null);
        this.mboundView0 = (FrameLayout)arr_object[0];
        ((FrameLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        boolean z5;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z = this.mHasFocus;
        boolean z1 = this.mIsRepresent;
        boolean z2 = this.mRepresentativeImageEnabled;
        boolean z3 = this.mIsEditable;
        if(Long.compare(v & 55L, 0L) != 0) {
            v = z2 ? v | 0x800L : v | 0x400L;
        }
        if(Long.compare(v & 49L, 0L) != 0 && (v & 2097L) != 0L) {
            v = z3 ? v | 0x80L : v | 0x40L;
        }
        if((v & 0x800L) != 0L && (v & 2097L) != 0L) {
            v = z3 ? v | 0x80L : v | 0x40L;
        }
        boolean z4 = false;
        if(Long.compare(v & 2097L, 0L) == 0) {
            z = false;
        }
        else {
            if(!z3) {
                z = false;
            }
            if((v & 0x800L) != 0L) {
                v |= (z ? 0x200L : 0x100L);
            }
        }
        if((v & 0x800L) == 0L) {
            z5 = false;
        }
        else if(z) {
            z5 = true;
        }
        else {
            z5 = z1;
        }
        int v1 = Long.compare(55L & v, 0L);
        if(v1 != 0 && z2) {
            z4 = z5;
        }
        if((v & 49L) != 0L) {
            BindingAdapters.goneUnless(this.keItemBorder, Boolean.valueOf(z));
        }
        if(v1 != 0) {
            BindingAdapters.goneUnless(this.keItemImageRepresentImageBtn, Boolean.valueOf(z4));
        }
        if((v & 34L) != 0L) {
            BindingAdapters.setSelected(this.keItemImageRepresentImageBtn, z1);
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
            this.mDirtyFlags = 0x20L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // com.kakao.keditor.databinding.KeItemImageGridSingleBinding
    public void setFlow(@Nullable EventFlow eventFlow0) {
        this.mFlow = eventFlow0;
    }

    @Override  // com.kakao.keditor.databinding.KeItemImageGridSingleBinding
    public void setHasFocus(boolean z) {
        this.mHasFocus = z;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.hasFocus);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeItemImageGridSingleBinding
    public void setIsEditable(boolean z) {
        this.mIsEditable = z;
        synchronized(this) {
            this.mDirtyFlags |= 16L;
        }
        this.notifyPropertyChanged(BR.isEditable);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeItemImageGridSingleBinding
    public void setIsRepresent(boolean z) {
        this.mIsRepresent = z;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.isRepresent);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeItemImageGridSingleBinding
    public void setRepresentativeImageEnabled(boolean z) {
        this.mRepresentativeImageEnabled = z;
        synchronized(this) {
            this.mDirtyFlags |= 4L;
        }
        this.notifyPropertyChanged(BR.representativeImageEnabled);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.hasFocus == v) {
            this.setHasFocus(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.isRepresent == v) {
            this.setIsRepresent(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.representativeImageEnabled == v) {
            this.setRepresentativeImageEnabled(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.flow == v) {
            this.setFlow(((EventFlow)object0));
            return true;
        }
        if(BR.isEditable == v) {
            this.setIsEditable(((Boolean)object0).booleanValue());
            return true;
        }
        return false;
    }
}

