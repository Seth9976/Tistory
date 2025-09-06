package p0;

import androidx.compose.material.SnackbarData;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class v8 extends Lambda implements Function1 {
    public final SnackbarData w;

    public v8(SnackbarData snackbarData0) {
        this.w = snackbarData0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        SemanticsPropertiesKt.setLiveRegion-hR3wRGc(((SemanticsPropertyReceiver)object0), 0);
        SemanticsPropertiesKt.dismiss$default(((SemanticsPropertyReceiver)object0), null, new u8(this.w, 0), 1, null);
        return Unit.INSTANCE;
    }
}

