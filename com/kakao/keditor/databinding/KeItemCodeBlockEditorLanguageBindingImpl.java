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
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.kakao.keditor.BR;
import com.kakao.keditor.standard.BindingAdapters;

public class KeItemCodeBlockEditorLanguageBindingImpl extends KeItemCodeBlockEditorLanguageBinding {
    private long mDirtyFlags;
    @NonNull
    private final FrameLayout mboundView0;
    @NonNull
    private final ImageView mboundView1;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    public KeItemCodeBlockEditorLanguageBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 3, KeItemCodeBlockEditorLanguageBindingImpl.sIncludes, KeItemCodeBlockEditorLanguageBindingImpl.sViewsWithIds));
    }

    private KeItemCodeBlockEditorLanguageBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((TextView)arr_object[2]));
        this.mDirtyFlags = -1L;
        this.languageName.setTag(null);
        this.mboundView0 = (FrameLayout)arr_object[0];
        ((FrameLayout)arr_object[0]).setTag(null);
        this.mboundView1 = (ImageView)arr_object[1];
        ((ImageView)arr_object[1]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        float f;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z = this.mIsSelected;
        String s = this.mLanguage;
        if(Long.compare(v & 5L, 0L) == 0) {
            f = 0.0f;
        }
        else {
            v |= (z ? 16L : 8L);
            f = z ? 1.0f : 0.5f;
        }
        int v1 = Long.compare(6L & v, 0L);
        if((v & 5L) != 0L) {
            this.languageName.setAlpha(f);
            BindingAdapters.goneUnless(this.mboundView1, Boolean.valueOf(z));
        }
        if(v1 != 0) {
            TextViewBindingAdapter.setText(this.languageName, s);
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

    @Override  // com.kakao.keditor.databinding.KeItemCodeBlockEditorLanguageBinding
    public void setIsSelected(boolean z) {
        this.mIsSelected = z;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.isSelected);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeItemCodeBlockEditorLanguageBinding
    public void setLanguage(@Nullable String s) {
        this.mLanguage = s;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.language);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.isSelected == v) {
            this.setIsSelected(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.language == v) {
            this.setLanguage(((String)object0));
            return true;
        }
        return false;
    }
}

