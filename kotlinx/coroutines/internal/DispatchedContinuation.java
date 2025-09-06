package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletedWithCancellation;
import kotlinx.coroutines.CompletionStateKt;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DispatchedTask;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ThreadLocalEventLoop;
import kotlinx.coroutines.UndispatchedCoroutine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001D\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005\u00A2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001A\n\u0018\u00010\u000Bj\u0004\u0018\u0001`\fH\u0016\u00A2\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0012\u001A\u00020\u000FH\u0000\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0016\u001A\u00020\u0013H\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0018\u001A\u00020\u0013H\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001C\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0019H\u0000\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u001D\u0010!\u001A\u0004\u0018\u00010\u001E2\n\u0010\b\u001A\u0006\u0012\u0002\b\u00030\u001DH\u0000\u00A2\u0006\u0004\b\u001F\u0010 J\u0017\u0010%\u001A\u00020\u000F2\u0006\u0010\"\u001A\u00020\u001EH\u0000\u00A2\u0006\u0004\b#\u0010$J\u0011\u0010)\u001A\u0004\u0018\u00010&H\u0010\u00A2\u0006\u0004\b\'\u0010(J \u0010,\u001A\u00020\u00132\f\u0010+\u001A\b\u0012\u0004\u0012\u00028\u00000*H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b,\u0010-JH\u00104\u001A\u00020\u00132\f\u0010+\u001A\b\u0012\u0004\u0012\u00028\u00000*2%\b\b\u00101\u001A\u001F\u0012\u0013\u0012\u00110\u001E\u00A2\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u0013\u0018\u00010.H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b2\u00103J!\u00108\u001A\u00020\u00132\b\u00105\u001A\u0004\u0018\u00010&2\u0006\u0010\"\u001A\u00020\u001EH\u0010\u00A2\u0006\u0004\b6\u00107J\u001A\u0010<\u001A\u00020\u000F2\b\u00109\u001A\u0004\u0018\u00010&H\u0080\b\u00A2\u0006\u0004\b:\u0010;J!\u0010>\u001A\u00020\u00132\f\u0010+\u001A\b\u0012\u0004\u0012\u00028\u00000*H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b=\u0010-J\u001F\u0010D\u001A\u00020\u00132\u0006\u0010@\u001A\u00020?2\u0006\u0010A\u001A\u00028\u0000H\u0000\u00A2\u0006\u0004\bB\u0010CJ\u000F\u0010F\u001A\u00020EH\u0016\u00A2\u0006\u0004\bF\u0010GR\u0014\u0010\u0007\u001A\u00020\u00068\u0000X\u0081\u0004\u00A2\u0006\u0006\n\u0004\b\u0007\u0010HR\u001A\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\b\u0010IR\u001E\u0010J\u001A\u0004\u0018\u00010&8\u0000@\u0000X\u0081\u000E\u00A2\u0006\f\n\u0004\bJ\u0010K\u0012\u0004\bL\u0010\u0015R\u0014\u0010M\u001A\u00020&8\u0000X\u0081\u0004\u00A2\u0006\u0006\n\u0004\bM\u0010KR\u0014\u0010@\u001A\u00020?8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bN\u0010OR\u001C\u0010R\u001A\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bP\u0010QR\u001A\u0010U\u001A\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004\u00A2\u0006\u0006\u001A\u0004\bS\u0010TR\u0013\u0010W\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010&0V8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u0006X"}, d2 = {"Lkotlinx/coroutines/internal/DispatchedContinuation;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "continuation", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)V", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "isReusable$kotlinx_coroutines_core", "()Z", "isReusable", "", "awaitReusability$kotlinx_coroutines_core", "()V", "awaitReusability", "release$kotlinx_coroutines_core", "release", "Lkotlinx/coroutines/CancellableContinuationImpl;", "claimReusableCancellableContinuation$kotlinx_coroutines_core", "()Lkotlinx/coroutines/CancellableContinuationImpl;", "claimReusableCancellableContinuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "tryReleaseClaimedContinuation$kotlinx_coroutines_core", "(Lkotlinx/coroutines/CancellableContinuation;)Ljava/lang/Throwable;", "tryReleaseClaimedContinuation", "cause", "postponeCancellation$kotlinx_coroutines_core", "(Ljava/lang/Throwable;)Z", "postponeCancellation", "", "takeState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "takeState", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onCancellation", "resumeCancellableWith$kotlinx_coroutines_core", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "resumeCancellableWith", "takenState", "cancelCompletedResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelCompletedResult", "state", "resumeCancelled$kotlinx_coroutines_core", "(Ljava/lang/Object;)Z", "resumeCancelled", "resumeUndispatchedWith$kotlinx_coroutines_core", "resumeUndispatchedWith", "Lkotlin/coroutines/CoroutineContext;", "context", "value", "dispatchYield$kotlinx_coroutines_core", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "dispatchYield", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/Continuation;", "_state", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "countOrElement", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "delegate", "Lkotlinx/atomicfu/AtomicRef;", "_reusableCancellableContinuation", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@PublishedApi
@SourceDebugExtension({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,317:1\n243#1,8:381\n255#1:389\n256#1,2:400\n258#1:404\n1#2:318\n1#2:324\n1#2:365\n297#3,5:319\n302#3,12:325\n314#3:359\n297#3,5:360\n302#3,12:366\n314#3:419\n200#4,3:337\n203#4,14:345\n200#4,3:378\n203#4,14:405\n95#5,5:340\n107#5,10:390\n118#5,2:402\n107#5,13:420\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n*L\n224#1:381,8\n225#1:389\n225#1:400,2\n225#1:404\n202#1:324\n223#1:365\n202#1:319,5\n202#1:325,12\n202#1:359\n223#1:360,5\n223#1:366,12\n223#1:419\n202#1:337,3\n202#1:345,14\n223#1:378,3\n223#1:405,14\n203#1:340,5\n225#1:390,10\n225#1:402,2\n255#1:420,13\n*E\n"})
public final class DispatchedContinuation extends DispatchedTask implements Continuation, CoroutineStackFrame {
    @Volatile
    @Nullable
    private volatile Object _reusableCancellableContinuation;
    @JvmField
    @Nullable
    public Object _state;
    public static final AtomicReferenceFieldUpdater a;
    @JvmField
    @NotNull
    public final Continuation continuation;
    @JvmField
    @NotNull
    public final Object countOrElement;
    @JvmField
    @NotNull
    public final CoroutineDispatcher dispatcher;

    static {
        DispatchedContinuation.a = AtomicReferenceFieldUpdater.newUpdater(DispatchedContinuation.class, Object.class, "_reusableCancellableContinuation");
    }

    public DispatchedContinuation(@NotNull CoroutineDispatcher coroutineDispatcher0, @NotNull Continuation continuation0) {
        super(-1);
        this.dispatcher = coroutineDispatcher0;
        this.continuation = continuation0;
        this._state = DispatchedContinuationKt.access$getUNDEFINED$p();
        this.countOrElement = ThreadContextKt.threadContextElements(this.getContext());
    }

    public final void awaitReusability$kotlinx_coroutines_core() {
        while(DispatchedContinuation.a.get(this) == DispatchedContinuationKt.REUSABLE_CLAIMED) {
        }
    }

    @Override  // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(@Nullable Object object0, @NotNull Throwable throwable0) {
        if(object0 instanceof CompletedWithCancellation) {
            ((CompletedWithCancellation)object0).onCancellation.invoke(throwable0);
        }
    }

    @Nullable
    public final CancellableContinuationImpl claimReusableCancellableContinuation$kotlinx_coroutines_core() {
        Object object0;
        while(true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = DispatchedContinuation.a;
            object0 = atomicReferenceFieldUpdater0.get(this);
            if(object0 == null) {
                atomicReferenceFieldUpdater0.set(this, DispatchedContinuationKt.REUSABLE_CLAIMED);
                return null;
            }
            if(object0 instanceof CancellableContinuationImpl) {
                Symbol symbol0 = DispatchedContinuationKt.REUSABLE_CLAIMED;
                do {
                    if(atomicReferenceFieldUpdater0.compareAndSet(this, object0, symbol0)) {
                        return (CancellableContinuationImpl)object0;
                    }
                }
                while(atomicReferenceFieldUpdater0.get(this) == object0);
            }
            else if(object0 != DispatchedContinuationKt.REUSABLE_CLAIMED && !(object0 instanceof Throwable)) {
                break;
            }
        }
        throw new IllegalStateException(("Inconsistent state " + object0).toString());
    }

    public final void dispatchYield$kotlinx_coroutines_core(@NotNull CoroutineContext coroutineContext0, Object object0) {
        this._state = object0;
        this.resumeMode = 1;
        this.dispatcher.dispatchYield(coroutineContext0, this);
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        return this.continuation instanceof CoroutineStackFrame ? ((CoroutineStackFrame)this.continuation) : null;
    }

    @Override  // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return this.continuation.getContext();
    }

    @Override  // kotlinx.coroutines.DispatchedTask
    @NotNull
    public Continuation getDelegate$kotlinx_coroutines_core() {
        return this;
    }

    @Override  // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public static void get_state$kotlinx_coroutines_core$annotations() {
    }

    public final boolean isReusable$kotlinx_coroutines_core() {
        return DispatchedContinuation.a.get(this) != null;
    }

    public final boolean postponeCancellation$kotlinx_coroutines_core(@NotNull Throwable throwable0) {
        while(true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = DispatchedContinuation.a;
            Object object0 = atomicReferenceFieldUpdater0.get(this);
            Symbol symbol0 = DispatchedContinuationKt.REUSABLE_CLAIMED;
            if(Intrinsics.areEqual(object0, symbol0)) {
                do {
                    if(atomicReferenceFieldUpdater0.compareAndSet(this, symbol0, throwable0)) {
                        return true;
                    }
                }
                while(atomicReferenceFieldUpdater0.get(this) == symbol0);
            }
            else {
                if(object0 instanceof Throwable) {
                    return true;
                }
                do {
                    if(atomicReferenceFieldUpdater0.compareAndSet(this, object0, null)) {
                        return false;
                    }
                }
                while(atomicReferenceFieldUpdater0.get(this) == object0);
            }
        }
    }

    public final void release$kotlinx_coroutines_core() {
        this.awaitReusability$kotlinx_coroutines_core();
        Object object0 = DispatchedContinuation.a.get(this);
        CancellableContinuationImpl cancellableContinuationImpl0 = object0 instanceof CancellableContinuationImpl ? ((CancellableContinuationImpl)object0) : null;
        if(cancellableContinuationImpl0 != null) {
            cancellableContinuationImpl0.detachChild$kotlinx_coroutines_core();
        }
    }

    public final void resumeCancellableWith$kotlinx_coroutines_core(@NotNull Object object0, @Nullable Function1 function10) {
        Object object2;
        CoroutineContext coroutineContext2;
        Object object1 = CompletionStateKt.toState(object0, function10);
        CoroutineContext coroutineContext0 = this.getContext();
        if(this.dispatcher.isDispatchNeeded(coroutineContext0)) {
            this._state = object1;
            this.resumeMode = 1;
            CoroutineContext coroutineContext1 = this.getContext();
            this.dispatcher.dispatch(coroutineContext1, this);
            return;
        }
        EventLoop eventLoop0 = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if(eventLoop0.isUnconfinedLoopActive()) {
            this._state = object1;
            this.resumeMode = 1;
            eventLoop0.dispatchUnconfined(this);
            return;
        }
        eventLoop0.incrementUseCount(true);
        try {
            Job job0 = (Job)this.getContext().get(Job.Key);
            if(job0 == null || job0.isActive()) {
                coroutineContext2 = this.continuation.getContext();
                object2 = ThreadContextKt.updateThreadContext(coroutineContext2, this.countOrElement);
                UndispatchedCoroutine undispatchedCoroutine0 = object2 == ThreadContextKt.NO_THREAD_ELEMENTS ? null : CoroutineContextKt.updateUndispatchedCompletion(this.continuation, coroutineContext2, object2);
                goto label_24;
            }
            else {
                CancellationException cancellationException0 = job0.getCancellationException();
                this.cancelCompletedResult$kotlinx_coroutines_core(object1, cancellationException0);
                this.resumeWith(Result.constructor-impl(ResultKt.createFailure(cancellationException0)));
            }
            goto label_32;
        }
        catch(Throwable throwable0) {
            goto label_35;
        }
        try {
        label_24:
            this.continuation.resumeWith(object0);
            goto label_30;
        }
        catch(Throwable throwable1) {
            try {
                if(undispatchedCoroutine0 == null || undispatchedCoroutine0.clearThreadContext()) {
                    ThreadContextKt.restoreThreadContext(coroutineContext2, object2);
                }
                throw throwable1;
            label_30:
                if(undispatchedCoroutine0 == null || undispatchedCoroutine0.clearThreadContext()) {
                    ThreadContextKt.restoreThreadContext(coroutineContext2, object2);
                }
                while(true) {
                label_32:
                    if(!eventLoop0.processUnconfinedEvent()) {
                        goto label_40;
                    }
                }
            }
            catch(Throwable throwable0) {
            }
        }
        try {
        label_35:
            this.handleFatalException$kotlinx_coroutines_core(throwable0, null);
        }
        catch(Throwable throwable2) {
            eventLoop0.decrementUseCount(true);
            throw throwable2;
        }
    label_40:
        eventLoop0.decrementUseCount(true);
    }

    public final boolean resumeCancelled$kotlinx_coroutines_core(@Nullable Object object0) {
        Job job0 = (Job)this.getContext().get(Job.Key);
        if(job0 != null && !job0.isActive()) {
            CancellationException cancellationException0 = job0.getCancellationException();
            this.cancelCompletedResult$kotlinx_coroutines_core(object0, cancellationException0);
            this.resumeWith(Result.constructor-impl(ResultKt.createFailure(cancellationException0)));
            return true;
        }
        return false;
    }

    public final void resumeUndispatchedWith$kotlinx_coroutines_core(@NotNull Object object0) {
        CoroutineContext coroutineContext0 = this.continuation.getContext();
        Object object1 = ThreadContextKt.updateThreadContext(coroutineContext0, this.countOrElement);
        UndispatchedCoroutine undispatchedCoroutine0 = object1 == ThreadContextKt.NO_THREAD_ELEMENTS ? null : CoroutineContextKt.updateUndispatchedCompletion(this.continuation, coroutineContext0, object1);
        try {
            this.continuation.resumeWith(object0);
        }
        finally {
            if(undispatchedCoroutine0 == null || undispatchedCoroutine0.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(coroutineContext0, object1);
            }
        }
    }

    @Override  // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object object0) {
        CoroutineContext coroutineContext0 = this.continuation.getContext();
        Object object1 = CompletionStateKt.toState$default(object0, null, 1, null);
        if(this.dispatcher.isDispatchNeeded(coroutineContext0)) {
            this._state = object1;
            this.resumeMode = 0;
            this.dispatcher.dispatch(coroutineContext0, this);
            return;
        }
        EventLoop eventLoop0 = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if(eventLoop0.isUnconfinedLoopActive()) {
            this._state = object1;
            this.resumeMode = 0;
            eventLoop0.dispatchUnconfined(this);
            return;
        }
        eventLoop0.incrementUseCount(true);
        try {
            CoroutineContext coroutineContext1 = this.getContext();
            Object object2 = ThreadContextKt.updateThreadContext(coroutineContext1, this.countOrElement);
            try {
                this.continuation.resumeWith(object0);
            }
            finally {
                ThreadContextKt.restoreThreadContext(coroutineContext1, object2);
            }
            while(eventLoop0.processUnconfinedEvent()) {
            }
        }
        catch(Throwable throwable0) {
            this.handleFatalException$kotlinx_coroutines_core(throwable0, null);
        }
        finally {
            eventLoop0.decrementUseCount(true);
        }
    }

    @Override  // kotlinx.coroutines.DispatchedTask
    @Nullable
    public Object takeState$kotlinx_coroutines_core() {
        Object object0 = this._state;
        this._state = DispatchedContinuationKt.a;
        return object0;
    }

    @Override
    @NotNull
    public String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + DebugStringsKt.toDebugString(this.continuation) + ']';
    }

    @Nullable
    public final Throwable tryReleaseClaimedContinuation$kotlinx_coroutines_core(@NotNull CancellableContinuation cancellableContinuation0) {
        Object object0;
        while(true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = DispatchedContinuation.a;
            object0 = atomicReferenceFieldUpdater0.get(this);
            Symbol symbol0 = DispatchedContinuationKt.REUSABLE_CLAIMED;
            if(object0 != symbol0) {
                break;
            }
            do {
                if(atomicReferenceFieldUpdater0.compareAndSet(this, symbol0, cancellableContinuation0)) {
                    return null;
                }
            }
            while(atomicReferenceFieldUpdater0.get(this) == symbol0);
        }
        if(!(object0 instanceof Throwable)) {
            throw new IllegalStateException(("Inconsistent state " + object0).toString());
        }
        do {
            if(atomicReferenceFieldUpdater0.compareAndSet(this, object0, null)) {
                return (Throwable)object0;
            }
        }
        while(atomicReferenceFieldUpdater0.get(this) == object0);
        throw new IllegalArgumentException("Failed requirement.");
    }
}

