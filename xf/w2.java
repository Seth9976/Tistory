package xf;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.Nullable;
import qd.a;

public final class w2 extends AbstractSharedFlowSlot {
    @Volatile
    @Nullable
    private volatile Object _state;
    public static final AtomicReferenceFieldUpdater a;

    static {
        w2.a = AtomicReferenceFieldUpdater.newUpdater(w2.class, Object.class, "_state");
    }

    public final Object a(u2 u20) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(u20), 1);
        cancellableContinuationImpl0.initCancellability();
        Symbol symbol0 = StateFlowKt.a;
        while(true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = w2.a;
            if(atomicReferenceFieldUpdater0.compareAndSet(this, symbol0, cancellableContinuationImpl0)) {
                break;
            }
            if(atomicReferenceFieldUpdater0.get(this) != symbol0) {
                cancellableContinuationImpl0.resumeWith(Unit.INSTANCE);
                break;
            }
        }
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(u20);
        }
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public final boolean allocateLocked(Object object0) {
        v2 v20 = (v2)object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = w2.a;
        if(atomicReferenceFieldUpdater0.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater0.set(this, StateFlowKt.a);
        return true;
    }

    @Override  // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public final Continuation[] freeLocked(Object object0) {
        v2 v20 = (v2)object0;
        w2.a.set(this, null);
        return AbstractSharedFlowKt.EMPTY_RESUMES;
    }
}

