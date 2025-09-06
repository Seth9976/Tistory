package com.kakao.tistory.presentation.databinding;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.kakao.tistory.domain.entity.SortItem;
import com.kakao.tistory.presentation.BR;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.common.bindingadapter.CommonBindingAdapter;

public class ItemCommonBottomDialogBindingImpl extends ItemCommonBottomDialogBinding {
    public long a;

    public ItemCommonBottomDialogBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        Object[] arr_object = ViewDataBinding.mapBindings(dataBindingComponent0, view0, 4, null, null);
        super(dataBindingComponent0, view0, 0, ((ImageView)arr_object[3]), ((TextView)arr_object[2]), ((TextView)arr_object[1]));
        this.a = -1L;
        this.commonBottomDialogCheckButton.setTag(null);
        this.commonBottomDialogDescText.setTag(null);
        this.commonBottomDialogTitleText.setTag(null);
        ((ConstraintLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        int v5;
        int v4;
        int v2;
        TextView textView0;
        int v1;
        String s1;
        String s;
        boolean z;
        synchronized(this) {
            v = this.a;
            this.a = 0L;
        }
        SortItem sortItem0 = this.mSortItem;
        CharSequence charSequence0 = null;
        if(Long.compare(v & 3L, 0L) == 0) {
            s = null;
            v5 = 0;
            v1 = 0;
            v4 = 0;
        }
        else {
            if(sortItem0 == null) {
                s1 = null;
                s = null;
                z = false;
            }
            else {
                z = sortItem0.isSelected();
                s = sortItem0.getTitle();
                s1 = sortItem0.getDescription();
            }
            v |= (z ? 40L : 20L);
            v1 = z ? 0 : 8;
            if(z) {
                textView0 = this.commonBottomDialogDescText;
                v2 = color.gray1;
            }
            else {
                textView0 = this.commonBottomDialogDescText;
                v2 = color.gray2;
            }
            int v3 = ViewDataBinding.getColorFromResource(textView0, v2);
            boolean z1 = TextUtils.isEmpty(s1);
            if((v & 3L) != 0L) {
                v |= (z1 ? 0x80L : 0x40L);
            }
            v4 = z1 ? 4 : 0;
            charSequence0 = s1;
            v5 = v3;
        }
        if((v & 3L) != 0L) {
            this.commonBottomDialogCheckButton.setVisibility(v1);
            TextViewBindingAdapter.setText(this.commonBottomDialogDescText, charSequence0);
            this.commonBottomDialogDescText.setTextColor(v5);
            this.commonBottomDialogDescText.setVisibility(v4);
            CommonBindingAdapter.bindText(this.commonBottomDialogTitleText, s, false, false);
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

    @Override  // com.kakao.tistory.presentation.databinding.ItemCommonBottomDialogBinding
    public void setSortItem(@Nullable SortItem sortItem0) {
        this.mSortItem = sortItem0;
        synchronized(this) {
            this.a |= 1L;
        }
        this.notifyPropertyChanged(BR.sortItem);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.sortItem == v) {
            this.setSortItem(((SortItem)object0));
            return true;
        }
        return false;
    }
}

