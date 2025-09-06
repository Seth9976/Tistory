package com.kakao.keditor.databinding;

import android.util.SparseIntArray;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.BR;
import com.kakao.keditor.R.id;
import com.kakao.keditor.generated.callback.OnClickListener.Listener;
import com.kakao.keditor.generated.callback.OnClickListener;
import com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridItem;
import com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener;
import com.kakao.keditor.standard.BindingAdapters;

public class KeToolbarImageGridMenuBindingImpl extends KeToolbarImageGridMenuBinding implements Listener {
    @Nullable
    private final View.OnClickListener mCallback12;
    @Nullable
    private final View.OnClickListener mCallback13;
    private long mDirtyFlags;
    @NonNull
    private final LinearLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeToolbarImageGridMenuBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_menu_horizontal_rule_scroll_view, 3);
    }

    public KeToolbarImageGridMenuBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 4, KeToolbarImageGridMenuBindingImpl.sIncludes, KeToolbarImageGridMenuBindingImpl.sViewsWithIds));
    }

    private KeToolbarImageGridMenuBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((ImageView)arr_object[2]), ((HorizontalScrollView)arr_object[3]), ((ImageView)arr_object[1]));
        this.mDirtyFlags = -1L;
        this.keBtnDelete.setTag(null);
        this.keMenuImageGridOpenEditor.setTag(null);
        this.mboundView0 = (LinearLayout)arr_object[0];
        ((LinearLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.mCallback12 = new OnClickListener(this, 1);
        this.mCallback13 = new OnClickListener(this, 2);
        this.invalidateAll();
    }

    @Override  // com.kakao.keditor.generated.callback.OnClickListener$Listener
    public final void _internalCallbackOnClick(int v, View view0) {
        switch(v) {
            case 1: {
                MediaMenuClickListener mediaMenuClickListener0 = this.mMediaMenuListener;
                if(mediaMenuClickListener0 != null) {
                    mediaMenuClickListener0.onEditImageGridClicked();
                    return;
                }
                break;
            }
            case 2: {
                MediaMenuClickListener mediaMenuClickListener1 = this.mMediaMenuListener;
                if(mediaMenuClickListener1 != null) {
                    mediaMenuClickListener1.onRemoveMenuClicked();
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
        int v1 = Long.compare(10L & v, 0L);
        if((v & 8L) != 0L) {
            this.keBtnDelete.setOnClickListener(this.mCallback13);
            this.keMenuImageGridOpenEditor.setOnClickListener(this.mCallback12);
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

    @Override  // com.kakao.keditor.databinding.KeToolbarImageGridMenuBinding
    public void setDisplayMenu(boolean z) {
        this.mDisplayMenu = z;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.displayMenu);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarImageGridMenuBinding
    public void setImageGrid(@Nullable ImageGridItem imageGridItem0) {
        this.mImageGrid = imageGridItem0;
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarImageGridMenuBinding
    public void setMediaMenuListener(@Nullable MediaMenuClickListener mediaMenuClickListener0) {
        this.mMediaMenuListener = mediaMenuClickListener0;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.mediaMenuListener);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.mediaMenuListener == v) {
            this.setMediaMenuListener(((MediaMenuClickListener)object0));
            return true;
        }
        if(BR.displayMenu == v) {
            this.setDisplayMenu(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.imageGrid == v) {
            this.setImageGrid(((ImageGridItem)object0));
            return true;
        }
        return false;
    }
}

