package com.kakao.keditor.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.kakao.common.util.StringUtil;
import com.kakao.keditor.BR;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.plugin.itemspec.file.FileItem;
import com.kakao.keditor.standard.BindingAdapters;

public class KeItemFileBindingImpl extends KeItemFileBinding {
    private long mDirtyFlags;
    @NonNull
    private final RelativeLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    public KeItemFileBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 4, KeItemFileBindingImpl.sIncludes, KeItemFileBindingImpl.sViewsWithIds));
    }

    private KeItemFileBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((TextView)arr_object[2]), ((TextView)arr_object[3]), ((View)arr_object[1]));
        this.mDirtyFlags = -1L;
        this.keItemFileName.setTag(null);
        this.keItemFileSize.setTag(null);
        this.keItemItemBorder.setTag(null);
        this.mboundView0 = (RelativeLayout)arr_object[0];
        ((RelativeLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        String s1;
        long v3;
        Drawable drawable0;
        int v1;
        Context context0;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z = this.mHasFocus;
        FileItem fileItem0 = this.mFileItem;
        String s = null;
        if(Long.compare(v & 5L, 0L) == 0) {
            drawable0 = null;
        }
        else {
            v |= (z ? 16L : 8L);
            if(z) {
                context0 = this.keItemItemBorder.getContext();
                v1 = drawable.ke_border_ke_item_focused;
            }
            else {
                context0 = this.keItemItemBorder.getContext();
                v1 = drawable.ke_border_ke_item;
            }
            drawable0 = AppCompatResources.getDrawable(context0, v1);
        }
        int v2 = Long.compare(6L & v, 0L);
        if(v2 == 0) {
            s1 = null;
        }
        else {
            if(fileItem0 == null) {
                v3 = 0L;
            }
            else {
                s = fileItem0.getName();
                v3 = fileItem0.getSize();
            }
            s1 = StringUtil.INSTANCE.getFormattedSize(v3);
        }
        if(v2 != 0) {
            TextViewBindingAdapter.setText(this.keItemFileName, s);
            TextViewBindingAdapter.setText(this.keItemFileSize, s1);
        }
        if((v & 5L) != 0L) {
            BindingAdapters.setBackgroundSrcDrawable(this.keItemItemBorder, drawable0);
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

    @Override  // com.kakao.keditor.databinding.KeItemFileBinding
    public void setFileItem(@Nullable FileItem fileItem0) {
        this.mFileItem = fileItem0;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.fileItem);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeItemFileBinding
    public void setHasFocus(boolean z) {
        this.mHasFocus = z;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.hasFocus);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.hasFocus == v) {
            this.setHasFocus(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.fileItem == v) {
            this.setFileItem(((FileItem)object0));
            return true;
        }
        return false;
    }
}

