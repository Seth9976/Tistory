package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.resources.MaterialResources;
import z7.b;

public class NavigationRailView extends NavigationBarView {
    public final int g;
    public View h;
    public final Boolean i;
    public final Boolean j;
    public final Boolean k;

    public NavigationRailView(@NonNull Context context0) {
        this(context0, null);
    }

    public NavigationRailView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.navigationRailStyle);
    }

    public NavigationRailView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, style.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.i = null;
        this.j = null;
        this.k = null;
        this.g = this.getResources().getDimensionPixelSize(dimen.mtrl_navigation_rail_margin);
        Context context1 = this.getContext();
        TintTypedArray tintTypedArray0 = ThemeEnforcement.obtainTintedStyledAttributes(context1, attributeSet0, styleable.NavigationRailView, v, v1, new int[0]);
        int v2 = tintTypedArray0.getResourceId(styleable.NavigationRailView_headerLayout, 0);
        if(v2 != 0) {
            this.addHeaderView(v2);
        }
        this.setMenuGravity(tintTypedArray0.getInt(styleable.NavigationRailView_menuGravity, 49));
        if(tintTypedArray0.hasValue(styleable.NavigationRailView_itemMinHeight)) {
            this.setItemMinimumHeight(tintTypedArray0.getDimensionPixelSize(styleable.NavigationRailView_itemMinHeight, -1));
        }
        if(tintTypedArray0.hasValue(styleable.NavigationRailView_paddingTopSystemWindowInsets)) {
            this.i = Boolean.valueOf(tintTypedArray0.getBoolean(styleable.NavigationRailView_paddingTopSystemWindowInsets, false));
        }
        if(tintTypedArray0.hasValue(styleable.NavigationRailView_paddingBottomSystemWindowInsets)) {
            this.j = Boolean.valueOf(tintTypedArray0.getBoolean(styleable.NavigationRailView_paddingBottomSystemWindowInsets, false));
        }
        if(tintTypedArray0.hasValue(styleable.NavigationRailView_paddingStartSystemWindowInsets)) {
            this.k = Boolean.valueOf(tintTypedArray0.getBoolean(styleable.NavigationRailView_paddingStartSystemWindowInsets, false));
        }
        int v3 = this.getResources().getDimensionPixelOffset(dimen.m3_navigation_rail_item_padding_top_with_large_font);
        int v4 = this.getResources().getDimensionPixelOffset(dimen.m3_navigation_rail_item_padding_bottom_with_large_font);
        float f = AnimationUtils.lerp(0.0f, 1.0f, 0.3f, 1.0f, MaterialResources.getFontScale(context1) - 1.0f);
        int v5 = this.getItemPaddingTop();
        int v6 = this.getItemPaddingBottom();
        this.setItemPaddingTop(Math.round(AnimationUtils.lerp(v5, v3, f)));
        this.setItemPaddingBottom(Math.round(AnimationUtils.lerp(v6, v4, f)));
        tintTypedArray0.recycle();
        ViewUtils.doOnApplyWindowInsets(this, new b(this));
    }

    public void addHeaderView(@LayoutRes int v) {
        this.addHeaderView(LayoutInflater.from(this.getContext()).inflate(v, this, false));
    }

    public void addHeaderView(@NonNull View view0) {
        this.removeHeaderView();
        this.h = view0;
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams0.gravity = 49;
        frameLayout$LayoutParams0.topMargin = this.g;
        this.addView(view0, 0, frameLayout$LayoutParams0);
    }

    @Override  // com.google.android.material.navigation.NavigationBarView
    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public NavigationBarMenuView createNavigationBarMenuView(@NonNull Context context0) {
        return this.createNavigationBarMenuView(context0);
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public NavigationRailMenuView createNavigationBarMenuView(@NonNull Context context0) {
        return new NavigationRailMenuView(context0);
    }

    @Nullable
    public View getHeaderView() {
        return this.h;
    }

    public int getItemMinimumHeight() {
        return ((NavigationRailMenuView)this.getMenuView()).getItemMinimumHeight();
    }

    @Override  // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return this.getNavigationRailMenuView().getMenuGravity();
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView)this.getMenuView();
    }

    @Override  // android.widget.FrameLayout
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        NavigationRailMenuView navigationRailMenuView0 = this.getNavigationRailMenuView();
        int v4 = 0;
        boolean z1 = this.h != null && this.h.getVisibility() != 8;
        int v5 = this.g;
        if(z1) {
            int v6 = this.h.getBottom() + v5;
            int v7 = navigationRailMenuView0.getTop();
            if(v7 < v6) {
                v4 = v6 - v7;
            }
        }
        else if((navigationRailMenuView0.I.gravity & 0x70) == 0x30) {
            v4 = v5;
        }
        if(v4 > 0) {
            navigationRailMenuView0.layout(navigationRailMenuView0.getLeft(), navigationRailMenuView0.getTop() + v4, navigationRailMenuView0.getRight(), navigationRailMenuView0.getBottom() + v4);
        }
    }

    @Override  // android.widget.FrameLayout
    public void onMeasure(int v, int v1) {
        int v2 = this.getSuggestedMinimumWidth();
        if(View.MeasureSpec.getMode(v) != 0x40000000 && v2 > 0) {
            int v3 = this.getPaddingLeft();
            int v4 = this.getPaddingRight();
            v = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(v), v4 + v3 + v2), 0x40000000);
        }
        super.onMeasure(v, v1);
        if(this.h != null && this.h.getVisibility() != 8) {
            this.measureChild(this.getNavigationRailMenuView(), v, View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight() - this.h.getMeasuredHeight() - this.g, 0x80000000));
        }
    }

    public void removeHeaderView() {
        View view0 = this.h;
        if(view0 != null) {
            this.removeView(view0);
            this.h = null;
        }
    }

    public void setItemMinimumHeight(@Px int v) {
        ((NavigationRailMenuView)this.getMenuView()).setItemMinimumHeight(v);
    }

    public void setMenuGravity(int v) {
        this.getNavigationRailMenuView().setMenuGravity(v);
    }
}

