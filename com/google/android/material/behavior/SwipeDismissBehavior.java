package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.customview.widget.ViewDragHelper;

public class SwipeDismissBehavior extends Behavior {
    public interface OnDismissListener {
        void onDismiss(View arg1);

        void onDragStateChanged(int arg1);
    }

    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END;
    public ViewDragHelper o;
    public OnDismissListener p;
    public boolean q;
    public boolean r;
    public float s;
    public boolean t;
    public int u;
    public float v;
    public float w;
    public float x;
    public final a y;

    public SwipeDismissBehavior() {
        this.s = 0.0f;
        this.u = 2;
        this.v = 0.5f;
        this.w = 0.0f;
        this.x = 0.5f;
        this.y = new a(this);
    }

    public boolean canSwipeDismissView(@NonNull View view0) {
        return true;
    }

    public int getDragState() {
        return this.o == null ? 0 : this.o.getViewDragState();
    }

    @Nullable
    @VisibleForTesting
    public OnDismissListener getListener() {
        return this.p;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull MotionEvent motionEvent0) {
        boolean z = this.q;
        int v = motionEvent0.getActionMasked();
        switch(v) {
            case 0: {
                z = coordinatorLayout0.isPointInChildBounds(view0, ((int)motionEvent0.getX()), ((int)motionEvent0.getY()));
                this.q = z;
                break;
            }
            case 1: {
                this.q = false;
                break;
            }
            default: {
                if(v == 3) {
                    this.q = false;
                }
            }
        }
        if(z) {
            if(this.o == null) {
                this.o = this.t ? ViewDragHelper.create(coordinatorLayout0, this.s, this.y) : ViewDragHelper.create(coordinatorLayout0, this.y);
            }
            return !this.r && this.o.shouldInterceptTouchEvent(motionEvent0);
        }
        return false;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
        boolean z = super.onLayoutChild(coordinatorLayout0, view0, v);
        if(ViewCompat.getImportantForAccessibility(view0) == 0) {
            ViewCompat.setImportantForAccessibility(view0, 1);
            ViewCompat.removeAccessibilityAction(view0, 0x100000);
            if(this.canSwipeDismissView(view0)) {
                b b0 = new b(this);
                ViewCompat.replaceAccessibilityAction(view0, AccessibilityActionCompat.ACTION_DISMISS, null, b0);
            }
        }
        return z;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
        if(this.o != null) {
            if(!this.r || motionEvent0.getActionMasked() != 3) {
                this.o.processTouchEvent(motionEvent0);
            }
            return true;
        }
        return false;
    }

    public void setDragDismissDistance(float f) {
        this.v = Math.min(Math.max(0.0f, f), 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f) {
        this.x = Math.min(Math.max(0.0f, f), 1.0f);
    }

    public void setListener(@Nullable OnDismissListener swipeDismissBehavior$OnDismissListener0) {
        this.p = swipeDismissBehavior$OnDismissListener0;
    }

    public void setSensitivity(float f) {
        this.s = f;
        this.t = true;
    }

    public void setStartAlphaSwipeDistance(float f) {
        this.w = Math.min(Math.max(0.0f, f), 1.0f);
    }

    public void setSwipeDirection(int v) {
        this.u = v;
    }
}

