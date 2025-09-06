package androidx.core.view;

import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

public final class k1 extends l1 {
    public final WindowInsetsAnimation f;

    public k1(WindowInsetsAnimation windowInsetsAnimation0) {
        super(0, null, 0L);
        this.f = windowInsetsAnimation0;
    }

    @Override  // androidx.core.view.l1
    public final long a() {
        return this.f.getDurationMillis();
    }

    @Override  // androidx.core.view.l1
    public final float b() {
        return this.f.getFraction();
    }

    @Override  // androidx.core.view.l1
    public final float c() {
        return this.f.getInterpolatedFraction();
    }

    @Override  // androidx.core.view.l1
    public final Interpolator d() {
        return this.f.getInterpolator();
    }

    @Override  // androidx.core.view.l1
    public final int e() {
        return this.f.getTypeMask();
    }

    @Override  // androidx.core.view.l1
    public final void f(float f) {
        this.f.setFraction(f);
    }
}

