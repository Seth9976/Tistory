package com.kakao.keditor.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import com.kakao.keditor.plugin.itemspec.poll.PollItem;
import com.kakao.keditor.standard.BindingAdapters;

public class KeItemPollBindingImpl extends KeItemPollBinding {
    private long mDirtyFlags;
    @NonNull
    private final FrameLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeItemPollBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.ke_plugin_poll_icon, 5);
        sparseIntArray0.put(id.ke_plugin_poll_summary, 6);
        sparseIntArray0.put(id.ke_plugin_poll_item_option_select, 7);
    }

    public KeItemPollBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 8, KeItemPollBindingImpl.sIncludes, KeItemPollBindingImpl.sViewsWithIds));
    }

    private KeItemPollBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((View)arr_object[1]), ((TextView)arr_object[3]), ((ImageView)arr_object[5]), ((LinearLayout)arr_object[7]), ((LinearLayout)arr_object[6]), ((TextView)arr_object[2]), ((TextView)arr_object[4]));
        this.mDirtyFlags = -1L;
        this.kePluginPollBorder.setTag(null);
        this.kePluginPollDateRange.setTag(null);
        this.kePluginPollTitle.setTag(null);
        this.kePluginPollType.setTag(null);
        this.mboundView0 = (FrameLayout)arr_object[0];
        ((FrameLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        String s2;
        String s1;
        Drawable drawable0;
        int v1;
        Context context0;
        synchronized(this) {
            v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        boolean z = this.mHasFocus;
        PollItem pollItem0 = this.mPollItem;
        String s = null;
        if(Long.compare(v & 5L, 0L) == 0) {
            drawable0 = null;
        }
        else {
            v |= (z ? 16L : 8L);
            if(z) {
                context0 = this.kePluginPollBorder.getContext();
                v1 = drawable.ke_border_ke_item_focused;
            }
            else {
                context0 = this.kePluginPollBorder.getContext();
                v1 = drawable.ke_border_poll_radius_0;
            }
            drawable0 = AppCompatResources.getDrawable(context0, v1);
        }
        int v2 = Long.compare(6L & v, 0L);
        if(v2 == 0 || pollItem0 == null) {
            s1 = null;
            s2 = null;
        }
        else {
            s1 = pollItem0.getTitle();
            s2 = pollItem0.toRemainCount();
            s = pollItem0.toRangeString();
        }
        if((v & 5L) != 0L) {
            BindingAdapters.setBackgroundSrcDrawable(this.kePluginPollBorder, drawable0);
        }
        if(v2 != 0) {
            TextViewBindingAdapter.setText(this.kePluginPollDateRange, s);
            TextViewBindingAdapter.setText(this.kePluginPollTitle, s1);
            TextViewBindingAdapter.setText(this.kePluginPollType, s2);
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

    @Override  // com.kakao.keditor.databinding.KeItemPollBinding
    public void setHasFocus(boolean z) {
        this.mHasFocus = z;
        synchronized(this) {
            this.mDirtyFlags |= 1L;
        }
        this.notifyPropertyChanged(BR.hasFocus);
        super.requestRebind();
    }

    @Override  // com.kakao.keditor.databinding.KeItemPollBinding
    public void setPollItem(@Nullable PollItem pollItem0) {
        this.mPollItem = pollItem0;
        synchronized(this) {
            this.mDirtyFlags |= 2L;
        }
        this.notifyPropertyChanged(BR.pollItem);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.hasFocus == v) {
            this.setHasFocus(((Boolean)object0).booleanValue());
            return true;
        }
        if(BR.pollItem == v) {
            this.setPollItem(((PollItem)object0));
            return true;
        }
        return false;
    }
}

