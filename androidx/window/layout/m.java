package androidx.window.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class m extends FunctionReferenceImpl implements Function1 {
    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((WindowMetricsCalculator)object0), "p0");
        return ((WindowMetricsCalculatorDecorator)this.receiver).decorate(((WindowMetricsCalculator)object0));
    }
}

