package com.kakao.tistory.presentation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import com.kakao.tistory.presentation.R.id;
import com.kakao.tistory.presentation.view.common.widget.TistoryToolbar;

public class ActivityTistoryToolbarBindingImpl extends ActivityTistoryToolbarBinding {
    public long a;
    public static final SparseIntArray b;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        ActivityTistoryToolbarBindingImpl.b = sparseIntArray0;
        sparseIntArray0.put(id.common_content_view_stub, 1);
        sparseIntArray0.put(id.common_toolbar, 2);
        sparseIntArray0.put(id.common_app_bar_title, 3);
        sparseIntArray0.put(id.common_bottom_view_stub, 4);
        sparseIntArray0.put(id.blog_switch_dialog, 5);
    }

    public ActivityTistoryToolbarBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        Object[] arr_object = ViewDataBinding.mapBindings(dataBindingComponent0, view0, 6, null, ActivityTistoryToolbarBindingImpl.b);
        super(dataBindingComponent0, view0, 0, ((ComposeView)arr_object[5]), ((TextView)arr_object[3]), new ViewStubProxy(((ViewStub)arr_object[4])), ((CoordinatorLayout)arr_object[0]), new ViewStubProxy(((ViewStub)arr_object[1])), ((TistoryToolbar)arr_object[2]));
        this.a = -1L;
        this.commonBottomViewStub.setContainingBinding(this);
        this.commonContainer.setTag(null);
        this.commonContentViewStub.setContainingBinding(this);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized(this) {
            this.a = 0L;
        }
        if(this.commonBottomViewStub.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.commonBottomViewStub.getBinding());
        }
        if(this.commonContentViewStub.getBinding() != null) {
            ViewDataBinding.executeBindingsOn(this.commonContentViewStub.getBinding());
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

