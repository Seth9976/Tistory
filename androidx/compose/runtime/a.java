package androidx.compose.runtime;

import android.view.Choreographer;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import s.h1;
import y0.i;
import y0.j;

public final class a implements MonotonicFrameClock {
    public static final a a;
    public static final Choreographer b;

    static {
        a.a = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        a.b = (Choreographer)BuildersKt.runBlocking(Dispatchers.getMain().getImmediate(), new i(2, null));  // 初始化器: Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    public final Object fold(Object object0, Function2 function20) {
        return DefaultImpls.fold(this, object0, function20);
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    public final Element get(Key coroutineContext$Key0) {
        return DefaultImpls.get(this, coroutineContext$Key0);
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    public final CoroutineContext minusKey(Key coroutineContext$Key0) {
        return DefaultImpls.minusKey(this, coroutineContext$Key0);
    }

    @Override  // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext0) {
        return DefaultImpls.plus(this, coroutineContext0);
    }

    @Override  // androidx.compose.runtime.MonotonicFrameClock
    public final Object withFrameNanos(Function1 function10, Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        j j0 = new j(function10, cancellableContinuationImpl0);
        a.b.postFrameCallback(j0);
        cancellableContinuationImpl0.invokeOnCancellation(new h1(j0, 24));
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == qd.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }
}

