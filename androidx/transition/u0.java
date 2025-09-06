package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import androidx.core.view.v1;

public final class u0 extends t0 {
    @Override  // androidx.transition.t0
    public final void a(int v, View view0) {
        v1.m(v, view0);
    }

    @Override  // androidx.transition.s0
    public final float b(View view0) {
        return view0.getTransitionAlpha();
    }

    @Override  // androidx.transition.s0
    public final void c(View view0, float f) {
        view0.setTransitionAlpha(f);
    }

    @Override  // androidx.transition.t0
    public final void d(View view0, Matrix matrix0) {
        view0.setAnimationMatrix(matrix0);
    }

    @Override  // androidx.transition.t0
    public final void e(View view0, int v, int v1, int v2, int v3) {
        view0.setLeftTopRightBottom(v, v1, v2, v3);
    }

    @Override  // androidx.transition.t0
    public final void f(View view0, Matrix matrix0) {
        view0.transformMatrixToGlobal(matrix0);
    }

    @Override  // androidx.transition.t0
    public final void g(View view0, Matrix matrix0) {
        view0.transformMatrixToLocal(matrix0);
    }
}

