package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function1 {
    public final Density w;
    public final AnimationSpec x;
    public final Function1 y;
    public final boolean z;

    public v(AnimationSpec animationSpec0, Function1 function10, boolean z, Density density0) {
        this.w = density0;
        this.x = animationSpec0;
        this.y = function10;
        this.z = z;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ModalBottomSheetKt.ModalBottomSheetState(((ModalBottomSheetValue)object0), this.w, this.x, this.y, this.z);
    }
}

