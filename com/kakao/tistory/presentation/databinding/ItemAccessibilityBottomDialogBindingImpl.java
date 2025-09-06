package com.kakao.tistory.presentation.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.presentation.BR;
import com.kakao.tistory.presentation.view.common.bottomsheet.AccessibilitySwipeItemType;

public class ItemAccessibilityBottomDialogBindingImpl extends ItemAccessibilityBottomDialogBinding {
    public long a;

    public ItemAccessibilityBottomDialogBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        Object[] arr_object = ViewDataBinding.mapBindings(dataBindingComponent0, view0, 2, null, null);
        super(dataBindingComponent0, view0, 0, ((TextView)arr_object[1]));
        this.a = -1L;
        this.commonBottomDialogTitleText.setTag(null);
        ((ConstraintLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        synchronized(this) {
            v = this.a;
            this.a = 0L;
        }
        int v1 = Long.compare(v & 3L, 0L);
        int v2 = v1 == 0 || this.mSwipeItem == null ? 0 : this.mSwipeItem.getTitle();
        if(v1 != 0) {
            this.commonBottomDialogTitleText.setText(v2);
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
            this.a = 2L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // com.kakao.tistory.presentation.databinding.ItemAccessibilityBottomDialogBinding
    public void setSwipeItem(@Nullable AccessibilitySwipeItemType accessibilitySwipeItemType0) {
        this.mSwipeItem = accessibilitySwipeItemType0;
        synchronized(this) {
            this.a |= 1L;
        }
        this.notifyPropertyChanged(BR.swipeItem);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.swipeItem == v) {
            this.setSwipeItem(((AccessibilitySwipeItemType)object0));
            return true;
        }
        return false;
    }
}

