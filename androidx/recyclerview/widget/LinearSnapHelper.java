package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;

public class LinearSnapHelper extends SnapHelper {
    public OrientationHelper d;
    public OrientationHelper e;

    public final int b(LayoutManager recyclerView$LayoutManager0, OrientationHelper orientationHelper0, int v, int v1) {
        int[] arr_v = this.calculateScrollDistance(v, v1);
        int v2 = recyclerView$LayoutManager0.getChildCount();
        float f = 1.0f;
        if(v2 != 0) {
            View view0 = null;
            int v4 = 0x80000000;
            int v5 = 0x7FFFFFFF;
            View view1 = null;
            for(int v3 = 0; v3 < v2; ++v3) {
                View view2 = recyclerView$LayoutManager0.getChildAt(v3);
                int v6 = recyclerView$LayoutManager0.getPosition(view2);
                if(v6 != -1) {
                    if(v6 < v5) {
                        view0 = view2;
                        v5 = v6;
                    }
                    if(v6 > v4) {
                        view1 = view2;
                        v4 = v6;
                    }
                }
            }
            if(view0 != null && view1 != null) {
                int v7 = Math.min(orientationHelper0.getDecoratedStart(view0), orientationHelper0.getDecoratedStart(view1));
                int v8 = Math.max(orientationHelper0.getDecoratedEnd(view0), orientationHelper0.getDecoratedEnd(view1)) - v7;
                if(v8 != 0) {
                    f = ((float)v8) * 1.0f / ((float)(v4 - v5 + 1));
                }
            }
        }
        if(f <= 0.0f) {
            return 0;
        }
        return Math.abs(arr_v[0]) <= Math.abs(arr_v[1]) ? Math.round(((float)arr_v[1]) / f) : Math.round(((float)arr_v[0]) / f);
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
    public int[] calculateDistanceToFinalSnap(@NonNull LayoutManager recyclerView$LayoutManager0, @NonNull View view0) {
        int[] arr_v = new int[2];
        if(recyclerView$LayoutManager0.canScrollHorizontally()) {
            OrientationHelper orientationHelper0 = this.d(recyclerView$LayoutManager0);
            int v = orientationHelper0.getDecoratedStart(view0);
            int v1 = orientationHelper0.getDecoratedMeasurement(view0);
            int v2 = orientationHelper0.getStartAfterPadding();
            arr_v[0] = v1 / 2 + v - (orientationHelper0.getTotalSpace() / 2 + v2);
        }
        else {
            arr_v[0] = 0;
        }
        if(recyclerView$LayoutManager0.canScrollVertically()) {
            OrientationHelper orientationHelper1 = this.e(recyclerView$LayoutManager0);
            int v3 = orientationHelper1.getDecoratedStart(view0);
            int v4 = orientationHelper1.getDecoratedMeasurement(view0);
            int v5 = orientationHelper1.getStartAfterPadding();
            arr_v[1] = v4 / 2 + v3 - (orientationHelper1.getTotalSpace() / 2 + v5);
            return arr_v;
        }
        arr_v[1] = 0;
        return arr_v;
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
    public View findSnapView(LayoutManager recyclerView$LayoutManager0) {
        if(recyclerView$LayoutManager0.canScrollVertically()) {
            return LinearSnapHelper.c(recyclerView$LayoutManager0, this.e(recyclerView$LayoutManager0));
        }
        return recyclerView$LayoutManager0.canScrollHorizontally() ? LinearSnapHelper.c(recyclerView$LayoutManager0, this.d(recyclerView$LayoutManager0)) : null;
    }

    @Override  // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(LayoutManager recyclerView$LayoutManager0, int v, int v1) {
        int v6;
        int v5;
        if(!(recyclerView$LayoutManager0 instanceof ScrollVectorProvider)) {
            return -1;
        }
        int v2 = recyclerView$LayoutManager0.getItemCount();
        if(v2 == 0) {
            return -1;
        }
        View view0 = this.findSnapView(recyclerView$LayoutManager0);
        if(view0 == null) {
            return -1;
        }
        int v3 = recyclerView$LayoutManager0.getPosition(view0);
        if(v3 == -1) {
            return -1;
        }
        int v4 = 0;
        PointF pointF0 = ((ScrollVectorProvider)recyclerView$LayoutManager0).computeScrollVectorForPosition(v2 - 1);
        if(pointF0 == null) {
            return -1;
        }
        if(recyclerView$LayoutManager0.canScrollHorizontally()) {
            v5 = this.b(recyclerView$LayoutManager0, this.d(recyclerView$LayoutManager0), v, 0);
            if(pointF0.x < 0.0f) {
                v5 = -v5;
            }
        }
        else {
            v5 = 0;
        }
        if(recyclerView$LayoutManager0.canScrollVertically()) {
            v6 = this.b(recyclerView$LayoutManager0, this.e(recyclerView$LayoutManager0), 0, v1);
            if(pointF0.y < 0.0f) {
                v6 = -v6;
            }
        }
        else {
            v6 = 0;
        }
        if(recyclerView$LayoutManager0.canScrollVertically()) {
            v5 = v6;
        }
        if(v5 == 0) {
            return -1;
        }
        int v7 = v3 + v5;
        if(v7 >= 0) {
            v4 = v7;
        }
        return v4 >= v2 ? v2 - 1 : v4;
    }
}

