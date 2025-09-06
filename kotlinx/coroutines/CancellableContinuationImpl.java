package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmName;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sf.a;
import sf.h;
import sf.k;

@Metadata(d1 = {"\u0000\u00B2\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001D\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u00A2\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0001\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001A\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u001A\u001A\u0004\u0018\u00010\u0017H\u0010\u00A2\u0006\u0004\b\u0018\u0010\u0019J!\u0010 \u001A\u00020\r2\b\u0010\u001B\u001A\u0004\u0018\u00010\u00172\u0006\u0010\u001D\u001A\u00020\u001CH\u0010\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0019\u0010!\u001A\u00020\u00102\b\u0010\u001D\u001A\u0004\u0018\u00010\u001CH\u0016\u00A2\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001A\u00020\r2\u0006\u0010\u001D\u001A\u00020\u001CH\u0000\u00A2\u0006\u0004\b#\u0010$J\u001F\u0010(\u001A\u00020\r2\u0006\u0010\'\u001A\u00020&2\b\u0010\u001D\u001A\u0004\u0018\u00010\u001C\u00A2\u0006\u0004\b(\u0010)J8\u0010.\u001A\u00020\r2!\u0010-\u001A\u001D\u0012\u0013\u0012\u00110\u001C\u00A2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u001D\u0012\u0004\u0012\u00020\r0*2\u0006\u0010\u001D\u001A\u00020\u001C\u00A2\u0006\u0004\b.\u0010/J\u0017\u00102\u001A\u00020\u001C2\u0006\u00101\u001A\u000200H\u0016\u00A2\u0006\u0004\b2\u00103J\u0011\u00104\u001A\u0004\u0018\u00010\u0017H\u0001\u00A2\u0006\u0004\b4\u0010\u0019J\u000F\u00106\u001A\u00020\rH\u0000\u00A2\u0006\u0004\b5\u0010\u000FJ \u00109\u001A\u00020\r2\f\u00108\u001A\b\u0012\u0004\u0012\u00028\u000007H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b9\u0010:J<\u0010<\u001A\u00020\r2\u0006\u0010;\u001A\u00028\u00002#\u0010-\u001A\u001F\u0012\u0013\u0012\u00110\u001C\u00A2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u001D\u0012\u0004\u0012\u00020\r\u0018\u00010*H\u0016\u00A2\u0006\u0004\b<\u0010=J#\u0010A\u001A\u00020\r2\n\u0010?\u001A\u0006\u0012\u0002\b\u00030>2\u0006\u0010@\u001A\u00020\tH\u0016\u00A2\u0006\u0004\bA\u0010BJ8\u0010A\u001A\u00020\r2\'\u0010\'\u001A#\u0012\u0015\u0012\u0013\u0018\u00010\u001C\u00A2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u001D\u0012\u0004\u0012\u00020\r0*j\u0002`CH\u0016\u00A2\u0006\u0004\bA\u0010DJ\u000F\u0010F\u001A\u00020\rH\u0000\u00A2\u0006\u0004\bE\u0010\u000FJ#\u0010H\u001A\u0004\u0018\u00010\u00172\u0006\u0010;\u001A\u00028\u00002\b\u0010G\u001A\u0004\u0018\u00010\u0017H\u0016\u00A2\u0006\u0004\bH\u0010IJH\u0010H\u001A\u0004\u0018\u00010\u00172\u0006\u0010;\u001A\u00028\u00002\b\u0010G\u001A\u0004\u0018\u00010\u00172#\u0010-\u001A\u001F\u0012\u0013\u0012\u00110\u001C\u00A2\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u001D\u0012\u0004\u0012\u00020\r\u0018\u00010*H\u0016\u00A2\u0006\u0004\bH\u0010JJ\u0019\u0010L\u001A\u0004\u0018\u00010\u00172\u0006\u0010K\u001A\u00020\u001CH\u0016\u00A2\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001A\u00020\r2\u0006\u0010N\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\bO\u0010:J\u001B\u0010Q\u001A\u00020\r*\u00020P2\u0006\u0010;\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\bQ\u0010RJ\u001B\u0010S\u001A\u00020\r*\u00020P2\u0006\u0010K\u001A\u00020\u001CH\u0016\u00A2\u0006\u0004\bS\u0010TJ\u001F\u0010X\u001A\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010U\u001A\u0004\u0018\u00010\u0017H\u0010\u00A2\u0006\u0004\bV\u0010WJ\u001B\u0010[\u001A\u0004\u0018\u00010\u001C2\b\u0010U\u001A\u0004\u0018\u00010\u0017H\u0010\u00A2\u0006\u0004\bY\u0010ZJ\u000F\u0010]\u001A\u00020\\H\u0016\u00A2\u0006\u0004\b]\u0010^J\u000F\u0010_\u001A\u00020\\H\u0014\u00A2\u0006\u0004\b_\u0010^R \u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u00078\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b`\u0010a\u001A\u0004\bb\u0010cR\u001A\u0010i\u001A\u00020d8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\be\u0010f\u001A\u0004\bg\u0010hR\u0016\u0010U\u001A\u0004\u0018\u00010\u00178@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bj\u0010\u0019R\u0014\u0010k\u001A\u00020\u00108VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bk\u0010\u0012R\u0014\u0010l\u001A\u00020\u00108VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bl\u0010\u0012R\u0014\u0010m\u001A\u00020\u00108VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bm\u0010\u0012R\u001C\u0010p\u001A\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bn\u0010oR\u000B\u0010r\u001A\u00020q8\u0002X\u0082\u0004R\u0013\u0010u\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010t0s8\u0002X\u0082\u0004R\u0013\u0010v\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170s8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u0006w"}, d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/Waiter;", "Lkotlin/coroutines/Continuation;", "delegate", "", "resumeMode", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "", "initCancellability", "()V", "", "resetStateReusable", "()Z", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "takeState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "takeState", "takenState", "", "cause", "cancelCompletedResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelCompletedResult", "cancel", "(Ljava/lang/Throwable;)Z", "parentCancelled$kotlinx_coroutines_core", "(Ljava/lang/Throwable;)V", "parentCancelled", "Lkotlinx/coroutines/CancelHandler;", "handler", "callCancelHandler", "(Lkotlinx/coroutines/CancelHandler;Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onCancellation", "callOnCancellation", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/Job;", "parent", "getContinuationCancellationCause", "(Lkotlinx/coroutines/Job;)Ljava/lang/Throwable;", "getResult", "releaseClaimedReusableContinuation$kotlinx_coroutines_core", "releaseClaimedReusableContinuation", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "value", "resume", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/internal/Segment;", "segment", "index", "invokeOnCancellation", "(Lkotlinx/coroutines/internal/Segment;I)V", "Lkotlinx/coroutines/CompletionHandler;", "(Lkotlin/jvm/functions/Function1;)V", "detachChild$kotlinx_coroutines_core", "detachChild", "idempotent", "tryResume", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "exception", "tryResumeWithException", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "completeResume", "Lkotlinx/coroutines/CoroutineDispatcher;", "resumeUndispatched", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Throwable;)V", "state", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "getSuccessfulResult", "getExceptionalResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "getExceptionalResult", "", "toString", "()Ljava/lang/String;", "nameString", "a", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/CoroutineContext;", "b", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "getState$kotlinx_coroutines_core", "isActive", "isCompleted", "isCancelled", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Lkotlinx/atomicfu/AtomicInt;", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/DisposableHandle;", "_parentHandle", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@PublishedApi
@SourceDebugExtension({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImplKt\n+ 4 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,662:1\n230#1,2:666\n232#1,8:669\n230#1,10:677\n230#1,10:688\n1#2:663\n24#3:664\n24#3:665\n22#3:687\n21#3:698\n22#3,3:699\n21#3:702\n22#3,3:703\n22#3:711\n21#3,4:712\n22#4:668\n13#4:710\n61#5,2:706\n61#5,2:708\n61#5,2:716\n*S KotlinDebug\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n*L\n246#1:666,2\n246#1:669,8\n249#1:677,10\n254#1:688,10\n72#1:664\n158#1:665\n252#1:687\n277#1:698\n278#1:699,3\n287#1:702\n288#1:703,3\n389#1:711\n392#1:712,4\n246#1:668\n350#1:710\n329#1:706,2\n339#1:708,2\n613#1:716,2\n*E\n"})
public class CancellableContinuationImpl extends DispatchedTask implements CoroutineStackFrame, CancellableContinuation, Waiter {
    @Volatile
    private volatile int _decisionAndIndex;
    @Volatile
    @Nullable
    private volatile Object _parentHandle;
    @Volatile
    @Nullable
    private volatile Object _state;
    public final Continuation a;
    public final CoroutineContext b;
    public static final AtomicIntegerFieldUpdater c;
    public static final AtomicReferenceFieldUpdater d;
    public static final AtomicReferenceFieldUpdater e;

    static {
        CancellableContinuationImpl.c = AtomicIntegerFieldUpdater.newUpdater(CancellableContinuationImpl.class, "_decisionAndIndex");
        CancellableContinuationImpl.d = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_state");
        CancellableContinuationImpl.e = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_parentHandle");
    }

    public CancellableContinuationImpl(@NotNull Continuation continuation0, int v) {
        super(v);
        this.a = continuation0;
        this.b = continuation0.getContext();
        this._decisionAndIndex = 0x1FFFFFFF;
        this._state = a.a;
    }

    public final void a(Segment segment0, Throwable throwable0) {
        int v = CancellableContinuationImpl.c.get(this);
        if((v & 0x1FFFFFFF) == 0x1FFFFFFF) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            segment0.onCancellation(v & 0x1FFFFFFF, throwable0, this.getContext());
        }
        catch(Throwable throwable1) {
            CoroutineExceptionHandlerKt.handleCoroutineException(this.getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, throwable1));
        }
    }

    public final void b(int v) {
    alab1:
        while(true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = CancellableContinuationImpl.c;
            int v1 = atomicIntegerFieldUpdater0.get(this);
            switch(v1 >> 29) {
                case 0: {
                    if(!atomicIntegerFieldUpdater0.compareAndSet(this, v1, 0x40000000 + (0x1FFFFFFF & v1))) {
                        break;
                    }
                    break alab1;
                }
                case 1: {
                    DispatchedTaskKt.dispatch(this, v);
                    return;
                }
                default: {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    public final DisposableHandle c() {
        Element coroutineContext$Element0 = this.getContext().get(Job.Key);
        if(((Job)coroutineContext$Element0) == null) {
            return null;
        }
        DisposableHandle disposableHandle0 = DefaultImpls.invokeOnCompletion$default(((Job)coroutineContext$Element0), true, false, new ChildContinuation(this), 2, null);
        while(!CancellableContinuationImpl.e.compareAndSet(this, null, disposableHandle0) && CancellableContinuationImpl.e.get(this) == null) {
        }
        return disposableHandle0;
    }

    public final void callCancelHandler(@NotNull CancelHandler cancelHandler0, @Nullable Throwable throwable0) {
        try {
            cancelHandler0.invoke(throwable0);
        }
        catch(Throwable throwable1) {
            CoroutineExceptionHandlerKt.handleCoroutineException(this.getContext(), new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, throwable1));
        }
    }

    public final void callOnCancellation(@NotNull Function1 function10, @NotNull Throwable throwable0) {
        try {
            function10.invoke(throwable0);
        }
        catch(Throwable throwable1) {
            CoroutineExceptionHandlerKt.handleCoroutineException(this.getContext(), new CompletionHandlerException("Exception in resume onCancellation handler for " + this, throwable1));
        }
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    public boolean cancel(@Nullable Throwable throwable0) {
        while(true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = CancellableContinuationImpl.d;
            Object object0 = atomicReferenceFieldUpdater0.get(this);
            boolean z = false;
            if(!(object0 instanceof NotCompleted)) {
                return false;
            }
            if(object0 instanceof CancelHandler || object0 instanceof Segment) {
                z = true;
            }
            CancelledContinuation cancelledContinuation0 = new CancelledContinuation(this, throwable0, z);
            do {
                if(atomicReferenceFieldUpdater0.compareAndSet(this, object0, cancelledContinuation0)) {
                    if(((NotCompleted)object0) instanceof CancelHandler) {
                        this.callCancelHandler(((CancelHandler)object0), throwable0);
                    }
                    else if(((NotCompleted)object0) instanceof Segment) {
                        this.a(((Segment)object0), throwable0);
                    }
                    if(!this.e()) {
                        this.detachChild$kotlinx_coroutines_core();
                    }
                    this.b(this.resumeMode);
                    return true;
                }
            }
            while(atomicReferenceFieldUpdater0.get(this) == object0);
        }
    }

    @Override  // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(@Nullable Object object0, @NotNull Throwable throwable0) {
        while(true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = CancellableContinuationImpl.d;
            Object object1 = atomicReferenceFieldUpdater0.get(this);
            if(object1 instanceof NotCompleted) {
                break;
            }
            if(object1 instanceof CompletedExceptionally) {
                return;
            }
            if(object1 instanceof k) {
                if(((k)object1).e != null) {
                    throw new IllegalStateException("Must be called at most once");
                }
                k k0 = k.a(((k)object1), null, throwable0, 15);
                do {
                    if(atomicReferenceFieldUpdater0.compareAndSet(this, object1, k0)) {
                        CancelHandler cancelHandler0 = ((k)object1).b;
                        if(cancelHandler0 != null) {
                            this.callCancelHandler(cancelHandler0, throwable0);
                        }
                        Function1 function10 = ((k)object1).c;
                        if(function10 != null) {
                            this.callOnCancellation(function10, throwable0);
                        }
                        return;
                    }
                }
                while(atomicReferenceFieldUpdater0.get(this) == object1);
            }
            else {
                k k1 = new k(object1, null, null, null, throwable0, 14);
                do {
                    if(atomicReferenceFieldUpdater0.compareAndSet(this, object1, k1)) {
                        return;
                    }
                }
                while(atomicReferenceFieldUpdater0.get(this) == object1);
            }
        }
        throw new IllegalStateException("Not completed");
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    public void completeResume(@NotNull Object object0) {
        this.b(this.resumeMode);
    }

    public final void d(NotCompleted notCompleted0) {
        Object object0;
        while(true) {
            Throwable throwable0 = null;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = CancellableContinuationImpl.d;
            object0 = atomicReferenceFieldUpdater0.get(this);
            if(object0 instanceof a) {
                do {
                    if(atomicReferenceFieldUpdater0.compareAndSet(this, object0, notCompleted0)) {
                        return;
                    }
                }
                while(atomicReferenceFieldUpdater0.get(this) == object0);
            }
            else {
                if((object0 instanceof CancelHandler ? true : object0 instanceof Segment)) {
                    break;
                }
                if(object0 instanceof CompletedExceptionally) {
                    CompletedExceptionally completedExceptionally0 = (CompletedExceptionally)object0;
                    if(completedExceptionally0.makeHandled()) {
                        if(object0 instanceof CancelledContinuation) {
                            if(!(object0 instanceof CompletedExceptionally)) {
                                completedExceptionally0 = null;
                            }
                            if(completedExceptionally0 != null) {
                                throwable0 = completedExceptionally0.cause;
                            }
                            if(notCompleted0 instanceof CancelHandler) {
                                this.callCancelHandler(((CancelHandler)notCompleted0), throwable0);
                                return;
                            }
                            Intrinsics.checkNotNull(notCompleted0, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            this.a(((Segment)notCompleted0), throwable0);
                        }
                        return;
                    }
                    CancellableContinuationImpl.f(notCompleted0, object0);
                    throw null;
                }
                if(object0 instanceof k) {
                    if(((k)object0).b == null) {
                        if(notCompleted0 instanceof Segment) {
                            return;
                        }
                        Intrinsics.checkNotNull(notCompleted0, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        Throwable throwable1 = ((k)object0).e;
                        if(throwable1 != null) {
                            this.callCancelHandler(((CancelHandler)notCompleted0), throwable1);
                            return;
                        }
                        k k0 = k.a(((k)object0), ((CancelHandler)notCompleted0), null, 29);
                        do {
                            if(atomicReferenceFieldUpdater0.compareAndSet(this, object0, k0)) {
                                return;
                            }
                        }
                        while(atomicReferenceFieldUpdater0.get(this) == object0);
                        continue;
                    }
                    CancellableContinuationImpl.f(notCompleted0, object0);
                    throw null;
                }
                if(notCompleted0 instanceof Segment) {
                    return;
                }
                Intrinsics.checkNotNull(notCompleted0, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                k k1 = new k(object0, ((CancelHandler)notCompleted0), null, null, null, 28);
                do {
                    if(atomicReferenceFieldUpdater0.compareAndSet(this, object0, k1)) {
                        return;
                    }
                }
                while(atomicReferenceFieldUpdater0.get(this) == object0);
            }
        }
        CancellableContinuationImpl.f(notCompleted0, object0);
        throw null;
    }

    public final void detachChild$kotlinx_coroutines_core() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = CancellableContinuationImpl.e;
        DisposableHandle disposableHandle0 = (DisposableHandle)atomicReferenceFieldUpdater0.get(this);
        if(disposableHandle0 == null) {
            return;
        }
        disposableHandle0.dispose();
        atomicReferenceFieldUpdater0.set(this, NonDisposableHandle.INSTANCE);
    }

    public final boolean e() {
        if(DispatchedTaskKt.isReusableMode(this.resumeMode)) {
            Intrinsics.checkNotNull(this.a, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            return ((DispatchedContinuation)this.a).isReusable$kotlinx_coroutines_core();
        }
        return false;
    }

    public static void f(NotCompleted notCompleted0, Object object0) {
        throw new IllegalStateException(("It\'s prohibited to register multiple handlers, tried to register " + notCompleted0 + ", already has " + object0).toString());
    }

    public final void g(int v, Object object0, Function1 function10) {
        Object object1;
        while(true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = CancellableContinuationImpl.d;
            object1 = atomicReferenceFieldUpdater0.get(this);
            if(!(object1 instanceof NotCompleted)) {
                break;
            }
            Object object2 = CancellableContinuationImpl.h(((NotCompleted)object1), object0, v, function10, null);
            do {
                if(atomicReferenceFieldUpdater0.compareAndSet(this, object1, object2)) {
                    if(!this.e()) {
                        this.detachChild$kotlinx_coroutines_core();
                    }
                    this.b(v);
                    return;
                }
            }
            while(atomicReferenceFieldUpdater0.get(this) == object1);
        }
        if(!(object1 instanceof CancelledContinuation) || !((CancelledContinuation)object1).makeResumed()) {
            throw new IllegalStateException(("Already resumed, but proposed with update " + object0).toString());
        }
        if(function10 != null) {
            this.callOnCancellation(function10, ((CancelledContinuation)object1).cause);
        }
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        return this.a instanceof CoroutineStackFrame ? ((CoroutineStackFrame)this.a) : null;
    }

    @Override  // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return this.b;
    }

    @NotNull
    public Throwable getContinuationCancellationCause(@NotNull Job job0) {
        return job0.getCancellationException();
    }

    @Override  // kotlinx.coroutines.DispatchedTask
    @NotNull
    public final Continuation getDelegate$kotlinx_coroutines_core() {
        return this.a;
    }

    @Override  // kotlinx.coroutines.DispatchedTask
    @Nullable
    public Throwable getExceptionalResult$kotlinx_coroutines_core(@Nullable Object object0) {
        Throwable throwable0 = super.getExceptionalResult$kotlinx_coroutines_core(object0);
        return throwable0 == null ? null : throwable0;
    }

    @PublishedApi
    @Nullable
    public final Object getResult() {
        boolean z = this.e();
    alab1:
        while(true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = CancellableContinuationImpl.c;
            int v = atomicIntegerFieldUpdater0.get(this);
            switch(v >> 29) {
                case 0: {
                    if(!atomicIntegerFieldUpdater0.compareAndSet(this, v, 0x20000000 + (0x1FFFFFFF & v))) {
                        break;
                    }
                    break alab1;
                }
                case 2: {
                    if(z) {
                        this.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                    }
                    Object object0 = this.getState$kotlinx_coroutines_core();
                    if(object0 instanceof CompletedExceptionally) {
                        throw ((CompletedExceptionally)object0).cause;
                    }
                    if(DispatchedTaskKt.isCancellableMode(this.resumeMode)) {
                        Job job0 = (Job)this.getContext().get(Job.Key);
                        if(job0 != null && !job0.isActive()) {
                            CancellationException cancellationException0 = job0.getCancellationException();
                            this.cancelCompletedResult$kotlinx_coroutines_core(object0, cancellationException0);
                            throw cancellationException0;
                        }
                    }
                    return this.getSuccessfulResult$kotlinx_coroutines_core(object0);
                }
                default: {
                    throw new IllegalStateException("Already suspended");
                }
            }
        }
        if(((DisposableHandle)CancellableContinuationImpl.e.get(this)) == null) {
            this.c();
        }
        if(z) {
            this.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
        }
        return qd.a.getCOROUTINE_SUSPENDED();
    }

    @Override  // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Nullable
    public final Object getState$kotlinx_coroutines_core() {
        return CancellableContinuationImpl.d.get(this);
    }

    // 去混淆评级： 低(20)
    @Override  // kotlinx.coroutines.DispatchedTask
    public Object getSuccessfulResult$kotlinx_coroutines_core(@Nullable Object object0) {
        return object0 instanceof k ? ((k)object0).a : object0;
    }

    public static Object h(NotCompleted notCompleted0, Object object0, int v, Function1 function10, Object object1) {
        if(!(object0 instanceof CompletedExceptionally) && (DispatchedTaskKt.isCancellableMode(v) || object1 != null) && (function10 != null || notCompleted0 instanceof CancelHandler || object1 != null)) {
            return notCompleted0 instanceof CancelHandler ? new k(object0, ((CancelHandler)notCompleted0), function10, object1, null, 16) : new k(object0, null, function10, object1, null, 16);
        }
        return object0;
    }

    public final Symbol i(Object object0, Object object1, Function1 function10) {
        Object object2;
        while(true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = CancellableContinuationImpl.d;
            object2 = atomicReferenceFieldUpdater0.get(this);
            if(!(object2 instanceof NotCompleted)) {
                break;
            }
            Object object3 = CancellableContinuationImpl.h(((NotCompleted)object2), object0, this.resumeMode, function10, object1);
            do {
                if(atomicReferenceFieldUpdater0.compareAndSet(this, object2, object3)) {
                    if(!this.e()) {
                        this.detachChild$kotlinx_coroutines_core();
                    }
                    return CancellableContinuationImplKt.RESUME_TOKEN;
                }
            }
            while(atomicReferenceFieldUpdater0.get(this) == object2);
        }
        return !(object2 instanceof k) || object1 == null || ((k)object2).d != object1 ? null : CancellableContinuationImplKt.RESUME_TOKEN;
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    public void initCancellability() {
        DisposableHandle disposableHandle0 = this.c();
        if(disposableHandle0 == null) {
            return;
        }
        if(this.isCompleted()) {
            disposableHandle0.dispose();
            CancellableContinuationImpl.e.set(this, NonDisposableHandle.INSTANCE);
        }
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    public void invokeOnCancellation(@NotNull Function1 function10) {
        CancelHandler cancelHandler0 = function10 instanceof CancelHandler ? ((CancelHandler)function10) : new h(function10, 2);
        this.d(cancelHandler0);
    }

    @Override  // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(@NotNull Segment segment0, int v) {
        while(true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = CancellableContinuationImpl.c;
            int v1 = atomicIntegerFieldUpdater0.get(this);
            if((v1 & 0x1FFFFFFF) != 0x1FFFFFFF) {
                break;
            }
            if(atomicIntegerFieldUpdater0.compareAndSet(this, v1, (v1 >> 29 << 29) + v)) {
                this.d(segment0);
                return;
            }
        }
        throw new IllegalStateException("invokeOnCancellation should be called at most once");
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    public boolean isActive() {
        return this.getState$kotlinx_coroutines_core() instanceof NotCompleted;
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    public boolean isCancelled() {
        return this.getState$kotlinx_coroutines_core() instanceof CancelledContinuation;
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    public boolean isCompleted() {
        return !(this.getState$kotlinx_coroutines_core() instanceof NotCompleted);
    }

    @NotNull
    public String nameString() [...] // 潜在的解密器

    public final void parentCancelled$kotlinx_coroutines_core(@NotNull Throwable throwable0) {
        boolean z;
        if(this.e()) {
            Intrinsics.checkNotNull(this.a, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            z = ((DispatchedContinuation)this.a).postponeCancellation$kotlinx_coroutines_core(throwable0);
        }
        else {
            z = false;
        }
        if(z) {
            return;
        }
        this.cancel(throwable0);
        if(!this.e()) {
            this.detachChild$kotlinx_coroutines_core();
        }
    }

    public final void releaseClaimedReusableContinuation$kotlinx_coroutines_core() {
        DispatchedContinuation dispatchedContinuation0 = this.a instanceof DispatchedContinuation ? ((DispatchedContinuation)this.a) : null;
        if(dispatchedContinuation0 != null) {
            Throwable throwable0 = dispatchedContinuation0.tryReleaseClaimedContinuation$kotlinx_coroutines_core(this);
            if(throwable0 != null) {
                this.detachChild$kotlinx_coroutines_core();
                this.cancel(throwable0);
            }
        }
    }

    @JvmName(name = "resetStateReusable")
    public final boolean resetStateReusable() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = CancellableContinuationImpl.d;
        Object object0 = atomicReferenceFieldUpdater0.get(this);
        if(object0 instanceof k && ((k)object0).d != null) {
            this.detachChild$kotlinx_coroutines_core();
            return false;
        }
        CancellableContinuationImpl.c.set(this, 0x1FFFFFFF);
        atomicReferenceFieldUpdater0.set(this, a.a);
        return true;
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    public void resume(Object object0, @Nullable Function1 function10) {
        this.g(this.resumeMode, object0, function10);
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatched(@NotNull CoroutineDispatcher coroutineDispatcher0, Object object0) {
        DispatchedContinuation dispatchedContinuation0 = this.a instanceof DispatchedContinuation ? ((DispatchedContinuation)this.a) : null;
        this.g(((dispatchedContinuation0 == null ? null : dispatchedContinuation0.dispatcher) == coroutineDispatcher0 ? 4 : this.resumeMode), object0, null);
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatchedWithException(@NotNull CoroutineDispatcher coroutineDispatcher0, @NotNull Throwable throwable0) {
        DispatchedContinuation dispatchedContinuation0 = this.a instanceof DispatchedContinuation ? ((DispatchedContinuation)this.a) : null;
        CompletedExceptionally completedExceptionally0 = new CompletedExceptionally(throwable0, false, 2, null);
        this.g(((dispatchedContinuation0 == null ? null : dispatchedContinuation0.dispatcher) == coroutineDispatcher0 ? 4 : this.resumeMode), completedExceptionally0, null);
    }

    @Override  // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object object0) {
        Object object1 = CompletionStateKt.toState(object0, this);
        this.g(this.resumeMode, object1, null);
    }

    @Override  // kotlinx.coroutines.DispatchedTask
    @Nullable
    public Object takeState$kotlinx_coroutines_core() {
        return this.getState$kotlinx_coroutines_core();
    }

    @Override
    @NotNull
    public String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("CancellableContinuation");
        stringBuilder0.append('(');
        stringBuilder0.append(DebugStringsKt.toDebugString(this.a));
        stringBuilder0.append("){");
        Object object0 = this.getState$kotlinx_coroutines_core();
        if(object0 instanceof NotCompleted) {
            s = "Active";
        }
        else {
            s = object0 instanceof CancelledContinuation ? "Cancelled" : "Completed";
        }
        stringBuilder0.append(s);
        stringBuilder0.append("}@");
        stringBuilder0.append(DebugStringsKt.getHexAddress(this));
        return stringBuilder0.toString();
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    @Nullable
    public Object tryResume(Object object0, @Nullable Object object1) {
        return this.i(object0, object1, null);
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    @Nullable
    public Object tryResume(Object object0, @Nullable Object object1, @Nullable Function1 function10) {
        return this.i(object0, object1, function10);
    }

    @Override  // kotlinx.coroutines.CancellableContinuation
    @Nullable
    public Object tryResumeWithException(@NotNull Throwable throwable0) {
        return this.i(new CompletedExceptionally(throwable0, false, 2, null), null, null);
    }
}

