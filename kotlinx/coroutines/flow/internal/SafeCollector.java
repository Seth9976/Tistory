package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.k;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001D\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\"\u0010\u0010\u001A\u00020\u000E2\u000E\u0010\u000F\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000E0\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001B\u0010\u0016\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001A\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001A\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\u001B\u001A\u00020\u001A8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001B\u0010\u001CR\u0016\u0010\u001F\u001A\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u001ER\u0014\u0010\"\u001A\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "collector", "Lkotlin/coroutines/CoroutineContext;", "collectContext", "<init>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "releaseIntercepted", "()V", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/CoroutineContext;", "", "collectContextSize", "I", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSafeCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.kt\nkotlinx/coroutines/flow/internal/SafeCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n1#2:157\n*E\n"})
public final class SafeCollector extends ContinuationImpl implements CoroutineStackFrame, FlowCollector {
    @JvmField
    @NotNull
    public final CoroutineContext collectContext;
    @JvmField
    public final int collectContextSize;
    @JvmField
    @NotNull
    public final FlowCollector collector;
    public CoroutineContext o;
    public Continuation p;

    public SafeCollector(@NotNull FlowCollector flowCollector0, @NotNull CoroutineContext coroutineContext0) {
        super(x.a, EmptyCoroutineContext.INSTANCE);
        this.collector = flowCollector0;
        this.collectContext = coroutineContext0;
        this.collectContextSize = ((Number)coroutineContext0.fold(0, y.w)).intValue();
    }

    public final Object a(Continuation continuation0, Object object0) {
        CoroutineContext coroutineContext0 = continuation0.getContext();
        JobKt.ensureActive(coroutineContext0);
        CoroutineContext coroutineContext1 = this.o;
        if(coroutineContext1 != coroutineContext0) {
            if(coroutineContext1 instanceof DownstreamExceptionContext) {
                throw new IllegalStateException(k.trimIndent(("\n            Flow exception transparency is violated:\n                Previous \'emit\' call has thrown exception " + ((DownstreamExceptionContext)coroutineContext1).e + ", but then emission attempt of value \'" + object0 + "\' has been detected.\n                Emissions from \'catch\' blocks are prohibited in order to avoid unspecified behaviour, \'Flow.catch\' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ")).toString());
            }
            SafeCollector_commonKt.checkContext(this, coroutineContext0);
            this.o = coroutineContext0;
        }
        this.p = continuation0;
        Intrinsics.checkNotNull(this.collector, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object object1 = SafeCollectorKt.access$getEmitFun$p().invoke(this.collector, object0, this);
        if(!Intrinsics.areEqual(object1, a.getCOROUTINE_SUSPENDED())) {
            this.p = null;
        }
        return object1;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public Object emit(Object object0, @NotNull Continuation continuation0) {
        Object object1;
        try {
            object1 = this.a(continuation0, object0);
        }
        catch(Throwable throwable0) {
            this.o = new DownstreamExceptionContext(throwable0, continuation0.getContext());
            throw throwable0;
        }
        if(object1 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        return this.p instanceof CoroutineStackFrame ? ((CoroutineStackFrame)this.p) : null;
    }

    @Override  // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext0 = this.o;
        return coroutineContext0 == null ? EmptyCoroutineContext.INSTANCE : coroutineContext0;
    }

    @Override  // kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public Object invokeSuspend(@NotNull Object object0) {
        Throwable throwable0 = Result.exceptionOrNull-impl(object0);
        if(throwable0 != null) {
            this.o = new DownstreamExceptionContext(throwable0, this.getContext());
        }
        Continuation continuation0 = this.p;
        if(continuation0 != null) {
            continuation0.resumeWith(object0);
        }
        return a.getCOROUTINE_SUSPENDED();
    }

    @Override  // kotlin.coroutines.jvm.internal.ContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}

