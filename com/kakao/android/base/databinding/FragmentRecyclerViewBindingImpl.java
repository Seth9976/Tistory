package com.kakao.android.base.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.kakao.android.base.R.id;

public class FragmentRecyclerViewBindingImpl extends FragmentRecyclerViewBinding {
    public long g;
    public static final SparseIntArray h;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        FragmentRecyclerViewBindingImpl.h = sparseIntArray0;
        sparseIntArray0.put(id.swipe_refresh_layout, 1);
        sparseIntArray0.put(id.recycler_view, 2);
    }

    public FragmentRecyclerViewBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        Object[] arr_object = ViewDataBinding.mapBindings(dataBindingComponent0, view0, 3, null, FragmentRecyclerViewBindingImpl.h);
        super(dataBindingComponent0, view0, 0, ((RecyclerView)arr_object[2]), ((FrameLayout)arr_object[0]), ((SwipeRefreshLayout)arr_object[1]));
        this.g = -1L;
        this.recyclerViewContainer.setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized(this) {
            this.g = 0L;
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized(this) {
            if(this.g != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized(this) {
            this.g = 1L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        return true;
    }
}

