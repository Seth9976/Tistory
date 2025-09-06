package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function0 {
    public final KMutableProperty0Impl w;

    public a0(KMutableProperty0Impl kMutableProperty0Impl0) {
        this.w = kMutableProperty0Impl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Setter(this.w);
    }
}

