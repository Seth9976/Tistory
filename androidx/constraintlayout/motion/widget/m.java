package androidx.constraintlayout.motion.widget;

import android.view.MotionEvent;
import android.view.VelocityTracker;

public final class m implements MotionTracker {
    public VelocityTracker a;
    public static final m b;

    static {
        m.b = new m();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker
    public final void addMovement(MotionEvent motionEvent0) {
        VelocityTracker velocityTracker0 = this.a;
        if(velocityTracker0 != null) {
            velocityTracker0.addMovement(motionEvent0);
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker
    public final void clear() {
        VelocityTracker velocityTracker0 = this.a;
        if(velocityTracker0 != null) {
            velocityTracker0.clear();
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker
    public final void computeCurrentVelocity(int v) {
        VelocityTracker velocityTracker0 = this.a;
        if(velocityTracker0 != null) {
            velocityTracker0.computeCurrentVelocity(v);
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker
    public final void computeCurrentVelocity(int v, float f) {
        VelocityTracker velocityTracker0 = this.a;
        if(velocityTracker0 != null) {
            velocityTracker0.computeCurrentVelocity(v, f);
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker
    public final float getXVelocity() {
        return this.a == null ? 0.0f : this.a.getXVelocity();
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker
    public final float getXVelocity(int v) {
        return this.a == null ? 0.0f : this.a.getXVelocity(v);
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker
    public final float getYVelocity() {
        return this.a == null ? 0.0f : this.a.getYVelocity();
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker
    public final float getYVelocity(int v) {
        return this.a == null ? 0.0f : this.getYVelocity(v);
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker
    public final void recycle() {
        VelocityTracker velocityTracker0 = this.a;
        if(velocityTracker0 != null) {
            velocityTracker0.recycle();
            this.a = null;
        }
    }
}

