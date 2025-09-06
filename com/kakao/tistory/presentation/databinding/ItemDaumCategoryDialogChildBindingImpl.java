package com.kakao.tistory.presentation.databinding;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.kakao.tistory.domain.entity.entry.DaumLikeItem;
import com.kakao.tistory.domain.entity.entry.DaumLikeViewItemModel.PairChild;
import com.kakao.tistory.presentation.BR;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.bindingadapter.CommonBindingAdapter;

public class ItemDaumCategoryDialogChildBindingImpl extends ItemDaumCategoryDialogChildBinding {
    public long a;

    public ItemDaumCategoryDialogChildBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        Object[] arr_object = ViewDataBinding.mapBindings(dataBindingComponent0, view0, 7, null, null);
        super(dataBindingComponent0, view0, 0, ((TextView)arr_object[2]), ((ConstraintLayout)arr_object[1]), ((TextView)arr_object[5]), ((ConstraintLayout)arr_object[4]), ((ImageView)arr_object[6]), ((ImageView)arr_object[3]));
        this.a = -1L;
        this.daumCategoryDialogParentTitleText.setTag(null);
        this.daumChildLeftContainer.setTag(null);
        this.daumChildRightCategoryDialogParentTitleText.setTag(null);
        this.daumChildRightContainer.setTag(null);
        this.daumChildRightSwitchDialogCheckButton.setTag(null);
        this.daumSwitchDialogCheckButton.setTag(null);
        ((ConstraintLayout)arr_object[0]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        String s8;
        String s7;
        String s6;
        int v15;
        CharSequence charSequence1;
        int v14;
        boolean z3;
        int v13;
        int v12;
        int v11;
        long v10;
        Drawable drawable1;
        int v9;
        int v8;
        Resources resources1;
        String s4;
        int v6;
        Resources resources0;
        Drawable drawable0;
        int v4;
        Context context0;
        String s2;
        boolean z1;
        String s1;
        int v3;
        String s;
        int v2;
        DaumLikeItem daumLikeItem1;
        DaumLikeItem daumLikeItem0;
        synchronized(this) {
            v = this.a;
            this.a = 0L;
        }
        int v1 = this.mSelectId;
        PairChild daumLikeViewItemModel$PairChild0 = this.mSubjectItem;
        CharSequence charSequence0 = null;
        if(Long.compare(v & 7L, 0L) == 0) {
            charSequence1 = null;
            drawable1 = null;
            s7 = null;
            s6 = null;
            s4 = null;
            drawable0 = null;
            s2 = null;
            v15 = 0;
            z3 = false;
            v13 = 0;
            v14 = 0;
            z1 = false;
            v12 = 0;
            v11 = 0;
        }
        else {
            if(daumLikeViewItemModel$PairChild0 == null) {
                daumLikeItem1 = null;
                daumLikeItem0 = null;
            }
            else {
                daumLikeItem0 = daumLikeViewItemModel$PairChild0.getDaumLikeItemRight();
                daumLikeItem1 = daumLikeViewItemModel$PairChild0.getDaumLikeItemLeft();
            }
            if(daumLikeItem0 == null) {
                s = null;
                v2 = 0;
            }
            else {
                v2 = daumLikeItem0.getId();
                s = daumLikeItem0.getLabel();
            }
            if(daumLikeItem1 == null) {
                s1 = null;
                v3 = 0;
            }
            else {
                v3 = daumLikeItem1.getId();
                s1 = daumLikeItem1.getLabel();
            }
            boolean z = true;
            z1 = v2 == v1;
            s2 = String.format(this.daumChildRightContainer.getResources().getString(string.content_desc_button), s);
            boolean z2 = v3 == v1;
            String s3 = String.format(this.daumChildLeftContainer.getResources().getString(string.content_desc_button), s1);
            v |= (z1 ? 0x4410L : 0x2208L);
            v = (v & 7L) == 0L ? v | (z1 ? 0x4410L : 0x2208L) : v | (z2 ? 0x151100L : 690304L);
            if(z1) {
                context0 = this.daumChildRightContainer.getContext();
                v4 = drawable.selector_item_f5_pressed_de_border_point1_rounded_6dp;
            }
            else {
                context0 = this.daumChildRightContainer.getContext();
                v4 = drawable.selector_item_f5_pressed_de_border_f5_rounded_6dp;
            }
            drawable0 = AppCompatResources.getDrawable(context0, v4);
            int v5 = z1 ? ViewDataBinding.getColorFromResource(this.daumChildRightCategoryDialogParentTitleText, color.point1) : ViewDataBinding.getColorFromResource(this.daumChildRightCategoryDialogParentTitleText, color.gray1);
            if(z2) {
                resources0 = this.daumCategoryDialogParentTitleText.getResources();
                v6 = string.font_pretended_regular;
            }
            else {
                resources0 = this.daumCategoryDialogParentTitleText.getResources();
                v6 = string.font_pretended_light;
            }
            s4 = resources0.getString(v6);
            int v7 = z2 ? ViewDataBinding.getColorFromResource(this.daumCategoryDialogParentTitleText, color.point1) : ViewDataBinding.getColorFromResource(this.daumCategoryDialogParentTitleText, color.gray1);
            if(z2) {
                resources1 = this.daumChildRightCategoryDialogParentTitleText.getResources();
                v8 = string.font_pretended_regular;
            }
            else {
                resources1 = this.daumChildRightCategoryDialogParentTitleText.getResources();
                v8 = string.font_pretended_light;
            }
            String s5 = resources1.getString(v8);
            if(z2) {
                v9 = v7;
                drawable1 = AppCompatResources.getDrawable(this.daumChildLeftContainer.getContext(), drawable.selector_item_f5_pressed_de_border_point1_rounded_6dp);
            }
            else {
                v9 = v7;
                drawable1 = AppCompatResources.getDrawable(this.daumChildLeftContainer.getContext(), drawable.selector_item_f5_pressed_de_border_f5_rounded_6dp);
            }
            if(Long.compare(v & 6L, 0L) == 0) {
            label_78:
                v14 = v5;
                v11 = z2 ? 0 : 8;
                v12 = z1 ? 0 : 8;
                v15 = v9;
                v13 = 0;
                z3 = z2;
                charSequence1 = s;
            }
            else {
                if(daumLikeItem0 == null) {
                    z = false;
                    v10 = 0x20L;
                }
                else {
                    v10 = 0x40L;
                }
                v |= v10;
                if(!z) {
                    v11 = z2 ? 0 : 8;
                    v12 = z1 ? 0 : 8;
                    v13 = 4;
                    z3 = z2;
                    v14 = v5;
                    charSequence1 = s;
                    v15 = v9;
                    goto label_85;
                }
                goto label_78;
            }
        label_85:
            s6 = s5;
            s7 = s3;
            charSequence0 = s1;
        }
        if((v & 6L) == 0L) {
            s8 = s2;
        }
        else {
            s8 = s2;
            TextViewBindingAdapter.setText(this.daumCategoryDialogParentTitleText, charSequence0);
            TextViewBindingAdapter.setText(this.daumChildRightCategoryDialogParentTitleText, charSequence1);
            this.daumChildRightContainer.setVisibility(v13);
        }
        if((v & 7L) != 0L) {
            this.daumCategoryDialogParentTitleText.setTextColor(v15);
            CommonBindingAdapter.bindFontName(this.daumCategoryDialogParentTitleText, s4);
            ViewBindingAdapter.setBackground(this.daumChildLeftContainer, drawable1);
            CommonBindingAdapter.bindContentDescription(this.daumChildLeftContainer, s7, z3);
            this.daumChildRightCategoryDialogParentTitleText.setTextColor(v14);
            CommonBindingAdapter.bindFontName(this.daumChildRightCategoryDialogParentTitleText, s6);
            ViewBindingAdapter.setBackground(this.daumChildRightContainer, drawable0);
            CommonBindingAdapter.bindContentDescription(this.daumChildRightContainer, s8, z1);
            this.daumChildRightSwitchDialogCheckButton.setVisibility(v12);
            this.daumSwitchDialogCheckButton.setVisibility(v11);
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

    @Override  // com.kakao.tistory.presentation.databinding.ItemDaumCategoryDialogChildBinding
    public void setSelectId(int v) {
        this.mSelectId = v;
        synchronized(this) {
            this.a |= 1L;
        }
        this.notifyPropertyChanged(BR.selectId);
        super.requestRebind();
    }

    @Override  // com.kakao.tistory.presentation.databinding.ItemDaumCategoryDialogChildBinding
    public void setSubjectItem(@Nullable PairChild daumLikeViewItemModel$PairChild0) {
        this.mSubjectItem = daumLikeViewItemModel$PairChild0;
        synchronized(this) {
            this.a |= 2L;
        }
        this.notifyPropertyChanged(BR.subjectItem);
        super.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.selectId == v) {
            this.setSelectId(((int)(((Integer)object0))));
            return true;
        }
        if(BR.subjectItem == v) {
            this.setSubjectItem(((PairChild)object0));
            return true;
        }
        return false;
    }
}

