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
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.itemspec.menulistener.SimpleAlignMenuClickListener;
import com.kakao.keditor.standard.BindingAdapters;

public class KeToolbarSimpleAlignmentMenuBindingImpl extends KeToolbarSimpleAlignmentMenuBinding implements Listener {
    @Nullable
    private final View.OnClickListener mCallback69;
    @Nullable
    private final View.OnClickListener mCallback70;
    private long mDirtyFlags;
    @NonNull
    private final RelativeLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    public KeToolbarSimpleAlignmentMenuBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 3, KeToolbarSimpleAlignmentMenuBindingImpl.sIncludes, KeToolbarSimpleAlignmentMenuBindingImpl.sViewsWithIds));
    }

    private KeToolbarSimpleAlignmentMenuBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((ImageView)arr_object[1]), ((ImageView)arr_object[2]));
        this.mDirtyFlags = -1L;
        this.keBtnAlign.setTag(null);
        this.keBtnDelete.setTag(null);
        this.mboundView0 = (RelativeLayout)arr_object[0];
        ((RelativeLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.mCallback69 = new OnClickListener(this, 1);
        this.mCallback70 = new OnClickListener(this, 2);
        this.invalidateAll();
    }

    @Override  // com.kakao.keditor.generated.callback.OnClickListener$Listener
    public final void _internalCallbackOnClick(int v, View view0) {
        switch(v) {
            case 1: {
                Alignment alignment0 = this.mAlignment;
                SimpleAlignMenuClickListener simpleAlignMenuClickListener0 = this.mAlignMenuClickListener;
                if(simpleAlignMenuClickListener0 != null) {
                    simpleAlignMenuClickListener0.onAlignmentClicked(alignment0);
                    return;
                }
                break;
            }
            case 2: {
                SimpleAlignMenuClickListener simpleAlignMenuClickListener1 = this.mAlignMenuClickListener;
                if(simpleAlignMenuClickListener1 != null) {
                    simpleAlignMenuClickListener1.onRemoveMenuClicked();
                    return;
                }
                break;
            }
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        Alignment alignment0 = this.mAlignment;
        boolean z = this.mDisplayMenu;
        int v1 = Long.compare(10L & v, 0L);
        if(Long.compare(9L & v, 0L) != 0) {
            BindingAdapters.alignment(this.keBtnAlign, alignment0);
        }
        if((v & 8L) != 0L) {
            this.keBtnAlign.setOnClickListener(this.mCallback69);
            this.keBtnDelete.setOnClickListener(this.mCallback70);
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
            this.mDirtyFlags = 8L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarSimpleAlignmentMenuBinding
    public void setAlignMenuClickListener(@Nullable SimpleAlignMenuClickListener simpleAlignMenuClickListener0) {
        this.mAlignMenuClickListener = simpleAlignMenuClickListener0;
        synchronized(this) {
            this.mDirtyFlags |= 4L;
        }
        this.notifyPropertyChanged(BR.alignMenuClickListener);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarSimpleAlignmentMenuBinding
    public void setAlignment(@Nullable Alignment alignment0) {
        this.mAlignment = alignment0;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.alignment);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarSimpleAlignmentMenuBinding
    public void setDisplayMenu(boolean z) {
        this.mDisplayMenu = z;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.displayMenu);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.alignment == v) {
            this.setAlignment(((Alignment)object0));
            return true;
        }
        if(BR.displayMenu == v) {
            this.setDisplayMenu(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.alignMenuClickListener == v) {
            this.setAlignMenuClickListener(((SimpleAlignMenuClickListener)object0));
            return true;
        }
        return false;
    }
}

