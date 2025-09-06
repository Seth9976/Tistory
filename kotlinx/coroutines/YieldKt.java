package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001A\u0011\u0010\u0000\u001A\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, d2 = {"yield", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class YieldKt {
    @Nullable
    public static final Object yield(@NotNull Continuation continuation0) {
        Unit unit0;
        CoroutineContext coroutineContext0 = continuation0.getContext();
        JobKt.ensureActive(coroutineContext0);
        Continuation continuation1 = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0);
        DispatchedContinuation dispatchedContinuation0 = continuation1 instanceof DispatchedContinuation ? ((DispatchedContinuation)continuation1) : null;
        if(dispatchedContinuation0 == null) {
            unit0 = Unit.INSTANCE;
        }
        else if(dispatchedContinuation0.dispatcher.isDispatchNeeded(coroutineContext0)) {
            dispatchedContinuation0.dispatchYield$kotlinx_coroutines_core(coroutineContext0, Unit.INSTANCE);
            unit0 = a.getCOROUTINE_SUSPENDED();
        }
        else {
            YieldContext yieldContext0 = new YieldContext();
            CoroutineContext coroutineContext1 = coroutineContext0.plus(yieldContext0);
            Unit unit1 = Unit.INSTANCE;
            dispatchedContinuation0.dispatchYield$kotlinx_coroutines_core(coroutineContext1, unit1);
            if(!yieldContext0.dispatcherWasUnconfined) {
                unit0 = a.getCOROUTINE_SUSPENDED();
            }
            else if(DispatchedContinuationKt.yieldUndispatched(dispatchedContinuation0)) {
                unit0 = a.getCOROUTINE_SUSPENDED();
            }
            else {
                unit0 = unit1;
            }
        }
        if(unit0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }
}

