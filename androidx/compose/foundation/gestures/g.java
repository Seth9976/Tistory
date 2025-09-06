package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function1 {
    public final Function1 A;
    public final Function1 w;
    public final Function0 x;
    public final AnimationSpec y;
    public final DecayAnimationSpec z;

    public g(AnimationSpec animationSpec0, DecayAnimationSpec decayAnimationSpec0, Function1 function10, Function0 function00, Function1 function11) {
        this.w = function10;
        this.x = function00;
        this.y = animationSpec0;
        this.z = decayAnimationSpec0;
        this.A = function11;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return new AnchoredDraggableState(object0, this.w, this.x, this.y, this.z, this.A);
    }
}

