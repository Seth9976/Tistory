package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.ScopeCoroutine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001F\b\u0000\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000E\u001A\u00020\u000B2\b\u0010\n\u001A\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000E\u0010\rJ\u0011\u0010\u0011\u001A\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u000F\u0010\u0010R\u000B\u0010\u0013\u001A\u00020\u00128\u0006X\u0087\u0004¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/DispatchedCoroutine;", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "", "state", "", "afterCompletion", "(Ljava/lang/Object;)V", "afterResume", "getResult$kotlinx_coroutines_core", "()Ljava/lang/Object;", "getResult", "Lkotlinx/atomicfu/AtomicInt;", "_decision", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@PublishedApi
public final class DispatchedCoroutine extends ScopeCoroutine {
    @JvmField
    @Volatile
    private volatile int _decision;
    public static final AtomicIntegerFieldUpdater d;

    static {
        DispatchedCoroutine.d = AtomicIntegerFieldUpdater.newUpdater(DispatchedCoroutine.class, "_decision");
    }

    public DispatchedCoroutine(@NotNull CoroutineContext coroutineContext0, @NotNull Continuation continuation0) {
        super(coroutineContext0, continuation0);
    }

    @Override  // kotlinx.coroutines.internal.ScopeCoroutine
    public void afterCompletion(@Nullable Object object0) {
        this.afterResume(object0);
    }

    @Override  // kotlinx.coroutines.internal.ScopeCoroutine
    public void afterResume(@Nullable Object object0) {
    alab1:
        while(true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = DispatchedCoroutine.d;
            switch(atomicIntegerFieldUpdater0.get(this)) {
                case 0: {
                    if(!atomicIntegerFieldUpdater0.compareAndSet(this, 0, 2)) {
                        break;
                    }
                    break alab1;
                }
                case 1: {
                    DispatchedContinuationKt.resumeCancellableWith$default(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this.uCont), CompletionStateKt.recoverResult(object0, this.uCont), null, 2, null);
                    return;
                }
                default: {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    @Nullable
    public final Object getResult$kotlinx_coroutines_core() {
    alab1:
        while(true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = DispatchedCoroutine.d;
            switch(atomicIntegerFieldUpdater0.get(this)) {
                case 0: {
                    if(!atomicIntegerFieldUpdater0.compareAndSet(this, 0, 1)) {
                        break;
                    }
                    break alab1;
                }
                case 2: {
                    Object object0 = JobSupportKt.unboxState(this.getState$kotlinx_coroutines_core());
                    if(object0 instanceof CompletedExceptionally) {
                        throw ((CompletedExceptionally)object0).cause;
                    }
                    return object0;
                }
                default: {
                    throw new IllegalStateException("Already suspended");
                }
            }
        }
        return a.getCOROUTINE_SUSPENDED();
    }

    @NotNull
    public static final AtomicIntegerFieldUpdater get_decision$FU() {
        return DispatchedCoroutine.d;
    }
}

