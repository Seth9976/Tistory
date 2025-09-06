package y2;

import android.view.View;
import androidx.constraintlayout.motion.utils.CustomSupport;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.widget.ConstraintAttribute;

public final class c extends ViewOscillator {
    public final float[] g;
    public ConstraintAttribute h;

    public c() {
        this.g = new float[1];
    }

    @Override  // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
    public final void setCustom(Object object0) {
        this.h = (ConstraintAttribute)object0;
    }

    @Override  // androidx.constraintlayout.motion.utils.ViewOscillator
    public final void setProperty(View view0, float f) {
        this.g[0] = this.get(f);
        CustomSupport.setInterpolatedValue(this.h, view0, this.g);
    }
}

