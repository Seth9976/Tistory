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

public class KeItemContentSearchTvBindingImpl extends KeItemContentSearchTvBinding {
    private long mDirtyFlags;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeItemContentSearchTvBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_item_content_search_image, 8);
        sparseIntArray0.put(id.ke_item_content_search_time, 9);
        sparseIntArray0.put(id.ke_item_content_search_actors, 10);
        sparseIntArray0.put(id.ke_item_content_search_channel, 11);
        sparseIntArray0.put(id.ke_item_content_search_text_barrier, 12);
    }

    public KeItemContentSearchTvBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 13, KeItemContentSearchTvBindingImpl.sIncludes, KeItemContentSearchTvBindingImpl.sViewsWithIds));
    }

    private KeItemContentSearchTvBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((TextView)arr_object[10]), ((TextView)arr_object[6]), ((TextView)arr_object[11]), ((TextView)arr_object[7]), ((ImageView)arr_object[8]), ((ImageView)arr_object[1]), ((ConstraintLayout)arr_object[0]), ((TextView)arr_object[5]), ((Barrier)arr_object[12]), ((TextView)arr_object[9]), ((TextView)arr_object[3]), ((View)arr_object[4]), ((TextView)arr_object[2]));
        this.mDirtyFlags = -1L;
        this.keItemContentSearchActorsDesc.setTag(null);
        this.keItemContentSearchChannelDesc.setTag(null);
        this.keItemContentSearchImagePlaceholder.setTag(null);
        this.keItemContentSearchLayout.setTag(null);
        this.keItemContentSearchStartTimeDesc.setTag(null);
        this.keItemContentSearchTimeDesc.setTag(null);
        this.keItemContentSearchTimeDivider.setTag(null);
        this.keItemContentSearchTitle.setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        CharSequence charSequence0;
        int v3;
        String s9;
        String s8;
        String s7;
        String s6;
        String s5;
        boolean z1;
        String s4;
        String s3;
        String s2;
        boolean z;
        String s1;
        String s;
        LoadingStatus loadingStatus0;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        ContentItem contentItem0 = this.mItem;
        if(Long.compare(v & 3L, 0L) == 0) {
            s5 = null;
            s6 = null;
            z1 = false;
            s4 = null;
            s = null;
            s1 = null;
            z = false;
        }
        else {
            if(contentItem0 == null) {
                s3 = null;
                s4 = null;
                loadingStatus0 = null;
                s = null;
                s1 = null;
                z = false;
                s2 = null;
            }
            else {
                loadingStatus0 = contentItem0.getLoadingStatus();
                s = contentItem0.getTitle();
                s1 = contentItem0.getActors();
                z = contentItem0.isBroadcastTimeNotEmpty();
                s2 = contentItem0.getChannel();
                s3 = contentItem0.getEndDate();
                s4 = contentItem0.getStartDate();
            }
            v |= (z ? 40L : 20L);
            z1 = loadingStatus0 != Succeed.INSTANCE;
            s5 = this.keItemContentSearchStartTimeDesc.getResources().getString(string.ke_content_search_broadcast_start_time_desc, new Object[]{s4, s3});
            s6 = s2;
        }
        if((v & 0x20L) == 0L) {
            s9 = null;
        }
        else {
            if(contentItem0 == null) {
                s8 = null;
                s7 = null;
            }
            else {
                s7 = contentItem0.getBroadcastDayOfWeek();
                s8 = contentItem0.getBroadcastTime();
            }
            s9 = this.keItemContentSearchTimeDesc.getResources().getString(string.ke_content_search_broadcast_time_desc, new Object[]{s7, s8});
        }
        int v1 = (8L & v) == 0L ? 0 : !(s4 == null ? false : s4.isEmpty());
        int v2 = Long.compare(v & 3L, 0L);
        if(v2 == 0) {
            v3 = 0;
            charSequence0 = null;
        }
        else {
            v3 = z ? v1 : 0;
            if(!z) {
                s9 = "-";
            }
            charSequence0 = s9;
        }
        if(v2 != 0) {
            TextViewBindingAdapter.setText(this.keItemContentSearchActorsDesc, s1);
            TextViewBindingAdapter.setText(this.keItemContentSearchChannelDesc, s6);
            BindingAdapters.goneUnless(this.keItemContentSearchImagePlaceholder, Boolean.valueOf(z1));
            BindingAdapters.goneUnless(this.keItemContentSearchStartTimeDesc, Boolean.valueOf(((boolean)v3)));
            TextViewBindingAdapter.setText(this.keItemContentSearchStartTimeDesc, s5);
            TextViewBindingAdapter.setText(this.keItemContentSearchTimeDesc, charSequence0);
            BindingAdapters.goneUnless(this.keItemContentSearchTimeDivider, Boolean.valueOf(((boolean)v3)));
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

    @Override  // com.kakao.keditor.databinding.KeItemContentSearchTvBinding
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

