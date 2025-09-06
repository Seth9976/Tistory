package p0;

import androidx.compose.material.SnackbarData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class u8 extends Lambda implements Function0 {
    public final int w;
    public final SnackbarData x;

    public u8(SnackbarData snackbarData0, int v) {
        this.w = v;
        this.x = snackbarData0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            this.x.performAction();
            return Unit.INSTANCE;
        }
        this.x.dismiss();
        return true;
    }
}

