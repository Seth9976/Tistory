package com.kakao.keditor.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import com.kakao.keditor.BR;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.R.id;
import com.kakao.keditor.R.string;
import com.kakao.keditor.generated.callback.OnClickListener.Listener;
import com.kakao.keditor.generated.callback.OnClickListener;
import com.kakao.keditor.standard.BindingAdapters;
import com.kakao.keditor.toolbar.category.OverlayCategory.MorePlugin;
import com.kakao.keditor.toolbar.category.OverlayCategory;
import com.kakao.keditor.toolbar.category.ToolbarCategory;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.ToolbarRequest.OnToolbarExtraClicked;

public class KeToolbarLayoutBindingImpl extends KeToolbarLayoutBinding implements Listener {
    @Nullable
    private final View.OnClickListener mCallback16;
    private long mDirtyFlags;
    @NonNull
    private final LinearLayout mboundView0;
    @NonNull
    private final FrameLayout mboundView2;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeToolbarLayoutBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_menu_root, 4);
        sparseIntArray0.put(id.ke_menu_container, 5);
        sparseIntArray0.put(id.overlay, 6);
    }

    public KeToolbarLayoutBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 7, KeToolbarLayoutBindingImpl.sIncludes, KeToolbarLayoutBindingImpl.sViewsWithIds));
    }

    private KeToolbarLayoutBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((ImageView)arr_object[3]), ((LinearLayout)arr_object[5]), ((ImageView)arr_object[1]), ((FrameLayout)arr_object[4]), ((FrameLayout)arr_object[6]));
        this.mDirtyFlags = -1L;
        this.keBtnExtra.setTag(null);
        this.keMenuMore.setTag(null);
        this.mboundView0 = (LinearLayout)arr_object[0];
        ((LinearLayout)arr_object[0]).setTag(null);
        this.mboundView2 = (FrameLayout)arr_object[2];
        ((FrameLayout)arr_object[2]).setTag(null);
        this.setRootTag(view0);
        this.mCallback16 = new OnClickListener(this, 1);
        this.invalidateAll();
    }

    @Override  // com.kakao.keditor.generated.callback.OnClickListener$Listener
    public final void _internalCallbackOnClick(int v, View view0) {
        KeEvent keEvent0 = KeEvent.INSTANCE;
        if(keEvent0 != null) {
            keEvent0.postInScope(OnToolbarExtraClicked.INSTANCE);
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        int v4;
        String s;
        boolean z3;
        boolean z2;
        boolean z1;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        int v1 = this.mExtraButtonContentDescriptionSrc;
        int v2 = this.mExtraButtonSrc;
        OverlayCategory overlayCategory0 = this.mActiveOverlayCategory;
        boolean z = this.mIsEnableExtra;
        if(Long.compare(v & 33L, 0L) == 0) {
            z1 = false;
        }
        else {
            z1 = v1 != 0;
            v |= (z1 ? 0x2000L : 0x1000L);
        }
        if(Long.compare(v & 34L, 0L) == 0) {
            z2 = false;
        }
        else {
            z2 = v2 != 0;
            v |= (z2 ? 0x800L : 0x400L);
        }
        if(Long.compare(v & 36L, 0L) == 0) {
            z3 = false;
            s = null;
        }
        else {
            z3 = overlayCategory0 == MorePlugin.INSTANCE;
            v |= (z3 ? 0x200L : 0x100L);
            s = this.keMenuMore.getResources().getString((z3 ? string.cd_fold : string.cd_unfold));
        }
        boolean z4 = Long.compare(v & 0x800L, 0L) != 0 && v2 != -1;
        int v3 = (0x2000L & v) == 0L || v1 == -1 ? 0 : 1;
        if(Long.compare(v & 34L, 0L) == 0) {
            z4 = false;
        }
        else {
            if(!z2) {
                z4 = false;
            }
            v |= (z4 ? 0x8000L : 0x4000L);
        }
        if(Long.compare(v & 33L, 0L) == 0) {
            v4 = 0;
        }
        else {
            v4 = z1 ? v3 : 0;
            v |= (v4 == 0 ? 0x40L : 0x80L);
        }
        Drawable drawable0 = (v & 0x8000L) == 0L ? null : this.getRoot().getContext().getDrawable(v2);
        String s1 = (v & 0x80L) == 0L ? null : this.getRoot().getContext().getString(v1);
        int v5 = Long.compare(33L & v, 0L);
        if(v5 == 0) {
            s1 = null;
        }
        else if(v4 == 0) {
            s1 = this.mboundView2.getResources().getString(string.cd_setting);
        }
        int v6 = Long.compare(v & 34L, 0L);
        if(v6 == 0) {
            drawable0 = null;
        }
        else if(!z4) {
            drawable0 = AppCompatResources.getDrawable(this.keBtnExtra.getContext(), drawable.ke_toolbar_ic_setting);
        }
        if(v6 != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.keBtnExtra, drawable0);
        }
        if((v & 36L) != 0L) {
            BindingAdapters.setSelected(this.keMenuMore, z3);
            String s2 = this.keMenuMore.getResources().getString(string.cd_more_plugin);
            BindingAdapters.setContentDescriptionWith(this.keMenuMore, s2, s, null);
        }
        if((0x20L & v) != 0L) {
            BindingAdapters.applyAccessibilityInfo(this.keMenuMore, true, null, Boolean.FALSE);
            this.mboundView2.setOnClickListener(this.mCallback16);
            BindingAdapters.applyAccessibilityInfo(this.mboundView2, true, null, null);
        }
        if((v & 0x30L) != 0L) {
            BindingAdapters.goneUnless(this.mboundView2, Boolean.valueOf(z));
        }
        if(v5 != 0) {
            this.mboundView2.setContentDescription(s1);
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
            this.mDirtyFlags = 0x20L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarLayoutBinding
    public void setActiveCategory(@Nullable ToolbarCategory toolbarCategory0) {
        this.mActiveCategory = toolbarCategory0;
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarLayoutBinding
    public void setActiveOverlayCategory(@Nullable OverlayCategory overlayCategory0) {
        this.mActiveOverlayCategory = overlayCategory0;
        synchronized(this) {
            this.mDirtyFlags |= 4L;
        }
        this.notifyPropertyChanged(BR.activeOverlayCategory);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarLayoutBinding
    public void setExtraButtonContentDescriptionSrc(int v) {
        this.mExtraButtonContentDescriptionSrc = v;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.extraButtonContentDescriptionSrc);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarLayoutBinding
    public void setExtraButtonSrc(int v) {
        this.mExtraButtonSrc = v;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.extraButtonSrc);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarLayoutBinding
    public void setIsEnableExtra(boolean z) {
        this.mIsEnableExtra = z;
        synchronized(this) {
            this.mDirtyFlags |= 16L;
        }
        this.notifyPropertyChanged(BR.isEnableExtra);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.extraButtonContentDescriptionSrc == v) {
            this.setExtraButtonContentDescriptionSrc(((int)(((Integer)object0))));
            return true;
        }
        if(BR.extraButtonSrc == v) {
            this.setExtraButtonSrc(((int)(((Integer)object0))));
            return true;
        }
        if(BR.activeOverlayCategory == v) {
            this.setActiveOverlayCategory(((OverlayCategory)object0));
            return true;
        }
        if(BR.activeCategory == v) {
            this.setActiveCategory(((ToolbarCategory)object0));
            return true;
        }
        if(BR.isEnableExtra == v) {
            this.setIsEnableExtra(((Boolean)object0).booleanValue());
            return true;
        }
        return false;
    }
}

