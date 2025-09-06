package com.kakao.keditor.databinding;

import android.util.SparseIntArray;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.kakao.keditor.BR;
import com.kakao.keditor.R.id;
import com.kakao.keditor.event.EventFlow;
import com.kakao.keditor.generated.callback.OnClickListener.Listener;
import com.kakao.keditor.generated.callback.OnClickListener;
import com.kakao.keditor.plugin.attrs.LoadingStatus.OnLoading;
import com.kakao.keditor.plugin.attrs.LoadingStatus;
import com.kakao.keditor.plugin.pluginspec.image.ImageItem;
import com.kakao.keditor.standard.BindingAdapters;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.ViewRequest.UpdateRepresentState;

public class KeItemImageBindingImpl extends KeItemImageBinding implements Listener {
    @Nullable
    private final View.OnClickListener mCallback74;
    private long mDirtyFlags;
    @NonNull
    private final FrameLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeItemImageBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_item_image_layout_wrapper, 6);
        sparseIntArray0.put(id.ke_item_image_layout, 7);
        sparseIntArray0.put(id.ke_item_image_wrapper, 8);
    }

    public KeItemImageBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 9, KeItemImageBindingImpl.sIncludes, KeItemImageBindingImpl.sViewsWithIds));
    }

    private KeItemImageBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((ImageView)arr_object[1]), ((EditText)arr_object[4]), ((ImageView)arr_object[2]), ((FrameLayout)arr_object[7]), ((LinearLayout)arr_object[6]), ((View)arr_object[5]), ((ImageView)arr_object[3]), ((FrameLayout)arr_object[8]));
        this.mDirtyFlags = -1L;
        this.keItemImage.setTag(null);
        this.keItemImageCaptionEditText.setTag(null);
        this.keItemImageGifBadge.setTag(null);
        this.keItemImageLoadingLayout.setTag(null);
        this.keItemImageRepresentImageBtn.setTag(null);
        this.mboundView0 = (FrameLayout)arr_object[0];
        ((FrameLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.mCallback74 = new OnClickListener(this, 1);
        this.invalidateAll();
    }

    @Override  // com.kakao.keditor.generated.callback.OnClickListener$Listener
    public final void _internalCallbackOnClick(int v, View view0) {
        ImageItem imageItem0 = this.mImageItem;
        int v1 = this.mPosition;
        KeEvent keEvent0 = KeEvent.INSTANCE;
        if(keEvent0 != null && imageItem0 != null) {
            keEvent0.postInScope(UpdateRepresentState.newInstance(v1, !imageItem0.containsRepresentativeImage()));
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        boolean z7;
        String s1;
        boolean z6;
        boolean z5;
        boolean z4;
        LoadingStatus loadingStatus0;
        boolean z3;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z = this.mRepresentativeImageEnable;
        ImageItem imageItem0 = this.mImageItem;
        boolean z1 = this.mHasFocus;
        boolean z2 = this.mTooSmallToShow;
        if(Long.compare(v & 110L, 0L) != 0) {
            v = z ? v | 0x400L : v | 0x200L;
        }
        String s = null;
        int v1 = 1;
        int v2 = 0;
        if(Long.compare(v & 68L, 0L) == 0) {
            z5 = false;
            z3 = false;
            z4 = false;
        }
        else {
            if(imageItem0 == null) {
                loadingStatus0 = null;
                z3 = false;
                z4 = false;
            }
            else {
                z3 = imageItem0.isRepresent();
                loadingStatus0 = imageItem0.getLoadingStatus();
                s = imageItem0.getCaption();
                z4 = imageItem0.isGif();
            }
            z5 = loadingStatus0 == OnLoading.INSTANCE;
        }
        if(Long.compare(v & 76L, 0L) != 0) {
            v = z1 ? v | 0x100L : v | 0x80L;
            if((v & 0x400L) != 0L) {
                v = z1 ? v | 0x10000L : v | 0x8000L;
            }
        }
        if((v & 0x400L) != 0L) {
            if((v & 76L) != 0L) {
                v = z1 ? v | 0x100L : v | 0x80L;
            }
            if((v & 0x400L) != 0L) {
                v = z1 ? v | 0x10000L : v | 0x8000L;
            }
        }
        if(Long.compare(v & 0x8080L, 0L) == 0) {
            s1 = s;
            z6 = false;
        }
        else {
            if((v & 0x8000L) != 0L && imageItem0 != null) {
                z3 = imageItem0.isRepresent();
            }
            if(Long.compare(v & 0x80L, 0L) == 0) {
                s1 = s;
                z6 = false;
            }
            else {
                if(imageItem0 != null) {
                    s = imageItem0.getCaption();
                }
                z6 = s != null;
                v = z6 ? v | 0x4000L : v | 0x2000L;
                s1 = s;
            }
        }
        if((0x400L & v) == 0L) {
            z7 = false;
        }
        else if(z1) {
            z7 = true;
        }
        else {
            z7 = z3;
        }
        if(Long.compare(v & 110L, 0L) == 0) {
            z7 = false;
        }
        else {
            if(!z) {
                z7 = false;
            }
            v |= (z7 ? 0x1000L : 0x800L);
        }
        int v3 = (v & 0x1000L) == 0L ? 0 : !z2;
        int v4 = (v & 0x4000L) == 0L ? 0 : !(s1 == null ? false : s1.equals(""));
        int v5 = Long.compare(110L & v, 0L);
        if(v5 == 0 || !z7) {
            v3 = 0;
        }
        if((v & 0x80L) == 0L || !z6) {
            v4 = 0;
        }
        int v6 = Long.compare(v & 76L, 0L);
        if(v6 != 0) {
            if(!z1) {
                v1 = v4;
            }
            v2 = v1;
        }
        if((v & 72L) != 0L) {
            BindingAdapters.setSelected(this.keItemImage, z1);
        }
        if((68L & v) != 0L) {
            TextViewBindingAdapter.setText(this.keItemImageCaptionEditText, s1);
            BindingAdapters.goneUnless(this.keItemImageGifBadge, Boolean.valueOf(z4));
            BindingAdapters.goneUnless(this.keItemImageLoadingLayout, Boolean.valueOf(z5));
            BindingAdapters.setSelected(this.keItemImageRepresentImageBtn, z3);
        }
        if(v6 != 0) {
            BindingAdapters.goneUnless(this.keItemImageCaptionEditText, Boolean.valueOf(((boolean)v2)));
        }
        if(v5 != 0) {
            BindingAdapters.goneUnless(this.keItemImageRepresentImageBtn, Boolean.valueOf(((boolean)v3)));
        }
        if((v & 0x40L) != 0L) {
            this.keItemImageRepresentImageBtn.setOnClickListener(this.mCallback74);
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
            this.mDirtyFlags = 0x40L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // com.kakao.keditor.databinding.KeItemImageBinding
    public void setFlow(@Nullable EventFlow eventFlow0) {
        this.mFlow = eventFlow0;
    }

    @Override  // com.kakao.keditor.databinding.KeItemImageBinding
    public void setHasFocus(boolean z) {
        this.mHasFocus = z;
        synchronized(this) {
            this.mDirtyFlags |= 8L;
        }
        this.notifyPropertyChanged(BR.hasFocus);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeItemImageBinding
    public void setImageItem(@Nullable ImageItem imageItem0) {
        this.mImageItem = imageItem0;
        synchronized(this) {
            this.mDirtyFlags |= 4L;
        }
        this.notifyPropertyChanged(BR.imageItem);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeItemImageBinding
    public void setPosition(int v) {
        this.mPosition = v;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.position);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeItemImageBinding
    public void setRepresentativeImageEnable(boolean z) {
        this.mRepresentativeImageEnable = z;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.representativeImageEnable);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeItemImageBinding
    public void setTooSmallToShow(boolean z) {
        this.mTooSmallToShow = z;
        synchronized(this) {
            this.mDirtyFlags |= 0x20L;
        }
        this.notifyPropertyChanged(BR.tooSmallToShow);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.position == v) {
            this.setPosition(((int)(((Integer)object0))));
            return true;
        }
        if(BR.representativeImageEnable == v) {
            this.setRepresentativeImageEnable(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.imageItem == v) {
            this.setImageItem(((ImageItem)object0));
            return true;
        }
        if(BR.hasFocus == v) {
            this.setHasFocus(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.flow == v) {
            this.setFlow(((EventFlow)object0));
            return true;
        }
        if(BR.tooSmallToShow == v) {
            this.setTooSmallToShow(((Boolean)object0).booleanValue());
            return true;
        }
        return false;
    }
}

