package s;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function1 {
    public final AnimatedContentTransitionScopeImpl w;
    public final Placeable x;
    public final long y;

    public j(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl0, Placeable placeable0, long v) {
        this.w = animatedContentTransitionScopeImpl0;
        this.x = placeable0;
        this.y = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v = this.w.getContentAlignment().align-KFBX0sM(IntSizeKt.IntSize(this.x.getWidth(), this.x.getHeight()), this.y, LayoutDirection.Ltr);
        PlacementScope.place-70tqf50$default(((PlacementScope)object0), this.x, v, 0.0f, 2, null);
        return Unit.INSTANCE;
    }
}

