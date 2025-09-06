package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.core.motion.utils.SpringStopEngine;
import androidx.constraintlayout.core.motion.utils.StopEngine;
import androidx.constraintlayout.core.motion.utils.StopLogicEngine;
import androidx.constraintlayout.motion.widget.MotionInterpolator;

public class StopLogic extends MotionInterpolator {
    public final StopLogicEngine a;
    public SpringStopEngine b;
    public StopEngine c;

    public StopLogic() {
        StopLogicEngine stopLogicEngine0 = new StopLogicEngine();
        this.a = stopLogicEngine0;
        this.c = stopLogicEngine0;
    }

    public void config(float f, float f1, float f2, float f3, float f4, float f5) {
        this.c = this.a;
        this.a.config(f, f1, f2, f3, f4, f5);
    }

    public String debug(String s, float f) {
        return this.c.debug(s, f);
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionInterpolator
    public float getInterpolation(float f) {
        return this.c.getInterpolation(f);
    }

    @Override  // androidx.constraintlayout.motion.widget.MotionInterpolator
    public float getVelocity() {
        return this.c.getVelocity();
    }

    public float getVelocity(float f) {
        return this.c.getVelocity(f);
    }

    public boolean isStopped() {
        return this.c.isStopped();
    }

    public void springConfig(float f, float f1, float f2, float f3, float f4, float f5, float f6, int v) {
        if(this.b == null) {
            this.b = new SpringStopEngine();
        }
        this.c = this.b;
        this.b.springConfig(f, f1, f2, f3, f4, f5, f6, v);
    }
}

