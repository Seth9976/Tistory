package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function1 {
    public final AnimationSpec w;
    public final Function1 x;

    public m(AnimationSpec animationSpec0, Function1 function10) {
        this.w = animationSpec0;
        this.x = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return new BottomSheetState(((BottomSheetValue)object0), this.w, this.x);
    }
}

