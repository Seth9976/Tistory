package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.core.math.MathUtils;
import androidx.customview.widget.ViewDragHelper.Callback;
import java.util.LinkedHashSet;

public final class e extends Callback {
    public final SideSheetBehavior a;

    public e(SideSheetBehavior sideSheetBehavior0) {
        this.a = sideSheetBehavior0;
        super();
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final int clampViewPositionHorizontal(View view0, int v, int v1) {
        return MathUtils.clamp(v, this.a.o.y(), this.a.o.x());
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final int clampViewPositionVertical(View view0, int v, int v1) {
        return view0.getTop();
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final int getViewHorizontalDragRange(View view0) {
        return this.a.A + this.a.D;
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final void onViewDragStateChanged(int v) {
        if(v == 1) {
            SideSheetBehavior sideSheetBehavior0 = this.a;
            if(sideSheetBehavior0.u) {
                sideSheetBehavior0.a(1);
            }
        }
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final void onViewPositionChanged(View view0, int v, int v1, int v2, int v3) {
        SideSheetBehavior sideSheetBehavior0 = this.a;
        View view1 = sideSheetBehavior0.getCoplanarSiblingView();
        if(view1 != null) {
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view1.getLayoutParams();
            if(viewGroup$MarginLayoutParams0 != null) {
                sideSheetBehavior0.o.b0(viewGroup$MarginLayoutParams0, view0.getLeft(), view0.getRight());
                view1.setLayoutParams(viewGroup$MarginLayoutParams0);
            }
        }
        LinkedHashSet linkedHashSet0 = sideSheetBehavior0.K;
        if(!linkedHashSet0.isEmpty()) {
            float f = sideSheetBehavior0.o.d(v);
            for(Object object0: linkedHashSet0) {
                ((SheetCallback)object0).onSlide(view0, f);
            }
        }
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final void onViewReleased(View view0, float f, float f1) {
        SideSheetBehavior sideSheetBehavior0 = this.a;
        int v = 3;
        if(!sideSheetBehavior0.o.I(f)) {
            if(!sideSheetBehavior0.o.Y(view0, f)) {
                if(f != 0.0f && Math.abs(f) > Math.abs(f1)) {
                    v = 5;
                }
                else {
                    int v1 = view0.getLeft();
                    if(Math.abs(v1 - sideSheetBehavior0.getExpandedOffset()) >= Math.abs(v1 - sideSheetBehavior0.o.v())) {
                        v = 5;
                    }
                }
            }
            else if(sideSheetBehavior0.o.M(f, f1) || sideSheetBehavior0.o.L(view0)) {
                v = 5;
            }
        }
        sideSheetBehavior0.c(view0, v, true);
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final boolean tryCaptureView(View view0, int v) {
        return this.a.v == 1 ? false : this.a.E != null && this.a.E.get() == view0;
    }
}

