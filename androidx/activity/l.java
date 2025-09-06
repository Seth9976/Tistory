package androidx.activity;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function0 {
    public final ComponentActivity w;

    public l(ComponentActivity componentActivity0) {
        this.w = componentActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new FullyDrawnReporter(this.w.reportFullyDrawnExecutor, new k(this.w, 1));
    }
}

