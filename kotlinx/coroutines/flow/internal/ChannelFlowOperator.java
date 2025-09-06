package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001A\u00020\u00102\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00010\u000EH¤@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001A\u00020\u00102\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001A\u00020\u00102\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00010\u000EH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0012J\u000F\u0010\u0019\u001A\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001AR\u001A\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001B\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001C"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "S", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/flow/Flow;", "flow", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "flowCollect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ProducerScope;", "scope", "collectTo", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collect", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class ChannelFlowOperator extends ChannelFlow {
    @JvmField
    @NotNull
    protected final Flow flow;

    public ChannelFlowOperator(@NotNull Flow flow0, @NotNull CoroutineContext coroutineContext0, int v, @NotNull BufferOverflow bufferOverflow0) {
        super(coroutineContext0, v, bufferOverflow0);
        this.flow = flow0;
    }

    public static final Object access$collectWithContextUndispatched(ChannelFlowOperator channelFlowOperator0, FlowCollector flowCollector0, CoroutineContext coroutineContext0, Continuation continuation0) {
        channelFlowOperator0.getClass();
        Unit unit0 = ChannelFlowKt.withContextUndispatched$default(coroutineContext0, ChannelFlowKt.access$withUndispatchedContextCollector(flowCollector0, continuation0.getContext()), null, new e(channelFlowOperator0, null), continuation0, 4, null);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.flow.internal.ChannelFlow
    @Nullable
    public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
        Unit unit0;
        if(this.capacity == -3) {
            CoroutineContext coroutineContext0 = continuation0.getContext();
            CoroutineContext coroutineContext1 = CoroutineContextKt.newCoroutineContext(coroutineContext0, this.context);
            if(Intrinsics.areEqual(coroutineContext1, coroutineContext0)) {
                unit0 = this.flowCollect(flowCollector0, continuation0);
                return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
            }
            if(Intrinsics.areEqual(coroutineContext1.get(ContinuationInterceptor.Key), coroutineContext0.get(ContinuationInterceptor.Key))) {
                unit0 = ChannelFlowKt.withContextUndispatched$default(coroutineContext1, ChannelFlowKt.access$withUndispatchedContextCollector(flowCollector0, continuation0.getContext()), null, new e(this, null), continuation0, 4, null);
                if(unit0 != a.getCOROUTINE_SUSPENDED()) {
                    unit0 = Unit.INSTANCE;
                }
                return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
            }
        }
        unit0 = super.collect(flowCollector0, continuation0);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.flow.internal.ChannelFlow
    @Nullable
    public Object collectTo(@NotNull ProducerScope producerScope0, @NotNull Continuation continuation0) {
        Unit unit0 = this.flowCollect(new SendingCollector(producerScope0), continuation0);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    @Nullable
    public abstract Object flowCollect(@NotNull FlowCollector arg1, @NotNull Continuation arg2);

    @Override  // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public String toString() {
        return this.flow + " -> " + super.toString();
    }
}

