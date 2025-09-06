package com.kakao.keditor.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.kakao.keditor.BR;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.R.id;
import com.kakao.keditor.plugin.itemspec.opengraph.OpenGraphItem;
import com.kakao.keditor.standard.BindingAdapters;

public class KeItemOpengraphBindingImpl extends KeItemOpengraphBinding {
    private long mDirtyFlags;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeItemOpengraphBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_item_opengraph_thumbnail, 5);
        sparseIntArray0.put(id.ke_item_opengraph_line, 6);
    }

    public KeItemOpengraphBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 7, KeItemOpengraphBindingImpl.sIncludes, KeItemOpengraphBindingImpl.sViewsWithIds));
    }

    private KeItemOpengraphBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((View)arr_object[4]), ((TextView)arr_object[2]), ((View)arr_object[6]), ((TextView)arr_object[3]), ((ImageView)arr_object[5]), ((TextView)arr_object[1]), ((RelativeLayout)arr_object[0]));
        this.mDirtyFlags = -1L;
        this.keItemOpengraphBorder.setTag(null);
        this.keItemOpengraphHostText.setTag(null);
        this.keItemOpengraphLoading.setTag(null);
        this.keItemOpengraphTitleText.setTag(null);
        this.keItemOpengraphWrapper.setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        String s1;
        Drawable drawable0;
        int v1;
        Context context0;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z = this.mHasFocus;
        OpenGraphItem openGraphItem0 = this.mItem;
        boolean z1 = this.mIsNowLoading;
        String s = null;
        if(Long.compare(v & 9L, 0L) == 0) {
            drawable0 = null;
        }
        else {
            v |= (z ? 0x20L : 16L);
            if(z) {
                context0 = this.keItemOpengraphBorder.getContext();
                v1 = drawable.ke_border_ke_item_focused;
            }
            else {
                context0 = this.keItemOpengraphBorder.getContext();
                v1 = drawable.ke_border_ke_item;
            }
            drawable0 = AppCompatResources.getDrawable(context0, v1);
        }
        int v2 = Long.compare(10L & v, 0L);
        if(v2 == 0 || openGraphItem0 == null) {
            s1 = null;
        }
        else {
            s = openGraphItem0.getUrl();
            s1 = openGraphItem0.getTitle();
        }
        int v3 = Long.compare(12L & v, 0L);
        if((v & 9L) != 0L) {
            BindingAdapters.setBackgroundSrcDrawable(this.keItemOpengraphBorder, drawable0);
        }
        if(v2 != 0) {
            TextViewBindingAdapter.setText(this.keItemOpengraphHostText, s);
            TextViewBindingAdapter.setText(this.keItemOpengraphTitleText, s1);
        }
        if(v3 != 0) {
            BindingAdapters.goneUnless(this.keItemOpengraphLoading, Boolean.valueOf(z1));
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

    @Override  // com.kakao.keditor.databinding.KeItemOpengraphBinding
    public void setHasFocus(boolean z) {
        this.mHasFocus = z;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.hasFocus);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeItemOpengraphBinding
    public void setIsNowLoading(boolean z) {
        this.mIsNowLoading = z;
        synchronized(this) {
            this.mDirtyFlags |= 4L;
        }
        this.notifyPropertyChanged(BR.isNowLoading);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeItemOpengraphBinding
    public void setItem(@Nullable OpenGraphItem openGraphItem0) {
        this.mItem = openGraphItem0;
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
            this.setItem(((OpenGraphItem)object0));
            return true;
        }
        if(BR.isNowLoading == v) {
            this.setIsNowLoading(((Boolean)object0).booleanValue());
            return true;
        }
        return false;
    }
}

