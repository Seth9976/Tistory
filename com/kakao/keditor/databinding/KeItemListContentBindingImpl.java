package com.kakao.keditor.databinding;

import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.kakao.keditor.BR;
import com.kakao.keditor.plugin.itemspec.textlist.ListType;
import com.kakao.keditor.standard.BindingAdapters;
import com.kakao.keditor.widget.KeditorEditText;

public class KeItemListContentBindingImpl extends KeItemListContentBinding {
    private long mDirtyFlags;
    @NonNull
    private final LinearLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    public KeItemListContentBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 4, KeItemListContentBindingImpl.sIncludes, KeItemListContentBindingImpl.sViewsWithIds));
    }

    private KeItemListContentBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((ImageView)arr_object[1]), ((KeditorEditText)arr_object[3]), ((TextView)arr_object[2]));
        this.mDirtyFlags = -1L;
        this.keListItemBullet.setTag(null);
        this.keListItemContent.setTag(null);
        this.keListItemIndex.setTag(null);
        this.mboundView0 = (LinearLayout)arr_object[0];
        ((LinearLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        int v3;
        boolean z2;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        ListType listType0 = this.mType;
        SpannableStringBuilder spannableStringBuilder0 = this.mText;
        int v1 = Long.compare(9L & v, 0L);
        Integer integer0 = null;
        boolean z = true;
        String s = v1 == 0 ? null : this.mIndex + 1 + ".";
        int v2 = Long.compare(10L & v, 0L);
        boolean z1 = false;
        if(v2 == 0) {
            v3 = 0;
            z2 = false;
        }
        else {
            z2 = listType0 == ListType.DECIMAL;
            if(listType0 == ListType.DECIMAL) {
                z = false;
            }
            if(listType0 != null) {
                integer0 = listType0.getSubToolbarSrc();
            }
            v3 = ViewDataBinding.safeUnbox(integer0);
            z1 = z;
        }
        int v4 = Long.compare(v & 12L, 0L);
        if(v2 != 0) {
            BindingAdapters.goneUnless(this.keListItemBullet, Boolean.valueOf(z1));
            BindingAdapters.setSrc(this.keListItemBullet, v3);
            BindingAdapters.goneUnless(this.keListItemIndex, Boolean.valueOf(z2));
        }
        if(v4 != 0) {
            TextViewBindingAdapter.setText(this.keListItemContent, spannableStringBuilder0);
        }
        if(v1 != 0) {
            TextViewBindingAdapter.setText(this.keListItemIndex, s);
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

    @Override  // com.kakao.keditor.databinding.KeItemListContentBinding
    public void setIndex(int v) {
        this.mIndex = v;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.index);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeItemListContentBinding
    public void setText(@Nullable SpannableStringBuilder spannableStringBuilder0) {
        this.mText = spannableStringBuilder0;
        synchronized(this) {
            this.mDirtyFlags |= 4L;
        }
        this.notifyPropertyChanged(BR.text);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeItemListContentBinding
    public void setType(@Nullable ListType listType0) {
        this.mType = listType0;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.type);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.index == v) {
            this.setIndex(((int)(((Integer)object0))));
            return true;
        }
        if(BR.type == v) {
            this.setType(((ListType)object0));
            return true;
        }
        if(BR.text == v) {
            this.setText(((SpannableStringBuilder)object0));
            return true;
        }
        return false;
    }
}

