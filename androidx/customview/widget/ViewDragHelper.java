package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.appcompat.widget.a;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.h1;
import java.util.Arrays;

public class ViewDragHelper {
    public static abstract class Callback {
        public int clampViewPositionHorizontal(@NonNull View view0, int v, int v1) {
            return 0;
        }

        public int clampViewPositionVertical(@NonNull View view0, int v, int v1) {
            return 0;
        }

        public int getOrderedChildIndex(int v) [...] // Inlined contents

        public int getViewHorizontalDragRange(@NonNull View view0) {
            return 0;
        }

        public int getViewVerticalDragRange(@NonNull View view0) {
            return 0;
        }

        public void onEdgeDragStarted(int v, int v1) {
        }

        public boolean onEdgeLock(int v) {
            return false;
        }

        public void onEdgeTouched(int v, int v1) {
        }

        public void onViewCaptured(@NonNull View view0, int v) {
        }

        public void onViewDragStateChanged(int v) {
        }

        public void onViewPositionChanged(@NonNull View view0, int v, int v1, @Px int v2, @Px int v3) {
        }

        public void onViewReleased(@NonNull View view0, float f, float f1) {
        }

        public abstract boolean tryCaptureView(@NonNull View arg1, int arg2);
    }

    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public int a;
    public int b;
    public int c;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public final float m;
    public float n;
    public int o;
    public final int p;
    public int q;
    public final OverScroller r;
    public final Callback s;
    public View t;
    public boolean u;
    public final ViewGroup v;
    public final a w;
    public static final h1 x;

    static {
        ViewDragHelper.x = new h1(2);
    }

