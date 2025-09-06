package androidx.compose.animation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

public final class s implements OverlayClip {
    public final Shape a;
    public final Path b;

    public s(Shape shape0) {
        this.a = shape0;
        this.b = AndroidPath_androidKt.Path();
    }

    @Override  // androidx.compose.animation.SharedTransitionScope$OverlayClip
    public final Path getClipPath(SharedContentState sharedTransitionScope$SharedContentState0, Rect rect0, LayoutDirection layoutDirection0, Density density0) {
        this.b.reset();
        long v = rect0.getSize-NH-jbRc();
        Outline outline0 = this.a.createOutline-Pq9zytI(v, layoutDirection0, density0);
        OutlineKt.addOutline(this.b, outline0);
        this.b.translate-k-4lQ0M(rect0.getTopLeft-F1C5BW0());
        return this.b;
    }
}

