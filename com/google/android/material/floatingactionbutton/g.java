package com.google.android.material.floatingactionbutton;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;

public final class g implements Size {
    public final f a;
    public final ExtendedFloatingActionButton b;

    public g(ExtendedFloatingActionButton extendedFloatingActionButton0, f f0) {
        this.b = extendedFloatingActionButton0;
        this.a = f0;
    }

    @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size
    public final int getHeight() {
        ExtendedFloatingActionButton extendedFloatingActionButton0 = this.b;
        int v = extendedFloatingActionButton0.H;
        ExtendedFloatingActionButton extendedFloatingActionButton1 = this.a.a;
        if(v == -1) {
            if(!(extendedFloatingActionButton0.getParent() instanceof View)) {
                return extendedFloatingActionButton1.getMeasuredHeight();
            }
            View view0 = (View)extendedFloatingActionButton0.getParent();
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            if(viewGroup$LayoutParams0 != null && viewGroup$LayoutParams0.height == -2) {
                return extendedFloatingActionButton1.getMeasuredHeight();
            }
            int v1 = view0.getPaddingTop();
            int v2 = view0.getPaddingBottom();
            if(extendedFloatingActionButton0.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)extendedFloatingActionButton0.getLayoutParams();
                if(viewGroup$MarginLayoutParams0 != null) {
                    int v3 = viewGroup$MarginLayoutParams0.topMargin + viewGroup$MarginLayoutParams0.bottomMargin;
                    return view0.getHeight() - v3 - (v2 + v1);
                }
            }
            return view0.getHeight() - (v2 + v1);
        }
        return v == -2 || v == 0 ? extendedFloatingActionButton1.getMeasuredHeight() : v;
    }

    @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size
    public final ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(-1, (this.b.H == 0 ? -2 : this.b.H));
    }

    @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size
    public final int getPaddingEnd() {
        return this.b.B;
    }

    @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size
    public final int getPaddingStart() {
        return this.b.A;
    }

    @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size
    public final int getWidth() {
        ExtendedFloatingActionButton extendedFloatingActionButton0 = this.b;
        ViewParent viewParent0 = extendedFloatingActionButton0.getParent();
        f f0 = this.a;
        if(!(viewParent0 instanceof View)) {
            return f0.getWidth();
        }
        View view0 = (View)extendedFloatingActionButton0.getParent();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(viewGroup$LayoutParams0 != null && viewGroup$LayoutParams0.width == -2) {
            return f0.getWidth();
        }
        int v = view0.getPaddingLeft();
        int v1 = view0.getPaddingRight();
        if(extendedFloatingActionButton0.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)extendedFloatingActionButton0.getLayoutParams();
            if(viewGroup$MarginLayoutParams0 != null) {
                int v2 = viewGroup$MarginLayoutParams0.leftMargin + viewGroup$MarginLayoutParams0.rightMargin;
                return view0.getWidth() - v2 - (v1 + v);
            }
        }
        return view0.getWidth() - (v1 + v);
    }
}

