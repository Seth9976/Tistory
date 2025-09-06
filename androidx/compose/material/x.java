package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function1 {
    public final AnimationSpec w;
    public final Function1 x;
    public final boolean y;

    public x(AnimationSpec animationSpec0, Function1 function10, boolean z) {
        this.w = animationSpec0;
        this.x = function10;
        this.y = z;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ModalBottomSheetKt.ModalBottomSheetState(((ModalBottomSheetValue)object0), this.w, this.x, this.y);
    }
}

