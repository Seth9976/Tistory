package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper.Callback;

public final class a extends Callback {
    public int a;
    public int b;
    public final SwipeDismissBehavior c;

    public a(SwipeDismissBehavior swipeDismissBehavior0) {
        this.c = swipeDismissBehavior0;
        super();
        this.b = -1;
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final int clampViewPositionHorizontal(View view0, int v, int v1) {
        int v3;
        boolean z = ViewCompat.getLayoutDirection(view0) == 1;
        int v2 = this.c.u;
        if(v2 == 0) {
            if(z) {
                return Math.min(Math.max(this.a - view0.getWidth(), v), this.a);
            }
            v3 = this.a;
            return Math.min(Math.max(v3, v), view0.getWidth() + v3);
        }
        if(v2 == 1) {
            if(z) {
                v3 = this.a;
                return Math.min(Math.max(v3, v), view0.getWidth() + v3);
            }
            return Math.min(Math.max(this.a - view0.getWidth(), v), this.a);
        }
        v3 = this.a - view0.getWidth();
        int v4 = this.a;
        return Math.min(Math.max(v3, v), view0.getWidth() + v4);
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final int clampViewPositionVertical(View view0, int v, int v1) {
        return view0.getTop();
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final int getViewHorizontalDragRange(View view0) {
        return view0.getWidth();
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final void onViewCaptured(View view0, int v) {
        this.b = v;
        this.a = view0.getLeft();
        ViewParent viewParent0 = view0.getParent();
        if(viewParent0 != null) {
            this.c.r = true;
            viewParent0.requestDisallowInterceptTouchEvent(true);
            this.c.r = false;
        }
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final void onViewDragStateChanged(int v) {
        OnDismissListener swipeDismissBehavior$OnDismissListener0 = this.c.p;
        if(swipeDismissBehavior$OnDismissListener0 != null) {
            swipeDismissBehavior$OnDismissListener0.onDragStateChanged(v);
        }
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final void onViewPositionChanged(View view0, int v, int v1, int v2, int v3) {
        float f = ((float)view0.getWidth()) * this.c.w;
        float f1 = ((float)view0.getWidth()) * this.c.x;
        float f2 = (float)Math.abs(v - this.a);
        if(Float.compare(f2, f) <= 0) {
            view0.setAlpha(1.0f);
            return;
        }
        if(Float.compare(f2, f1) >= 0) {
            view0.setAlpha(0.0f);
            return;
        }
        view0.setAlpha(Math.min(Math.max(0.0f, 1.0f - (f2 - f) / (f1 - f)), 1.0f));
    }

    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final void onViewReleased(View view0, float f, float f1) {
        int v2;
        this.b = -1;
        int v = view0.getWidth();
        int v1 = Float.compare(f, 0.0f);
        boolean z = true;
        SwipeDismissBehavior swipeDismissBehavior0 = this.c;
        if(v1 != 0) {
            boolean z1 = ViewCompat.getLayoutDirection(view0) == 1;
            switch(swipeDismissBehavior0.u) {
                case 0: {
                    if(!z1) {
                        if(v1 <= 0) {
                            v2 = this.a;
                            z = false;
                        }
                        else {
                            goto label_30;
                        }
                    }
                    else if(f >= 0.0f) {
                        v2 = this.a;
                        z = false;
                    }
                    else {
                        goto label_30;
                    }
                    break;
                }
                case 1: {
                    if(!z1) {
                        if(f >= 0.0f) {
                            v2 = this.a;
                            z = false;
                        }
                        else {
                            goto label_30;
                        }
                    }
                    else if(v1 <= 0) {
                        v2 = this.a;
                        z = false;
                    }
                    else {
                        goto label_30;
                    }
                    break;
                }
                case 2: {
                    goto label_30;
                }
                default: {
                    v2 = this.a;
                    z = false;
                }
            }
        }
        else if(Math.abs(view0.getLeft() - this.a) >= Math.round(((float)view0.getWidth()) * swipeDismissBehavior0.v)) {
        label_30:
            if(f >= 0.0f) {
                int v3 = view0.getLeft();
                int v4 = this.a;
                v2 = v3 >= v4 ? v4 + v : this.a - v;
            }
            else {
                v2 = this.a - v;
            }
        }
        else {
            v2 = this.a;
            z = false;
        }
        if(swipeDismissBehavior0.o.settleCapturedViewAt(v2, view0.getTop())) {
            ViewCompat.postOnAnimation(view0, new c(swipeDismissBehavior0, view0, z));
            return;
        }
        if(z) {
            OnDismissListener swipeDismissBehavior$OnDismissListener0 = swipeDismissBehavior0.p;
            if(swipeDismissBehavior$OnDismissListener0 != null) {
                swipeDismissBehavior$OnDismissListener0.onDismiss(view0);
            }
        }
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.customview.widget.ViewDragHelper$Callback
    public final boolean tryCaptureView(View view0, int v) {
        return (this.b == -1 || this.b == v) && this.c.canSwipeDismissView(view0);
    }
}

