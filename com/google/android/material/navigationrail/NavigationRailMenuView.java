package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import z7.a;

@RestrictTo({Scope.LIBRARY_GROUP})
public class NavigationRailMenuView extends NavigationBarMenuView {
    public int H;
    public final FrameLayout.LayoutParams I;

    public NavigationRailMenuView(@NonNull Context context0) {
        super(context0);
        this.H = -1;
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -2);
        this.I = frameLayout$LayoutParams0;
        frameLayout$LayoutParams0.gravity = 49;
        this.setLayoutParams(frameLayout$LayoutParams0);
        this.setItemActiveIndicatorResizeable(true);
    }

    public final int c(View view0, int v, int v1, int v2) {
        int v7;
        int v3 = view0 == null ? View.MeasureSpec.makeMeasureSpec(Math.min((this.H == -1 ? View.MeasureSpec.getSize(v) : this.H), v1 / Math.max(1, v2)), 0) : View.MeasureSpec.makeMeasureSpec(view0.getMeasuredHeight(), 0);
        int v4 = this.getChildCount();
        int v6 = 0;
        for(int v5 = 0; v5 < v4; ++v5) {
            View view1 = this.getChildAt(v5);
            if(view1 != view0) {
                if(view1.getVisibility() == 8) {
                    v7 = 0;
                }
                else {
                    view1.measure(v, v3);
                    v7 = view1.getMeasuredHeight();
                }
                v6 += v7;
            }
        }
        return v6;
    }

    @Override  // com.google.android.material.navigation.NavigationBarMenuView
    @NonNull
    public NavigationBarItemView createNavigationBarItemView(@NonNull Context context0) {
        return new a(context0);  // 初始化器: Lcom/google/android/material/navigation/NavigationBarItemView;-><init>(Landroid/content/Context;)V
    }

    @Px
    public int getItemMinimumHeight() {
        return this.H;
    }

    public int getMenuGravity() {
        return this.I.gravity;
    }

    @Override  // android.view.ViewGroup
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v4 = this.getChildCount();
        int v6 = 0;
        for(int v5 = 0; v5 < v4; ++v5) {
            View view0 = this.getChildAt(v5);
            if(view0.getVisibility() != 8) {
                int v7 = view0.getMeasuredHeight() + v6;
                view0.layout(0, v6, v2 - v, v7);
                v6 = v7;
            }
        }
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        int v6;
        int v5;
        int v2 = View.MeasureSpec.getSize(v1);
        int v3 = this.getMenu().getVisibleItems().size();
        if(v3 <= 1 || !this.isShifting(this.getLabelVisibilityMode(), v3)) {
            v6 = this.c(null, v, v2, v3);
        }
        else {
            View view0 = this.getChildAt(this.getSelectedItemPosition());
            if(view0 == null) {
                v5 = 0;
            }
            else {
                int v4 = View.MeasureSpec.makeMeasureSpec(Math.min((this.H == -1 ? View.MeasureSpec.getSize(v) : this.H), v2 / Math.max(1, v3)), 0);
                if(view0.getVisibility() == 8) {
                    v5 = 0;
                }
                else {
                    view0.measure(v, v4);
                    v5 = view0.getMeasuredHeight();
                }
                v2 -= v5;
                --v3;
            }
            v6 = this.c(view0, v, v2, v3) + v5;
        }
        this.setMeasuredDimension(View.MeasureSpec.getSize(v), View.resolveSizeAndState(v6, v1, 0));
    }

    public void setItemMinimumHeight(@Px int v) {
        if(this.H != v) {
            this.H = v;
            this.requestLayout();
        }
    }

    public void setMenuGravity(int v) {
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = this.I;
        if(frameLayout$LayoutParams0.gravity != v) {
            frameLayout$LayoutParams0.gravity = v;
            this.setLayoutParams(frameLayout$LayoutParams0);
        }
    }
}

