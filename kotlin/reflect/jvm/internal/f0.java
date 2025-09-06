package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class f0 extends Lambda implements Function0 {
    public final KProperty0Impl w;

    public f0(KProperty0Impl kProperty0Impl0) {
        this.w = kProperty0Impl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Getter(this.w);
    }
}

