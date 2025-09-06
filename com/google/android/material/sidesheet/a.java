package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class a extends g.a {
    public final int l;
    public final SideSheetBehavior m;

    public a(SideSheetBehavior sideSheetBehavior0, int v) {
        this.l = v;
        this.m = sideSheetBehavior0;
        super();
    }

    @Override  // g.a
    public final int A(CoordinatorLayout coordinatorLayout0) {
        return this.l == 0 ? coordinatorLayout0.getLeft() : coordinatorLayout0.getRight();
    }

    @Override  // g.a
    public final int C() {
        return this.l == 0 ? 1 : 0;
    }

    @Override  // g.a
    public final boolean I(float f) {
        return this.l == 0 ? f > 0.0f : f < 0.0f;
    }

    @Override  // g.a
    public final boolean L(View view0) {
        return this.l == 0 ? view0.getRight() < (this.u() - this.v()) / 2 : view0.getLeft() > (this.u() + this.m.B) / 2;
    }

    @Override  // g.a
    public final boolean M(float f, float f1) {
        if(this.l != 0) {
            if(Math.abs(f) > Math.abs(f1)) {
                this.m.getClass();
                return Math.abs(f) > 500.0f;
            }
            return false;
        }
        if(Math.abs(f) > Math.abs(f1)) {
            this.m.getClass();
            return Math.abs(f) > 500.0f;
        }
        return false;
    }

    @Override  // g.a
    public final boolean Y(View view0, float f) {
        if(this.l != 0) {
            float f1 = (float)view0.getRight();
            this.m.getClass();
            return Math.abs(this.m.getHideFriction() * f + f1) > 0.5f;
        }
        float f2 = (float)view0.getLeft();
        this.m.getClass();
        return Math.abs(this.m.getHideFriction() * f + f2) > 0.5f;
    }

    @Override  // g.a
    public final void a0(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v) {
        if(this.l != 0) {
            viewGroup$MarginLayoutParams0.rightMargin = v;
            return;
        }
        viewGroup$MarginLayoutParams0.leftMargin = v;
    }

    @Override  // g.a
    public final void b0(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0, int v, int v1) {
        if(this.l != 0) {
            int v2 = this.m.B;
            if(v <= v2) {
                viewGroup$MarginLayoutParams0.rightMargin = v2 - v;
            }
            return;
        }
        if(v <= this.m.B) {
            viewGroup$MarginLayoutParams0.leftMargin = v1;
        }
    }

    @Override  // g.a
    public final int c(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
        return this.l == 0 ? viewGroup$MarginLayoutParams0.leftMargin : viewGroup$MarginLayoutParams0.rightMargin;
    }

    @Override  // g.a
    public final float d(int v) {
        if(this.l != 0) {
            float f = (float)this.m.B;
            return (f - ((float)v)) / (f - ((float)this.u()));
        }
        float f1 = (float)this.v();
        return (((float)v) - f1) / (((float)this.u()) - f1);
    }

    @Override  // g.a
    public final int t(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
        return this.l == 0 ? viewGroup$MarginLayoutParams0.leftMargin : viewGroup$MarginLayoutParams0.rightMargin;
    }

    @Override  // g.a
    public final int u() {
        return this.l == 0 ? Math.max(0, this.m.C + this.m.D) : Math.max(0, this.m.B - this.m.A - this.m.D);
    }

    @Override  // g.a
    public final int v() {
        return this.l == 0 ? -this.m.A - this.m.D : this.m.B;
    }

    @Override  // g.a
    public final int x() {
        return this.l == 0 ? this.m.D : this.m.B;
    }

    @Override  // g.a
    public final int y() {
        return this.l == 0 ? -this.m.A : this.u();
    }

    @Override  // g.a
    public final int z(View view0) {
        return this.l == 0 ? view0.getRight() + this.m.D : view0.getLeft() - this.m.D;
    }
}

