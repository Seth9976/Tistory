package xf;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.k;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.CancellableFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.SubscribedFlowCollector;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.Nullable;
import qd.a;

public final class v2 extends AbstractSharedFlow implements CancellableFlow, MutableStateFlow, FusibleFlow {
    @Volatile
    @Nullable
    private volatile Object _state;
    public int e;
    public static final AtomicReferenceFieldUpdater f;

    static {
        v2.f = AtomicReferenceFieldUpdater.newUpdater(v2.class, Object.class, "_state");
    }

    public v2(Object object0) {
        this._state = object0;
    }

    public final boolean a(Object object0, Object object1) {
        int v4;
        AbstractSharedFlowSlot[] arr_abstractSharedFlowSlot;
        int v1;
        int v;
        synchronized(this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = v2.f;
            Object object2 = atomicReferenceFieldUpdater0.get(this);
            if(object0 == null || Intrinsics.areEqual(object2, object0)) {
                if(!Intrinsics.areEqual(object2, object1)) {
                    atomicReferenceFieldUpdater0.set(this, object1);
                    v = this.e;
                    if((v & 1) == 0) {
                        v1 = v + 1;
                        this.e = v1;
                        arr_abstractSharedFlowSlot = this.getSlots();
                        goto label_11;
                    }
                    this.e = v + 2;
                    return true;
                }
                return true;
            }
            return false;
        }
    label_11:
        while(true) {
            w2[] arr_w2 = (w2[])arr_abstractSharedFlowSlot;
            if(arr_w2 != null) {
                int v2 = arr_w2.length;
                int v3 = 0;
                while(v3 < v2) {
                    w2 w20 = arr_w2[v3];
                    if(w20 != null) {
                    alab1:
                        while(true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater1 = w2.a;
                            Object object3 = atomicReferenceFieldUpdater1.get(w20);
                            if(object3 == null || object3 == StateFlowKt.b) {
                                break;
                            }
                            if(object3 == StateFlowKt.a) {
                                Symbol symbol0 = StateFlowKt.b;
                                while(true) {
                                    if(atomicReferenceFieldUpdater1.compareAndSet(w20, object3, symbol0)) {
                                        break alab1;
                                    }
                                    if(atomicReferenceFieldUpdater1.get(w20) == object3) {
                                        continue;
                                    }
                                    continue alab1;
                                }
                            }
                            Symbol symbol1 = StateFlowKt.a;
                        label_28:
                            if(atomicReferenceFieldUpdater1.compareAndSet(w20, object3, symbol1)) {
                                ((CancellableContinuationImpl)object3).resumeWith(Unit.INSTANCE);
                            }
                            else {
                                if(atomicReferenceFieldUpdater1.get(w20) != object3) {
                                    continue;
                                }
                                if(false) {
                                    break;
                                }
                                goto label_28;
                            }
                            break;
                        }
                    }
                    ++v3;
                }
            }
            synchronized(this) {
                v4 = this.e;
                if(v4 == v1) {
                    break;
                }
            }
            arr_abstractSharedFlowSlot = this.getSlots();
            v1 = v4;
        }
        this.e = v1 + 1;
        return true;
    }

