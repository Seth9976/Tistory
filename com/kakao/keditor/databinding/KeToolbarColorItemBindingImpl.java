package com.kakao.keditor.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.BR;
import com.kakao.keditor.generated.callback.OnClickListener.Listener;
import com.kakao.keditor.generated.callback.OnClickListener;
import com.kakao.keditor.plugin.attrs.text.ColorType;
import com.kakao.keditor.standard.BindingAdapters;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuClickedListener;

public class KeToolbarColorItemBindingImpl extends KeToolbarColorItemBinding implements Listener {
    @Nullable
    private final View.OnClickListener mCallback65;
    private long mDirtyFlags;
    @NonNull
    private final FrameLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    public KeToolbarColorItemBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 3, KeToolbarColorItemBindingImpl.sIncludes, KeToolbarColorItemBindingImpl.sViewsWithIds));
    }

    private KeToolbarColorItemBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((ImageView)arr_object[2]), ((ImageView)arr_object[1]));
        this.mDirtyFlags = -1L;
        this.itemCheck.setTag(null);
        this.mboundView0 = (FrameLayout)arr_object[0];
        ((FrameLayout)arr_object[0]).setTag(null);
        this.selectorImage.setTag(null);
        this.setRootTag(view0);
        this.mCallback65 = new OnClickListener(this, 1);
        this.invalidateAll();
    }

    @Override  // com.kakao.keditor.generated.callback.OnClickListener$Listener
    public final void _internalCallbackOnClick(int v, View view0) {
        ColorType colorType0 = this.mItem;
        ToolbarOverlayMenuClickedListener toolbarOverlayMenuClickedListener0 = this.mListener;
        if(toolbarOverlayMenuClickedListener0 != null) {
            toolbarOverlayMenuClickedListener0.onOverlayMenuClicked(colorType0);
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        Drawable drawable1;
        Drawable drawable0;
        String s;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z = this.mIsSelected;
        ColorType colorType0 = this.mItem;
        if(Long.compare(v & 11L, 0L) != 0) {
            v = z ? v | 0x20L : v | 16L;
        }
        int v1 = Long.compare(10L & v, 0L);
        if(v1 == 0 || colorType0 == null) {
            s = null;
            drawable0 = null;
            drawable1 = null;
        }
        else {
            s = colorType0.getDescription(this.getRoot().getContext());
            drawable0 = colorType0.getDrawable(this.getRoot().getContext());
            drawable1 = colorType0.getSelectorDrawable(this.getRoot().getContext());
        }
        boolean z1 = false;
        boolean z2 = Long.compare(0x20L & v, 0L) != 0 && colorType0 != ColorType.CLEAR;
        int v2 = Long.compare(11L & v, 0L);
        if(v2 != 0 && z) {
            z1 = z2;
        }
        if(v2 != 0) {
            BindingAdapters.goneUnless(this.itemCheck, Boolean.valueOf(z1));
        }
        if(v1 != 0) {
            BindingAdapters.setSrcDrawable(this.itemCheck, drawable1);
            BindingAdapters.setSrcDrawable(this.selectorImage, drawable0);
            this.mboundView0.setContentDescription(s);
        }
        if((v & 8L) != 0L) {
            this.mboundView0.setOnClickListener(this.mCallback65);
            BindingAdapters.applyAccessibilityInfo(this.mboundView0, true, null, null);
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

    @Override  // com.kakao.keditor.databinding.KeToolbarColorItemBinding
    public void setIsSelected(boolean z) {
        this.mIsSelected = z;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.isSelected);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarColorItemBinding
    public void setItem(@Nullable ColorType colorType0) {
        this.mItem = colorType0;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.item);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarColorItemBinding
    public void setListener(@Nullable ToolbarOverlayMenuClickedListener toolbarOverlayMenuClickedListener0) {
        this.mListener = toolbarOverlayMenuClickedListener0;
        synchronized(this) {
            this.mDirtyFlags |= 4L;
        }
        this.notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.isSelected == v) {
            this.setIsSelected(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.item == v) {
            this.setItem(((ColorType)object0));
            return true;
        }
        if(BR.listener == v) {
            this.setListener(((ToolbarOverlayMenuClickedListener)object0));
            return true;
        }
        return false;
    }
}

