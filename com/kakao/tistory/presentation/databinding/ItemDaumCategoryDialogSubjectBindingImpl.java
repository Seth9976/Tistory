package com.kakao.tistory.presentation.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.kakao.tistory.domain.entity.entry.DaumLikeCategoryItem;
import com.kakao.tistory.domain.entity.entry.DaumLikeViewItemModel.DaumLikeCategoryTitle;
import com.kakao.tistory.presentation.BR;
import com.kakao.tistory.presentation.common.bindingadapter.CommonBindingAdapter;

public class ItemDaumCategoryDialogSubjectBindingImpl extends ItemDaumCategoryDialogSubjectBinding {
    public long a;

    public ItemDaumCategoryDialogSubjectBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        Object[] arr_object = ViewDataBinding.mapBindings(dataBindingComponent0, view0, 2, null, null);
        super(dataBindingComponent0, view0, 0, ((TextView)arr_object[1]));
        this.a = -1L;
        this.blogCategoryDialogParentTitleText.setTag(null);
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
        DaumLikeCategoryTitle daumLikeViewItemModel$DaumLikeCategoryTitle0 = this.mCategoryItem;
        int v1 = Long.compare(v & 6L, 0L);
        String s = null;
        if(v1 != 0) {
            DaumLikeCategoryItem daumLikeCategoryItem0 = daumLikeViewItemModel$DaumLikeCategoryTitle0 == null ? null : daumLikeViewItemModel$DaumLikeCategoryTitle0.getCategoryItem();
            if(daumLikeCategoryItem0 != null) {
                s = daumLikeCategoryItem0.getLabel();
            }
        }
        if(v1 != 0) {
            CommonBindingAdapter.bindText(this.blogCategoryDialogParentTitleText, s, false, false);
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
            this.a = 4L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // com.kakao.tistory.presentation.databinding.ItemDaumCategoryDialogSubjectBinding
    public void setCategoryItem(@Nullable DaumLikeCategoryTitle daumLikeViewItemModel$DaumLikeCategoryTitle0) {
        this.mCategoryItem = daumLikeViewItemModel$DaumLikeCategoryTitle0;
        synchronized(this) {
            this.a |= 2L;
        }
        this.notifyPropertyChanged(BR.categoryItem);
        super.requestRebind();
    }

    @Override  // com.kakao.tistory.presentation.databinding.ItemDaumCategoryDialogSubjectBinding
    public void setIsSelected(@Nullable Boolean boolean0) {
        this.mIsSelected = boolean0;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.isSelected == v) {
            this.setIsSelected(((Boolean)object0));
            return true;
        }
        if(BR.categoryItem == v) {
            this.setCategoryItem(((DaumLikeCategoryTitle)object0));
            return true;
        }
        return false;
    }
}

