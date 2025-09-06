package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletionStateKt;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ThreadLocalEventLoop;
import kotlinx.coroutines.UndispatchedCoroutine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001AW\u0010\u000B\u001A\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022%\b\u0002\u0010\n\u001A\u001F\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\f\u001A\u0019\u0010\u000F\u001A\u00020\u000E*\b\u0012\u0004\u0012\u00020\t0\rH\u0000¢\u0006\u0004\b\u000F\u0010\u0010\"\u0014\u0010\u0012\u001A\u00020\u00118\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"T", "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", "result", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "onCancellation", "resumeCancellableWith", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/internal/DispatchedContinuation;", "", "yieldUndispatched", "(Lkotlinx/coroutines/internal/DispatchedContinuation;)Z", "Lkotlinx/coroutines/internal/Symbol;", "REUSABLE_CLAIMED", "Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 2 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,317:1\n297#1,5:325\n302#1,12:331\n314#1:387\n301#1:389\n302#1,12:391\n314#1:420\n217#2,7:318\n224#2:346\n243#2,8:347\n225#2:355\n255#2:356\n256#2,2:367\n258#2:371\n227#2:372\n229#2:388\n1#3:330\n1#3:390\n1#3:421\n200#4,3:343\n203#4,14:373\n200#4,17:403\n200#4,17:422\n107#5,10:357\n118#5,2:369\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n*L\n282#1:325,5\n282#1:331,12\n282#1:387\n287#1:389\n287#1:391,12\n287#1:420\n282#1:318,7\n282#1:346\n282#1:347,8\n282#1:355\n282#1:356\n282#1:367,2\n282#1:371\n282#1:372\n282#1:388\n282#1:330\n287#1:390\n282#1:343,3\n282#1:373,14\n287#1:403,17\n313#1:422,17\n282#1:357,10\n282#1:369,2\n*E\n"})
public final class DispatchedContinuationKt {
    @JvmField
    @NotNull
    public static final Symbol REUSABLE_CLAIMED;
    public static final Symbol a;

    static {
        DispatchedContinuationKt.a = new Symbol("UNDEFINED");
        DispatchedContinuationKt.REUSABLE_CLAIMED = new Symbol("REUSABLE_CLAIMED");
    }

    @InternalCoroutinesApi
    public static final void resumeCancellableWith(@NotNull Continuation continuation0, @NotNull Object object0, @Nullable Function1 function10) {
        Object object2;
        CoroutineContext coroutineContext2;
        if(continuation0 instanceof DispatchedContinuation) {
            DispatchedContinuation dispatchedContinuation0 = (DispatchedContinuation)continuation0;
            Object object1 = CompletionStateKt.toState(object0, function10);
            CoroutineContext coroutineContext0 = dispatchedContinuation0.getContext();
            if(dispatchedContinuation0.dispatcher.isDispatchNeeded(coroutineContext0)) {
                dispatchedContinuation0._state = object1;
                dispatchedContinuation0.resumeMode = 1;
                CoroutineContext coroutineContext1 = dispatchedContinuation0.getContext();
                dispatchedContinuation0.dispatcher.dispatch(coroutineContext1, dispatchedContinuation0);
                return;
            }
            EventLoop eventLoop0 = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
            if(eventLoop0.isUnconfinedLoopActive()) {
                dispatchedContinuation0._state = object1;
                dispatchedContinuation0.resumeMode = 1;
                eventLoop0.dispatchUnconfined(dispatchedContinuation0);
                return;
            }
            eventLoop0.incrementUseCount(true);
            try {
                Job job0 = (Job)dispatchedContinuation0.getContext().get(Job.Key);
                if(job0 == null || job0.isActive()) {
                    coroutineContext2 = dispatchedContinuation0.continuation.getContext();
                    object2 = ThreadContextKt.updateThreadContext(coroutineContext2, dispatchedContinuation0.countOrElement);
                    UndispatchedCoroutine undispatchedCoroutine0 = object2 == ThreadContextKt.NO_THREAD_ELEMENTS ? null : CoroutineContextKt.updateUndispatchedCompletion(dispatchedContinuation0.continuation, coroutineContext2, object2);
                    goto label_26;
                }
                else {
                    CancellationException cancellationException0 = job0.getCancellationException();
                    dispatchedContinuation0.cancelCompletedResult$kotlinx_coroutines_core(object1, cancellationException0);
                    dispatchedContinuation0.resumeWith(Result.constructor-impl(ResultKt.createFailure(cancellationException0)));
                }
                goto label_40;
            }
            catch(Throwable throwable0) {
                goto label_43;
            }
            try {
            label_26:
                dispatchedContinuation0.continuation.resumeWith(object0);
                goto label_35;
            }
            catch(Throwable throwable1) {
                try {
                    if(undispatchedCoroutine0 == null) {
                        ThreadContextKt.restoreThreadContext(coroutineContext2, object2);
                    }
                    else if(undispatchedCoroutine0.clearThreadContext()) {
                        ThreadContextKt.restoreThreadContext(coroutineContext2, object2);
                    }
                    throw throwable1;
                label_35:
                    if(undispatchedCoroutine0 == null) {
                        ThreadContextKt.restoreThreadContext(coroutineContext2, object2);
                    }
                    else if(undispatchedCoroutine0.clearThreadContext()) {
                        ThreadContextKt.restoreThreadContext(coroutineContext2, object2);
                    }
                    while(true) {
                    label_40:
                        if(!eventLoop0.processUnconfinedEvent()) {
                            goto label_48;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
            }
            try {
            label_43:
                dispatchedContinuation0.handleFatalException$kotlinx_coroutines_core(throwable0, null);
            }
            catch(Throwable throwable2) {
                eventLoop0.decrementUseCount(true);
                throw throwable2;
            }
        label_48:
            eventLoop0.decrementUseCount(true);
            return;
        }
        continuation0.resumeWith(object0);
    }

    public static void resumeCancellableWith$default(Continuation continuation0, Object object0, Function1 function10, int v, Object object1) {
        if((v & 2) != 0) {
            function10 = null;
        }
        DispatchedContinuationKt.resumeCancellableWith(continuation0, object0, function10);
    }

    public static final boolean yieldUndispatched(@NotNull DispatchedContinuation dispatchedContinuation0) {
        Unit unit0 = Unit.INSTANCE;
        EventLoop eventLoop0 = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if(!eventLoop0.isUnconfinedQueueEmpty()) {
            if(eventLoop0.isUnconfinedLoopActive()) {
                dispatchedContinuation0._state = unit0;
                dispatchedContinuation0.resumeMode = 1;
                eventLoop0.dispatchUnconfined(dispatchedContinuation0);
                return true;
            }
            eventLoop0.incrementUseCount(true);
            try {
                dispatchedContinuation0.run();
                while(eventLoop0.processUnconfinedEvent()) {
                }
            }
            catch(Throwable throwable0) {
                dispatchedContinuation0.handleFatalException$kotlinx_coroutines_core(throwable0, null);
            }
            finally {
                eventLoop0.decrementUseCount(true);
            }
            return false;
        }
        return false;
    }
}

