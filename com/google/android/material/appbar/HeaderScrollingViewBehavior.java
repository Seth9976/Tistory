package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior {
    public final Rect r;
    public final Rect s;
    public int t;
    public int u;

    public HeaderScrollingViewBehavior() {
        this.r = new Rect();
        this.s = new Rect();
        this.t = 0;
    }

    public HeaderScrollingViewBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.r = new Rect();
        this.s = new Rect();
        this.t = 0;
    }

    public abstract AppBarLayout b(List arg1);

    public float c(View view0) {
        return 1.0f;
    }

    public int d(View view0) {
        return view0.getMeasuredHeight();
    }

    public final int getOverlayTop() {
        return this.u;
    }

    @Override  // com.google.android.material.appbar.ViewOffsetBehavior
    public void layoutChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
        AppBarLayout appBarLayout0 = this.b(coordinatorLayout0.getDependencies(view0));
        int v1 = 0;
        if(appBarLayout0 != null) {
            LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            int v2 = coordinatorLayout0.getPaddingLeft() + coordinatorLayout$LayoutParams0.leftMargin;
            int v3 = appBarLayout0.getBottom() + coordinatorLayout$LayoutParams0.topMargin;
            int v4 = coordinatorLayout0.getWidth() - coordinatorLayout0.getPaddingRight() - coordinatorLayout$LayoutParams0.rightMargin;
            int v5 = coordinatorLayout0.getHeight();
            int v6 = appBarLayout0.getBottom();
            int v7 = coordinatorLayout0.getPaddingBottom();
            Rect rect0 = this.r;
            rect0.set(v2, v3, v4, v6 + v5 - v7 - coordinatorLayout$LayoutParams0.bottomMargin);
            WindowInsetsCompat windowInsetsCompat0 = coordinatorLayout0.getLastWindowInsets();
            if(windowInsetsCompat0 != null && ViewCompat.getFitsSystemWindows(coordinatorLayout0) && !ViewCompat.getFitsSystemWindows(view0)) {
                int v8 = rect0.left;
                rect0.left = windowInsetsCompat0.getSystemWindowInsetLeft() + v8;
                rect0.right -= windowInsetsCompat0.getSystemWindowInsetRight();
            }
            int v9 = coordinatorLayout$LayoutParams0.gravity == 0 ? 0x800033 : coordinatorLayout$LayoutParams0.gravity;
            int v10 = view0.getMeasuredWidth();
            int v11 = view0.getMeasuredHeight();
            Rect rect1 = this.s;
            GravityCompat.apply(v9, v10, v11, rect0, rect1, v);
            if(this.u != 0) {
                v1 = MathUtils.clamp(((int)(this.c(appBarLayout0) * ((float)this.u))), 0, this.u);
            }
            view0.layout(rect1.left, rect1.top - v1, rect1.right, rect1.bottom - v1);
            this.t = rect1.top - appBarLayout0.getBottom();
            return;
        }
        super.layoutChild(coordinatorLayout0, view0, v);
        this.t = 0;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout0, View view0, int v, int v1, int v2, int v3) {
        int v4 = view0.getLayoutParams().height;
        if(v4 == -2 || v4 == -1) {
            AppBarLayout appBarLayout0 = this.b(coordinatorLayout0.getDependencies(view0));
            if(appBarLayout0 != null) {
                int v5 = View.MeasureSpec.getSize(v2);
                if(v5 <= 0) {
                    v5 = coordinatorLayout0.getHeight();
                }
                else if(ViewCompat.getFitsSystemWindows(appBarLayout0)) {
                    WindowInsetsCompat windowInsetsCompat0 = coordinatorLayout0.getLastWindowInsets();
                    if(windowInsetsCompat0 != null) {
                        int v6 = windowInsetsCompat0.getSystemWindowInsetTop();
                        v5 += windowInsetsCompat0.getSystemWindowInsetBottom() + v6;
                    }
                }
                int v7 = v5 + this.d(appBarLayout0);
                int v8 = appBarLayout0.getMeasuredHeight();
                if(this.shouldHeaderOverlapScrollingChild()) {
                    view0.setTranslationY(((float)(-v8)));
                }
                else {
                    view0.setTranslationY(0.0f);
                    v7 -= v8;
                }
                coordinatorLayout0.onMeasureChild(view0, v, v1, View.MeasureSpec.makeMeasureSpec(v7, (v4 == -1 ? 0x40000000 : 0x80000000)), v3);
                return true;
            }
        }
        return false;
    }

    public final void setOverlayTop(int v) {
        this.u = v;
    }

    public boolean shouldHeaderOverlapScrollingChild() {
        return false;
    }
}

