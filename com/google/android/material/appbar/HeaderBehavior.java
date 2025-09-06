package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;

abstract class HeaderBehavior extends ViewOffsetBehavior {
    public i r;
    public OverScroller s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public VelocityTracker x;

    public HeaderBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.u = -1;
        this.w = -1;
    }

    public boolean b(View view0) {
        return false;
    }

    public int c(View view0) {
        return -view0.getHeight();
    }

    public int d(View view0) {
        return view0.getHeight();
    }

    public void e(CoordinatorLayout coordinatorLayout0, View view0) {
    }

    public int f(CoordinatorLayout coordinatorLayout0, View view0, int v, int v1, int v2) {
        int v3 = this.getTopAndBottomOffset();
        if(v1 != 0 && v3 >= v1 && v3 <= v2) {
            int v4 = MathUtils.clamp(v, v1, v2);
            if(v3 != v4) {
                this.setTopAndBottomOffset(v4);
                return v3 - v4;
            }
        }
        return 0;
    }

    public final void g(CoordinatorLayout coordinatorLayout0, View view0, int v) {
        this.f(coordinatorLayout0, view0, v, 0x80000000, 0x7FFFFFFF);
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
        if(this.w < 0) {
            this.w = ViewConfiguration.get(coordinatorLayout0.getContext()).getScaledTouchSlop();
        }
        if(motionEvent0.getActionMasked() == 2 && this.t) {
            int v = this.u;
            if(v == -1) {
                return false;
            }
            int v1 = motionEvent0.findPointerIndex(v);
            if(v1 == -1) {
                return false;
            }
            int v2 = (int)motionEvent0.getY(v1);
            if(Math.abs(v2 - this.v) > this.w) {
                this.v = v2;
                return true;
            }
        }
        if(motionEvent0.getActionMasked() == 0) {
            this.u = -1;
            int v3 = (int)motionEvent0.getX();
            int v4 = (int)motionEvent0.getY();
            boolean z = this.b(view0) && coordinatorLayout0.isPointInChildBounds(view0, v3, v4);
            this.t = z;
            if(z) {
                this.v = v4;
                this.u = motionEvent0.getPointerId(0);
                if(this.x == null) {
                    this.x = VelocityTracker.obtain();
                }
                if(this.s != null && !this.s.isFinished()) {
                    this.s.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker0 = this.x;
        if(velocityTracker0 != null) {
            velocityTracker0.addMovement(motionEvent0);
        }
        return false;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
        boolean z;
        switch(motionEvent0.getActionMasked()) {
            case 1: {
                VelocityTracker velocityTracker0 = this.x;
                if(velocityTracker0 == null) {
                    z = false;
                }
                else {
                    velocityTracker0.addMovement(motionEvent0);
                    this.x.computeCurrentVelocity(1000);
                    float f = this.x.getYVelocity(this.u);
                    int v = this.d(view0);
                    i i0 = this.r;
                    if(i0 != null) {
                        view0.removeCallbacks(i0);
                        this.r = null;
                    }
                    if(this.s == null) {
                        this.s = new OverScroller(view0.getContext());
                    }
                    this.s.fling(0, this.getTopAndBottomOffset(), 0, Math.round(f), 0, 0, -v, 0);
                    if(this.s.computeScrollOffset()) {
                        i i1 = new i(this, coordinatorLayout0, view0);
                        this.r = i1;
                        ViewCompat.postOnAnimation(view0, i1);
                    }
                    else {
                        this.e(coordinatorLayout0, view0);
                    }
                    z = true;
                }
                goto label_37;
            }
            case 2: {
                int v1 = motionEvent0.findPointerIndex(this.u);
                if(v1 == -1) {
                    return false;
                }
                int v2 = (int)motionEvent0.getY(v1);
                int v3 = this.v - v2;
                this.v = v2;
                int v4 = this.c(view0);
                this.f(coordinatorLayout0, view0, this.a() - v3, v4, 0);
                z = false;
                break;
            }
            case 3: {
                z = false;
            label_37:
                this.t = false;
                this.u = -1;
                VelocityTracker velocityTracker1 = this.x;
                if(velocityTracker1 != null) {
                    velocityTracker1.recycle();
                    this.x = null;
                }
                break;
            }
            case 6: {
                int v5 = motionEvent0.getActionIndex() == 0 ? 1 : 0;
                this.u = motionEvent0.getPointerId(v5);
                this.v = (int)(motionEvent0.getY(v5) + 0.5f);
                z = false;
                break;
            }
            default: {
                z = false;
            }
        }
        VelocityTracker velocityTracker2 = this.x;
        if(velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent0);
        }
        return this.t || z;
    }
}

