package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class sl extends Lambda implements Function0 {
    public final int w;
    public final SnackbarData x;

    public sl(SnackbarData snackbarData0, int v) {
        this.w = v;
        this.x = snackbarData0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                this.x.dismiss();
                return true;
            }
            case 1: {
                this.x.performAction();
                return Unit.INSTANCE;
            }
            default: {
                this.x.dismiss();
                return Unit.INSTANCE;
            }
        }
    }
}

