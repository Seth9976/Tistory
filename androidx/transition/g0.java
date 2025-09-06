package androidx.transition;

import android.graphics.Path;

public final class g0 extends PathMotion {
    @Override  // androidx.transition.PathMotion
    public final Path getPath(float f, float f1, float f2, float f3) {
        Path path0 = new Path();
        path0.moveTo(f, f1);
        path0.lineTo(f2, f3);
        return path0;
    }
}