    @Override  // kotlinx.coroutines.flow.Flow, kotlinx.coroutines.flow.SharedFlow
    public final Object collect(FlowCollector flowCollector0, Continuation continuation0) {
        w2 w21;
        v2 v20;
        Object object1;
        Object object0;
        u2 u20;
        if(continuation0 instanceof u2) {
            u20 = (u2)continuation0;
            int v = u20.v;
            if((v & 0x80000000) == 0) {
                u20 = new u2(this, continuation0);
            }
            else {
                u20.v = v ^ 0x80000000;
            }
        }
        else {
            u20 = new u2(this, continuation0);
        }
        try {
            object0 = u20.t;
            object1 = a.getCOROUTINE_SUSPENDED();
            switch(u20.v) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_29;
                }
                case 2: {
                    goto label_37;
                }
                case 3: {
                    goto label_44;
                }
            }
        }
        catch(Throwable throwable0) {
            v20.freeSlot(w21);
            throw throwable0;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ResultKt.throwOnFailure(object0);
        w2 w20 = (w2)this.allocateSlot();
        try {
            if(flowCollector0 instanceof SubscribedFlowCollector) {
                u20.o = this;
                u20.p = flowCollector0;
                u20.q = w20;
                u20.v = 1;
                if(((SubscribedFlowCollector)flowCollector0).onSubscription(u20) == object1) {
                    return object1;
                }
            }
            v20 = this;
            w21 = w20;
            goto label_33;
        }
        catch(Throwable throwable0) {
            v20 = this;
            w21 = w20;
            v20.freeSlot(w21);
            throw throwable0;
        }
        try {
        label_29:
            w21 = u20.q;
            flowCollector0 = u20.p;
            v20 = u20.o;
            ResultKt.throwOnFailure(object0);
        label_33:
            FlowCollector flowCollector1 = flowCollector0;
            Job job0 = (Job)u20.getContext().get(Job.Key);
            Object object2 = null;
            goto label_50;
        label_37:
            object2 = u20.s;
            job0 = u20.r;
            w21 = u20.q;
            flowCollector1 = u20.p;
            v20 = u20.o;
            ResultKt.throwOnFailure(object0);
            goto label_63;
        label_44:
            object2 = u20.s;
            job0 = u20.r;
            w21 = u20.q;
            flowCollector1 = u20.p;
            v20 = u20.o;
            ResultKt.throwOnFailure(object0);
            do {
                do {
                label_50:
                    Object object3 = v2.f.get(v20);
                    if(job0 != null) {
                        JobKt.ensureActive(job0);
                    }
                    if(object2 == null || !Intrinsics.areEqual(object2, object3)) {
                        u20.o = v20;
                        u20.p = flowCollector1;
                        u20.q = w21;
                        u20.r = job0;
                        u20.s = object3;
                        u20.v = 2;
                        if(flowCollector1.emit((object3 == NullSurrogateKt.NULL ? null : object3), u20) == object1) {
                            return object1;
                        }
                        object2 = object3;
                    }
                label_63:
                    w21.getClass();
                    Object object4 = w2.a.getAndSet(w21, StateFlowKt.a);
                    Intrinsics.checkNotNull(object4);
                }
                while(object4 == StateFlowKt.b);
                u20.o = v20;
                u20.p = flowCollector1;
                u20.q = w21;
                u20.r = job0;
                u20.s = object2;
                u20.v = 3;
            }
            while(w21.a(u20) != object1);
            return object1;
        }
        catch(Throwable throwable0) {
        }
        v20.freeSlot(w21);
        throw throwable0;
    }

    @Override  // kotlinx.coroutines.flow.MutableStateFlow
    public final boolean compareAndSet(Object object0, Object object1) {
        if(object0 == null) {
            object0 = NullSurrogateKt.NULL;
        }
        if(object1 == null) {
            object1 = NullSurrogateKt.NULL;
        }
        return this.a(object0, object1);
    }

    @Override  // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public final AbstractSharedFlowSlot createSlot() {
        return new w2();  // 初始化器: Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;-><init>()V
    }

    @Override  // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public final AbstractSharedFlowSlot[] createSlotArray(int v) {
        return new w2[v];
    }

    @Override  // kotlinx.coroutines.flow.MutableSharedFlow
    public final Object emit(Object object0, Continuation continuation0) {
        this.setValue(object0);
        return Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.flow.internal.FusibleFlow
    public final Flow fuse(CoroutineContext coroutineContext0, int v, BufferOverflow bufferOverflow0) {
        return StateFlowKt.fuseStateFlow(this, coroutineContext0, v, bufferOverflow0);
    }

    @Override  // kotlinx.coroutines.flow.SharedFlow
    public final List getReplayCache() {
        return k.listOf(this.getValue());
    }

    @Override  // kotlinx.coroutines.flow.MutableStateFlow
    public final Object getValue() {
        Object object0 = v2.f.get(this);
        return object0 == NullSurrogateKt.NULL ? null : object0;
    }

    @Override  // kotlinx.coroutines.flow.MutableSharedFlow
    public final void resetReplayCache() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override  // kotlinx.coroutines.flow.MutableStateFlow
    public final void setValue(Object object0) {
        if(object0 == null) {
            object0 = NullSurrogateKt.NULL;
        }
        this.a(null, object0);
    }

    @Override  // kotlinx.coroutines.flow.MutableSharedFlow
    public final boolean tryEmit(Object object0) {
        this.setValue(object0);
        return true;
    }
}

