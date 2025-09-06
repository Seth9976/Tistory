package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u000F\u001A\'\u0010\u0005\u001A\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001A5\u0010\u000B\u001A\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001A\u00020\tH\u0000¢\u0006\u0004\b\u000B\u0010\f\u001A.\u0010\u0011\u001A\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u000E\u001A\u00020\r2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00040\u000FH\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012\u001A \u0010\u0015\u001A\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0014\u001A\u00020\u0013H\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0017\u001A\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u001A\u0010\u0019\u001A\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u0012\u0004\b\u001A\u0010\u001B\"\u0014\u0010\u001C\u001A\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001C\u0010\u0018\"\u0014\u0010\u001D\u001A\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001D\u0010\u0018\"\u0014\u0010\u001E\u001A\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001E\u0010\u0018\"\u0018\u0010\u001F\u001A\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u001F\u0010 \"\u0018\u0010!\u001A\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b!\u0010 ¨\u0006\""}, d2 = {"T", "Lkotlinx/coroutines/DispatchedTask;", "", "mode", "", "dispatch", "(Lkotlinx/coroutines/DispatchedTask;I)V", "Lkotlin/coroutines/Continuation;", "delegate", "", "undispatched", "resume", "(Lkotlinx/coroutines/DispatchedTask;Lkotlin/coroutines/Continuation;Z)V", "Lkotlinx/coroutines/EventLoop;", "eventLoop", "Lkotlin/Function0;", "block", "runUnconfinedEventLoop", "(Lkotlinx/coroutines/DispatchedTask;Lkotlinx/coroutines/EventLoop;Lkotlin/jvm/functions/Function0;)V", "", "exception", "resumeWithStackTrace", "(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;)V", "MODE_ATOMIC", "I", "MODE_CANCELLABLE", "getMODE_CANCELLABLE$annotations", "()V", "MODE_CANCELLABLE_REUSABLE", "MODE_UNDISPATCHED", "MODE_UNINITIALIZED", "isCancellableMode", "(I)Z", "isReusableMode", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 4 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,222:1\n200#1,17:240\n1#2:223\n255#3:224\n256#3,2:235\n258#3:239\n107#4,10:225\n118#4,2:237\n61#5,2:257\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n*L\n190#1:240,17\n178#1:224\n178#1:235,2\n178#1:239\n178#1:225,10\n178#1:237,2\n220#1:257,2\n*E\n"})
public final class DispatchedTaskKt {
    public static final int MODE_ATOMIC = 0;
    public static final int MODE_CANCELLABLE = 1;
    public static final int MODE_CANCELLABLE_REUSABLE = 2;
    public static final int MODE_UNDISPATCHED = 4;
    public static final int MODE_UNINITIALIZED = -1;

    public static final void dispatch(@NotNull DispatchedTask dispatchedTask0, int v) {
        Continuation continuation0 = dispatchedTask0.getDelegate$kotlinx_coroutines_core();
        if(v != 4 && continuation0 instanceof DispatchedContinuation && DispatchedTaskKt.isCancellableMode(v) == DispatchedTaskKt.isCancellableMode(dispatchedTask0.resumeMode)) {
            CoroutineDispatcher coroutineDispatcher0 = ((DispatchedContinuation)continuation0).dispatcher;
            CoroutineContext coroutineContext0 = continuation0.getContext();
            if(coroutineDispatcher0.isDispatchNeeded(coroutineContext0)) {
                coroutineDispatcher0.dispatch(coroutineContext0, dispatchedTask0);
                return;
            }
            EventLoop eventLoop0 = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
            if(eventLoop0.isUnconfinedLoopActive()) {
                eventLoop0.dispatchUnconfined(dispatchedTask0);
                return;
            }
            eventLoop0.incrementUseCount(true);
            try {
                DispatchedTaskKt.resume(dispatchedTask0, dispatchedTask0.getDelegate$kotlinx_coroutines_core(), true);
                while(eventLoop0.processUnconfinedEvent()) {
                }
            }
            catch(Throwable throwable0) {
                dispatchedTask0.handleFatalException$kotlinx_coroutines_core(throwable0, null);
            }
            finally {
                eventLoop0.decrementUseCount(true);
            }
            return;
        }
        DispatchedTaskKt.resume(dispatchedTask0, continuation0, v == 4);
    }

    @PublishedApi
    public static void getMODE_CANCELLABLE$annotations() {
    }

    public static final boolean isCancellableMode(int v) {
        return v == 1 || v == 2;
    }

    public static final boolean isReusableMode(int v) {
        return v == 2;
    }

    public static final void resume(@NotNull DispatchedTask dispatchedTask0, @NotNull Continuation continuation0, boolean z) {
        Object object0 = dispatchedTask0.takeState$kotlinx_coroutines_core();
        Throwable throwable0 = dispatchedTask0.getExceptionalResult$kotlinx_coroutines_core(object0);
        Object object1 = throwable0 == null ? dispatchedTask0.getSuccessfulResult$kotlinx_coroutines_core(object0) : ResultKt.createFailure(throwable0);
        if(z) {
            Intrinsics.checkNotNull(continuation0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            DispatchedContinuation dispatchedContinuation0 = (DispatchedContinuation)continuation0;
            CoroutineContext coroutineContext0 = dispatchedContinuation0.continuation.getContext();
            Object object2 = ThreadContextKt.updateThreadContext(coroutineContext0, dispatchedContinuation0.countOrElement);
            UndispatchedCoroutine undispatchedCoroutine0 = object2 == ThreadContextKt.NO_THREAD_ELEMENTS ? null : CoroutineContextKt.updateUndispatchedCompletion(dispatchedContinuation0.continuation, coroutineContext0, object2);
            try {
                dispatchedContinuation0.continuation.resumeWith(object1);
            }
            catch(Throwable throwable1) {
                if(undispatchedCoroutine0 == null || undispatchedCoroutine0.clearThreadContext()) {
                    ThreadContextKt.restoreThreadContext(coroutineContext0, object2);
                }
                throw throwable1;
            }
            if(undispatchedCoroutine0 == null || undispatchedCoroutine0.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(coroutineContext0, object2);
            }
        }
        else {
            continuation0.resumeWith(object1);
        }
    }

    public static final void resumeWithStackTrace(@NotNull Continuation continuation0, @NotNull Throwable throwable0) {
        continuation0.resumeWith(Result.constructor-impl(ResultKt.createFailure(throwable0)));
    }

    public static final void runUnconfinedEventLoop(@NotNull DispatchedTask dispatchedTask0, @NotNull EventLoop eventLoop0, @NotNull Function0 function00) {
        eventLoop0.incrementUseCount(true);
        try {
            function00.invoke();
            while(eventLoop0.processUnconfinedEvent()) {
            }
        }
        catch(Throwable throwable0) {
            dispatchedTask0.handleFatalException$kotlinx_coroutines_core(throwable0, null);
        }
        finally {
            eventLoop0.decrementUseCount(true);
        }
    }
}

