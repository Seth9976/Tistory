package com.kakao.keditor.databinding;

import android.util.SparseIntArray;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.BR;
import com.kakao.keditor.generated.callback.OnClickListener.Listener;
import com.kakao.keditor.generated.callback.OnClickListener;
import com.kakao.keditor.standard.BindingAdapters;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuClickedListener;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuItem;

public class KeToolbarOverlayItemBindingImpl extends KeToolbarOverlayItemBinding implements Listener {
    @Nullable
    private final View.OnClickListener mCallback64;
    private long mDirtyFlags;
    @NonNull
    private final LinearLayout mboundView0;
    @NonNull
    private final ImageView mboundView1;
    @NonNull
    private final TextView mboundView2;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    public KeToolbarOverlayItemBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 3, KeToolbarOverlayItemBindingImpl.sIncludes, KeToolbarOverlayItemBindingImpl.sViewsWithIds));
    }

    private KeToolbarOverlayItemBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0);
        this.mDirtyFlags = -1L;
        this.mboundView0 = (LinearLayout)arr_object[0];
        ((LinearLayout)arr_object[0]).setTag(null);
        this.mboundView1 = (ImageView)arr_object[1];
        ((ImageView)arr_object[1]).setTag(null);
        this.mboundView2 = (TextView)arr_object[2];
        ((TextView)arr_object[2]).setTag(null);
        this.setRootTag(view0);
        this.mCallback64 = new OnClickListener(this, 1);
        this.invalidateAll();
    }

    @Override  // com.kakao.keditor.generated.callback.OnClickListener$Listener
    public final void _internalCallbackOnClick(int v, View view0) {
        ToolbarOverlayMenuItem toolbarOverlayMenuItem0 = this.mItem;
        ToolbarOverlayMenuClickedListener toolbarOverlayMenuClickedListener0 = this.mListener;
        if(toolbarOverlayMenuClickedListener0 != null) {
            toolbarOverlayMenuClickedListener0.onOverlayMenuClicked(toolbarOverlayMenuItem0);
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        int v7;
        String s1;
        int v6;
        int v5;
        int v4;
        String s;
        int v3;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        ToolbarOverlayMenuItem toolbarOverlayMenuItem0 = this.mItem;
        int v1 = Long.compare(10L & v, 0L);
        int v2 = 0;
        if(v1 == 0) {
            v6 = 0;
            v7 = 0;
            s1 = null;
            s = null;
        }
        else {
            if(toolbarOverlayMenuItem0 == null) {
                v4 = 0;
                v5 = 0;
                v3 = 0;
                s = null;
            }
            else {
                v3 = toolbarOverlayMenuItem0.getId();
                s = toolbarOverlayMenuItem0.getCurrentValue();
                v4 = toolbarOverlayMenuItem0.getIconResId();
                v5 = toolbarOverlayMenuItem0.getTextResId();
                v2 = toolbarOverlayMenuItem0.getAccessibilityDescResId();
            }
            v6 = v4;
            s1 = this.getRoot().getContext().getString(v2);
            v2 = v3;
            v7 = v5;
        }
        if((v & 8L) != 0L) {
            this.mboundView0.setOnClickListener(this.mCallback64);
            BindingAdapters.applyAccessibilityInfo(this.mboundView0, true, null, null);
        }
        if(v1 != 0) {
            BindingAdapters.setRuntimeId(this.mboundView0, v2);
            BindingAdapters.setContentDescriptionWith(this.mboundView0, s1, s, null);
            BindingAdapters.setSrc(this.mboundView1, v6);
            this.mboundView2.setText(v7);
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

    @Override  // com.kakao.keditor.databinding.KeToolbarOverlayItemBinding
    public void setIsSelected(boolean z) {
        this.mIsSelected = z;
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarOverlayItemBinding
    public void setItem(@Nullable ToolbarOverlayMenuItem toolbarOverlayMenuItem0) {
        this.mItem = toolbarOverlayMenuItem0;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.item);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarOverlayItemBinding
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
            this.setItem(((ToolbarOverlayMenuItem)object0));
            return true;
        }
        if(BR.listener == v) {
            this.setListener(((ToolbarOverlayMenuClickedListener)object0));
            return true;
        }
        return false;
    }
}