    public ViewDragHelper(Context context0, ViewGroup viewGroup0, Callback viewDragHelper$Callback0) {
        this.c = -1;
        this.w = new a(this, 21);
        if(viewGroup0 == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if(viewDragHelper$Callback0 == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.v = viewGroup0;
        this.s = viewDragHelper$Callback0;
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(context0);
        int v = (int)(context0.getResources().getDisplayMetrics().density * 20.0f + 0.5f);
        this.p = v;
        this.o = v;
        this.b = viewConfiguration0.getScaledTouchSlop();
        this.m = (float)viewConfiguration0.getScaledMaximumFlingVelocity();
        this.n = (float)viewConfiguration0.getScaledMinimumFlingVelocity();
        this.r = new OverScroller(context0, ViewDragHelper.x);
    }

    public final boolean a(float f, float f1, int v, int v1) {
        float f2 = Math.abs(f);
        float f3 = Math.abs(f1);
        if((this.h[v] & v1) == v1 && (this.q & v1) != 0 && (this.j[v] & v1) != v1 && (this.i[v] & v1) != v1) {
            float f4 = (float)this.b;
            if(f2 > f4 || f3 > f4) {
                if(f2 < f3 * 0.5f && this.s.onEdgeLock(v1)) {
                    this.j[v] |= v1;
                    return false;
                }
                return (this.i[v] & v1) == 0 && f2 > ((float)this.b);
            }
        }
        return false;
    }

    public void abort() {
        this.cancel();
        if(this.a == 2) {
            int v = this.r.getCurrX();
            int v1 = this.r.getCurrY();
            this.r.abortAnimation();
            int v2 = this.r.getCurrX();
            int v3 = this.r.getCurrY();
            this.s.onViewPositionChanged(this.t, v2, v3, v2 - v, v3 - v1);
        }
        this.k(0);
    }

    public final boolean b(View view0, float f, float f1) {
        if(view0 == null) {
            return false;
        }
        boolean z = this.s.getViewHorizontalDragRange(view0) > 0;
        boolean z1 = this.s.getViewVerticalDragRange(view0) > 0;
        if(z && z1) {
            return f1 * f1 + f * f > ((float)(this.b * this.b));
        }
        return z ? Math.abs(f) > ((float)this.b) : z1 && Math.abs(f1) > ((float)this.b);
    }

    public final void c(int v) {
        if(this.d != null && this.isPointerDown(v)) {
            this.d[v] = 0.0f;
            this.e[v] = 0.0f;
            this.f[v] = 0.0f;
            this.g[v] = 0.0f;
            this.h[v] = 0;
            this.i[v] = 0;
            this.j[v] = 0;
            this.k &= ~(1 << v);
        }
    }

    public boolean canScroll(@NonNull View view0, boolean z, int v, int v1, int v2, int v3) {
        if(view0 instanceof ViewGroup) {
            int v4 = view0.getScrollX();
            int v5 = view0.getScrollY();
            for(int v6 = ((ViewGroup)view0).getChildCount() - 1; v6 >= 0; --v6) {
                View view1 = ((ViewGroup)view0).getChildAt(v6);
                int v7 = v2 + v4;
                if(v7 >= view1.getLeft() && v7 < view1.getRight()) {
                    int v8 = v3 + v5;
                    if(v8 >= view1.getTop() && v8 < view1.getBottom() && this.canScroll(view1, true, v, v1, v7 - view1.getLeft(), v8 - view1.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && (view0.canScrollHorizontally(-v) || view0.canScrollVertically(-v1));
    }

    public void cancel() {
        this.c = -1;
        float[] arr_f = this.d;
        if(arr_f != null) {
            Arrays.fill(arr_f, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker0 = this.l;
        if(velocityTracker0 != null) {
            velocityTracker0.recycle();
            this.l = null;
        }
    }

    public void captureChildView(@NonNull View view0, int v) {
        ViewParent viewParent0 = view0.getParent();
        ViewGroup viewGroup0 = this.v;
        if(viewParent0 != viewGroup0) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view (" + viewGroup0 + ")");
        }
        this.t = view0;
        this.c = v;
        this.s.onViewCaptured(view0, v);
        this.k(1);
    }

    public boolean checkTouchSlop(int v) {
        for(int v1 = 0; v1 < this.d.length; ++v1) {
            if(this.checkTouchSlop(v, v1)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkTouchSlop(int v, int v1) {
        if(!this.isPointerDown(v1)) {
            return false;
        }
        boolean z = (v & 1) == 1;
        boolean z1 = (v & 2) == 2;
        float f = this.f[v1] - this.d[v1];
        float f1 = this.g[v1] - this.e[v1];
        if(z && z1) {
            return f1 * f1 + f * f > ((float)(this.b * this.b));
        }
        return z ? Math.abs(f) > ((float)this.b) : z1 && Math.abs(f1) > ((float)this.b);
    }

    public boolean continueSettling(boolean z) {
        if(this.a == 2) {
            OverScroller overScroller0 = this.r;
            boolean z1 = overScroller0.computeScrollOffset();
            int v = overScroller0.getCurrX();
            int v1 = overScroller0.getCurrY();
            int v2 = v - this.t.getLeft();
            int v3 = v1 - this.t.getTop();
            if(v2 != 0) {
                ViewCompat.offsetLeftAndRight(this.t, v2);
            }
            if(v3 != 0) {
                ViewCompat.offsetTopAndBottom(this.t, v3);
            }
            if(v2 != 0 || v3 != 0) {
                this.s.onViewPositionChanged(this.t, v, v1, v2, v3);
            }
            if(z1 && v == overScroller0.getFinalX() && v1 == overScroller0.getFinalY()) {
                overScroller0.abortAnimation();
                z1 = false;
            }
            if(!z1) {
                if(z) {
                    this.v.post(this.w);
                    return this.a == 2;
                }
                this.k(0);
            }
        }
        return this.a == 2;
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup0, float f, @NonNull Callback viewDragHelper$Callback0) {
        ViewDragHelper viewDragHelper0 = ViewDragHelper.create(viewGroup0, viewDragHelper$Callback0);
        viewDragHelper0.b = (int)(1.0f / f * ((float)viewDragHelper0.b));
        return viewDragHelper0;
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup0, @NonNull Callback viewDragHelper$Callback0) {
        return new ViewDragHelper(viewGroup0.getContext(), viewGroup0, viewDragHelper$Callback0);
    }

    public final int d(int v, int v1, int v2) {
        if(v == 0) {
            return 0;
        }
        int v3 = this.v.getWidth();
        int v4 = Math.abs(v1);
        return v4 <= 0 ? Math.min(((int)((((float)Math.abs(v)) / ((float)v2) + 1.0f) * 256.0f)), 600) : Math.min(Math.round(Math.abs((((float)Math.sin((Math.min(1.0f, ((float)Math.abs(v)) / ((float)v3)) - 0.5f) * 0.471239f)) * ((float)(v3 / 2)) + ((float)(v3 / 2))) / ((float)v4)) * 1000.0f) * 4, 600);
    }

    public final boolean e(int v, int v1, int v2, int v3) {
        float f3;
        float f2;
        float f1;
        float f;
        int v4 = this.t.getLeft();
        int v5 = this.t.getTop();
        int v6 = v - v4;
        int v7 = v1 - v5;
        OverScroller overScroller0 = this.r;
        if(v6 == 0 && v7 == 0) {
            overScroller0.abortAnimation();
            this.k(0);
            return false;
        }
        View view0 = this.t;
        int v8 = (int)this.m;
        int v9 = Math.abs(v2);
        if(v9 < ((int)this.n)) {
            v2 = 0;
        }
        else if(v9 > v8) {
            v2 = v2 <= 0 ? -v8 : v8;
        }
        int v10 = Math.abs(v3);
        if(v10 < ((int)this.n)) {
            v3 = 0;
        }
        else if(v10 > v8) {
            v3 = v3 > 0 ? v8 : -v8;
        }
        int v11 = Math.abs(v6);
        int v12 = Math.abs(v7);
        int v13 = Math.abs(v2);
        int v14 = Math.abs(v3);
        int v15 = v13 + v14;
        int v16 = v11 + v12;
        if(v2 == 0) {
            f = (float)v11;
            f1 = (float)v16;
        }
        else {
            f = (float)v13;
            f1 = (float)v15;
        }
        if(v3 == 0) {
            f2 = (float)v12;
            f3 = (float)v16;
        }
        else {
            f2 = (float)v14;
            f3 = (float)v15;
        }
        int v17 = this.d(v6, v2, this.s.getViewHorizontalDragRange(view0));
        overScroller0.startScroll(v4, v5, v6, v7, ((int)(((float)this.d(v7, v3, this.s.getViewVerticalDragRange(view0))) * (f2 / f3) + ((float)v17) * (f / f1))));
        this.k(2);
        return true;
    }

    public final boolean f(int v) {
        if(!this.isPointerDown(v)) {
            Log.e("ViewDragHelper", "Ignoring pointerId=" + v + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
            return false;
        }
        return true;
    }

    @Nullable
    public View findTopChildUnder(int v, int v1) {
        ViewGroup viewGroup0 = this.v;
        for(int v2 = viewGroup0.getChildCount() - 1; v2 >= 0; --v2) {
            View view0 = viewGroup0.getChildAt(v2);
            if(v >= view0.getLeft() && v < view0.getRight() && v1 >= view0.getTop() && v1 < view0.getBottom()) {
                return view0;
            }
        }
        return null;
    }

    public void flingCapturedView(int v, int v1, int v2, int v3) {
        if(!this.u) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        int v4 = this.t.getLeft();
        int v5 = this.t.getTop();
        int v6 = (int)this.l.getXVelocity(this.c);
        int v7 = (int)this.l.getYVelocity(this.c);
        this.r.fling(v4, v5, v6, v7, v, v2, v1, v3);
        this.k(2);
    }

    public final void g() {
        float f = this.m;
        this.l.computeCurrentVelocity(1000, f);
        float f1 = this.l.getXVelocity(this.c);
        float f2 = Math.abs(f1);
        float f3 = 0.0f;
        if(Float.compare(f2, this.n) < 0) {
            f1 = 0.0f;
        }
        else if(f2 > f) {
            f1 = f1 > 0.0f ? f : -f;
        }
        float f4 = this.l.getYVelocity(this.c);
        float f5 = Math.abs(f4);
        if(f5 >= this.n) {
            if(f5 > f) {
                if(f4 <= 0.0f) {
                    f = -f;
                }
                f3 = f;
            }
            else {
                f3 = f4;
            }
        }
        this.u = true;
        this.s.onViewReleased(this.t, f1, f3);
        this.u = false;
        if(this.a == 1) {
            this.k(0);
        }
    }

    public int getActivePointerId() {
        return this.c;
    }

    @Nullable
    public View getCapturedView() {
        return this.t;
    }

    @Px
    public int getDefaultEdgeSize() {
        return this.p;
    }

    @Px
    public int getEdgeSize() {
        return this.o;
    }

    public float getMinVelocity() {
        return this.n;
    }

    @Px
    public int getTouchSlop() {
        return this.b;
    }

    public int getViewDragState() {
        return this.a;
    }

    public final void h(float f, float f1, int v) {
        boolean z = this.a(f, f1, v, 1);
        if(this.a(f1, f, v, 4)) {
            z |= 4;
        }
        if(this.a(f, f1, v, 2)) {
            z |= 2;
        }
        if(this.a(f1, f, v, 8)) {
            z |= 8;
        }
        if(z) {
            this.i[v] |= true;
            this.s.onEdgeDragStarted(1, v);
        }
    }

    public final void i(float f, float f1, int v) {
        float[] arr_f = this.d;
        int v1 = 0;
        if(arr_f == null || arr_f.length <= v) {
            float[] arr_f1 = new float[v + 1];
            float[] arr_f2 = new float[v + 1];
            float[] arr_f3 = new float[v + 1];
            float[] arr_f4 = new float[v + 1];
            int[] arr_v = new int[v + 1];
            int[] arr_v1 = new int[v + 1];
            int[] arr_v2 = new int[v + 1];
            if(arr_f != null) {
                System.arraycopy(arr_f, 0, arr_f1, 0, arr_f.length);
                System.arraycopy(this.e, 0, arr_f2, 0, this.e.length);
                System.arraycopy(this.f, 0, arr_f3, 0, this.f.length);
                System.arraycopy(this.g, 0, arr_f4, 0, this.g.length);
                System.arraycopy(this.h, 0, arr_v, 0, this.h.length);
                System.arraycopy(this.i, 0, arr_v1, 0, this.i.length);
                System.arraycopy(this.j, 0, arr_v2, 0, this.j.length);
            }
            this.d = arr_f1;
            this.e = arr_f2;
            this.f = arr_f3;
            this.g = arr_f4;
            this.h = arr_v;
            this.i = arr_v1;
            this.j = arr_v2;
        }
        float[] arr_f5 = this.d;
        this.f[v] = f;
        arr_f5[v] = f;
        float[] arr_f6 = this.e;
        this.g[v] = f1;
        arr_f6[v] = f1;
        int[] arr_v3 = this.h;
        ViewGroup viewGroup0 = this.v;
        if(((int)f) < viewGroup0.getLeft() + this.o) {
            v1 = 1;
        }
        if(((int)f1) < viewGroup0.getTop() + this.o) {
            v1 |= 4;
        }
        if(((int)f) > viewGroup0.getRight() - this.o) {
            v1 |= 2;
        }
        if(((int)f1) > viewGroup0.getBottom() - this.o) {
            v1 |= 8;
        }
        arr_v3[v] = v1;
        this.k |= 1 << v;
    }

    public boolean isCapturedViewUnder(int v, int v1) {
        return this.isViewUnder(this.t, v, v1);
    }

    public boolean isEdgeTouched(int v) {
        for(int v1 = 0; v1 < this.h.length; ++v1) {
            if(this.isEdgeTouched(v, v1)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEdgeTouched(int v, int v1) {
        return this.isPointerDown(v1) && (v & this.h[v1]) != 0;
    }

    public boolean isPointerDown(int v) {
        return (1 << v & this.k) != 0;
    }

    public boolean isViewUnder(@Nullable View view0, int v, int v1) {
        return view0 == null ? false : v >= view0.getLeft() && v < view0.getRight() && v1 >= view0.getTop() && v1 < view0.getBottom();
    }

    public final void j(MotionEvent motionEvent0) {
        int v = motionEvent0.getPointerCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = motionEvent0.getPointerId(v1);
            if(this.f(v2)) {
                float f = motionEvent0.getX(v1);
                float f1 = motionEvent0.getY(v1);
                this.f[v2] = f;
                this.g[v2] = f1;
            }
        }
    }

    public final void k(int v) {
        this.v.removeCallbacks(this.w);
        if(this.a != v) {
            this.a = v;
            this.s.onViewDragStateChanged(v);
            if(this.a == 0) {
                this.t = null;
            }
        }
    }

    public final boolean l(int v, View view0) {
        if(view0 == this.t && this.c == v) {
            return true;
        }
        if(view0 != null && this.s.tryCaptureView(view0, v)) {
            this.c = v;
            this.captureChildView(view0, v);
            return true;
        }
        return false;
    }

    public void processTouchEvent(@NonNull MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        int v1 = motionEvent0.getActionIndex();
        if(v == 0) {
            this.cancel();
        }
        if(this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent0);
        int v2 = 0;
        Callback viewDragHelper$Callback0 = this.s;
        switch(v) {
            case 0: {
                float f8 = motionEvent0.getX();
                float f9 = motionEvent0.getY();
                int v19 = motionEvent0.getPointerId(0);
                View view1 = this.findTopChildUnder(((int)f8), ((int)f9));
                this.i(f8, f9, v19);
                this.l(v19, view1);
                int v20 = this.h[v19] & this.q;
                if(v20 != 0) {
                    viewDragHelper$Callback0.onEdgeTouched(v20, v19);
                }
                break;
            }
            case 1: {
                if(this.a == 1) {
                    this.g();
                }
                this.cancel();
                return;
            }
            case 2: {
                if(this.a != 1) {
                    int v17 = motionEvent0.getPointerCount();
                    while(v2 < v17) {
                        int v18 = motionEvent0.getPointerId(v2);
                        if(this.f(v18)) {
                            float f4 = motionEvent0.getX(v2);
                            float f5 = motionEvent0.getY(v2);
                            float f6 = f4 - this.d[v18];
                            float f7 = f5 - this.e[v18];
                            this.h(f6, f7, v18);
                            if(this.a == 1) {
                                break;
                            }
                            View view0 = this.findTopChildUnder(((int)f4), ((int)f5));
                            if(!this.b(view0, f6, f7) || !this.l(v18, view0)) {
                                goto label_86;
                            }
                            break;
                        }
                    label_86:
                        ++v2;
                    }
                    this.j(motionEvent0);
                    return;
                }
                else if(this.f(this.c)) {
                    int v9 = motionEvent0.findPointerIndex(this.c);
                    float f2 = motionEvent0.getX(v9);
                    float f3 = motionEvent0.getY(v9);
                    int v10 = this.c;
                    int v11 = (int)(f2 - this.f[v10]);
                    int v12 = (int)(f3 - this.g[v10]);
                    int v13 = this.t.getLeft() + v11;
                    int v14 = this.t.getTop() + v12;
                    int v15 = this.t.getLeft();
                    int v16 = this.t.getTop();
                    if(v11 != 0) {
                        v13 = viewDragHelper$Callback0.clampViewPositionHorizontal(this.t, v13, v11);
                        ViewCompat.offsetLeftAndRight(this.t, v13 - v15);
                    }
                    if(v12 != 0) {
                        v14 = viewDragHelper$Callback0.clampViewPositionVertical(this.t, v14, v12);
                        ViewCompat.offsetTopAndBottom(this.t, v14 - v16);
                    }
                    if(v11 != 0 || v12 != 0) {
                        this.s.onViewPositionChanged(this.t, v13, v14, v13 - v15, v14 - v16);
                    }
                    this.j(motionEvent0);
                    return;
                }
                break;
            }
            case 3: {
                if(this.a == 1) {
                    this.u = true;
                    viewDragHelper$Callback0.onViewReleased(this.t, 0.0f, 0.0f);
                    this.u = false;
                    if(this.a == 1) {
                        this.k(0);
                    }
                }
                this.cancel();
                return;
            }
            case 5: {
                int v7 = motionEvent0.getPointerId(v1);
                float f = motionEvent0.getX(v1);
                float f1 = motionEvent0.getY(v1);
                this.i(f, f1, v7);
                if(this.a == 0) {
                    this.l(v7, this.findTopChildUnder(((int)f), ((int)f1)));
                    int v8 = this.h[v7] & this.q;
                    if(v8 != 0) {
                        viewDragHelper$Callback0.onEdgeTouched(v8, v7);
                        return;
                    }
                }
                else if(this.isCapturedViewUnder(((int)f), ((int)f1))) {
                    this.l(v7, this.t);
                    return;
                }
                break;
            }
            case 6: {
                int v3 = motionEvent0.getPointerId(v1);
                if(this.a == 1 && v3 == this.c) {
                    int v4 = motionEvent0.getPointerCount();
                    while(true) {
                        int v5 = -1;
                        if(v2 >= v4) {
                            break;
                        }
                        int v6 = motionEvent0.getPointerId(v2);
                        if(v6 != this.c && (this.findTopChildUnder(((int)motionEvent0.getX(v2)), ((int)motionEvent0.getY(v2))) == this.t && this.l(v6, this.t))) {
                            v5 = this.c;
                            break;
                        }
                        ++v2;
                    }
                    if(v5 == -1) {
                        this.g();
                    }
                }
                this.c(v3);
            }
        }
    }

    public void setEdgeSize(@IntRange(from = 0L) @Px int v) {
        this.o = v;
    }

    public void setEdgeTrackingEnabled(int v) {
        this.q = v;
    }

    public void setMinVelocity(float f) {
        this.n = f;
    }

    public boolean settleCapturedViewAt(int v, int v1) {
        if(!this.u) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        return this.e(v, v1, ((int)this.l.getXVelocity(this.c)), ((int)this.l.getYVelocity(this.c)));
    }

    public boolean shouldInterceptTouchEvent(@NonNull MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        int v1 = motionEvent0.getActionIndex();
        if(v == 0) {
            this.cancel();
        }
        if(this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent0);
        Callback viewDragHelper$Callback0 = this.s;
        switch(v) {
            case 0: {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                int v2 = motionEvent0.getPointerId(0);
                this.i(f, f1, v2);
                View view0 = this.findTopChildUnder(((int)f), ((int)f1));
                if(view0 == this.t && this.a == 2) {
                    this.l(v2, view0);
                }
                int v3 = this.h[v2] & this.q;
                if(v3 != 0) {
                    viewDragHelper$Callback0.onEdgeTouched(v3, v2);
                    return this.a == 1;
                }
                break;
            }
            case 2: {
                if(this.d != null && this.e != null) {
                    int v4 = motionEvent0.getPointerCount();
                    int v5 = 0;
                    while(v5 < v4) {
                        int v6 = motionEvent0.getPointerId(v5);
                        if(this.f(v6)) {
                            float f2 = motionEvent0.getX(v5);
                            float f3 = motionEvent0.getY(v5);
                            float f4 = f2 - this.d[v6];
                            float f5 = f3 - this.e[v6];
                            View view1 = this.findTopChildUnder(((int)f2), ((int)f3));
                            boolean z = view1 != null && this.b(view1, f4, f5);
                            if(z) {
                                int v7 = view1.getLeft();
                                int v8 = view1.getTop();
                                int v9 = viewDragHelper$Callback0.getViewHorizontalDragRange(view1);
                                int v10 = viewDragHelper$Callback0.getViewVerticalDragRange(view1);
                                if(v9 != 0 && (v9 <= 0 || viewDragHelper$Callback0.clampViewPositionHorizontal(view1, v7 + ((int)f4), ((int)f4)) != v7) || v10 != 0 && (v10 <= 0 || viewDragHelper$Callback0.clampViewPositionVertical(view1, v8 + ((int)f5), ((int)f5)) != v8)) {
                                    goto label_43;
                                }
                                break;
                            }
                        label_43:
                            this.h(f4, f5, v6);
                            if(this.a != 1 && (!z || !this.l(v6, view1))) {
                                goto label_45;
                            }
                            break;
                        }
                    label_45:
                        ++v5;
                    }
                    this.j(motionEvent0);
                    return this.a == 1;
                }
                break;
            }
            case 1: 
            case 3: {
                this.cancel();
                return this.a == 1;
            }
            case 5: {
                int v11 = motionEvent0.getPointerId(v1);
                float f6 = motionEvent0.getX(v1);
                float f7 = motionEvent0.getY(v1);
                this.i(f6, f7, v11);
                int v12 = this.a;
                if(v12 == 0) {
                    int v13 = this.h[v11] & this.q;
                    if(v13 != 0) {
                        viewDragHelper$Callback0.onEdgeTouched(v13, v11);
                        return this.a == 1;
                    }
                }
                else if(v12 == 2) {
                    View view2 = this.findTopChildUnder(((int)f6), ((int)f7));
                    if(view2 == this.t) {
                        this.l(v11, view2);
                        return this.a == 1;
                    }
                }
                break;
            }
            case 6: {
                this.c(motionEvent0.getPointerId(v1));
                return this.a == 1;
            }
            default: {
                return this.a == 1;
            }
        }
        return this.a == 1;
    }

    public boolean smoothSlideViewTo(@NonNull View view0, int v, int v1) {
        this.t = view0;
        this.c = -1;
        boolean z = this.e(v, v1, 0, 0);
        if(!z && this.a == 0 && this.t != null) {
            this.t = null;
        }
        return z;
    }
}

