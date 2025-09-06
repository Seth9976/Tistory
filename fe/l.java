package fe;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KParameterImpl;
import kotlin.reflect.jvm.internal.UtilKt;

public final class l extends Lambda implements Function0 {
    public final KParameterImpl w;

    public l(KParameterImpl kParameterImpl0) {
        this.w = kParameterImpl0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return UtilKt.computeAnnotations(KParameterImpl.access$getDescriptor(this.w));
    }
}

