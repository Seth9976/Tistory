package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import sf.g0;
import sf.g;
import sf.h0;
import sf.k0;
import sf.o;

@Metadata(d1 = {}, d2 = {}, k = 4, mv = {1, 8, 0}, xi = 0x30)
public final class BuildersKt {
    @NotNull
    public static final Deferred async(@NotNull CoroutineScope coroutineScope0, @NotNull CoroutineContext coroutineContext0, @NotNull CoroutineStart coroutineStart0, @NotNull Function2 function20) {
        CoroutineContext coroutineContext1 = CoroutineContextKt.newCoroutineContext(coroutineScope0, coroutineContext0);
        Deferred deferred0 = coroutineStart0.isLazy() ? new g0(coroutineContext1, function20) : new o(coroutineContext1, true, true);  // 初始化器: Lkotlinx/coroutines/AbstractCoroutine;-><init>(Lkotlin/coroutines/CoroutineContext;ZZ)V
        ((AbstractCoroutine)deferred0).start(coroutineStart0, deferred0, function20);
        return deferred0;
    }

    public static Deferred async$default(CoroutineScope coroutineScope0, CoroutineContext coroutineContext0, CoroutineStart coroutineStart0, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        if((v & 2) != 0) {
            coroutineStart0 = CoroutineStart.DEFAULT;
        }
        return BuildersKt.async(coroutineScope0, coroutineContext0, coroutineStart0, function20);
    }

    @Nullable
    public static final Object invoke(@NotNull CoroutineDispatcher coroutineDispatcher0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        return BuildersKt.withContext(coroutineDispatcher0, function20, continuation0);
    }

    @NotNull
    public static final Job launch(@NotNull CoroutineScope coroutineScope0, @NotNull CoroutineContext coroutineContext0, @NotNull CoroutineStart coroutineStart0, @NotNull Function2 function20) {
        CoroutineContext coroutineContext1 = CoroutineContextKt.newCoroutineContext(coroutineScope0, coroutineContext0);
        Job job0 = coroutineStart0.isLazy() ? new h0(coroutineContext1, function20) : new k0(coroutineContext1, true, true);  // 初始化器: Lkotlinx/coroutines/AbstractCoroutine;-><init>(Lkotlin/coroutines/CoroutineContext;ZZ)V
        ((AbstractCoroutine)job0).start(coroutineStart0, job0, function20);
        return job0;
    }

    public static Job launch$default(CoroutineScope coroutineScope0, CoroutineContext coroutineContext0, CoroutineStart coroutineStart0, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        if((v & 2) != 0) {
            coroutineStart0 = CoroutineStart.DEFAULT;
        }
        return BuildersKt.launch(coroutineScope0, coroutineContext0, coroutineStart0, function20);
    }

