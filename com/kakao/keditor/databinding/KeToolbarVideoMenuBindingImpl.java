package com.kakao.keditor.databinding;

import android.util.SparseIntArray;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.FrameLayout;
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
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.Style;
import com.kakao.keditor.plugin.attrs.item.MobileStyle;
import com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener;
import com.kakao.keditor.plugin.itemspec.video.VideoItem;
import com.kakao.keditor.standard.BindingAdapters;
import java.util.List;

public class KeToolbarVideoMenuBindingImpl extends KeToolbarVideoMenuBinding implements Listener {
    @Nullable
    private final View.OnClickListener mCallback51;
    @Nullable
    private final View.OnClickListener mCallback52;
    @Nullable
    private final View.OnClickListener mCallback53;
    @Nullable
    private final View.OnClickListener mCallback54;
    private long mDirtyFlags;
    @NonNull
    private final FrameLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeToolbarVideoMenuBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_menu_video_edit_layout, 5);
    }

    public KeToolbarVideoMenuBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 6, KeToolbarVideoMenuBindingImpl.sIncludes, KeToolbarVideoMenuBindingImpl.sViewsWithIds));
    }

    private KeToolbarVideoMenuBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((ImageView)arr_object[3]), ((ImageView)arr_object[4]), ((ImageView)arr_object[1]), ((ImageView)arr_object[2]), ((LinearLayout)arr_object[5]));
        this.mDirtyFlags = -1L;
        this.keBtnAlign.setTag(null);
        this.keBtnDelete.setTag(null);
        this.keBtnVideoFitContent.setTag(null);
        this.keBtnVideoMatchParent.setTag(null);
        this.mboundView0 = (FrameLayout)arr_object[0];
        ((FrameLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.mCallback52 = new OnClickListener(this, 2);
        this.mCallback54 = new OnClickListener(this, 4);
        this.mCallback53 = new OnClickListener(this, 3);
        this.mCallback51 = new OnClickListener(this, 1);
        this.invalidateAll();
    }

    @Override  // com.kakao.keditor.generated.callback.OnClickListener$Listener
    public final void _internalCallbackOnClick(int v, View view0) {
        switch(v) {
            case 1: {
                MediaMenuClickListener mediaMenuClickListener0 = this.mMediaMenuListener;
                if(mediaMenuClickListener0 != null) {
                    mediaMenuClickListener0.onMobileStyleChangeClicked(MobileStyle.Content);
                    return;
                }
                break;
            }
            case 2: {
                MediaMenuClickListener mediaMenuClickListener1 = this.mMediaMenuListener;
                if(mediaMenuClickListener1 != null) {
                    mediaMenuClickListener1.onMobileStyleChangeClicked(MobileStyle.Full);
                    return;
                }
                break;
            }
            case 3: {
                MediaMenuClickListener mediaMenuClickListener2 = this.mMediaMenuListener;
                VideoItem videoItem0 = this.mVideoItem;
                if(mediaMenuClickListener2 != null && videoItem0 != null) {
                    Style style0 = videoItem0.getStyle();
                    if(style0 != null) {
                        mediaMenuClickListener2.onAlignmentChanged(style0.toAlignment());
                        return;
                    }
                }
                break;
            }
            case 4: {
                MediaMenuClickListener mediaMenuClickListener3 = this.mMediaMenuListener;
                if(mediaMenuClickListener3 != null) {
                    mediaMenuClickListener3.onRemoveMenuClicked();
                    return;
                }
                break;
            }
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        boolean z6;
        boolean z2;
        boolean z1;
        Style style0;
        MobileStyle mobileStyle0;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z = this.mDisplayMenu;
        List list0 = this.mVideoStyles;
        VideoItem videoItem0 = this.mVideoItem;
        Alignment alignment0 = null;
        if(Long.compare(v & 24L, 0L) == 0) {
            z1 = false;
            z2 = false;
        }
        else {
            if(videoItem0 == null) {
                style0 = null;
                mobileStyle0 = null;
            }
            else {
                mobileStyle0 = videoItem0.getMobileStyle();
                style0 = videoItem0.getStyle();
            }
            String s = mobileStyle0 == null ? null : mobileStyle0.getStr();
            if(style0 != null) {
                alignment0 = style0.toAlignment();
            }
            z1 = "widthContent".equals(s);
            z2 = "widthFull".equals(s);
        }
        boolean z3 = true;
        if(Long.compare(v & 20L, 0L) == 0) {
            z3 = false;
        }
        else {
            v |= ((list0 == null ? 0 : list0.size()) <= 1 ? 0xA0L : 320L);
        }
        boolean z4 = (v & 0x40L) == 0L || list0 == null ? false : list0.contains("full");
        boolean z5 = (v & 0x100L) == 0L || list0 == null ? false : list0.contains("content");
        int v1 = Long.compare(v & 20L, 0L);
        if(v1 == 0) {
            z4 = false;
            z6 = false;
        }
        else {
            if(!z3) {
                z4 = false;
            }
            z6 = z3 ? z5 : false;
        }
        if((24L & v) != 0L) {
            BindingAdapters.alignment(this.keBtnAlign, alignment0);
            BindingAdapters.setSelected(this.keBtnVideoFitContent, z1);
            BindingAdapters.setSelected(this.keBtnVideoMatchParent, z2);
        }
        if((16L & v) != 0L) {
            this.keBtnAlign.setOnClickListener(this.mCallback53);
            this.keBtnDelete.setOnClickListener(this.mCallback54);
            this.keBtnVideoFitContent.setOnClickListener(this.mCallback51);
            this.keBtnVideoMatchParent.setOnClickListener(this.mCallback52);
        }
        if(v1 != 0) {
            BindingAdapters.goneUnless(this.keBtnVideoFitContent, Boolean.valueOf(z6));
            BindingAdapters.goneUnless(this.keBtnVideoMatchParent, Boolean.valueOf(z4));
        }
        if((v & 17L) != 0L) {
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

    @Override  // com.kakao.keditor.databinding.KeToolbarVideoMenuBinding
    public void setDisplayMenu(boolean z) {
        this.mDisplayMenu = z;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.displayMenu);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarVideoMenuBinding
    public void setMediaMenuListener(@Nullable MediaMenuClickListener mediaMenuClickListener0) {
        this.mMediaMenuListener = mediaMenuClickListener0;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.mediaMenuListener);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.displayMenu == v) {
            this.setDisplayMenu(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.mediaMenuListener == v) {
            this.setMediaMenuListener(((MediaMenuClickListener)object0));
            return true;
        }
        if(BR.videoStyles == v) {
            this.setVideoStyles(((List)object0));
            return true;
        }
        if(BR.videoItem == v) {
            this.setVideoItem(((VideoItem)object0));
            return true;
        }
        return false;
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarVideoMenuBinding
    public void setVideoItem(@Nullable VideoItem videoItem0) {
        this.mVideoItem = videoItem0;
        synchronized(this) {
            this.mDirtyFlags |= 8L;
        }
        this.notifyPropertyChanged(BR.videoItem);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarVideoMenuBinding
    public void setVideoStyles(@Nullable List list0) {
        this.mVideoStyles = list0;
        synchronized(this) {
            this.mDirtyFlags |= 4L;
        }
        this.notifyPropertyChanged(BR.videoStyles);
        super.requestRebind();
    }
}

