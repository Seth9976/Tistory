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
import com.kakao.keditor.plugin.itemspec.menulistener.CodeMenuClickListener;
import com.kakao.keditor.plugin.itemspec.menulistener.SimpleAlignMenuClickListener;
import com.kakao.keditor.standard.BindingAdapters;

public class KeToolbarPollMenuBindingImpl extends KeToolbarPollMenuBinding implements Listener {
    @Nullable
    private final View.OnClickListener mCallback71;
    @Nullable
    private final View.OnClickListener mCallback72;
    @Nullable
    private final View.OnClickListener mCallback73;
    private long mDirtyFlags;
    @NonNull
    private final RelativeLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    public KeToolbarPollMenuBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 4, KeToolbarPollMenuBindingImpl.sIncludes, KeToolbarPollMenuBindingImpl.sViewsWithIds));
    }

    private KeToolbarPollMenuBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((ImageView)arr_object[2]), ((ImageView)arr_object[3]), ((ImageView)arr_object[1]));
        this.mDirtyFlags = -1L;
        this.keBtnAlign.setTag(null);
        this.keBtnDelete.setTag(null);
        this.keBtnEditPoll.setTag(null);
        this.mboundView0 = (RelativeLayout)arr_object[0];
        ((RelativeLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.mCallback72 = new OnClickListener(this, 2);
        this.mCallback73 = new OnClickListener(this, 3);
        this.mCallback71 = new OnClickListener(this, 1);
        this.invalidateAll();
    }

    @Override  // com.kakao.keditor.generated.callback.OnClickListener$Listener
    public final void _internalCallbackOnClick(int v, View view0) {
        switch(v) {
            case 1: {
                CodeMenuClickListener codeMenuClickListener0 = this.mCodeMenuListener;
                if(codeMenuClickListener0 != null) {
                    codeMenuClickListener0.onItemEditClicked();
                    return;
                }
                break;
            }
            case 2: {
                Alignment alignment0 = this.mAlignment;
                SimpleAlignMenuClickListener simpleAlignMenuClickListener0 = this.mAlignMenuClickListener;
                if(simpleAlignMenuClickListener0 != null) {
                    simpleAlignMenuClickListener0.onAlignmentClicked(alignment0);
                    return;
                }
                break;
            }
            case 3: {
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
        int v1 = Long.compare(20L & v, 0L);
        if(Long.compare(17L & v, 0L) != 0) {
            BindingAdapters.alignment(this.keBtnAlign, alignment0);
        }
        if((v & 16L) != 0L) {
            this.keBtnAlign.setOnClickListener(this.mCallback72);
            this.keBtnDelete.setOnClickListener(this.mCallback73);
            this.keBtnEditPoll.setOnClickListener(this.mCallback71);
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
            this.mDirtyFlags = 16L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarPollMenuBinding
    public void setAlignMenuClickListener(@Nullable SimpleAlignMenuClickListener simpleAlignMenuClickListener0) {
        this.mAlignMenuClickListener = simpleAlignMenuClickListener0;
        synchronized(this) {
            this.mDirtyFlags |= 8L;
        }
        this.notifyPropertyChanged(BR.alignMenuClickListener);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarPollMenuBinding
    public void setAlignment(@Nullable Alignment alignment0) {
        this.mAlignment = alignment0;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.alignment);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarPollMenuBinding
    public void setCodeMenuListener(@Nullable CodeMenuClickListener codeMenuClickListener0) {
        this.mCodeMenuListener = codeMenuClickListener0;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.codeMenuListener);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarPollMenuBinding
    public void setDisplayMenu(boolean z) {
        this.mDisplayMenu = z;
        synchronized(this) {
            this.mDirtyFlags |= 4L;
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
        if(BR.codeMenuListener == v) {
            this.setCodeMenuListener(((CodeMenuClickListener)object0));
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

