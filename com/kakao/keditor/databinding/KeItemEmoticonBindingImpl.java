package com.kakao.keditor.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.BR;
import com.kakao.keditor.R.dimen;
import com.kakao.keditor.plugin.itemspec.emoticon.EmoticonItem;
import com.kakao.keditor.plugin.pluginspec.emoticon.BindingAdapter;
import com.kakao.keditor.standard.BindingAdapters;
import com.kakao.kemoticon.EmoticonView;

public class KeItemEmoticonBindingImpl extends KeItemEmoticonBinding {
    private long mDirtyFlags;
    @NonNull
    private final FrameLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    public KeItemEmoticonBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 3, KeItemEmoticonBindingImpl.sIncludes, KeItemEmoticonBindingImpl.sViewsWithIds));
    }

    private KeItemEmoticonBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((EmoticonView)arr_object[1]), ((View)arr_object[2]));
        this.mDirtyFlags = -1L;
        this.keItemEmoticon.setTag(null);
        this.keItemEmoticonBorder.setTag(null);
        this.mboundView0 = (FrameLayout)arr_object[0];
        ((FrameLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        float f1;
        int v1;
        Resources resources0;
        float f;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z = this.mHasFocus;
        EmoticonItem emoticonItem0 = this.mItem;
        if(Long.compare(v & 6L, 0L) == 0) {
            f = 0.0f;
            f1 = 0.0f;
        }
        else {
            boolean z1 = "face".equals((emoticonItem0 == null ? null : emoticonItem0.getPackId()));
            v |= (z1 ? 80L : 40L);
            f = this.keItemEmoticon.getResources().getDimension((z1 ? dimen.ke_emoticon_size_small : dimen.ke_emoticon_size));
            if(z1) {
                resources0 = this.keItemEmoticonBorder.getResources();
                v1 = dimen.ke_emoticon_size_small;
            }
            else {
                resources0 = this.keItemEmoticonBorder.getResources();
                v1 = dimen.ke_emoticon_size;
            }
            f1 = resources0.getDimension(v1);
        }
        if((6L & v) != 0L) {
            BindingAdapters.setAlign(this.keItemEmoticon, emoticonItem0);
            BindingAdapter.setLayoutWidth(this.keItemEmoticon, f);
            BindingAdapter.setLayoutHeight(this.keItemEmoticon, f);
            BindingAdapter.setEmoticon(this.keItemEmoticon, emoticonItem0);
            BindingAdapters.setAlign(this.keItemEmoticonBorder, emoticonItem0);
            BindingAdapter.setLayoutWidth(this.keItemEmoticonBorder, f1);
            BindingAdapter.setLayoutHeight(this.keItemEmoticonBorder, f1);
        }
        if((v & 5L) != 0L) {
            BindingAdapters.goneUnless(this.keItemEmoticonBorder, Boolean.valueOf(z));
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

    @Override  // com.kakao.keditor.databinding.KeItemEmoticonBinding
    public void setHasFocus(boolean z) {
        this.mHasFocus = z;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.hasFocus);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeItemEmoticonBinding
    public void setItem(@Nullable EmoticonItem emoticonItem0) {
        this.mItem = emoticonItem0;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.item);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.hasFocus == v) {
            this.setHasFocus(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.item == v) {
            this.setItem(((EmoticonItem)object0));
            return true;
        }
        return false;
    }
}

