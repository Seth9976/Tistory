package md;

import kotlin.DeepRecursiveFunction;
import kotlin.DeepRecursiveScope;
import kotlin.DeepRecursiveScopeImpl.crossFunctionCompletion..inlined.Continuation.1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

public final class a extends DeepRecursiveScope implements Continuation {
    public Function3 a;
    public Object b;
    public Continuation c;
    public Object d;

    @Override  // kotlin.DeepRecursiveScope
    public final Object callRecursive(Object object0, Continuation continuation0) {
        Intrinsics.checkNotNull(continuation0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.c = continuation0;
        this.b = object0;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        if(object1 == qd.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object1;
    }

    @Override  // kotlin.DeepRecursiveScope
    public final Object callRecursive(DeepRecursiveFunction deepRecursiveFunction0, Object object0, Continuation continuation0) {
        Function3 function30 = deepRecursiveFunction0.getBlock$kotlin_stdlib();
        Intrinsics.checkNotNull(function30, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<kotlin.DeepRecursiveScope<*, *>, kotlin.Any?, kotlin.Any?>{ kotlin.DeepRecursiveKt.DeepRecursiveFunctionBlock }");
        Function3 function31 = this.a;
        if(function30 == function31) {
            Intrinsics.checkNotNull(continuation0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.c = continuation0;
        }
        else {
            this.a = function30;
            Intrinsics.checkNotNull(continuation0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.c = new DeepRecursiveScopeImpl.crossFunctionCompletion..inlined.Continuation.1(EmptyCoroutineContext.INSTANCE, this, function31, continuation0);
        }
        this.b = object0;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        if(object1 == qd.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object1;
    }

    @Override  // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override  // kotlin.coroutines.Continuation
    public final void resumeWith(Object object0) {
        this.c = null;
        this.d = object0;
    }
}

