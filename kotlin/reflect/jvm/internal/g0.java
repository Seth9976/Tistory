package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class g0 extends Lambda implements Function0 {
    public final KProperty1Impl w;

    public g0(KProperty1Impl kProperty1Impl0) {
        this.w = kProperty1Impl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Getter(this.w);
    }
}

