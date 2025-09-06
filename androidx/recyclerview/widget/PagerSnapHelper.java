package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class PagerSnapHelper extends SnapHelper {
    public OrientationHelper d;
    public OrientationHelper e;

    public static int b(View view0, OrientationHelper orientationHelper0) {
        int v = orientationHelper0.getDecoratedStart(view0);
        int v1 = orientationHelper0.getDecoratedMeasurement(view0);
        int v2 = orientationHelper0.getStartAfterPadding();
        return v1 / 2 + v - (orientationHelper0.getTotalSpace() / 2 + v2);
    }

    public static View c(LayoutManager recyclerView$LayoutManager0, OrientationHelper orientationHelper0) {
        int v = recyclerView$LayoutManager0.getChildCount();
        View view0 = null;
        if(v == 0) {
            return null;
        }
        int v1 = orientationHelper0.getStartAfterPadding();
        int v2 = orientationHelper0.getTotalSpace();
        int v3 = 0x7FFFFFFF;
        for(int v4 = 0; v4 < v; ++v4) {
            View view1 = recyclerView$LayoutManager0.getChildAt(v4);
            int v5 = orientationHelper0.getDecoratedStart(view1);
            int v6 = Math.abs(orientationHelper0.getDecoratedMeasurement(view1) / 2 + v5 - (v2 / 2 + v1));
            if(v6 < v3) {
                view0 = view1;
                v3 = v6;
            }
        }
        return view0;
    }

    @Override  // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public int[] calculateDistanceToFinalSnap(@NonNull LayoutManager recyclerView$LayoutManager0, @NonNull View view0) {
        int[] arr_v = new int[2];
        arr_v[0] = recyclerView$LayoutManager0.canScrollHorizontally() ? PagerSnapHelper.b(view0, this.d(recyclerView$LayoutManager0)) : 0;
        if(recyclerView$LayoutManager0.canScrollVertically()) {
            arr_v[1] = PagerSnapHelper.b(view0, this.e(recyclerView$LayoutManager0));
            return arr_v;
        }
        arr_v[1] = 0;
        return arr_v;
    }

    @Override  // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public SmoothScroller createScroller(@NonNull LayoutManager recyclerView$LayoutManager0) {
        return !(recyclerView$LayoutManager0 instanceof ScrollVectorProvider) ? null : new e1(this, this.a.getContext());
    }

    public final OrientationHelper d(LayoutManager recyclerView$LayoutManager0) {
        if(this.e == null || this.e.mLayoutManager != recyclerView$LayoutManager0) {
            this.e = OrientationHelper.createHorizontalHelper(recyclerView$LayoutManager0);
        }
        return this.e;
    }

    public final OrientationHelper e(LayoutManager recyclerView$LayoutManager0) {
        if(this.d == null || this.d.mLayoutManager != recyclerView$LayoutManager0) {
            this.d = OrientationHelper.createVerticalHelper(recyclerView$LayoutManager0);
        }
        return this.d;
    }

    @Override  // androidx.recyclerview.widget.SnapHelper
    @SuppressLint({"UnknownNullness"})
    @Nullable
    public View findSnapView(LayoutManager recyclerView$LayoutManager0) {
        if(recyclerView$LayoutManager0.canScrollVertically()) {
            return PagerSnapHelper.c(recyclerView$LayoutManager0, this.e(recyclerView$LayoutManager0));
        }
        return recyclerView$LayoutManager0.canScrollHorizontally() ? PagerSnapHelper.c(recyclerView$LayoutManager0, this.d(recyclerView$LayoutManager0)) : null;
    }

    @Override  // androidx.recyclerview.widget.SnapHelper
    @SuppressLint({"UnknownNullness"})
    public int findTargetSnapPosition(LayoutManager recyclerView$LayoutManager0, int v, int v1) {
        int v10;
        int v8;
        OrientationHelper orientationHelper0;
        View view0 = null;
        int v2 = recyclerView$LayoutManager0.getItemCount();
        if(v2 == 0) {
            return -1;
        }
        if(recyclerView$LayoutManager0.canScrollVertically()) {
            orientationHelper0 = this.e(recyclerView$LayoutManager0);
        }
        else {
            orientationHelper0 = recyclerView$LayoutManager0.canScrollHorizontally() ? this.d(recyclerView$LayoutManager0) : null;
        }
        if(orientationHelper0 == null) {
            return -1;
        }
        int v3 = recyclerView$LayoutManager0.getChildCount();
        int v4 = 0;
        int v6 = 0x7FFFFFFF;
        int v7 = 0x80000000;
        View view1 = null;
        for(int v5 = 0; true; ++v5) {
            v8 = 1;
            if(v5 >= v3) {
                break;
            }
            View view2 = recyclerView$LayoutManager0.getChildAt(v5);
            if(view2 != null) {
                int v9 = PagerSnapHelper.b(view2, orientationHelper0);
                if(v9 <= 0 && v9 > v7) {
                    view1 = view2;
                    v7 = v9;
                }
                if(v9 >= 0 && v9 < v6) {
                    view0 = view2;
                    v6 = v9;
                }
            }
        }
        if(!recyclerView$LayoutManager0.canScrollHorizontally()) {
            v10 = v1 <= 0 ? 0 : 1;
        }
        else if(v > 0) {
            v10 = 1;
        }
        else {
            v10 = 0;
        }
        if(v10 != 0 && view0 != null) {
            return recyclerView$LayoutManager0.getPosition(view0);
        }
        if(v10 == 0 && view1 != null) {
            return recyclerView$LayoutManager0.getPosition(view1);
        }
        if(v10 != 0) {
            view0 = view1;
        }
        if(view0 == null) {
            return -1;
        }
        int v11 = recyclerView$LayoutManager0.getPosition(view0);
        int v12 = recyclerView$LayoutManager0.getItemCount();
        if(recyclerView$LayoutManager0 instanceof ScrollVectorProvider) {
            PointF pointF0 = ((ScrollVectorProvider)recyclerView$LayoutManager0).computeScrollVectorForPosition(v12 - 1);
            if(pointF0 != null && (pointF0.x < 0.0f || pointF0.y < 0.0f)) {
                v4 = 1;
            }
        }
        if(v4 == v10) {
            v8 = -1;
        }
        int v13 = v11 + v8;
        return v13 < 0 || v13 >= v2 ? -1 : v13;
    }
}

