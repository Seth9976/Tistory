package com.kakao.keditor.databinding;

import android.util.SparseIntArray;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.BR;
import com.kakao.keditor.generated.callback.OnClickListener.Listener;
import com.kakao.keditor.generated.callback.OnClickListener;
import com.kakao.keditor.plugin.itemspec.menulistener.SimpleDeleteMenuClickListener;
import com.kakao.keditor.standard.BindingAdapters;

public class KeToolbarSimpleDeletionMenuBindingImpl extends KeToolbarSimpleDeletionMenuBinding implements Listener {
    @Nullable
    private final View.OnClickListener mCallback68;
    private long mDirtyFlags;
    @NonNull
    private final RelativeLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    public KeToolbarSimpleDeletionMenuBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 2, KeToolbarSimpleDeletionMenuBindingImpl.sIncludes, KeToolbarSimpleDeletionMenuBindingImpl.sViewsWithIds));
    }

    private KeToolbarSimpleDeletionMenuBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((ImageView)arr_object[1]));
        this.mDirtyFlags = -1L;
        this.keBtnDelete.setTag(null);
        this.mboundView0 = (RelativeLayout)arr_object[0];
        ((RelativeLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.mCallback68 = new OnClickListener(this, 1);
        this.invalidateAll();
    }

    @Override  // com.kakao.keditor.generated.callback.OnClickListener$Listener
    public final void _internalCallbackOnClick(int v, View view0) {
        SimpleDeleteMenuClickListener simpleDeleteMenuClickListener0 = this.mDeleteListener;
        if(simpleDeleteMenuClickListener0 != null) {
            simpleDeleteMenuClickListener0.onRemoveMenuClicked();
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z = this.mDisplayMenu;
        int v1 = Long.compare(5L & v, 0L);
        if((v & 4L) != 0L) {
            this.keBtnDelete.setOnClickListener(this.mCallback68);
        }
        if(v1 != 0) {
            BindingAdapters.goneUnless(this.mboundView0, Boolean.valueOf(z));
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

    @Override  // com.kakao.keditor.databinding.KeToolbarSimpleDeletionMenuBinding
    public void setDeleteListener(@Nullable SimpleDeleteMenuClickListener simpleDeleteMenuClickListener0) {
        this.mDeleteListener = simpleDeleteMenuClickListener0;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.deleteListener);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarSimpleDeletionMenuBinding
    public void setDisplayMenu(boolean z) {
        this.mDisplayMenu = z;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.displayMenu);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.displayMenu == v) {
            this.setDisplayMenu(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.deleteListener == v) {
            this.setDeleteListener(((SimpleDeleteMenuClickListener)object0));
            return true;
        }
        return false;
    }
}

