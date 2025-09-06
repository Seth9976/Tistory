package com.kakao.keditor.databinding;

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
import com.kakao.keditor.plugin.attrs.text.SelectableItem;
import com.kakao.keditor.standard.BindingAdapters;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuClickedListener;

public class KeToolbarSelectableItemBindingImpl extends KeToolbarSelectableItemBinding implements Listener {
    @Nullable
    private final View.OnClickListener mCallback14;
    private long mDirtyFlags;
    @NonNull
    private final FrameLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    public KeToolbarSelectableItemBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 3, KeToolbarSelectableItemBindingImpl.sIncludes, KeToolbarSelectableItemBindingImpl.sViewsWithIds));
    }

    private KeToolbarSelectableItemBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((ImageView)arr_object[1]), ((ImageView)arr_object[2]));
        this.mDirtyFlags = -1L;
        this.itemCheck.setTag(null);
        this.mboundView0 = (FrameLayout)arr_object[0];
        ((FrameLayout)arr_object[0]).setTag(null);
        this.selectorImage.setTag(null);
        this.setRootTag(view0);
        this.mCallback14 = new OnClickListener(this, 1);
        this.invalidateAll();
    }

    @Override  // com.kakao.keditor.generated.callback.OnClickListener$Listener
    public final void _internalCallbackOnClick(int v, View view0) {
        SelectableItem selectableItem0 = this.mItem;
        ToolbarOverlayMenuClickedListener toolbarOverlayMenuClickedListener0 = this.mListener;
        if(toolbarOverlayMenuClickedListener0 != null) {
            toolbarOverlayMenuClickedListener0.onOverlayMenuClicked(selectableItem0);
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        String s1;
        String s;
        int v3;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z = this.mIsSelected;
        SelectableItem selectableItem0 = this.mItem;
        int v1 = Long.compare(9L & v, 0L);
        int v2 = Long.compare(10L & v, 0L);
        if(v2 == 0 || selectableItem0 == null) {
            v3 = 0;
            s1 = null;
            s = null;
        }
        else {
            v3 = selectableItem0.getImage();
            s = selectableItem0.getDescription(this.getRoot().getContext());
            s1 = selectableItem0.getHintText(this.getRoot().getContext());
        }
        if(v1 != 0) {
            BindingAdapters.goneUnless(this.itemCheck, Boolean.valueOf(z));
            BindingAdapters.setSelected(this.mboundView0, z);
        }
        if((v & 8L) != 0L) {
            this.mboundView0.setOnClickListener(this.mCallback14);
        }
        if(v2 != 0) {
            this.mboundView0.setContentDescription(s);
            BindingAdapters.applyAccessibilityInfo(this.mboundView0, true, s1, null);
            BindingAdapters.setSrc(this.selectorImage, v3);
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

    @Override  // com.kakao.keditor.databinding.KeToolbarSelectableItemBinding
    public void setIsSelected(boolean z) {
        this.mIsSelected = z;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.isSelected);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarSelectableItemBinding
    public void setItem(@Nullable SelectableItem selectableItem0) {
        this.mItem = selectableItem0;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.item);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarSelectableItemBinding
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
            this.setItem(((SelectableItem)object0));
            return true;
        }
        if(BR.listener == v) {
            this.setListener(((ToolbarOverlayMenuClickedListener)object0));
            return true;
        }
        return false;
    }
}

