package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final Function1 w;
    public final Function0 x;
    public final AnimationSpec y;
    public final Function1 z;

    public b(AnimationSpec animationSpec0, Function1 function10, Function1 function11, Function0 function00) {
        this.w = function10;
        this.x = function00;
        this.y = animationSpec0;
        this.z = function11;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return new AnchoredDraggableState(object0, this.w, this.x, this.y, this.z);
    }
}

