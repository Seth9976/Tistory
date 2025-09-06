package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class c0 extends Lambda implements Function0 {
    public final KMutableProperty2Impl w;

    public c0(KMutableProperty2Impl kMutableProperty2Impl0) {
        this.w = kMutableProperty2Impl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Setter(this.w);
    }
}

