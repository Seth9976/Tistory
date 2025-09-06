package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.MotionWidget;

public final class d extends KeyCycleOscillator {
    public int g;

    @Override  // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
    public final void setProperty(MotionWidget motionWidget0, float f) {
        motionWidget0.setValue(this.g, this.get(f));
    }
}

