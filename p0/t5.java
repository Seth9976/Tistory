package p0;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class t5 extends Lambda implements Function0 {
    public final boolean A;
    public final ModalBottomSheetValue w;
    public final Density x;
    public final AnimationSpec y;
    public final Function1 z;

    public t5(ModalBottomSheetValue modalBottomSheetValue0, Density density0, AnimationSpec animationSpec0, Function1 function10, boolean z) {
        this.w = modalBottomSheetValue0;
        this.x = density0;
        this.y = animationSpec0;
        this.z = function10;
        this.A = z;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ModalBottomSheetKt.ModalBottomSheetState(this.w, this.x, this.y, this.z, this.A);
    }
}

