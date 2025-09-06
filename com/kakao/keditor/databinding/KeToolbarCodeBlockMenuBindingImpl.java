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
import com.kakao.keditor.plugin.itemspec.codeblock.CodeBlockItem;
import com.kakao.keditor.plugin.itemspec.menulistener.CodeMenuClickListener;
import com.kakao.keditor.standard.BindingAdapters;

public class KeToolbarCodeBlockMenuBindingImpl extends KeToolbarCodeBlockMenuBinding implements Listener {
    @Nullable
    private final View.OnClickListener mCallback66;
    @Nullable
    private final View.OnClickListener mCallback67;
    private long mDirtyFlags;
    @NonNull
    private final RelativeLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    public KeToolbarCodeBlockMenuBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 3, KeToolbarCodeBlockMenuBindingImpl.sIncludes, KeToolbarCodeBlockMenuBindingImpl.sViewsWithIds));
    }

    private KeToolbarCodeBlockMenuBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((ImageView)arr_object[2]), ((ImageView)arr_object[1]));
        this.mDirtyFlags = -1L;
        this.keBtnDelete.setTag(null);
        this.keBtnEditCodeBlock.setTag(null);
        this.mboundView0 = (RelativeLayout)arr_object[0];
        ((RelativeLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.mCallback67 = new OnClickListener(this, 2);
        this.mCallback66 = new OnClickListener(this, 1);
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
                CodeMenuClickListener codeMenuClickListener1 = this.mCodeMenuListener;
                if(codeMenuClickListener1 != null) {
                    codeMenuClickListener1.onRemoveMenuClicked();
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
        boolean z = this.mDisplayMenu;
        int v1 = Long.compare(12L & v, 0L);
        if((v & 8L) != 0L) {
            this.keBtnDelete.setOnClickListener(this.mCallback67);
            this.keBtnEditCodeBlock.setOnClickListener(this.mCallback66);
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

    @Override  // com.kakao.keditor.databinding.KeToolbarCodeBlockMenuBinding
    public void setCodeBlock(@Nullable CodeBlockItem codeBlockItem0) {
        this.mCodeBlock = codeBlockItem0;
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarCodeBlockMenuBinding
    public void setCodeMenuListener(@Nullable CodeMenuClickListener codeMenuClickListener0) {
        this.mCodeMenuListener = codeMenuClickListener0;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.codeMenuListener);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarCodeBlockMenuBinding
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
        if(BR.codeMenuListener == v) {
            this.setCodeMenuListener(((CodeMenuClickListener)object0));
            return true;
        }
        if(BR.codeBlock == v) {
            this.setCodeBlock(((CodeBlockItem)object0));
            return true;
        }
        if(BR.displayMenu == v) {
            this.setDisplayMenu(((Boolean)object0).booleanValue());
            return true;
        }
        return false;
    }
}

