package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function0 {
    public final Data w;

    public f(Data kClassImpl$Data0) {
        this.w = kClassImpl$Data0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return UtilKt.computeAnnotations(this.w.getDescriptor());
    }
}

