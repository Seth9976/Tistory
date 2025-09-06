package com.kakao.keditor.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.kakao.keditor.BR;
import com.kakao.keditor.R.id;
import com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridItem;
import com.kakao.keditor.plugin.pluginspec.imagegrid.layout.KeditorImageGridLayout;
import com.kakao.keditor.standard.BindingAdapters;

public class KeItemImageGridBindingImpl extends KeItemImageGridBinding {
    private long mDirtyFlags;
    @NonNull
    private final LinearLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeItemImageGridBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_item_image_grid_layout_wrapper, 3);
        sparseIntArray0.put(id.ke_image_grid_layout, 4);
    }

    public KeItemImageGridBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 5, KeItemImageGridBindingImpl.sIncludes, KeItemImageGridBindingImpl.sViewsWithIds));
    }

    private KeItemImageGridBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((KeditorImageGridLayout)arr_object[4]), ((View)arr_object[1]), ((EditText)arr_object[2]), ((FrameLayout)arr_object[3]));
        this.mDirtyFlags = -1L;
        this.keItemImageGridBorderView.setTag(null);
        this.keItemImageGridCaptionEditText.setTag(null);
        this.mboundView0 = (LinearLayout)arr_object[0];
        ((LinearLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        boolean z1;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z = this.mHasFocus;
        ImageGridItem imageGridItem0 = this.mImageGridItem;
        if(Long.compare(v & 7L, 0L) != 0) {
            v = z ? v | 16L : v | 8L;
        }
        String s = (v & 6L) == 0L || imageGridItem0 == null ? null : imageGridItem0.getCaption();
        int v1 = 1;
        int v2 = 0;
        if(Long.compare(v & 8L, 0L) == 0) {
            z1 = false;
        }
        else {
            if(imageGridItem0 != null) {
                s = imageGridItem0.getCaption();
            }
            z1 = s != null;
            v |= (z1 ? 0x40L : 0x20L);
        }
        int v3 = (v & 0x40L) == 0L ? 0 : !(s == null ? false : s.equals(""));
        if((8L & v) == 0L || !z1) {
            v3 = 0;
        }
        int v4 = Long.compare(v & 7L, 0L);
        if(v4 != 0) {
            if(!z) {
                v1 = v3;
            }
            v2 = v1;
        }
        if((5L & v) != 0L) {
            BindingAdapters.goneUnless(this.keItemImageGridBorderView, Boolean.valueOf(z));
        }
        if((v & 6L) != 0L) {
            TextViewBindingAdapter.setText(this.keItemImageGridCaptionEditText, s);
        }
        if(v4 != 0) {
            BindingAdapters.goneUnless(this.keItemImageGridCaptionEditText, Boolean.valueOf(((boolean)v2)));
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

    @Override  // com.kakao.keditor.databinding.KeItemImageGridBinding
    public void setHasFocus(boolean z) {
        this.mHasFocus = z;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.hasFocus);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeItemImageGridBinding
    public void setImageGridItem(@Nullable ImageGridItem imageGridItem0) {
        this.mImageGridItem = imageGridItem0;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.imageGridItem);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.hasFocus == v) {
            this.setHasFocus(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.imageGridItem == v) {
            this.setImageGridItem(((ImageGridItem)object0));
            return true;
        }
        return false;
    }
}

