package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class k0 extends Lambda implements Function0 {
    public final Setter w;

    public k0(Setter kPropertyImpl$Setter0) {
        this.w = kPropertyImpl$Setter0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return KPropertyImplKt.access$computeCallerForAccessor(this.w, false);
    }
}

