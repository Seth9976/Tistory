package androidx.drawerlayout.widget;

import android.view.View;
import androidx.appcompat.widget.a;
import androidx.customview.widget.ViewDragHelper.Callback;
import androidx.customview.widget.ViewDragHelper;

public final class b extends Callback {
    public final int a;
    public ViewDragHelper b;
    public final a c;
    public final DrawerLayout d;

    public b(DrawerLayout drawerLayout0, int v) {
        this.d = drawerLayout0;
        super();
        this.c = new a(this, 5);
        this.a = v;
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final int clampViewPositionHorizontal(View view0, int v, int v1) {
        DrawerLayout drawerLayout0 = this.d;
        if(drawerLayout0.a(3, view0)) {
            return Math.max(-view0.getWidth(), Math.min(v, 0));
        }
        int v2 = drawerLayout0.getWidth();
        return Math.max(v2 - view0.getWidth(), Math.min(v, v2));
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final int clampViewPositionVertical(View view0, int v, int v1) {
        return view0.getTop();
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final int getViewHorizontalDragRange(View view0) {
        this.d.getClass();
        return DrawerLayout.j(view0) ? view0.getWidth() : 0;
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final void onEdgeDragStarted(int v, int v1) {
        View view0 = (v & 1) == 1 ? this.d.c(3) : this.d.c(5);
        if(view0 != null && this.d.getDrawerLockMode(view0) == 0) {
            this.b.captureChildView(view0, v1);
        }
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final boolean onEdgeLock(int v) {
        return false;
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final void onEdgeTouched(int v, int v1) {
        this.d.postDelayed(this.c, 0xA0L);
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final void onViewCaptured(View view0, int v) {
        ((LayoutParams)view0.getLayoutParams()).b = false;
        DrawerLayout drawerLayout0 = this.d;
        View view1 = drawerLayout0.c((this.a == 3 ? 5 : 3));
        if(view1 != null) {
            drawerLayout0.closeDrawer(view1);
        }
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final void onViewDragStateChanged(int v) {
        View view0 = this.b.getCapturedView();
        this.d.p(v, view0);
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final void onViewPositionChanged(View view0, int v, int v1, int v2, int v3) {
        int v4 = view0.getWidth();
        float f = (this.d.a(3, view0) ? ((float)(v + v4)) : ((float)(this.d.getWidth() - v))) / ((float)v4);
        this.d.m(view0, f);
        view0.setVisibility((f == 0.0f ? 4 : 0));
        this.d.invalidate();
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final void onViewReleased(View view0, float f, float f1) {
        int v2;
        DrawerLayout drawerLayout0 = this.d;
        drawerLayout0.getClass();
        float f2 = ((LayoutParams)view0.getLayoutParams()).a;
        int v = view0.getWidth();
        if(drawerLayout0.a(3, view0)) {
            int v1 = Float.compare(f, 0.0f);
            v2 = v1 > 0 || v1 == 0 && f2 > 0.5f ? 0 : -v;
        }
        else {
            int v3 = drawerLayout0.getWidth();
            if(f < 0.0f || f == 0.0f && f2 > 0.5f) {
                v3 -= v;
            }
            v2 = v3;
        }
        this.b.settleCapturedViewAt(v2, view0.getTop());
        drawerLayout0.invalidate();
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final boolean tryCaptureView(View view0, int v) {
        this.d.getClass();
        return DrawerLayout.j(view0) && this.d.a(this.a, view0) && this.d.getDrawerLockMode(view0) == 0;
    }
}

