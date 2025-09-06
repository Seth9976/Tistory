package com.kakao.tistory.presentation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.tistory.presentation.R.id;

public class FragmentBottomSheetBlogCategoryBindingImpl extends FragmentBottomSheetBlogCategoryBinding {
    public long a;
    public static final SparseIntArray b;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        FragmentBottomSheetBlogCategoryBindingImpl.b = sparseIntArray0;
        sparseIntArray0.put(id.blog_category_dialog_recycler_view, 1);
        sparseIntArray0.put(id.blog_category_loading_view, 2);
        sparseIntArray0.put(id.loading_paogress_bar, 3);
        sparseIntArray0.put(id.blog_category_dialog_title_text, 4);
    }

    public FragmentBottomSheetBlogCategoryBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        Object[] arr_object = ViewDataBinding.mapBindings(dataBindingComponent0, view0, 5, null, FragmentBottomSheetBlogCategoryBindingImpl.b);
        super(dataBindingComponent0, view0, 0, ((RecyclerView)arr_object[1]), ((TextView)arr_object[4]), ((RelativeLayout)arr_object[2]), ((ProgressBar)arr_object[3]));
        this.a = -1L;
        ((FrameLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized(this) {
            this.a = 0L;
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized(this) {
            if(this.a != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized(this) {
            this.a = 1L;
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

