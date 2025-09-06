package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import sf.p0;
import sf.q0;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001AW\u0010\t\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001A\u00020\u00012\'\u0010\b\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\u001A]\u0010\t\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\f\u001A\u00020\u000B2\'\u0010\b\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\r\u0010\n\u001AL\u0010\u000E\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001A\u00020\u00012\'\u0010\b\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\n\u001AR\u0010\u000E\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\f\u001A\u00020\u000B2\'\u0010\b\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\n\u001A\'\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0010\u001A\u00020\u00012\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0018"}, d2 = {"T", "", "timeMillis", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "withTimeout", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/time/Duration;", "timeout", "withTimeout-KLykuaI", "withTimeoutOrNull", "withTimeoutOrNull-KLykuaI", "time", "Lkotlinx/coroutines/Delay;", "delay", "Lkotlinx/coroutines/Job;", "coroutine", "Lkotlinx/coroutines/TimeoutCancellationException;", "TimeoutCancellationException", "(JLkotlinx/coroutines/Delay;Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/TimeoutCancellationException;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TimeoutKt {
    @NotNull
    public static final TimeoutCancellationException TimeoutCancellationException(long v, @NotNull Delay delay0, @NotNull Job job0) {
        DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics0 = delay0 instanceof DelayWithTimeoutDiagnostics ? ((DelayWithTimeoutDiagnostics)delay0) : null;
        if(delayWithTimeoutDiagnostics0 != null) {
            String s = delayWithTimeoutDiagnostics0.timeoutMessage-LRDsOJo(DurationKt.toDuration(v, DurationUnit.MILLISECONDS));
            return s == null ? new TimeoutCancellationException("Timed out waiting for " + v + " ms", job0) : new TimeoutCancellationException(s, job0);
        }
        return new TimeoutCancellationException("Timed out waiting for " + v + " ms", job0);
    }

    @Nullable
    public static final Object withTimeout(long v, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        if(v <= 0L) {
            throw new TimeoutCancellationException("Timed out immediately");
        }
        p0 p00 = new p0(v, continuation0);
        JobKt.disposeOnCompletion(p00, DelayKt.getDelay(p00.uCont.getContext()).invokeOnTimeout(p00.d, p00, p00.getContext()));
        Object object0 = UndispatchedKt.startUndispatchedOrReturnIgnoreTimeout(p00, p00, function20);
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }

    @Nullable
    public static final Object withTimeout-KLykuaI(long v, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        return TimeoutKt.withTimeout(DelayKt.toDelayMillis-LRDsOJo(v), function20, continuation0);
    }

    @Nullable
    public static final Object withTimeoutOrNull(long v, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        ObjectRef ref$ObjectRef1;
        Object object2;
        q0 q00;
        if(continuation0 instanceof q0) {
            q00 = (q0)continuation0;
            int v1 = q00.r;
            if((v1 & 0x80000000) == 0) {
                q00 = new q0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
            }
            else {
                q00.r = v1 ^ 0x80000000;
            }
        }
        else {
            q00 = new q0(continuation0);  // 初始化器: Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V
        }
        Object object0 = q00.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(q00.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(v <= 0L) {
                    return null;
                }
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                try {
                    q00.o = function20;
                    q00.p = ref$ObjectRef0;
                    q00.r = 1;
                    p0 p00 = new p0(v, q00);
                    ref$ObjectRef0.element = p00;
                    try {
                        JobKt.disposeOnCompletion(p00, DelayKt.getDelay(p00.uCont.getContext()).invokeOnTimeout(p00.d, p00, p00.getContext()));
                        object2 = UndispatchedKt.startUndispatchedOrReturnIgnoreTimeout(p00, p00, function20);
                    }
                    catch(TimeoutCancellationException timeoutCancellationException1) {
                        timeoutCancellationException0 = timeoutCancellationException1;
                        ref$ObjectRef1 = ref$ObjectRef0;
                        goto label_39;
                    }
                    if(object2 == a.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(q00);
                        return object2 == object1 ? object1 : object2;
                    }
                    return object2 == object1 ? object1 : object2;
                }
                catch(TimeoutCancellationException timeoutCancellationException0) {
                }
                ref$ObjectRef1 = ref$ObjectRef0;
                goto label_39;
            }
            case 1: {
                try {
                    ref$ObjectRef1 = q00.p;
                    ResultKt.throwOnFailure(object0);
                    return object0;
                }
                catch(TimeoutCancellationException timeoutCancellationException0) {
                }
            label_39:
                if(timeoutCancellationException0.coroutine != ref$ObjectRef1.element) {
                    throw timeoutCancellationException0;
                }
                return null;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Nullable
    public static final Object withTimeoutOrNull-KLykuaI(long v, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        return TimeoutKt.withTimeoutOrNull(DelayKt.toDelayMillis-LRDsOJo(v), function20, continuation0);
    }
}

