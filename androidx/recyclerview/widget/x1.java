package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

public final class x1 extends LinearSmoothScroller {
    public final SnapHelper l;

    public x1(SnapHelper snapHelper0, Context context0) {
        this.l = snapHelper0;
        super(context0);
    }

    @Override  // androidx.recyclerview.widget.LinearSmoothScroller
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics0) {
        return 100.0f / ((float)displayMetrics0.densityDpi);
    }

    @Override  // androidx.recyclerview.widget.LinearSmoothScroller
    public final void onTargetFound(View view0, State recyclerView$State0, Action recyclerView$SmoothScroller$Action0) {
        SnapHelper snapHelper0 = this.l;
        RecyclerView recyclerView0 = snapHelper0.a;
        if(recyclerView0 == null) {
            return;
        }
        int[] arr_v = snapHelper0.calculateDistanceToFinalSnap(recyclerView0.getLayoutManager(), view0);
        int v = arr_v[0];
        int v1 = arr_v[1];
        int v2 = this.calculateTimeForDeceleration(Math.max(Math.abs(v), Math.abs(v1)));
        if(v2 > 0) {
            recyclerView$SmoothScroller$Action0.update(v, v1, v2, this.mDecelerateInterpolator);
        }
    }
}

