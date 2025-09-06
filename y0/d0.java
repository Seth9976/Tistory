package y0;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;
import qd.a;

public final class d0 implements MutableState, ProduceStateScope {
    public final CoroutineContext a;
    public final MutableState b;

    public d0(MutableState mutableState0, CoroutineContext coroutineContext0) {
        this.a = coroutineContext0;
        this.b = mutableState0;
    }

    @Override  // androidx.compose.runtime.ProduceStateScope
    public final Object awaitDispose(Function0 function00, Continuation continuation0) {
        c0 c00;
        if(continuation0 instanceof c0) {
            c00 = (c0)continuation0;
            int v = c00.r;
            if((v & 0x80000000) == 0) {
                c00 = new c0(this, continuation0);
            }
            else {
                c00.r = v ^ 0x80000000;
            }
        }
        else {
            c00 = new c0(this, continuation0);
        }
        Object object0 = c00.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(c00.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    c00.o = function00;
                    c00.r = 1;
                    CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(c00), 1);
                    cancellableContinuationImpl0.initCancellability();
                    Object object2 = cancellableContinuationImpl0.getResult();
                    if(object2 == a.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(c00);
                    }
                    if(object2 == object1) {
                        return object1;
                    label_23:
                        function00 = c00.o;
                        ResultKt.throwOnFailure(object0);
                    }
                    throw new KotlinNothingValueException();
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                goto label_23;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        function00.invoke();
        throw throwable0;
    }

    @Override  // androidx.compose.runtime.MutableState
    public final Object component1() {
        return this.b.component1();
    }

    @Override  // androidx.compose.runtime.MutableState
    public final Function1 component2() {
        return this.b.component2();
    }

    @Override  // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.a;
    }

    @Override  // androidx.compose.runtime.MutableState
    public final Object getValue() {
        return this.b.getValue();
    }

    @Override  // androidx.compose.runtime.MutableState
    public final void setValue(Object object0) {
        this.b.setValue(object0);
    }
}

