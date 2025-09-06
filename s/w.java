package s;

import androidx.compose.animation.BoundsAnimation;
import androidx.compose.animation.core.Transition.Segment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function1 {
    public final BoundsAnimation w;

    public w(BoundsAnimation boundsAnimation0) {
        this.w = boundsAnimation0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Segment transition$Segment0 = (Segment)object0;
        return this.w.getAnimationSpec();
    }
}

