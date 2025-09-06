package s;

import androidx.compose.animation.BoundsTransform;
import androidx.compose.animation.SharedTransitionScopeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.geometry.Rect;

public final class k1 implements BoundsTransform {
    @Override  // androidx.compose.animation.BoundsTransform
    public final FiniteAnimationSpec transform(Rect rect0, Rect rect1) {
        return SharedTransitionScopeKt.b;
    }
}

