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
import com.kakao.keditor.plugin.pluginspec.image.ImageItem;
import com.kakao.keditor.standard.BindingAdapters;
import java.util.List;

public class KeToolbarImageMenuBindingImpl extends KeToolbarImageMenuBinding implements Listener {
    @Nullable
    private final View.OnClickListener mCallback28;
    @Nullable
    private final View.OnClickListener mCallback29;
    @Nullable
    private final View.OnClickListener mCallback30;
    @Nullable
    private final View.OnClickListener mCallback31;
    @Nullable
    private final View.OnClickListener mCallback32;
    @Nullable
    private final View.OnClickListener mCallback33;
    @Nullable
    private final View.OnClickListener mCallback34;
    private long mDirtyFlags;
    @NonNull
    private final FrameLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeToolbarImageMenuBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_menu_image_edit_layout, 8);
    }

    public KeToolbarImageMenuBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 9, KeToolbarImageMenuBindingImpl.sIncludes, KeToolbarImageMenuBindingImpl.sViewsWithIds));
    }

    private KeToolbarImageMenuBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((ImageView)arr_object[4]), ((ImageView)arr_object[7]), ((ImageView)arr_object[5]), ((ImageView)arr_object[2]), ((ImageView)arr_object[3]), ((ImageView)arr_object[1]), ((ImageView)arr_object[6]), ((LinearLayout)arr_object[8]));
        this.mDirtyFlags = -1L;
        this.imageAlign.setTag(null);
        this.keBtnDelete.setTag(null);
        this.keBtnImageEdit.setTag(null);
        this.keBtnImageFitContent.setTag(null);
        this.keBtnImageMatchParent.setTag(null);
        this.keBtnImageOriginCenter.setTag(null);
        this.keBtnLink.setTag(null);
        this.mboundView0 = (FrameLayout)arr_object[0];
        ((FrameLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.mCallback30 = new OnClickListener(this, 3);
        this.mCallback28 = new OnClickListener(this, 1);
        this.mCallback32 = new OnClickListener(this, 5);
        this.mCallback31 = new OnClickListener(this, 4);
        this.mCallback33 = new OnClickListener(this, 6);
        this.mCallback29 = new OnClickListener(this, 2);
        this.mCallback34 = new OnClickListener(this, 7);
        this.invalidateAll();
    }

    @Override  // com.kakao.keditor.generated.callback.OnClickListener$Listener
    public final void _internalCallbackOnClick(int v, View view0) {
        switch(v) {
            case 1: {
                MediaMenuClickListener mediaMenuClickListener0 = this.mMediaMenuListener;
                if(mediaMenuClickListener0 != null) {
                    mediaMenuClickListener0.onMobileStyleChangeClicked(MobileStyle.Origin);
                    return;
                }
                break;
            }
            case 2: {
                MediaMenuClickListener mediaMenuClickListener1 = this.mMediaMenuListener;
                if(mediaMenuClickListener1 != null) {
                    mediaMenuClickListener1.onMobileStyleChangeClicked(MobileStyle.Content);
                    return;
                }
                break;
            }
            case 3: {
                MediaMenuClickListener mediaMenuClickListener2 = this.mMediaMenuListener;
                if(mediaMenuClickListener2 != null) {
                    mediaMenuClickListener2.onMobileStyleChangeClicked(MobileStyle.Full);
                    return;
                }
                break;
            }
            case 4: {
                ImageItem imageItem0 = this.mImageItem;
                MediaMenuClickListener mediaMenuClickListener3 = this.mMediaMenuListener;
                if(mediaMenuClickListener3 != null && imageItem0 != null) {
                    Style style0 = imageItem0.getStyle();
                    if(style0 != null) {
                        mediaMenuClickListener3.onAlignmentChanged(style0.toAlignment());
                        return;
                    }
                }
                break;
            }
            case 5: {
                MediaMenuClickListener mediaMenuClickListener4 = this.mMediaMenuListener;
                if(mediaMenuClickListener4 != null) {
                    mediaMenuClickListener4.onEditImageClicked();
                    return;
                }
                break;
            }
            case 6: {
                MediaMenuClickListener mediaMenuClickListener5 = this.mMediaMenuListener;
                if(mediaMenuClickListener5 != null) {
                    mediaMenuClickListener5.onLinkClicked();
                    return;
                }
                break;
            }
            case 7: {
                MediaMenuClickListener mediaMenuClickListener6 = this.mMediaMenuListener;
                if(mediaMenuClickListener6 != null) {
                    mediaMenuClickListener6.onRemoveMenuClicked();
                    return;
                }
                break;
            }
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        int v5;
        boolean z6;
        MobileStyle mobileStyle1;
        boolean z5;
        boolean z4;
        Alignment alignment1;
        boolean z3;
        boolean z2;
        Style style0;
        String s;
        MobileStyle mobileStyle0;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z = this.mIsEnableImageEdit;
        List list0 = this.mImageStyles;
        boolean z1 = this.mDisplayMenu;
        ImageItem imageItem0 = this.mImageItem;
        if(Long.compare(v & 0x30L, 0L) == 0) {
            z2 = false;
            mobileStyle1 = null;
            z5 = false;
            alignment1 = null;
            z3 = false;
            z4 = false;
        }
        else {
            if(imageItem0 == null) {
                mobileStyle0 = null;
                s = null;
                style0 = null;
            }
            else {
                mobileStyle0 = imageItem0.getMobileStyle();
                s = imageItem0.getLink();
                style0 = imageItem0.getStyle();
            }
            String s1 = mobileStyle0 == null ? null : mobileStyle0.getStr();
            Alignment alignment0 = style0 == null ? null : style0.toAlignment();
            z2 = "widthOrigin".equals(s1);
            z3 = "widthContent".equals(s1);
            alignment1 = alignment0;
            z4 = s != null;
            z5 = "widthFull".equals(s1);
            mobileStyle1 = mobileStyle0;
        }
        if(Long.compare(v & 49L, 0L) != 0) {
            v = z ? v | 0x800L : v | 0x400L;
        }
        if(Long.compare(v & 34L, 0L) == 0) {
            z6 = false;
        }
        else {
            z6 = (list0 == null ? 0 : list0.size()) > 1;
            v |= (z6 ? 0x2280L : 0x1140L);
        }
        int v1 = Long.compare(v & 36L, 0L);
        boolean z7 = (v & 0x2000L) == 0L || list0 == null ? false : list0.contains("full");
        boolean z8 = (v & 0x200L) == 0L || list0 == null ? false : list0.contains("content");
        int v2 = (v & 0x800L) == 0L ? 0 : !(imageItem0 == null ? false : imageItem0.isGif());
        boolean z9 = (v & 0x80L) == 0L || list0 == null ? false : list0.contains("origin");
        int v3 = Long.compare(v & 34L, 0L);
        if(v3 == 0) {
            z8 = false;
            z9 = false;
            z7 = false;
        }
        else {
            if(!z6) {
                z9 = false;
            }
            if(!z6) {
                z8 = false;
            }
            if(!z6) {
                z7 = false;
            }
        }
        int v4 = Long.compare(v & 49L, 0L);
        if(v4 == 0) {
            v5 = 0;
        }
        else if(z) {
            v5 = v2;
        }
        else {
            v5 = 0;
        }
        if((v & 0x30L) != 0L) {
            BindingAdapters.alignment(this.imageAlign, alignment1);
            BindingAdapters.setSelected(this.keBtnImageFitContent, z3);
            BindingAdapters.mobileStyleVisible(this.keBtnImageFitContent, mobileStyle1);
            BindingAdapters.setSelected(this.keBtnImageMatchParent, z5);
            BindingAdapters.mobileStyleVisible(this.keBtnImageMatchParent, mobileStyle1);
            BindingAdapters.setSelected(this.keBtnImageOriginCenter, z2);
            BindingAdapters.mobileStyleVisible(this.keBtnImageOriginCenter, mobileStyle1);
            BindingAdapters.setSelected(this.keBtnLink, z4);
        }
        if((v & 0x20L) != 0L) {
            this.imageAlign.setOnClickListener(this.mCallback31);
            this.keBtnDelete.setOnClickListener(this.mCallback34);
            this.keBtnImageEdit.setOnClickListener(this.mCallback32);
            this.keBtnImageFitContent.setOnClickListener(this.mCallback29);
            this.keBtnImageMatchParent.setOnClickListener(this.mCallback30);
            this.keBtnImageOriginCenter.setOnClickListener(this.mCallback28);
            this.keBtnLink.setOnClickListener(this.mCallback33);
        }
        if(v4 != 0) {
            BindingAdapters.goneUnless(this.keBtnImageEdit, Boolean.valueOf(((boolean)v5)));
        }
        if(v3 != 0) {
            BindingAdapters.goneUnless(this.keBtnImageFitContent, Boolean.valueOf(z8));
            BindingAdapters.goneUnless(this.keBtnImageMatchParent, Boolean.valueOf(z7));
            BindingAdapters.goneUnless(this.keBtnImageOriginCenter, Boolean.valueOf(z9));
        }
        if(v1 != 0) {
            BindingAdapters.goneUnless(this.mboundView0, Boolean.valueOf(z1));
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

    @Override  // com.kakao.keditor.databinding.KeToolbarImageMenuBinding
    public void setDisplayMenu(boolean z) {
        this.mDisplayMenu = z;
        synchronized(this) {
            this.mDirtyFlags |= 4L;
        }
        this.notifyPropertyChanged(BR.displayMenu);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarImageMenuBinding
    public void setImageItem(@Nullable ImageItem imageItem0) {
        this.mImageItem = imageItem0;
        synchronized(this) {
            this.mDirtyFlags |= 16L;
        }
        this.notifyPropertyChanged(BR.imageItem);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarImageMenuBinding
    public void setImageStyles(@Nullable List list0) {
        this.mImageStyles = list0;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.imageStyles);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarImageMenuBinding
    public void setIsEnableImageEdit(boolean z) {
        this.mIsEnableImageEdit = z;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.isEnableImageEdit);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeToolbarImageMenuBinding
    public void setMediaMenuListener(@Nullable MediaMenuClickListener mediaMenuClickListener0) {
        this.mMediaMenuListener = mediaMenuClickListener0;
        synchronized(this) {
            this.mDirtyFlags |= 8L;
        }
        this.notifyPropertyChanged(BR.mediaMenuListener);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.isEnableImageEdit == v) {
            this.setIsEnableImageEdit(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.imageStyles == v) {
            this.setImageStyles(((List)object0));
            return true;
        }
        if(BR.displayMenu == v) {
            this.setDisplayMenu(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.mediaMenuListener == v) {
            this.setMediaMenuListener(((MediaMenuClickListener)object0));
            return true;
        }
        if(BR.imageItem == v) {
            this.setImageItem(((ImageItem)object0));
            return true;
        }
        return false;
    }
}

