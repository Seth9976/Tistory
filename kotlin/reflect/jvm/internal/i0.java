package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class i0 extends Lambda implements Function0 {
    public final Getter w;

    public i0(Getter kPropertyImpl$Getter0) {
        this.w = kPropertyImpl$Getter0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return KPropertyImplKt.access$computeCallerForAccessor(this.w, true);
    }
}

