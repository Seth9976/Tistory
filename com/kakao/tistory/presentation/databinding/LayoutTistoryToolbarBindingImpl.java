package com.kakao.tistory.presentation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.kakao.tistory.presentation.BR;
import com.kakao.tistory.presentation.R.id;
import com.kakao.tistory.presentation.viewmodel.TistoryToolbarViewModel;

public class LayoutTistoryToolbarBindingImpl extends LayoutTistoryToolbarBinding {
    public final TextView a;
    public long b;
    public static final SparseIntArray c;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        LayoutTistoryToolbarBindingImpl.c = sparseIntArray0;
        sparseIntArray0.put(id.common_app_bar_logo_image, 2);
        sparseIntArray0.put(id.common_app_bar_home_as_up_button, 3);
        sparseIntArray0.put(id.common_app_search_button, 4);
        sparseIntArray0.put(id.common_app_bar_user_image, 5);
        sparseIntArray0.put(id.common_toolbar_menu_container, 6);
        sparseIntArray0.put(id.common_toolbar_menu_text, 7);
        sparseIntArray0.put(id.common_toolbar_menu_image_button, 8);
    }

    public LayoutTistoryToolbarBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        Object[] arr_object = ViewDataBinding.mapBindings(dataBindingComponent0, view0, 9, null, LayoutTistoryToolbarBindingImpl.c);
        super(dataBindingComponent0, view0, 0, ((ImageButton)arr_object[3]), ((ImageView)arr_object[2]), ((ComposeView)arr_object[5]), ((ImageButton)arr_object[4]), ((ConstraintLayout)arr_object[6]), ((ImageButton)arr_object[8]), ((TextView)arr_object[7]), ((RelativeLayout)arr_object[0]));
        this.b = -1L;
        this.commonToolbarSubContainer.setTag(null);
        this.a = (TextView)arr_object[1];
        ((TextView)arr_object[1]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        synchronized(this) {
            v = this.b;
            this.b = 0L;
        }
        TistoryToolbarViewModel tistoryToolbarViewModel0 = this.mViewModel;
        int v1 = 0;
        String s = null;
        if(Long.compare(v & 3L, 0L) != 0) {
            if(tistoryToolbarViewModel0 != null) {
                s = tistoryToolbarViewModel0.getAppVersion();
            }
            v |= 4L;
            v1 = 8;
        }
        if((v & 3L) != 0L) {
            TextViewBindingAdapter.setText(this.a, s);
            this.a.setVisibility(v1);
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized(this) {
            if(this.b != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized(this) {
            this.b = 2L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.viewModel == v) {
            this.setViewModel(((TistoryToolbarViewModel)object0));
            return true;
        }
        return false;
    }

    @Override  // com.kakao.tistory.presentation.databinding.LayoutTistoryToolbarBinding
    public void setViewModel(@Nullable TistoryToolbarViewModel tistoryToolbarViewModel0) {
        this.mViewModel = tistoryToolbarViewModel0;
        synchronized(this) {
            this.b |= 1L;
        }
        this.notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
}

