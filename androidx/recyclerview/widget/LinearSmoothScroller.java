package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public class LinearSmoothScroller extends SmoothScroller {
    public static final int SNAP_TO_ANY = 0;
    public static final int SNAP_TO_END = 1;
    public static final int SNAP_TO_START = -1;
    public final DisplayMetrics i;
    public boolean j;
    public float k;
    protected final DecelerateInterpolator mDecelerateInterpolator;
    protected int mInterimTargetDx;
    protected int mInterimTargetDy;
    protected final LinearInterpolator mLinearInterpolator;
    @SuppressLint({"UnknownNullness"})
    protected PointF mTargetVector;

    @SuppressLint({"UnknownNullness"})
    public LinearSmoothScroller(Context context0) {
        this.mLinearInterpolator = new LinearInterpolator();
        this.mDecelerateInterpolator = new DecelerateInterpolator();
        this.j = false;
        this.mInterimTargetDx = 0;
        this.mInterimTargetDy = 0;
        this.i = context0.getResources().getDisplayMetrics();
    }

    public int calculateDtToFit(int v, int v1, int v2, int v3, int v4) {
        switch(v4) {
            case -1: {
                return v2 - v;
            }
            case 0: {
                int v5 = v2 - v;
                if(v5 > 0) {
                    return v5;
                }
                int v6 = v3 - v1;
                return v6 >= 0 ? 0 : v6;
            }
            default: {
                if(v4 != 1) {
                    throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
                }
                return v3 - v1;
            }
        }
    }

    @SuppressLint({"UnknownNullness"})
    public int calculateDxToMakeVisible(View view0, int v) {
        LayoutManager recyclerView$LayoutManager0 = this.getLayoutManager();
        if(recyclerView$LayoutManager0 != null && recyclerView$LayoutManager0.canScrollHorizontally()) {
            LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            return this.calculateDtToFit(recyclerView$LayoutManager0.getDecoratedLeft(view0) - recyclerView$LayoutParams0.leftMargin, recyclerView$LayoutManager0.getDecoratedRight(view0) + recyclerView$LayoutParams0.rightMargin, recyclerView$LayoutManager0.getPaddingLeft(), recyclerView$LayoutManager0.getWidth() - recyclerView$LayoutManager0.getPaddingRight(), v);
        }
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    public int calculateDyToMakeVisible(View view0, int v) {
        LayoutManager recyclerView$LayoutManager0 = this.getLayoutManager();
        if(recyclerView$LayoutManager0 != null && recyclerView$LayoutManager0.canScrollVertically()) {
            LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            return this.calculateDtToFit(recyclerView$LayoutManager0.getDecoratedTop(view0) - recyclerView$LayoutParams0.topMargin, recyclerView$LayoutManager0.getDecoratedBottom(view0) + recyclerView$LayoutParams0.bottomMargin, recyclerView$LayoutManager0.getPaddingTop(), recyclerView$LayoutManager0.getHeight() - recyclerView$LayoutManager0.getPaddingBottom(), v);
        }
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics0) {
        return 25.0f / ((float)displayMetrics0.densityDpi);
    }

    public int calculateTimeForDeceleration(int v) {
        return (int)Math.ceil(((double)this.calculateTimeForScrolling(v)) / 0.3356);
    }

    public int calculateTimeForScrolling(int v) {
        float f = (float)Math.abs(v);
        if(!this.j) {
            this.k = this.calculateSpeedPerPixel(this.i);
            this.j = true;
        }
        return (int)Math.ceil(f * this.k);
    }

    public int getHorizontalSnapPreference() {
        PointF pointF0 = this.mTargetVector;
        if(pointF0 != null) {
            float f = pointF0.x;
            if(f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    public int getVerticalSnapPreference() {
        PointF pointF0 = this.mTargetVector;
        if(pointF0 != null) {
            float f = pointF0.y;
            if(f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$SmoothScroller
    @SuppressLint({"UnknownNullness"})
    public void onSeekTargetStep(int v, int v1, State recyclerView$State0, Action recyclerView$SmoothScroller$Action0) {
        if(this.getChildCount() == 0) {
            this.stop();
            return;
        }
        int v2 = this.mInterimTargetDx - v;
        int v3 = 0;
        if(this.mInterimTargetDx * v2 <= 0) {
            v2 = 0;
        }
        this.mInterimTargetDx = v2;
        int v4 = this.mInterimTargetDy - v1;
        if(this.mInterimTargetDy * v4 > 0) {
            v3 = v4;
        }
        this.mInterimTargetDy = v3;
        if(v2 == 0 && v3 == 0) {
            this.updateActionForInterimTarget(recyclerView$SmoothScroller$Action0);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$SmoothScroller
    public void onStart() {
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$SmoothScroller
    public void onStop() {
        this.mInterimTargetDy = 0;
        this.mInterimTargetDx = 0;
        this.mTargetVector = null;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$SmoothScroller
    @SuppressLint({"UnknownNullness"})
    public void onTargetFound(View view0, State recyclerView$State0, Action recyclerView$SmoothScroller$Action0) {
        int v = this.calculateDxToMakeVisible(view0, this.getHorizontalSnapPreference());
        int v1 = this.calculateDyToMakeVisible(view0, this.getVerticalSnapPreference());
        int v2 = this.calculateTimeForDeceleration(((int)Math.sqrt(v1 * v1 + v * v)));
        if(v2 > 0) {
            recyclerView$SmoothScroller$Action0.update(-v, -v1, v2, this.mDecelerateInterpolator);
        }
    }

    @SuppressLint({"UnknownNullness"})
    public void updateActionForInterimTarget(Action recyclerView$SmoothScroller$Action0) {
        PointF pointF0 = this.computeScrollVectorForPosition(this.getTargetPosition());
        if(pointF0 != null && (pointF0.x != 0.0f || pointF0.y != 0.0f)) {
            this.normalize(pointF0);
            this.mTargetVector = pointF0;
            this.mInterimTargetDx = (int)(pointF0.x * 10000.0f);
            this.mInterimTargetDy = (int)(pointF0.y * 10000.0f);
            int v = this.calculateTimeForScrolling(10000);
            recyclerView$SmoothScroller$Action0.update(((int)(((float)this.mInterimTargetDx) * 1.2f)), ((int)(((float)this.mInterimTargetDy) * 1.2f)), ((int)(((float)v) * 1.2f)), this.mLinearInterpolator);
            return;
        }
        recyclerView$SmoothScroller$Action0.jumpTo(this.getTargetPosition());
        this.stop();
    }
}

