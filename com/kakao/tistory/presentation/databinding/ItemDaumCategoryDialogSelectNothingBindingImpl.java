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
import androidx.databinding.adapters.ViewBindingAdapter;
import com.kakao.tistory.domain.entity.entry.DaumLikeViewItemModel.SelectNothingItem;
import com.kakao.tistory.presentation.BR;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.bindingadapter.CommonBindingAdapter;

public class ItemDaumCategoryDialogSelectNothingBindingImpl extends ItemDaumCategoryDialogSelectNothingBinding {
    public final ConstraintLayout a;
    public final ConstraintLayout b;
    public long c;

    public ItemDaumCategoryDialogSelectNothingBindingImpl(@Nullable DataBindingComponent dataBindingComponent0, @NonNull View view0) {
        Object[] arr_object = ViewDataBinding.mapBindings(dataBindingComponent0, view0, 4, null, null);
        super(dataBindingComponent0, view0, 0, ((TextView)arr_object[2]), ((ImageView)arr_object[3]));
        this.c = -1L;
        this.daumCategoryDialogParentTitleText.setTag(null);
        this.daumSwitchDialogCheckButton.setTag(null);
        this.a = (ConstraintLayout)arr_object[0];
        ((ConstraintLayout)arr_object[0]).setTag(null);
        this.b = (ConstraintLayout)arr_object[1];
        ((ConstraintLayout)arr_object[1]).setTag(null);
        this.setRootTag(view0);
        this.invalidateAll();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long v;
        int v6;
        boolean z1;
        String s;
        int v5;
        Resources resources0;
        int v3;
        TextView textView0;
        Drawable drawable0;
        int v2;
        Context context0;
        synchronized(this) {
            v = this.c;
            this.c = 0L;
        }
        Boolean boolean0 = this.mIsSelected;
        int v1 = 0;
        if(Long.compare(v & 5L, 0L) == 0) {
            drawable0 = null;
            s = null;
            v6 = 0;
            z1 = false;
        }
        else {
            boolean z = ViewDataBinding.safeUnbox(boolean0);
            v |= (z ? 0x550L : 680L);
            if(z) {
                context0 = this.b.getContext();
                v2 = drawable.selector_item_f5_pressed_de_border_point1_rounded_6dp;
            }
            else {
                context0 = this.b.getContext();
                v2 = drawable.selector_item_f5_pressed_de_border_f5_rounded_6dp;
            }
            drawable0 = AppCompatResources.getDrawable(context0, v2);
            if(z) {
                textView0 = this.daumCategoryDialogParentTitleText;
                v3 = color.point1;
            }
            else {
                textView0 = this.daumCategoryDialogParentTitleText;
                v3 = color.gray1;
            }
            int v4 = ViewDataBinding.getColorFromResource(textView0, v3);
            if(z) {
                resources0 = this.daumCategoryDialogParentTitleText.getResources();
                v5 = string.font_pretended_regular;
            }
            else {
                resources0 = this.daumCategoryDialogParentTitleText.getResources();
                v5 = string.font_pretended_light;
            }
            s = resources0.getString(v5);
            if(!z) {
                v1 = 8;
            }
            z1 = z;
            v6 = v1;
            v1 = v4;
        }
        if((v & 5L) != 0L) {
            this.daumCategoryDialogParentTitleText.setTextColor(v1);
            CommonBindingAdapter.bindFontName(this.daumCategoryDialogParentTitleText, s);
            this.daumSwitchDialogCheckButton.setVisibility(v6);
            String s1 = String.format(this.a.getResources().getString(string.content_desc_button), this.a.getResources().getString(string.label_editor_setting_no_category_select));
            CommonBindingAdapter.bindContentDescription(this.a, s1, z1);
            ViewBindingAdapter.setBackground(this.b, drawable0);
        }
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized(this) {
            if(this.c != 0L) {
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized(this) {
            this.c = 4L;
        }
        this.requestRebind();
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int v, Object object0, int v1) {
        return false;
    }

    @Override  // com.kakao.tistory.presentation.databinding.ItemDaumCategoryDialogSelectNothingBinding
    public void setIsSelected(@Nullable Boolean boolean0) {
        this.mIsSelected = boolean0;
        synchronized(this) {
            this.c |= 1L;
        }
        this.notifyPropertyChanged(BR.isSelected);
        super.requestRebind();
    }

    @Override  // com.kakao.tistory.presentation.databinding.ItemDaumCategoryDialogSelectNothingBinding
    public void setSelectNoItem(@Nullable SelectNothingItem daumLikeViewItemModel$SelectNothingItem0) {
        this.mSelectNoItem = daumLikeViewItemModel$SelectNothingItem0;
    }

    @Override  // androidx.databinding.ViewDataBinding
    public boolean setVariable(int v, @Nullable Object object0) {
        if(BR.isSelected == v) {
            this.setIsSelected(((Boolean)object0));
            return true;
        }
        if(BR.selectNoItem == v) {
            this.setSelectNoItem(((SelectNothingItem)object0));
            return true;
        }
        return false;
    }
}

