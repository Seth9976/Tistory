package b;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function1 {
    public static final x a;

    static {
        x.a = new x();
    }

    public x() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((s)object0), "it");
        return Unit.INSTANCE;
    }
}

