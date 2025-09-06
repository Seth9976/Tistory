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
import com.kakao.keditor.plugin.itemspec.horizontalrule.HorizontalRuleItem;
import com.kakao.keditor.standard.BindingAdapters;

public class KeItemHorizontalRuleBindingImpl extends KeItemHorizontalRuleBinding {
    private long mDirtyFlags;
    @NonNull
    private final FrameLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    public KeItemHorizontalRuleBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 3, KeItemHorizontalRuleBindingImpl.sIncludes, KeItemHorizontalRuleBindingImpl.sViewsWithIds));
    }

    private KeItemHorizontalRuleBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((ImageView)arr_object[1]), ((View)arr_object[2]));
        this.mDirtyFlags = -1L;
        this.keItemHorizontalRule.setTag(null);
        this.keItemHorizontalRuleBorderView.setTag(null);
        this.mboundView0 = (FrameLayout)arr_object[0];
        ((FrameLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z = this.mHasFocus;
        int v1 = Long.compare(5L & v, 0L);
        int v2 = v1 == 0 || this.mHorizontalRule == null ? 0 : this.mHorizontalRule.imageSrc();
        int v3 = Long.compare(v & 6L, 0L);
        if(v1 != 0) {
            BindingAdapters.setSrc(this.keItemHorizontalRule, v2);
        }
        if(v3 != 0) {
            BindingAdapters.goneUnless(this.keItemHorizontalRuleBorderView, Boolean.valueOf(z));
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

    @Override  // com.kakao.keditor.databinding.KeItemHorizontalRuleBinding
    public void setHasFocus(boolean z) {
        this.mHasFocus = z;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.hasFocus);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeItemHorizontalRuleBinding
    public void setHorizontalRule(@Nullable HorizontalRuleItem horizontalRuleItem0) {
        this.mHorizontalRule = horizontalRuleItem0;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.horizontalRule);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.horizontalRule == v) {
            this.setHorizontalRule(((HorizontalRuleItem)object0));
            return true;
        }
        if(BR.hasFocus == v) {
            this.setHasFocus(((Boolean)object0).booleanValue());
            return true;
        }
        return false;
    }
}

