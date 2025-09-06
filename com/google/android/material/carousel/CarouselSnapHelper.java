package com.google.android.material.carousel;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

public class CarouselSnapHelper extends SnapHelper {
    public final boolean d;
    public RecyclerView e;

    public CarouselSnapHelper() {
        this(true);
    }

    public CarouselSnapHelper(boolean z) {
        this.d = z;
    }

    @Override  // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(@Nullable RecyclerView recyclerView0) {
        super.attachToRecyclerView(recyclerView0);
        this.e = recyclerView0;
    }

    public static int[] b(LayoutManager recyclerView$LayoutManager0, View view0, boolean z) {
        if(!(recyclerView$LayoutManager0 instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        int v = ((CarouselLayoutManager)recyclerView$LayoutManager0).n(((CarouselLayoutManager)recyclerView$LayoutManager0).getPosition(view0), z);
        if(recyclerView$LayoutManager0.canScrollHorizontally()) {
            return new int[]{v, 0};
        }
        return recyclerView$LayoutManager0.canScrollVertically() ? new int[]{0, v} : new int[]{0, 0};
    }

    @Override  // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public int[] calculateDistanceToFinalSnap(@NonNull LayoutManager recyclerView$LayoutManager0, @NonNull View view0) {
        return CarouselSnapHelper.b(recyclerView$LayoutManager0, view0, false);
    }

    @Override  // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public SmoothScroller createScroller(@NonNull LayoutManager recyclerView$LayoutManager0) {
        return recyclerView$LayoutManager0 instanceof ScrollVectorProvider ? new h(this, this.e.getContext(), recyclerView$LayoutManager0) : null;
    }

    @Override  // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public View findSnapView(LayoutManager recyclerView$LayoutManager0) {
        int v = recyclerView$LayoutManager0.getChildCount();
        View view0 = null;
        if(v != 0 && recyclerView$LayoutManager0 instanceof CarouselLayoutManager) {
            int v1 = 0x7FFFFFFF;
            for(int v2 = 0; v2 < v; ++v2) {
                View view1 = recyclerView$LayoutManager0.getChildAt(v2);
                int v3 = Math.abs(((CarouselLayoutManager)recyclerView$LayoutManager0).n(recyclerView$LayoutManager0.getPosition(view1), false));
                if(v3 < v1) {
                    view0 = view1;
                    v1 = v3;
                }
            }
        }
        return view0;
    }

    @Override  // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(LayoutManager recyclerView$LayoutManager0, int v, int v1) {
        int v10;
        int v8;
        if(!this.d) {
            return -1;
        }
        int v2 = recyclerView$LayoutManager0.getItemCount();
        if(v2 == 0) {
            return -1;
        }
        int v3 = recyclerView$LayoutManager0.getChildCount();
        View view0 = null;
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
                int v9 = ((CarouselLayoutManager)recyclerView$LayoutManager0).n(((CarouselLayoutManager)recyclerView$LayoutManager0).getPosition(view2), false);
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

