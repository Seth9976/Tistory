package com.kakao.keditor.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.kakao.keditor.BR;
import com.kakao.keditor.R.id;
import com.kakao.keditor.R.string;
import com.kakao.keditor.plugin.attrs.LoadingStatus.Succeed;
import com.kakao.keditor.plugin.attrs.LoadingStatus;
import com.kakao.keditor.plugin.itemspec.contentsearch.entity.ContentItem;
import com.kakao.keditor.standard.BindingAdapters;

public class KeItemContentSearchPlayBindingImpl extends KeItemContentSearchPlayBinding {
    private long mDirtyFlags;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeItemContentSearchPlayBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_item_content_search_image, 6);
        sparseIntArray0.put(id.ke_item_content_search_date, 7);
        sparseIntArray0.put(id.ke_item_content_search_location, 8);
        sparseIntArray0.put(id.ke_item_content_search_actors, 9);
        sparseIntArray0.put(id.ke_item_content_search_text_barrier, 10);
    }

    public KeItemContentSearchPlayBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 11, KeItemContentSearchPlayBindingImpl.sIncludes, KeItemContentSearchPlayBindingImpl.sViewsWithIds));
    }

    private KeItemContentSearchPlayBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((TextView)arr_object[9]), ((TextView)arr_object[5]), ((TextView)arr_object[7]), ((TextView)arr_object[3]), ((ImageView)arr_object[6]), ((ImageView)arr_object[1]), ((ConstraintLayout)arr_object[0]), ((TextView)arr_object[8]), ((TextView)arr_object[4]), ((Barrier)arr_object[10]), ((TextView)arr_object[2]));
        this.mDirtyFlags = -1L;
        this.keItemContentSearchActorsDesc.setTag(null);
        this.keItemContentSearchDateDesc.setTag(null);
        this.keItemContentSearchImagePlaceholder.setTag(null);
        this.keItemContentSearchLayout.setTag(null);
        this.keItemContentSearchLocationDesc.setTag(null);
        this.keItemContentSearchTitle.setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        String s7;
        String s6;
        String s5;
        String s4;
        String s3;
        boolean z2;
        boolean z1;
        String s2;
        String s1;
        String s;
        LoadingStatus loadingStatus0;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        ContentItem contentItem0 = this.mItem;
        boolean z = false;
        if(Long.compare(v & 3L, 0L) == 0) {
            z2 = false;
            s3 = null;
            s = null;
            s1 = null;
        }
        else {
            if(contentItem0 == null) {
                z1 = false;
                loadingStatus0 = null;
                s = null;
                s1 = null;
                s2 = null;
            }
            else {
                loadingStatus0 = contentItem0.getLoadingStatus();
                s = contentItem0.getTitle();
                s1 = contentItem0.getActors();
                s2 = contentItem0.getLocation();
                z1 = contentItem0.isDateNotEmpty();
            }
            v = z1 ? v | 8L : v | 4L;
            if(loadingStatus0 != Succeed.INSTANCE) {
                z = true;
            }
            z2 = z;
            s3 = s2;
            z = z1;
        }
        if((8L & v) == 0L) {
            s6 = null;
        }
        else {
            if(contentItem0 == null) {
                s5 = null;
                s4 = null;
            }
            else {
                s4 = contentItem0.getEndDate();
                s5 = contentItem0.getStartDate();
            }
            s6 = this.keItemContentSearchDateDesc.getResources().getString(string.ke_content_search_date_desc, new Object[]{s5, s4});
        }
        int v1 = Long.compare(v & 3L, 0L);
        if(v1 == 0) {
            s7 = null;
        }
        else {
            if(!z) {
                s6 = "-";
            }
            s7 = s6;
        }
        if(v1 != 0) {
            TextViewBindingAdapter.setText(this.keItemContentSearchActorsDesc, s1);
            TextViewBindingAdapter.setText(this.keItemContentSearchDateDesc, s7);
            BindingAdapters.goneUnless(this.keItemContentSearchImagePlaceholder, Boolean.valueOf(z2));
            TextViewBindingAdapter.setText(this.keItemContentSearchLocationDesc, s3);
            TextViewBindingAdapter.setText(this.keItemContentSearchTitle, s);
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
            this.mDirtyFlags = 2L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // com.kakao.keditor.databinding.KeItemContentSearchPlayBinding
    public void setItem(@Nullable ContentItem contentItem0) {
        this.mItem = contentItem0;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.item);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.item == v) {
            this.setItem(((ContentItem)object0));
            return true;
        }
        return false;
    }
}

