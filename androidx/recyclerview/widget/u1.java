package androidx.recyclerview.widget;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

public final class u1 implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator d;
    public boolean e;
    public boolean f;
    public final RecyclerView g;

    public u1(RecyclerView recyclerView0) {
        this.g = recyclerView0;
        this.d = RecyclerView.sQuinticInterpolator;
        this.e = false;
        this.f = false;
        this.c = new OverScroller(recyclerView0.getContext(), RecyclerView.sQuinticInterpolator);
    }

    public final void a(int v, int v1) {
        RecyclerView recyclerView0 = this.g;
        recyclerView0.setScrollState(2);
        this.b = 0;
        this.a = 0;
        Interpolator interpolator0 = RecyclerView.sQuinticInterpolator;
        if(this.d != interpolator0) {
            this.d = interpolator0;
            this.c = new OverScroller(recyclerView0.getContext(), interpolator0);
        }
        this.c.fling(0, 0, v, v1, 0x80000000, 0x7FFFFFFF, 0x80000000, 0x7FFFFFFF);
        this.b();
    }

    public final void b() {
        if(this.e) {
            this.f = true;
            return;
        }
        this.g.removeCallbacks(this);
        ViewCompat.postOnAnimation(this.g, this);
    }

    public final void c(int v, int v1, int v2, Interpolator interpolator0) {
        RecyclerView recyclerView0 = this.g;
        if(v2 == 0x80000000) {
            int v3 = Math.abs(v);
            int v4 = Math.abs(v1);
            boolean z = v3 > v4;
            int v5 = z ? recyclerView0.getWidth() : recyclerView0.getHeight();
            if(!z) {
                v3 = v4;
            }
            v2 = Math.min(((int)((((float)v3) / ((float)v5) + 1.0f) * 300.0f)), 2000);
        }
        if(interpolator0 == null) {
            interpolator0 = RecyclerView.sQuinticInterpolator;
        }
        if(this.d != interpolator0) {
            this.d = interpolator0;
            this.c = new OverScroller(recyclerView0.getContext(), interpolator0);
        }
        this.b = 0;
        this.a = 0;
        recyclerView0.setScrollState(2);
        this.c.startScroll(0, 0, v, v1, v2);
        this.b();
    }

    @Override
    public final void run() {
        int v16;
        int v12;
        int v11;
        int v10;
        int v9;
        RecyclerView recyclerView0 = this.g;
        if(recyclerView0.mLayout == null) {
            recyclerView0.removeCallbacks(this);
            this.c.abortAnimation();
            return;
        }
        this.f = false;
        this.e = true;
        recyclerView0.consumePendingUpdateOperations();
        OverScroller overScroller0 = this.c;
        if(overScroller0.computeScrollOffset()) {
            int v = overScroller0.getCurrX();
            int v1 = overScroller0.getCurrY();
            int v2 = v - this.a;
            int v3 = v1 - this.b;
            this.a = v;
            this.b = v1;
            int v4 = recyclerView0.consumeFlingInHorizontalStretch(v2);
            int v5 = recyclerView0.consumeFlingInVerticalStretch(v3);
            recyclerView0.mReusableIntPair[0] = 0;
            recyclerView0.mReusableIntPair[1] = 0;
            if(recyclerView0.dispatchNestedPreScroll(v4, v5, recyclerView0.mReusableIntPair, null, 1)) {
                v4 -= recyclerView0.mReusableIntPair[0];
                v5 -= recyclerView0.mReusableIntPair[1];
            }
            if(recyclerView0.getOverScrollMode() != 2) {
                recyclerView0.considerReleasingGlowsOnScroll(v4, v5);
            }
            if(recyclerView0.mAdapter == null) {
                v11 = v4;
                v12 = v5;
                v9 = 0;
                v10 = 0;
            }
            else {
                recyclerView0.mReusableIntPair[0] = 0;
                recyclerView0.mReusableIntPair[1] = 0;
                recyclerView0.scrollStep(v4, v5, recyclerView0.mReusableIntPair);
                int v6 = recyclerView0.mReusableIntPair[0];
                int v7 = recyclerView0.mReusableIntPair[1];
                SmoothScroller recyclerView$SmoothScroller0 = recyclerView0.mLayout.mSmoothScroller;
                if(recyclerView$SmoothScroller0 != null && !recyclerView$SmoothScroller0.isPendingInitialRun() && recyclerView$SmoothScroller0.isRunning()) {
                    int v8 = recyclerView0.mState.getItemCount();
                    if(v8 == 0) {
                        recyclerView$SmoothScroller0.stop();
                    }
                    else {
                        if(recyclerView$SmoothScroller0.getTargetPosition() >= v8) {
                            recyclerView$SmoothScroller0.setTargetPosition(v8 - 1);
                        }
                        recyclerView$SmoothScroller0.a(v6, v7);
                    }
                }
                v9 = v7;
                v10 = v6;
                v11 = v4 - v6;
                v12 = v5 - v7;
            }
            if(!recyclerView0.mItemDecorations.isEmpty()) {
                recyclerView0.invalidate();
            }
            recyclerView0.mReusableIntPair[0] = 0;
            recyclerView0.mReusableIntPair[1] = 0;
            recyclerView0.dispatchNestedScroll(v10, v9, v11, v12, null, 1, recyclerView0.mReusableIntPair);
            int v13 = v11 - recyclerView0.mReusableIntPair[0];
            int v14 = v12 - recyclerView0.mReusableIntPair[1];
            if(v10 != 0 || v9 != 0) {
                recyclerView0.dispatchOnScrolled(v10, v9);
            }
            if(!recyclerView0.awakenScrollBars()) {
                recyclerView0.invalidate();
            }
            boolean z = overScroller0.getCurrX() == overScroller0.getFinalX();
            boolean z1 = overScroller0.getCurrY() == overScroller0.getFinalY();
            boolean z2 = overScroller0.isFinished() || (z || v13 != 0) && (z1 || v14 != 0);
            SmoothScroller recyclerView$SmoothScroller1 = recyclerView0.mLayout.mSmoothScroller;
            if(recyclerView$SmoothScroller1 != null && recyclerView$SmoothScroller1.isPendingInitialRun() || !z2) {
                this.b();
                e0 e00 = recyclerView0.mGapWorker;
                if(e00 != null) {
                    e00.a(recyclerView0, v10, v9);
                }
            }
            else {
                if(recyclerView0.getOverScrollMode() != 2) {
                    int v15 = (int)overScroller0.getCurrVelocity();
                    if(v13 < 0) {
                        v16 = -v15;
                    }
                    else {
                        v16 = v13 <= 0 ? 0 : v15;
                    }
                    if(v14 < 0) {
                        v15 = -v15;
                    }
                    else if(v14 <= 0) {
                        v15 = 0;
                    }
                    recyclerView0.absorbGlows(v16, v15);
                }
                if(RecyclerView.ALLOW_THREAD_GAP_WORK) {
                    c0 c00 = recyclerView0.mPrefetchRegistry;
                    int[] arr_v = c00.c;
                    if(arr_v != null) {
                        Arrays.fill(arr_v, -1);
                    }
                    c00.d = 0;
                }
            }
        }
        SmoothScroller recyclerView$SmoothScroller2 = recyclerView0.mLayout.mSmoothScroller;
        if(recyclerView$SmoothScroller2 != null && recyclerView$SmoothScroller2.isPendingInitialRun()) {
            recyclerView$SmoothScroller2.a(0, 0);
        }
        this.e = false;
        if(this.f) {
            recyclerView0.removeCallbacks(this);
            ViewCompat.postOnAnimation(recyclerView0, this);
            return;
        }
        recyclerView0.setScrollState(0);
        recyclerView0.stopNestedScroll(1);
    }
}

