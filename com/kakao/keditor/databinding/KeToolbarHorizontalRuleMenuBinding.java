package com.kakao.keditor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.plugin.itemspec.horizontalrule.HorizontalRuleItem;
import com.kakao.keditor.plugin.itemspec.horizontalrule.HorizontalRuleMenuClickListener;
import com.kakao.keditor.toolbar.category.ToolbarCategory;

public abstract class KeToolbarHorizontalRuleMenuBinding extends ViewDataBinding {
    @NonNull
    public final ImageView keBtnDelete;
    @NonNull
    public final HorizontalScrollView keMenuHorizontalRuleScrollView;
    @NonNull
    public final ImageView keMenuHorizontalRuleStyle1;
    @NonNull
    public final ImageView keMenuHorizontalRuleStyle2;
    @NonNull
    public final ImageView keMenuHorizontalRuleStyle3;
    @NonNull
    public final ImageView keMenuHorizontalRuleStyle4;
    @NonNull
    public final ImageView keMenuHorizontalRuleStyle5;
    @NonNull
    public final ImageView keMenuHorizontalRuleStyle6;
    @NonNull
    public final ImageView keMenuHorizontalRuleStyle7;
    @NonNull
    public final ImageView keMenuHorizontalRuleStyle8;
    @Bindable
    protected ToolbarCategory mActiveCategory;
    @Bindable
    protected boolean mDisplayMenu;
    @Bindable
    protected HorizontalRuleItem mHorizontalRule;
    @Bindable
    protected HorizontalRuleMenuClickListener mListener;

    public KeToolbarHorizontalRuleMenuBinding(Object object0, View view0, int v, ImageView imageView0, HorizontalScrollView horizontalScrollView0, ImageView imageView1, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8) {
        super(object0, view0, v);
        this.keBtnDelete = imageView0;
        this.keMenuHorizontalRuleScrollView = horizontalScrollView0;
        this.keMenuHorizontalRuleStyle1 = imageView1;
        this.keMenuHorizontalRuleStyle2 = imageView2;
        this.keMenuHorizontalRuleStyle3 = imageView3;
        this.keMenuHorizontalRuleStyle4 = imageView4;
        this.keMenuHorizontalRuleStyle5 = imageView5;
        this.keMenuHorizontalRuleStyle6 = imageView6;
        this.keMenuHorizontalRuleStyle7 = imageView7;
        this.keMenuHorizontalRuleStyle8 = imageView8;
    }

    public static KeToolbarHorizontalRuleMenuBinding bind(@NonNull View view0) {
        return KeToolbarHorizontalRuleMenuBinding.bind(view0, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static KeToolbarHorizontalRuleMenuBinding bind(@NonNull View view0, @Nullable Object object0) {
        return (KeToolbarHorizontalRuleMenuBinding)ViewDataBinding.bind(object0, view0, layout.ke_toolbar_horizontal_rule_menu);
    }

    @Nullable
    public ToolbarCategory getActiveCategory() {
        return this.mActiveCategory;
    }

    public boolean getDisplayMenu() {
        return this.mDisplayMenu;
    }

    @Nullable
    public HorizontalRuleItem getHorizontalRule() {
        return this.mHorizontalRule;
    }

    @Nullable
    public HorizontalRuleMenuClickListener getListener() {
        return this.mListener;
    }

    @NonNull
    public static KeToolbarHorizontalRuleMenuBinding inflate(@NonNull LayoutInflater layoutInflater0) {
        return KeToolbarHorizontalRuleMenuBinding.inflate(layoutInflater0, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static KeToolbarHorizontalRuleMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        return KeToolbarHorizontalRuleMenuBinding.inflate(layoutInflater0, viewGroup0, z, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static KeToolbarHorizontalRuleMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z, @Nullable Object object0) {
        return (KeToolbarHorizontalRuleMenuBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_horizontal_rule_menu, viewGroup0, z, object0);
    }

    @NonNull
    @Deprecated
    public static KeToolbarHorizontalRuleMenuBinding inflate(@NonNull LayoutInflater layoutInflater0, @Nullable Object object0) {
        return (KeToolbarHorizontalRuleMenuBinding)ViewDataBinding.inflateInternal(layoutInflater0, layout.ke_toolbar_horizontal_rule_menu, null, false, object0);
    }

    public abstract void setActiveCategory(@Nullable ToolbarCategory arg1);

    public abstract void setDisplayMenu(boolean arg1);

    public abstract void setHorizontalRule(@Nullable HorizontalRuleItem arg1);

    public abstract void setListener(@Nullable HorizontalRuleMenuClickListener arg1);
}