    public static final Object runBlocking(@NotNull CoroutineContext coroutineContext0, @NotNull Function2 function20) throws InterruptedException {
        Unit unit0;
        CoroutineContext coroutineContext2;
        EventLoop eventLoop0;
        Thread thread0 = Thread.currentThread();
        ContinuationInterceptor continuationInterceptor0 = (ContinuationInterceptor)coroutineContext0.get(ContinuationInterceptor.Key);
        CompletedExceptionally completedExceptionally0 = null;
        if(continuationInterceptor0 == null) {
            eventLoop0 = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
            CoroutineContext coroutineContext1 = coroutineContext0.plus(eventLoop0);
            coroutineContext2 = CoroutineContextKt.newCoroutineContext(GlobalScope.INSTANCE, coroutineContext1);
        }
        else {
            if(continuationInterceptor0 instanceof EventLoop) {
                eventLoop0 = (EventLoop)continuationInterceptor0;
            }
            eventLoop0 = ThreadLocalEventLoop.INSTANCE.currentOrNull$kotlinx_coroutines_core();
            coroutineContext2 = CoroutineContextKt.newCoroutineContext(GlobalScope.INSTANCE, coroutineContext0);
        }
        g g0 = new g(coroutineContext2, thread0, eventLoop0);
        g0.start(CoroutineStart.DEFAULT, g0, function20);
        AbstractTimeSource abstractTimeSource0 = AbstractTimeSourceKt.getTimeSource();
        if(abstractTimeSource0 != null) {
            abstractTimeSource0.registerTimeLoopThread();
        }
        try {
            EventLoop eventLoop1 = g0.e;
            if(eventLoop1 != null) {
                EventLoop.incrementUseCount$default(eventLoop1, false, 1, null);
            }
            try {
                while(true) {
                    if(Thread.interrupted()) {
                        InterruptedException interruptedException0 = new InterruptedException();
                        g0.cancelCoroutine(interruptedException0);
                        throw interruptedException0;
                    }
                    long v1 = eventLoop1 == null ? 0x7FFFFFFFFFFFFFFFL : eventLoop1.processNextEvent();
                    if(g0.isCompleted()) {
                        goto label_41;
                    }
                    AbstractTimeSource abstractTimeSource1 = AbstractTimeSourceKt.getTimeSource();
                    if(abstractTimeSource1 == null) {
                        unit0 = null;
                    }
                    else {
                        abstractTimeSource1.parkNanos(g0, v1);
                        unit0 = Unit.INSTANCE;
                    }
                    if(unit0 == null) {
                        LockSupport.parkNanos(g0, v1);
                        continue;
                    label_37:
                        if(eventLoop1 == null) {
                            throw throwable0;
                        }
                        break;
                    }
                }
            }
            catch(Throwable throwable0) {
                goto label_37;
            }
            EventLoop.decrementUseCount$default(eventLoop1, false, 1, null);
            throw throwable0;
        label_41:
            if(eventLoop1 != null) {
                EventLoop.decrementUseCount$default(eventLoop1, false, 1, null);
            }
        }
        finally {
            AbstractTimeSource abstractTimeSource2 = AbstractTimeSourceKt.getTimeSource();
            if(abstractTimeSource2 != null) {
                abstractTimeSource2.unregisterTimeLoopThread();
            }
        }
        Object object0 = JobSupportKt.unboxState(g0.getState$kotlinx_coroutines_core());
        if(object0 instanceof CompletedExceptionally) {
            completedExceptionally0 = (CompletedExceptionally)object0;
        }
        if(completedExceptionally0 != null) {
            throw completedExceptionally0.cause;
        }
        return object0;
    }

    public static Object runBlocking$default(CoroutineContext coroutineContext0, Function2 function20, int v, Object object0) throws InterruptedException {
        if((v & 1) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        return BuildersKt.runBlocking(coroutineContext0, function20);
    }

    @Nullable
    public static final Object withContext(@NotNull CoroutineContext coroutineContext0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        Object object2;
        Object object0;
        CoroutineContext coroutineContext1 = continuation0.getContext();
        CoroutineContext coroutineContext2 = CoroutineContextKt.newCoroutineContext(coroutineContext1, coroutineContext0);
        JobKt.ensureActive(coroutineContext2);
        if(coroutineContext2 == coroutineContext1) {
            ScopeCoroutine scopeCoroutine0 = new ScopeCoroutine(coroutineContext2, continuation0);
            object0 = UndispatchedKt.startUndispatchedOrReturn(scopeCoroutine0, scopeCoroutine0, function20);
        }
        else if(Intrinsics.areEqual(coroutineContext2.get(ContinuationInterceptor.Key), coroutineContext1.get(ContinuationInterceptor.Key))) {
            UndispatchedCoroutine undispatchedCoroutine0 = new UndispatchedCoroutine(coroutineContext2, continuation0);
            CoroutineContext coroutineContext3 = undispatchedCoroutine0.getContext();
            Object object1 = ThreadContextKt.updateThreadContext(coroutineContext3, null);
            try {
                object2 = UndispatchedKt.startUndispatchedOrReturn(undispatchedCoroutine0, undispatchedCoroutine0, function20);
            }
            finally {
                ThreadContextKt.restoreThreadContext(coroutineContext3, object1);
            }
            object0 = object2;
        }
        else {
            DispatchedCoroutine dispatchedCoroutine0 = new DispatchedCoroutine(coroutineContext2, continuation0);
            CancellableKt.startCoroutineCancellable$default(function20, dispatchedCoroutine0, dispatchedCoroutine0, null, 4, null);
            object0 = dispatchedCoroutine0.getResult$kotlinx_coroutines_core();
        }
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0;
    }
}

