package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function1 {
    public final Density w;
    public final AnimationSpec x;
    public final Function1 y;

    public k(AnimationSpec animationSpec0, Function1 function10, Density density0) {
        this.w = density0;
        this.x = animationSpec0;
        this.y = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return BottomSheetScaffoldKt.BottomSheetState(((BottomSheetValue)object0), this.w, this.x, this.y);
    }
}

