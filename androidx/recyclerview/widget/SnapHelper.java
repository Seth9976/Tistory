package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class SnapHelper extends OnFlingListener {
    public RecyclerView a;
    public Scroller b;
    public final w1 c;

    public SnapHelper() {
        this.c = new w1(this);
    }

    public final void a() {
        RecyclerView recyclerView0 = this.a;
        if(recyclerView0 == null) {
            return;
        }
        LayoutManager recyclerView$LayoutManager0 = recyclerView0.getLayoutManager();
        if(recyclerView$LayoutManager0 == null) {
            return;
        }
        View view0 = this.findSnapView(recyclerView$LayoutManager0);
        if(view0 == null) {
            return;
        }
        int[] arr_v = this.calculateDistanceToFinalSnap(recyclerView$LayoutManager0, view0);
        int v = arr_v[0];
        if(v != 0 || arr_v[1] != 0) {
            this.a.smoothScrollBy(v, arr_v[1]);
        }
    }

    public void attachToRecyclerView(@Nullable RecyclerView recyclerView0) throws IllegalStateException {
        RecyclerView recyclerView1 = this.a;
        if(recyclerView1 == recyclerView0) {
            return;
        }
        w1 w10 = this.c;
        if(recyclerView1 != null) {
            recyclerView1.removeOnScrollListener(w10);
            this.a.setOnFlingListener(null);
        }
        this.a = recyclerView0;
        if(recyclerView0 != null) {
            if(recyclerView0.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.a.addOnScrollListener(w10);
            this.a.setOnFlingListener(this);
            this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
            this.a();
        }
    }

    @Nullable
    public abstract int[] calculateDistanceToFinalSnap(@NonNull LayoutManager arg1, @NonNull View arg2);

    @SuppressLint({"UnknownNullness"})
    public int[] calculateScrollDistance(int v, int v1) {
        this.b.fling(0, 0, v, v1, 0x80000000, 0x7FFFFFFF, 0x80000000, 0x7FFFFFFF);
        return new int[]{this.b.getFinalX(), this.b.getFinalY()};
    }

    @Nullable
    public SmoothScroller createScroller(@NonNull LayoutManager recyclerView$LayoutManager0) {
        return this.createSnapScroller(recyclerView$LayoutManager0);
    }

    @Nullable
    @Deprecated
    public LinearSmoothScroller createSnapScroller(@NonNull LayoutManager recyclerView$LayoutManager0) {
        return !(recyclerView$LayoutManager0 instanceof ScrollVectorProvider) ? null : new x1(this, this.a.getContext());
    }

    @SuppressLint({"UnknownNullness"})
    @Nullable
    public abstract View findSnapView(LayoutManager arg1);

    @SuppressLint({"UnknownNullness"})
    public abstract int findTargetSnapPosition(LayoutManager arg1, int arg2, int arg3);

    @Override  // androidx.recyclerview.widget.RecyclerView$OnFlingListener
    public boolean onFling(int v, int v1) {
        LayoutManager recyclerView$LayoutManager0 = this.a.getLayoutManager();
        if(recyclerView$LayoutManager0 == null) {
            return false;
        }
        if(this.a.getAdapter() == null) {
            return false;
        }
        int v2 = this.a.getMinFlingVelocity();
        if((Math.abs(v1) > v2 || Math.abs(v) > v2) && recyclerView$LayoutManager0 instanceof ScrollVectorProvider) {
            SmoothScroller recyclerView$SmoothScroller0 = this.createScroller(recyclerView$LayoutManager0);
            if(recyclerView$SmoothScroller0 != null) {
                int v3 = this.findTargetSnapPosition(recyclerView$LayoutManager0, v, v1);
                if(v3 != -1) {
                    recyclerView$SmoothScroller0.setTargetPosition(v3);
                    recyclerView$LayoutManager0.startSmoothScroll(recyclerView$SmoothScroller0);
                    return true;
                }
            }
        }
        return false;
    }
}

