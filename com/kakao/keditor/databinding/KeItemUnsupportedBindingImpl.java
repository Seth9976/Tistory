package com.kakao.keditor.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.BR;
import com.kakao.keditor.plugin.itemspec.unsupport.UnSupportedItem;
import com.kakao.keditor.plugin.itemspec.unsupport.UnSupportedType;
import com.kakao.keditor.standard.BindingAdapters;

public class KeItemUnsupportedBindingImpl extends KeItemUnsupportedBinding {
    private long mDirtyFlags;
    @NonNull
    private final FrameLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    public KeItemUnsupportedBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 4, KeItemUnsupportedBindingImpl.sIncludes, KeItemUnsupportedBindingImpl.sViewsWithIds));
    }

    private KeItemUnsupportedBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((View)arr_object[3]), ((ImageView)arr_object[1]), ((TextView)arr_object[2]));
        this.mDirtyFlags = -1L;
        this.keItemHorizontalRuleBorderView.setTag(null);
        this.kePluginUnknownImage.setTag(null);
        this.kePluginUnknownText.setTag(null);
        this.mboundView0 = (FrameLayout)arr_object[0];
        ((FrameLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        int v3;
        int v2;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        UnSupportedItem unSupportedItem0 = this.mUnSupportedItem;
        boolean z = this.mHasFocus;
        int v1 = Long.compare(5L & v, 0L);
        if(v1 == 0) {
            v2 = 0;
            v3 = 0;
        }
        else {
            UnSupportedType unSupportedType0 = unSupportedItem0 == null ? null : unSupportedItem0.getUnSupportedType();
            if(unSupportedType0 == null) {
                v2 = 0;
                v3 = 0;
            }
            else {
                v2 = unSupportedType0.getStrResId();
                v3 = unSupportedType0.getImgResId();
            }
        }
        if((v & 6L) != 0L) {
            BindingAdapters.goneUnless(this.keItemHorizontalRuleBorderView, Boolean.valueOf(z));
        }
        if(v1 != 0) {
            BindingAdapters.setSrc(this.kePluginUnknownImage, v3);
            this.kePluginUnknownText.setText(v2);
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

    @Override  // com.kakao.keditor.databinding.KeItemUnsupportedBinding
    public void setHasFocus(boolean z) {
        this.mHasFocus = z;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.hasFocus);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeItemUnsupportedBinding
    public void setUnSupportedItem(@Nullable UnSupportedItem unSupportedItem0) {
        this.mUnSupportedItem = unSupportedItem0;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.unSupportedItem);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.unSupportedItem == v) {
            this.setUnSupportedItem(((UnSupportedItem)object0));
            return true;
        }
        if(BR.hasFocus == v) {
            this.setHasFocus(((Boolean)object0).booleanValue());
            return true;
        }
        return false;
    }
}

