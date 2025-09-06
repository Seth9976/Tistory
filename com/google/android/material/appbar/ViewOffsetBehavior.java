package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

class ViewOffsetBehavior extends Behavior {
    public j o;
    public int p;
    public int q;

    public ViewOffsetBehavior() {
        this.p = 0;
        this.q = 0;
    }

    public ViewOffsetBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.p = 0;
        this.q = 0;
    }

    public int a() {
        return this.getTopAndBottomOffset();
    }

    public int getLeftAndRightOffset() {
        return this.o == null ? 0 : this.o.e;
    }

    public int getTopAndBottomOffset() {
        return this.o == null ? 0 : this.o.d;
    }

    public boolean isHorizontalOffsetEnabled() {
        return this.o != null && this.o.g;
    }

    public boolean isVerticalOffsetEnabled() {
        return this.o != null && this.o.f;
    }

    public void layoutChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
        coordinatorLayout0.onLayoutChild(view0, v);
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout0, View view0, int v) {
        this.layoutChild(coordinatorLayout0, view0, v);
        if(this.o == null) {
            this.o = new j(view0);
        }
        j j0 = this.o;
        j0.b = j0.a.getTop();
        j0.c = j0.a.getLeft();
        this.o.a();
        int v1 = this.p;
        if(v1 != 0) {
            this.o.b(v1);
            this.p = 0;
        }
        int v2 = this.q;
        if(v2 != 0) {
            j j1 = this.o;
            if(j1.g && j1.e != v2) {
                j1.e = v2;
                j1.a();
            }
            this.q = 0;
        }
        return true;
    }

    public void setHorizontalOffsetEnabled(boolean z) {
        j j0 = this.o;
        if(j0 != null) {
            j0.g = z;
        }
    }

    public boolean setLeftAndRightOffset(int v) {
        j j0 = this.o;
        if(j0 != null) {
            if(j0.g && j0.e != v) {
                j0.e = v;
                j0.a();
                return true;
            }
            return false;
        }
        this.q = v;
        return false;
    }

    public boolean setTopAndBottomOffset(int v) {
        j j0 = this.o;
        if(j0 != null) {
            return j0.b(v);
        }
        this.p = v;
        return false;
    }

    public void setVerticalOffsetEnabled(boolean z) {
        j j0 = this.o;
        if(j0 != null) {
            j0.f = z;
        }
    }
}

