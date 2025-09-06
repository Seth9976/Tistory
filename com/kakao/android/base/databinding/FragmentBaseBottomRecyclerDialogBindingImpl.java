package com.kakao.android.base.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.android.base.R.id;

public class FragmentBaseBottomRecyclerDialogBindingImpl extends FragmentBaseBottomRecyclerDialogBinding {
    public long g;
    public static final SparseIntArray h;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        FragmentBaseBottomRecyclerDialogBindingImpl.h = sparseIntArray0;
        sparseIntArray0.put(id.bottom_dialog_recycler_view, 1);
    }

    public FragmentBaseBottomRecyclerDialogBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        Object[] arr_object = ViewDataBinding.mapBindings(dataBindingComponent0, view0, 2, null, FragmentBaseBottomRecyclerDialogBindingImpl.h);
        super(dataBindingComponent0, view0, 0, ((RecyclerView)arr_object[1]));
        this.g = -1L;
        ((ConstraintLayout)arr_object[0]).setTag(null);
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

