package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import xf.m2;
import xf.n2;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u00019B\u001F\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0007\u0012\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001A\u00020\u00102\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000EH\u0096@\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00028\u0000H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u001B\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u0013\u001A\u00028\u0000H\u0096@\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001D\u001A\u00020\u001AH\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001CJ%\u0010#\u001A\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010 0\u001F2\u0006\u0010\u001E\u001A\u00020\u001AH\u0000\u00A2\u0006\u0004\b!\u0010\"J\u000F\u0010$\u001A\u00020\u0003H\u0014\u00A2\u0006\u0004\b$\u0010%J\u001F\u0010\'\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001F2\u0006\u0010&\u001A\u00020\u0007H\u0014\u00A2\u0006\u0004\b\'\u0010(J\u000F\u0010)\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b)\u0010*J-\u0010/\u001A\b\u0012\u0004\u0012\u00028\u00000.2\u0006\u0010,\u001A\u00020+2\u0006\u0010-\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b/\u00100R\u001A\u00104\u001A\b\u0012\u0004\u0012\u00028\u0000018VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b2\u00103R\u001A\u00108\u001A\u00028\u00008DX\u0084\u0004\u00A2\u0006\f\u0012\u0004\b7\u0010*\u001A\u0004\b5\u00106\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u0006:"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "", "replay", "bufferCapacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "", "tryEmit", "(Ljava/lang/Object;)Z", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "updateNewCollectorIndexLocked$kotlinx_coroutines_core", "()J", "updateNewCollectorIndexLocked", "oldIndex", "", "Lkotlin/coroutines/Continuation;", "updateCollectorIndexLocked$kotlinx_coroutines_core", "(J)[Lkotlin/coroutines/Continuation;", "updateCollectorIndexLocked", "createSlot", "()Lkotlinx/coroutines/flow/SharedFlowSlot;", "size", "createSlotArray", "(I)[Lkotlinx/coroutines/flow/SharedFlowSlot;", "resetReplayCache", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lkotlinx/coroutines/flow/Flow;", "fuse", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/Flow;", "", "getReplayCache", "()Ljava/util/List;", "replayCache", "getLastReplayedLocked", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "lastReplayedLocked", "xf/m2", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,731:1\n28#2,4:732\n28#2,4:738\n28#2,4:760\n28#2,4:767\n28#2,4:779\n28#2,4:793\n28#2,4:807\n20#3:736\n20#3:742\n20#3:764\n20#3:771\n20#3:783\n20#3:797\n20#3:811\n329#4:737\n1#5:743\n94#6,2:744\n96#6,2:747\n98#6:750\n94#6,2:772\n96#6,2:775\n98#6:778\n94#6,2:800\n96#6,2:803\n98#6:806\n13579#7:746\n13580#7:749\n13579#7:774\n13580#7:777\n13579#7:802\n13580#7:805\n314#8,9:751\n323#8,2:765\n314#8,9:784\n323#8,2:798\n*S KotlinDebug\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n*L\n351#1:732,4\n391#1:738,4\n485#1:760,4\n506#1:767,4\n626#1:779,4\n661#1:793,4\n689#1:807,4\n351#1:736\n391#1:742\n485#1:764\n506#1:771\n626#1:783\n661#1:797\n689#1:811\n373#1:737\n453#1:744,2\n453#1:747,2\n453#1:750\n529#1:772,2\n529#1:775,2\n529#1:778\n676#1:800,2\n676#1:803,2\n676#1:806\n453#1:746\n453#1:749\n529#1:774\n529#1:777\n676#1:802\n676#1:805\n483#1:751,9\n483#1:765,2\n660#1:784,9\n660#1:798,2\n*E\n"})
public class SharedFlowImpl extends AbstractSharedFlow implements CancellableFlow, MutableSharedFlow, FusibleFlow {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[BufferOverflow.values().length];
            try {
                arr_v[BufferOverflow.SUSPEND.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public final int e;
    public final int f;
    public final BufferOverflow g;
    public Object[] h;
    public long i;
    public long j;
    public int k;
    public int l;

    public SharedFlowImpl(int v, int v1, @NotNull BufferOverflow bufferOverflow0) {
        this.e = v;
        this.f = v1;
        this.g = bufferOverflow0;
    }

    public final Object a(SharedFlowSlot sharedFlowSlot0, Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        synchronized(this) {
            if(this.k(sharedFlowSlot0) < 0L) {
                sharedFlowSlot0.cont = cancellableContinuationImpl0;
            }
            else {
                cancellableContinuationImpl0.resumeWith(Unit.INSTANCE);
            }
        }
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static final Object access$awaitValue(SharedFlowImpl sharedFlowImpl0, SharedFlowSlot sharedFlowSlot0, Continuation continuation0) {
        return sharedFlowImpl0.a(sharedFlowSlot0, continuation0);
    }

    public static final void access$cancelEmitter(SharedFlowImpl sharedFlowImpl0, m2 m20) {
        synchronized(sharedFlowImpl0) {
            if(m20.b < sharedFlowImpl0.h()) {
                return;
            }
            Object[] arr_object = sharedFlowImpl0.h;
            Intrinsics.checkNotNull(arr_object);
            if(SharedFlowKt.access$getBufferAt(arr_object, m20.b) != m20) {
                return;
            }
            SharedFlowKt.access$setBufferAt(arr_object, m20.b, SharedFlowKt.NO_VALUE);
            sharedFlowImpl0.b();
        }
    }

    public static final Object access$emitSuspend(SharedFlowImpl sharedFlowImpl0, Object object0, Continuation continuation0) {
        return sharedFlowImpl0.e(object0, continuation0);
    }

    public static final int access$getTotalSize(SharedFlowImpl sharedFlowImpl0) {
        return sharedFlowImpl0.k + sharedFlowImpl0.l;
    }

    public final void b() {
        if(this.f == 0 && this.l <= 1) {
            return;
        }
        Object[] arr_object = this.h;
        Intrinsics.checkNotNull(arr_object);
        while(this.l > 0 && SharedFlowKt.access$getBufferAt(arr_object, this.h() + ((long)(this.k + this.l)) - 1L) == SharedFlowKt.NO_VALUE) {
            --this.l;
            SharedFlowKt.access$setBufferAt(arr_object, this.h() + ((long)(this.k + this.l)), null);
        }
    }

    public static Object c(SharedFlowImpl sharedFlowImpl0, FlowCollector flowCollector0, Continuation continuation0) {
        SharedFlowImpl sharedFlowImpl2;
        Throwable throwable1;
        SharedFlowImpl sharedFlowImpl1;
        SharedFlowSlot sharedFlowSlot1;
        FlowCollector flowCollector1;
        n2 n20;
        if(continuation0 instanceof n2) {
            n20 = (n2)continuation0;
            int v = n20.u;
            if((v & 0x80000000) == 0) {
                n20 = new n2(sharedFlowImpl0, continuation0);
            }
            else {
                n20.u = v ^ 0x80000000;
            }
        }
        else {
            n20 = new n2(sharedFlowImpl0, continuation0);
        }
        Object object0 = n20.s;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(n20.u) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                SharedFlowSlot sharedFlowSlot0 = (SharedFlowSlot)sharedFlowImpl0.allocateSlot();
                try {
                    if(flowCollector0 instanceof SubscribedFlowCollector) {
                        n20.o = sharedFlowImpl0;
                        n20.p = flowCollector0;
                        n20.q = sharedFlowSlot0;
                        n20.u = 1;
                        if(((SubscribedFlowCollector)flowCollector0).onSubscription(n20) == object1) {
                            return object1;
                        }
                    }
                    flowCollector1 = flowCollector0;
                    sharedFlowSlot1 = sharedFlowSlot0;
                    goto label_40;
                }
                catch(Throwable throwable0) {
                    sharedFlowImpl1 = sharedFlowImpl0;
                    throwable1 = throwable0;
                    sharedFlowSlot1 = sharedFlowSlot0;
                    goto label_80;
                }
            }
            case 1: {
                try {
                    sharedFlowSlot1 = n20.q;
                    FlowCollector flowCollector2 = n20.p;
                    sharedFlowImpl2 = n20.o;
                    ResultKt.throwOnFailure(object0);
                    flowCollector1 = flowCollector2;
                    sharedFlowImpl0 = sharedFlowImpl2;
                }
                catch(Throwable throwable1) {
                    sharedFlowImpl1 = sharedFlowImpl2;
                    goto label_80;
                }
                try {
                label_40:
                    Job job0 = (Job)n20.getContext().get(Job.Key);
                    goto label_58;
                label_42:
                    Job job1 = n20.r;
                    sharedFlowSlot1 = n20.q;
                    FlowCollector flowCollector3 = n20.p;
                    sharedFlowImpl1 = n20.o;
                    goto label_51;
                label_47:
                    job1 = n20.r;
                    sharedFlowSlot1 = n20.q;
                    flowCollector3 = n20.p;
                    sharedFlowImpl1 = n20.o;
                    try {
                    label_51:
                        ResultKt.throwOnFailure(object0);
                        flowCollector1 = flowCollector3;
                        job0 = job1;
                        sharedFlowImpl0 = sharedFlowImpl1;
                    }
                    catch(Throwable throwable1) {
                        goto label_80;
                    }
                    do {
                        while(true) {
                        label_58:
                            Object object2 = sharedFlowImpl0.l(sharedFlowSlot1);
                            if(object2 != SharedFlowKt.NO_VALUE) {
                                break;
                            }
                            n20.o = sharedFlowImpl0;
                            n20.p = flowCollector1;
                            n20.q = sharedFlowSlot1;
                            n20.r = job0;
                            n20.u = 2;
                            if(sharedFlowImpl0.a(sharedFlowSlot1, n20) == object1) {
                                return object1;
                            }
                        }
                        if(job0 != null) {
                            JobKt.ensureActive(job0);
                        }
                        n20.o = sharedFlowImpl0;
                        n20.p = flowCollector1;
                        n20.q = sharedFlowSlot1;
                        n20.r = job0;
                        n20.u = 3;
                    }
                    while(flowCollector1.emit(object2, n20) != object1);
                    return object1;
                }
                catch(Throwable throwable2) {
                }
                break;
            }
            case 2: {
                goto label_42;
            }
            case 3: {
                goto label_47;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        sharedFlowImpl1 = sharedFlowImpl0;
        throwable1 = throwable2;
    label_80:
        sharedFlowImpl1.freeSlot(sharedFlowSlot1);
        throw throwable1;
    }

    @Override  // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    @Nullable
    public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
        return SharedFlowImpl.c(this, flowCollector0, continuation0);
    }

    @NotNull
    public SharedFlowSlot createSlot() {
        return new SharedFlowSlot();
    }

    @Override  // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public AbstractSharedFlowSlot createSlot() {
        return this.createSlot();
    }

    @NotNull
    public SharedFlowSlot[] createSlotArray(int v) {
        return new SharedFlowSlot[v];
    }

    @Override  // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public AbstractSharedFlowSlot[] createSlotArray(int v) {
        return this.createSlotArray(v);
    }

