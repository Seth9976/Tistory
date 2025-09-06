package r7;

import android.view.View;
import androidx.core.math.MathUtils;
import androidx.customview.widget.ViewDragHelper.Callback;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class b extends Callback {
    public long a;
    public final BottomSheetBehavior b;

    public b(BottomSheetBehavior bottomSheetBehavior0) {
        this.b = bottomSheetBehavior0;
        super();
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final int clampViewPositionHorizontal(View view0, int v, int v1) {
        return view0.getLeft();
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final int clampViewPositionVertical(View view0, int v, int v1) {
        return MathUtils.clamp(v, this.b.getExpandedOffset(), this.getViewVerticalDragRange(view0));
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final int getViewVerticalDragRange(View view0) {
        return this.b.isHideable() ? this.b.j0 : this.b.V;
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final void onViewDragStateChanged(int v) {
        if(v == 1) {
            BottomSheetBehavior bottomSheetBehavior0 = this.b;
            if(bottomSheetBehavior0.Z) {
                bottomSheetBehavior0.l(1);
            }
        }
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final void onViewPositionChanged(View view0, int v, int v1, int v2, int v3) {
        this.b.f(v1);
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final void onViewReleased(View view0, float f, float f1) {
        int v = 6;
        BottomSheetBehavior bottomSheetBehavior0 = this.b;
        if(Float.compare(f1, 0.0f) >= 0) {
            if(!bottomSheetBehavior0.X || !bottomSheetBehavior0.m(view0, f1)) {
                if(f1 == 0.0f || Math.abs(f) > Math.abs(f1)) {
                    int v2 = view0.getTop();
                    if(!bottomSheetBehavior0.p) {
                        int v3 = bottomSheetBehavior0.T;
                        if(v2 >= v3) {
                            if(Math.abs(v2 - v3) >= Math.abs(v2 - bottomSheetBehavior0.V)) {
                                v = 4;
                            }
                        }
                        else if(v2 < Math.abs(v2 - bottomSheetBehavior0.V)) {
                            v = 3;
                        }
                    }
                    else if(Math.abs(v2 - bottomSheetBehavior0.S) >= Math.abs(v2 - bottomSheetBehavior0.V)) {
                        v = 4;
                    }
                    else {
                        v = 3;
                    }
                }
                else if(!bottomSheetBehavior0.p) {
                    int v1 = view0.getTop();
                    if(Math.abs(v1 - bottomSheetBehavior0.T) >= Math.abs(v1 - bottomSheetBehavior0.V)) {
                        v = 4;
                    }
                }
                else {
                    v = 4;
                }
            }
            else if(Math.abs(f) < Math.abs(f1) && f1 > ((float)bottomSheetBehavior0.s) || view0.getTop() > (bottomSheetBehavior0.getExpandedOffset() + bottomSheetBehavior0.j0) / 2) {
                v = 5;
            }
            else if(bottomSheetBehavior0.p || Math.abs(view0.getTop() - bottomSheetBehavior0.getExpandedOffset()) < Math.abs(view0.getTop() - bottomSheetBehavior0.T)) {
                v = 3;
            }
        }
        else if(bottomSheetBehavior0.p) {
            v = 3;
        }
        else if(view0.getTop() <= bottomSheetBehavior0.T) {
            v = 3;
        }
        bottomSheetBehavior0.n(view0, v, true);
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final boolean tryCaptureView(View view0, int v) {
        BottomSheetBehavior bottomSheetBehavior0 = this.b;
        int v1 = bottomSheetBehavior0.a0;
        if(v1 == 1) {
            return false;
        }
        if(bottomSheetBehavior0.s0) {
            return false;
        }
        if(v1 == 3 && bottomSheetBehavior0.q0 == v) {
            View view1 = bottomSheetBehavior0.m0 == null ? null : ((View)bottomSheetBehavior0.m0.get());
            if(view1 != null && view1.canScrollVertically(-1)) {
                return false;
            }
        }
        this.a = System.currentTimeMillis();
        return bottomSheetBehavior0.k0 != null && bottomSheetBehavior0.k0.get() == view0;
    }
}

