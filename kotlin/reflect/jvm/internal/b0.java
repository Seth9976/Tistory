package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function0 {
    public final KMutableProperty1Impl w;

    public b0(KMutableProperty1Impl kMutableProperty1Impl0) {
        this.w = kMutableProperty1Impl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Setter(this.w);
    }
}

