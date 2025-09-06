package com.kakao.keditor.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding.IncludedLayouts;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.keditor.BR;
import com.kakao.keditor.R.id;
import com.kakao.keditor.R.string;
import com.kakao.keditor.plugin.itemspec.poll.PollItem;
import com.kakao.keditor.standard.BindingAdapters;

public class KeActivityPollCreatorBindingImpl extends KeActivityPollCreatorBinding {
    private long mDirtyFlags;
    @NonNull
    private final LinearLayout mboundView0;
    @Nullable
    private static final IncludedLayouts sIncludes;
    @Nullable
    private static final SparseIntArray sViewsWithIds;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        KeActivityPollCreatorBindingImpl.sViewsWithIds = sparseIntArray0;
        sparseIntArray0.put(id.close, 3);
        sparseIntArray0.put(id.title_input, 4);
        sparseIntArray0.put(id.title_del_btn, 5);
        sparseIntArray0.put(id.scroll_view, 6);
        sparseIntArray0.put(id.poll_items, 7);
    }

    public KeActivityPollCreatorBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        this(dataBindingComponent0, view0, ViewDataBinding.mapBindings(dataBindingComponent0, view0, 8, KeActivityPollCreatorBindingImpl.sIncludes, KeActivityPollCreatorBindingImpl.sViewsWithIds));
    }

    private KeActivityPollCreatorBindingImpl(DataBindingComponent dataBindingComponent0, View view0, Object[] arr_object) {
        super(dataBindingComponent0, view0, 0, ((TextView)arr_object[2]), ((ImageView)arr_object[3]), ((TextView)arr_object[1]), ((RecyclerView)arr_object[7]), ((NestedScrollView)arr_object[6]), ((ImageView)arr_object[5]), ((EditText)arr_object[4]));
        this.mDirtyFlags = -1L;
        this.attachPoll.setTag(null);
        this.mboundView0 = (LinearLayout)arr_object[0];
        ((LinearLayout)arr_object[0]).setTag(null);
        this.navigationTitle.setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized(this) {
            long v = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        if((v & 2L) != 0L) {
            BindingAdapters.applyAccessibilityInfo(this.attachPoll, true, null, null);
            String s = this.navigationTitle.getResources().getString(string.title_poll);
            TextViewBindingAdapter.setText(this.navigationTitle, s);
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

    @Override  // com.kakao.keditor.databinding.KeActivityPollCreatorBinding
    public void setPollItem(@Nullable PollItem pollItem0) {
        this.mPollItem = pollItem0;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.pollItem == v) {
            this.setPollItem(((PollItem)object0));
            return true;
        }
        return false;
    }
}

