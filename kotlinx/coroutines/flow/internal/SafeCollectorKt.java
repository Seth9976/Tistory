package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SafeCollectorKt {
    public static final Function3 a;

    static {
        Intrinsics.checkNotNull(z.a, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        SafeCollectorKt.a = (Function3)TypeIntrinsics.beforeCheckcastToFunctionOfArity(z.a, 3);
    }

    public static final Function3 access$getEmitFun$p() {
        return SafeCollectorKt.a;
    }
}