    public final void d() {
        Object[] arr_object = this.h;
        Intrinsics.checkNotNull(arr_object);
        SharedFlowKt.access$setBufferAt(arr_object, this.h(), null);
        --this.k;
        long v = this.h();
        if(this.i < v + 1L) {
            this.i = v + 1L;
        }
        if(this.j < v + 1L) {
            if(this.b != 0) {
                AbstractSharedFlowSlot[] arr_abstractSharedFlowSlot = this.a;
                if(arr_abstractSharedFlowSlot != null) {
                    for(int v1 = 0; v1 < arr_abstractSharedFlowSlot.length; ++v1) {
                        AbstractSharedFlowSlot abstractSharedFlowSlot0 = arr_abstractSharedFlowSlot[v1];
                        if(abstractSharedFlowSlot0 != null) {
                            long v2 = ((SharedFlowSlot)abstractSharedFlowSlot0).index;
                            if(v2 >= 0L && v2 < v + 1L) {
                                ((SharedFlowSlot)abstractSharedFlowSlot0).index = v + 1L;
                            }
                        }
                    }
                }
            }
            this.j = v + 1L;
        }
    }

    public final Object e(Object object0, Continuation continuation0) {
        m2 m20;
        Continuation[] arr_continuation1;
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        Continuation[] arr_continuation = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized(this) {
            if(this.j(object0)) {
                cancellableContinuationImpl0.resumeWith(Unit.INSTANCE);
                arr_continuation1 = this.g(arr_continuation);
                m20 = null;
            }
            else {
                m2 m21 = new m2(this, ((long)SharedFlowImpl.access$getTotalSize(this)) + this.h(), object0, cancellableContinuationImpl0);
                this.f(m21);
                ++this.l;
                if(this.f == 0) {
                    arr_continuation = this.g(arr_continuation);
                }
                arr_continuation1 = arr_continuation;
                m20 = m21;
            }
        }
        if(m20 != null) {
            CancellableContinuationKt.disposeOnCancellation(cancellableContinuationImpl0, m20);
        }
        for(int v1 = 0; v1 < arr_continuation1.length; ++v1) {
            Continuation continuation1 = arr_continuation1[v1];
            if(continuation1 != null) {
                continuation1.resumeWith(Unit.INSTANCE);
            }
        }
        Object object1 = cancellableContinuationImpl0.getResult();
        if(object1 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object1 == a.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.flow.MutableSharedFlow
    @Nullable
    public Object emit(Object object0, @NotNull Continuation continuation0) {
        if(this.tryEmit(object0)) {
            return Unit.INSTANCE;
        }
        Unit unit0 = this.e(object0, continuation0);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    public final void f(Object object0) {
        int v = this.k + this.l;
        Object[] arr_object = this.h;
        if(arr_object == null) {
            arr_object = this.i(0, 2, null);
        }
        else if(v >= arr_object.length) {
            arr_object = this.i(v, arr_object.length * 2, arr_object);
        }
        SharedFlowKt.access$setBufferAt(arr_object, this.h() + ((long)v), object0);
    }

    @Override  // kotlinx.coroutines.flow.internal.FusibleFlow
    @NotNull
    public Flow fuse(@NotNull CoroutineContext coroutineContext0, int v, @NotNull BufferOverflow bufferOverflow0) {
        return SharedFlowKt.fuseSharedFlow(this, coroutineContext0, v, bufferOverflow0);
    }

    public final Continuation[] g(Continuation[] arr_continuation) {
        int v = arr_continuation.length;
        if(this.b != 0) {
            AbstractSharedFlowSlot[] arr_abstractSharedFlowSlot = this.a;
            if(arr_abstractSharedFlowSlot != null) {
                for(int v1 = 0; v1 < arr_abstractSharedFlowSlot.length; ++v1) {
                    AbstractSharedFlowSlot abstractSharedFlowSlot0 = arr_abstractSharedFlowSlot[v1];
                    if(abstractSharedFlowSlot0 != null) {
                        Continuation continuation0 = ((SharedFlowSlot)abstractSharedFlowSlot0).cont;
                        if(continuation0 != null && this.k(((SharedFlowSlot)abstractSharedFlowSlot0)) >= 0L) {
                            if(v >= arr_continuation.length) {
                                arr_continuation = Arrays.copyOf(arr_continuation, Math.max(2, arr_continuation.length * 2));
                                Intrinsics.checkNotNullExpressionValue(arr_continuation, "copyOf(this, newSize)");
                            }
                            arr_continuation[v] = continuation0;
                            ((SharedFlowSlot)abstractSharedFlowSlot0).cont = null;
                            ++v;
                        }
                    }
                }
            }
        }
        return arr_continuation;
    }

    public final Object getLastReplayedLocked() {
        Object[] arr_object = this.h;
        Intrinsics.checkNotNull(arr_object);
        return SharedFlowKt.access$getBufferAt(arr_object, this.i + ((long)(((int)(this.h() + ((long)this.k) - this.i)))) - 1L);
    }

    public static void getLastReplayedLocked$annotations() {
    }

    @Override  // kotlinx.coroutines.flow.SharedFlow
    @NotNull
    public List getReplayCache() {
        synchronized(this) {
            int v1 = (int)(this.h() + ((long)this.k) - this.i);
            if(v1 == 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            List list0 = new ArrayList(v1);
            Object[] arr_object = this.h;
            Intrinsics.checkNotNull(arr_object);
            for(int v2 = 0; v2 < v1; ++v2) {
                ((ArrayList)list0).add(SharedFlowKt.access$getBufferAt(arr_object, this.i + ((long)v2)));
            }
            return list0;
        }
    }

    public final long h() {
        return Math.min(this.j, this.i);
    }

    public final Object[] i(int v, int v1, Object[] arr_object) {
        if(v1 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] arr_object1 = new Object[v1];
        this.h = arr_object1;
        if(arr_object == null) {
            return arr_object1;
        }
        long v2 = this.h();
        for(int v3 = 0; v3 < v; ++v3) {
            long v4 = ((long)v3) + v2;
            SharedFlowKt.access$setBufferAt(arr_object1, v4, SharedFlowKt.access$getBufferAt(arr_object, v4));
        }
        return arr_object1;
    }

    public final boolean j(Object object0) {
        int v = this.e;
        if(this.getNCollectors() == 0) {
            if(v != 0) {
                this.f(object0);
                int v1 = this.k + 1;
                this.k = v1;
                if(v1 > v) {
                    this.d();
                }
                this.j = this.h() + ((long)this.k);
            }
            return true;
        }
        int v2 = this.f;
        if(this.k >= v2 && this.j <= this.i) {
            switch(WhenMappings.$EnumSwitchMapping$0[this.g.ordinal()]) {
                case 1: {
                    return false;
                }
                case 2: {
                    return true;
                }
            }
        }
        this.f(object0);
        int v3 = this.k + 1;
        this.k = v3;
        if(v3 > v2) {
            this.d();
        }
        long v4 = this.i;
        if(((int)(this.h() + ((long)this.k) - v4)) > v) {
            this.m(v4 + 1L, this.j, this.h() + ((long)this.k), this.h() + ((long)this.k) + ((long)this.l));
        }
        return true;
    }

    public final long k(SharedFlowSlot sharedFlowSlot0) {
        long v = sharedFlowSlot0.index;
        if(v < this.h() + ((long)this.k)) {
            return v;
        }
        if(this.f > 0) {
            return -1L;
        }
        if(v > this.h()) {
            return -1L;
        }
        return this.l == 0 ? -1L : v;
    }

    public final Object l(SharedFlowSlot sharedFlowSlot0) {
        Symbol symbol0;
        Continuation[] arr_continuation = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized(this) {
            long v1 = this.k(sharedFlowSlot0);
            if(v1 < 0L) {
                symbol0 = SharedFlowKt.NO_VALUE;
            }
            else {
                long v2 = sharedFlowSlot0.index;
                Object[] arr_object = this.h;
                Intrinsics.checkNotNull(arr_object);
                Object object0 = SharedFlowKt.access$getBufferAt(arr_object, v1);
                if(object0 instanceof m2) {
                    object0 = ((m2)object0).c;
                }
                sharedFlowSlot0.index = v1 + 1L;
                arr_continuation = this.updateCollectorIndexLocked$kotlinx_coroutines_core(v2);
                symbol0 = object0;
            }
        }
        for(int v3 = 0; v3 < arr_continuation.length; ++v3) {
            Continuation continuation0 = arr_continuation[v3];
            if(continuation0 != null) {
                continuation0.resumeWith(Unit.INSTANCE);
            }
        }
        return symbol0;
    }

    public final void m(long v, long v1, long v2, long v3) {
        long v4 = Math.min(v1, v);
        for(long v5 = this.h(); v5 < v4; ++v5) {
            Object[] arr_object = this.h;
            Intrinsics.checkNotNull(arr_object);
            SharedFlowKt.access$setBufferAt(arr_object, v5, null);
        }
        this.i = v;
        this.j = v1;
        this.k = (int)(v2 - v4);
        this.l = (int)(v3 - v2);
    }

    @Override  // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
        synchronized(this) {
            this.m(this.h() + ((long)this.k), this.j, this.h() + ((long)this.k), this.h() + ((long)this.k) + ((long)this.l));
        }
    }

    @Override  // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(Object object0) {
        boolean z;
        Continuation[] arr_continuation = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized(this) {
            if(this.j(object0)) {
                arr_continuation = this.g(arr_continuation);
                z = true;
            }
            else {
                z = false;
            }
        }
        for(int v = 0; v < arr_continuation.length; ++v) {
            Continuation continuation0 = arr_continuation[v];
            if(continuation0 != null) {
                continuation0.resumeWith(Unit.INSTANCE);
            }
        }
        return z;
    }

    @NotNull
    public final Continuation[] updateCollectorIndexLocked$kotlinx_coroutines_core(long v) {
        long v12;
        long v11;
        if(v > this.j) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long v1 = this.h();
        long v2 = ((long)this.k) + v1;
        int v3 = this.f;
        if(v3 == 0 && this.l > 0) {
            ++v2;
        }
        int v4 = 0;
        if(this.b != 0) {
            AbstractSharedFlowSlot[] arr_abstractSharedFlowSlot = this.a;
            if(arr_abstractSharedFlowSlot != null) {
                for(int v5 = 0; v5 < arr_abstractSharedFlowSlot.length; ++v5) {
                    AbstractSharedFlowSlot abstractSharedFlowSlot0 = arr_abstractSharedFlowSlot[v5];
                    if(abstractSharedFlowSlot0 != null) {
                        long v6 = ((SharedFlowSlot)abstractSharedFlowSlot0).index;
                        if(v6 >= 0L && v6 < v2) {
                            v2 = v6;
                        }
                    }
                }
            }
        }
        if(v2 <= this.j) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long v7 = this.h() + ((long)this.k);
        int v8 = this.getNCollectors() <= 0 ? this.l : Math.min(this.l, v3 - ((int)(v7 - v2)));
        Continuation[] arr_continuation = AbstractSharedFlowKt.EMPTY_RESUMES;
        long v9 = ((long)this.l) + v7;
        if(v8 > 0) {
            arr_continuation = new Continuation[v8];
            Object[] arr_object = this.h;
            Intrinsics.checkNotNull(arr_object);
            long v10 = v7;
            while(true) {
                if(v7 >= v9) {
                    v11 = v2;
                    v12 = v9;
                    break;
                }
                v11 = v2;
                Object object0 = SharedFlowKt.access$getBufferAt(arr_object, v7);
                Symbol symbol0 = SharedFlowKt.NO_VALUE;
                v12 = v9;
                if(object0 != symbol0) {
                    Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    arr_continuation[v4] = ((m2)object0).d;
                    SharedFlowKt.access$setBufferAt(arr_object, v7, symbol0);
                    SharedFlowKt.access$setBufferAt(arr_object, v10, ((m2)object0).c);
                    ++v10;
                    if(v4 + 1 >= v8) {
                        break;
                    }
                    ++v4;
                }
                ++v7;
                v2 = v11;
                v9 = v12;
            }
            v7 = v10;
        }
        else {
            v11 = v2;
            v12 = v9;
        }
        if(this.getNCollectors() == 0) {
            v11 = v7;
        }
        long v13 = Math.max(this.i, v7 - ((long)Math.min(this.e, ((int)(v7 - v1)))));
        if(v3 == 0 && v13 < v12) {
            Object[] arr_object1 = this.h;
            Intrinsics.checkNotNull(arr_object1);
            if(Intrinsics.areEqual(SharedFlowKt.access$getBufferAt(arr_object1, v13), SharedFlowKt.NO_VALUE)) {
                ++v7;
                ++v13;
            }
        }
        this.m(v13, v11, v7, v12);
        this.b();
        return arr_continuation.length == 0 ? arr_continuation : this.g(arr_continuation);
    }

    public final long updateNewCollectorIndexLocked$kotlinx_coroutines_core() {
        long v = this.i;
        if(v < this.j) {
            this.j = v;
        }
        return v;
    }
}

