package kotlin.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result.Failure;
import kotlin.SinceKotlin;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B!\b\u0000\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0011\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001D\u0010\r\u001A\u00020\f2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0011\u0010\u000F\u001A\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0011\u0010\u0012\u001A\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000B\u001A\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\u000B\u0010\u0017R\u0014\u0010\u001B\u001A\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u001AR\u0016\u0010\u001E\u001A\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001C\u0010\u001D¨\u0006\u001F"}, d2 = {"Lkotlin/coroutines/SafeContinuation;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "delegate", "", "initialResult", "<init>", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "(Lkotlin/coroutines/Continuation;)V", "Lkotlin/Result;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "getOrThrow", "()Ljava/lang/Object;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@PublishedApi
@SinceKotlin(version = "1.3")
public final class SafeContinuation implements Continuation, CoroutineStackFrame {
    public final Continuation a;
    public static final AtomicReferenceFieldUpdater b;
    @Nullable
    private volatile Object result;

    static {
        SafeContinuation.b = AtomicReferenceFieldUpdater.newUpdater(SafeContinuation.class, Object.class, "result");
    }

    @PublishedApi
    public SafeContinuation(@NotNull Continuation continuation0) {
        Intrinsics.checkNotNullParameter(continuation0, "delegate");
        this(continuation0, CoroutineSingletons.UNDECIDED);
    }

    public SafeContinuation(@NotNull Continuation continuation0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(continuation0, "delegate");
        super();
        this.a = continuation0;
        this.result = object0;
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
        return this.a.getContext();
    }

    @PublishedApi
    @Nullable
    public final Object getOrThrow() {
        Object object0 = this.result;
        CoroutineSingletons coroutineSingletons0 = CoroutineSingletons.UNDECIDED;
        if(object0 == coroutineSingletons0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = SafeContinuation.b;
            Object object1 = a.getCOROUTINE_SUSPENDED();
            do {
                if(atomicReferenceFieldUpdater0.compareAndSet(this, coroutineSingletons0, object1)) {
                    return a.getCOROUTINE_SUSPENDED();
                }
            }
            while(atomicReferenceFieldUpdater0.get(this) == coroutineSingletons0);
            object0 = this.result;
        }
        if(object0 == CoroutineSingletons.RESUMED) {
            return a.getCOROUTINE_SUSPENDED();
        }
        if(object0 instanceof Failure) {
            throw ((Failure)object0).exception;
        }
        return object0;
    }

    @Override  // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override  // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object object0) {
        while(true) {
            Object object1 = this.result;
            CoroutineSingletons coroutineSingletons0 = CoroutineSingletons.UNDECIDED;
            if(object1 == coroutineSingletons0) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = SafeContinuation.b;
                do {
                    if(atomicReferenceFieldUpdater0.compareAndSet(this, coroutineSingletons0, object0)) {
                        return;
                    }
                }
                while(atomicReferenceFieldUpdater0.get(this) == coroutineSingletons0);
            }
            else {
                if(object1 != a.getCOROUTINE_SUSPENDED()) {
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater1 = SafeContinuation.b;
                Object object2 = a.getCOROUTINE_SUSPENDED();
                CoroutineSingletons coroutineSingletons1 = CoroutineSingletons.RESUMED;
                do {
                    if(atomicReferenceFieldUpdater1.compareAndSet(this, object2, coroutineSingletons1)) {
                        this.a.resumeWith(object0);
                        return;
                    }
                }
                while(atomicReferenceFieldUpdater1.get(this) == object2);
            }
        }
        throw new IllegalStateException("Already resumed");
    }

    @Override
    @NotNull
    public String toString() {
        return "SafeContinuation for " + this.a;
    }
}

