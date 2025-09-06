package androidx.slidingpanelayout.widget;

import android.view.View;
import androidx.customview.widget.ViewDragHelper.Callback;
import java.util.concurrent.CopyOnWriteArrayList;

public final class b extends Callback {
    public final SlidingPaneLayout a;

    public b(SlidingPaneLayout slidingPaneLayout0) {
        this.a = slidingPaneLayout0;
        super();
    }

    public final boolean a() {
        SlidingPaneLayout slidingPaneLayout0 = this.a;
        if(slidingPaneLayout0.j) {
            return false;
        }
        if(slidingPaneLayout0.getLockMode() == 3) {
            return false;
        }
        return !slidingPaneLayout0.isOpen() || slidingPaneLayout0.getLockMode() != 1 ? slidingPaneLayout0.isOpen() || slidingPaneLayout0.getLockMode() != 2 : false;
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final int clampViewPositionHorizontal(View view0, int v, int v1) {
        SlidingPaneLayout slidingPaneLayout0 = this.a;
        LayoutParams slidingPaneLayout$LayoutParams0 = (LayoutParams)slidingPaneLayout0.f.getLayoutParams();
        if(slidingPaneLayout0.b()) {
            int v2 = slidingPaneLayout0.getWidth();
            int v3 = slidingPaneLayout0.getPaddingRight() + slidingPaneLayout$LayoutParams0.rightMargin;
            int v4 = v2 - (slidingPaneLayout0.f.getWidth() + v3);
            return Math.max(Math.min(v, v4), v4 - slidingPaneLayout0.i);
        }
        int v5 = slidingPaneLayout0.getPaddingLeft() + slidingPaneLayout$LayoutParams0.leftMargin;
        return Math.min(Math.max(v, v5), slidingPaneLayout0.i + v5);
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final int clampViewPositionVertical(View view0, int v, int v1) {
        return view0.getTop();
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final int getViewHorizontalDragRange(View view0) {
        return this.a.i;
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final void onEdgeDragStarted(int v, int v1) {
        if(!this.a()) {
            return;
        }
        this.a.p.captureChildView(this.a.f, v1);
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final void onEdgeTouched(int v, int v1) {
        if(!this.a()) {
            return;
        }
        this.a.p.captureChildView(this.a.f, v1);
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final void onViewCaptured(View view0, int v) {
        SlidingPaneLayout slidingPaneLayout0 = this.a;
        int v1 = slidingPaneLayout0.getChildCount();
        for(int v2 = 0; v2 < v1; ++v2) {
            View view1 = slidingPaneLayout0.getChildAt(v2);
            if(view1.getVisibility() == 4) {
                view1.setVisibility(0);
            }
        }
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final void onViewDragStateChanged(int v) {
        SlidingPaneLayout slidingPaneLayout0 = this.a;
        if(slidingPaneLayout0.p.getViewDragState() == 0) {
            CopyOnWriteArrayList copyOnWriteArrayList0 = slidingPaneLayout0.n;
            if(Float.compare(slidingPaneLayout0.g, 1.0f) == 0) {
                slidingPaneLayout0.e(slidingPaneLayout0.f);
                View view0 = slidingPaneLayout0.f;
                for(Object object0: copyOnWriteArrayList0) {
                    ((PanelSlideListener)object0).onPanelClosed(view0);
                }
                slidingPaneLayout0.sendAccessibilityEvent(0x20);
                slidingPaneLayout0.q = false;
                return;
            }
            View view1 = slidingPaneLayout0.f;
            for(Object object1: copyOnWriteArrayList0) {
                ((PanelSlideListener)object1).onPanelOpened(view1);
            }
            slidingPaneLayout0.sendAccessibilityEvent(0x20);
            slidingPaneLayout0.q = true;
        }
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final void onViewPositionChanged(View view0, int v, int v1, int v2, int v3) {
        SlidingPaneLayout slidingPaneLayout0 = this.a;
        if(slidingPaneLayout0.f == null) {
            slidingPaneLayout0.g = 0.0f;
        }
        else {
            boolean z = slidingPaneLayout0.b();
            LayoutParams slidingPaneLayout$LayoutParams0 = (LayoutParams)slidingPaneLayout0.f.getLayoutParams();
            int v4 = slidingPaneLayout0.f.getWidth();
            if(z) {
                v = slidingPaneLayout0.getWidth() - v - v4;
            }
            float f = ((float)(v - ((z ? slidingPaneLayout0.getPaddingRight() : slidingPaneLayout0.getPaddingLeft()) + (z ? slidingPaneLayout$LayoutParams0.rightMargin : slidingPaneLayout$LayoutParams0.leftMargin)))) / ((float)slidingPaneLayout0.i);
            slidingPaneLayout0.g = f;
            if(slidingPaneLayout0.k != 0) {
                slidingPaneLayout0.c(f);
            }
            View view1 = slidingPaneLayout0.f;
            for(Object object0: slidingPaneLayout0.n) {
                ((PanelSlideListener)object0).onPanelSlide(view1, slidingPaneLayout0.g);
            }
        }
        slidingPaneLayout0.invalidate();
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final void onViewReleased(View view0, float f, float f1) {
        int v2;
        LayoutParams slidingPaneLayout$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        SlidingPaneLayout slidingPaneLayout0 = this.a;
        if(slidingPaneLayout0.b()) {
            int v = slidingPaneLayout0.getPaddingRight() + slidingPaneLayout$LayoutParams0.rightMargin;
            if(f < 0.0f || f == 0.0f && slidingPaneLayout0.g > 0.5f) {
                v += slidingPaneLayout0.i;
            }
            int v1 = slidingPaneLayout0.f.getWidth();
            v2 = slidingPaneLayout0.getWidth() - v - v1;
        }
        else {
            int v3 = slidingPaneLayout0.getPaddingLeft();
            v2 = slidingPaneLayout$LayoutParams0.leftMargin + v3;
            int v4 = Float.compare(f, 0.0f);
            if(v4 > 0 || v4 == 0 && slidingPaneLayout0.g > 0.5f) {
                v2 += slidingPaneLayout0.i;
            }
        }
        int v5 = view0.getTop();
        slidingPaneLayout0.p.settleCapturedViewAt(v2, v5);
        slidingPaneLayout0.invalidate();
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final boolean tryCaptureView(View view0, int v) {
        return this.a() ? ((LayoutParams)view0.getLayoutParams()).a : false;
    }
}

