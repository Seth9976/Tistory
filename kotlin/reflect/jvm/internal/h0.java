package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class h0 extends Lambda implements Function0 {
    public final KProperty2Impl w;

    public h0(KProperty2Impl kProperty2Impl0) {
        this.w = kProperty2Impl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Getter(this.w);
    }
}

