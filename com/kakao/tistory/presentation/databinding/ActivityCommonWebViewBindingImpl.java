package com.kakao.tistory.presentation.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.kakao.tistory.presentation.BR;
import com.kakao.tistory.presentation.R.id;
import com.kakao.tistory.presentation.generated.callback.OnClickListener.Listener;
import com.kakao.tistory.presentation.generated.callback.OnClickListener;
import com.kakao.tistory.presentation.view.webview.CommonWebView;
import com.kakao.tistory.presentation.viewmodel.CommonWebViewModel;

public class ActivityCommonWebViewBindingImpl extends ActivityCommonWebViewBinding implements Listener {
    public final OnClickListener a;
    public long b;
    public static final SparseIntArray c;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        ActivityCommonWebViewBindingImpl.c = sparseIntArray0;
        sparseIntArray0.put(id.common_web_view, 4);
        sparseIntArray0.put(id.web_view_navigation_close_button_container, 5);
        sparseIntArray0.put(id.web_view_navigation_close_button, 6);
        sparseIntArray0.put(id.web_view_navigation_back_button_container, 7);
        sparseIntArray0.put(id.web_view_navigation_back_button, 8);
        sparseIntArray0.put(id.web_view_navigation_forward_button_container, 9);
        sparseIntArray0.put(id.web_view_navigation_forward_button, 10);
        sparseIntArray0.put(id.web_view_navigation_reload_button_container, 11);
        sparseIntArray0.put(id.web_view_navigation_reload_button, 12);
        sparseIntArray0.put(id.web_view_navigation_share_button_container, 13);
        sparseIntArray0.put(id.web_view_navigation_share_button, 14);
    }

    public ActivityCommonWebViewBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        Object[] arr_object = ViewDataBinding.mapBindings(dataBindingComponent0, view0, 15, null, ActivityCommonWebViewBindingImpl.c);
        super(dataBindingComponent0, view0, 2, ((CommonWebView)arr_object[4]), ((ConstraintLayout)arr_object[3]), ((Toolbar)arr_object[1]), ((ImageButton)arr_object[2]), ((ImageButton)arr_object[8]), ((FrameLayout)arr_object[7]), ((ImageButton)arr_object[6]), ((FrameLayout)arr_object[5]), ((ImageButton)arr_object[10]), ((FrameLayout)arr_object[9]), ((ImageButton)arr_object[12]), ((FrameLayout)arr_object[11]), ((ImageButton)arr_object[14]), ((FrameLayout)arr_object[13]));
        this.b = -1L;
        this.commonWebViewNavigationBar.setTag(null);
        this.commonWebViewToolbar.setTag(null);
        this.commonWebViewToolbarHomeAsUpButton.setTag(null);
        ((ConstraintLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.a = new OnClickListener(this, 1);
        this.invalidateAll();
    }

    @Override  // com.kakao.tistory.presentation.generated.callback.OnClickListener$Listener
    public final void _internalCallbackOnClick(int v, View view0) {
        CommonWebViewModel commonWebViewModel0 = this.mViewModel;
        if(commonWebViewModel0 != null) {
            commonWebViewModel0.onClickBackButton();
        }
    }

    public final boolean a(int v) {
        if(v == BR._all) {
            synchronized(this) {
                this.b |= 1L;
            }
            return true;
        }
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        int v2;
        Boolean boolean0 = null;
        synchronized(this) {
            v = this.b;
            this.b = 0L;
        }
        CommonWebViewModel commonWebViewModel0 = this.mViewModel;
        int v1 = 0;
        if(Long.compare(15L & v, 0L) == 0) {
            v2 = 0;
        }
        else {
            if(Long.compare(v & 13L, 0L) == 0) {
                v2 = 0;
            }
            else {
                MutableLiveData mutableLiveData0 = commonWebViewModel0 == null ? null : commonWebViewModel0.getAppBarEnabled();
                this.updateLiveDataRegistration(0, mutableLiveData0);
                boolean z = ViewDataBinding.safeUnbox((mutableLiveData0 == null ? null : ((Boolean)mutableLiveData0.getValue())));
                v |= (z ? 0x80L : 0x40L);
                v2 = z ? 0 : 8;
            }
            if(Long.compare(v & 14L, 0L) != 0) {
                MutableLiveData mutableLiveData1 = commonWebViewModel0 == null ? null : commonWebViewModel0.getBottomBarEnabled();
                this.updateLiveDataRegistration(1, mutableLiveData1);
                if(mutableLiveData1 != null) {
                    boolean0 = (Boolean)mutableLiveData1.getValue();
                }
                boolean z1 = ViewDataBinding.safeUnbox(boolean0);
                v |= (z1 ? 0x20L : 16L);
                if(!z1) {
                    v1 = 8;
                }
            }
        }
        if((14L & v) != 0L) {
            this.commonWebViewNavigationBar.setVisibility(v1);
        }
        if((v & 13L) != 0L) {
            this.commonWebViewToolbar.setVisibility(v2);
        }
        if((v & 8L) != 0L) {
            this.commonWebViewToolbarHomeAsUpButton.setOnClickListener(this.a);
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
            this.b = 8L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        switch(v) {
            case 0: {
                MutableLiveData mutableLiveData0 = (MutableLiveData)object0;
                return this.a(v1);
            }
            case 1: {
                MutableLiveData mutableLiveData1 = (MutableLiveData)object0;
                if(v1 == BR._all) {
                    synchronized(this) {
                        this.b |= 2L;
                    }
                    return true;
                }
                return false;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.viewModel == v) {
            this.setViewModel(((CommonWebViewModel)object0));
            return true;
        }
        return false;
    }

    @Override  // com.kakao.tistory.presentation.databinding.ActivityCommonWebViewBinding
    public void setViewModel(@Nullable CommonWebViewModel commonWebViewModel0) {
        this.mViewModel = commonWebViewModel0;
        synchronized(this) {
            this.b |= 4L;
        }
        this.notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
}

