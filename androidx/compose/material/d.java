package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public final AnimationSpec w;
    public final Function1 x;
    public final SnackbarHostState y;

    public d(AnimationSpec animationSpec0, Function1 function10, SnackbarHostState snackbarHostState0) {
        this.w = animationSpec0;
        this.x = function10;
        this.y = snackbarHostState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return new BackdropScaffoldState(((BackdropValue)object0), this.w, this.x, this.y);
    }
}

