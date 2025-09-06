package n6;

import androidx.compose.material.ModalBottomSheetState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function0 {
    public final int w;
    public final ModalBottomSheetState x;

    public f(ModalBottomSheetState modalBottomSheetState0, int v) {
        this.w = v;
        this.x = modalBottomSheetState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.w != 0 ? ModalBottomSheetState.access$requireDensity(this.x).toPx-0680j_4(125.0f) : Boolean.valueOf(this.x.isVisible());
    }
}

