package kotlinx.coroutines.flow.internal;

import androidx.compose.material3.o7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BA\u0012\u0012\u0010\u0004\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\b\b\u0002\u0010\t\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u00052\u0006\u0010\u000B\u001A\u00020\nH\u0014¢\u0006\u0004\b\u000E\u0010\u000FJ\u001D\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001A\u00020\u00162\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u001A\u001A\u00020\u0019H\u0014¢\u0006\u0004\b\u001A\u0010\u001B\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001C"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowMerge;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/flow/Flow;", "flow", "", "concurrency", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/flow/Flow;ILkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "create", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/channels/ReceiveChannel;", "produceImpl", "(Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/channels/ProducerScope;", "", "collectTo", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "additionalToStringProps", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ChannelFlowMerge extends ChannelFlow {
    public final Flow a;
    public final int b;

    public ChannelFlowMerge(@NotNull Flow flow0, int v, @NotNull CoroutineContext coroutineContext0, int v1, @NotNull BufferOverflow bufferOverflow0) {
        super(coroutineContext0, v1, bufferOverflow0);
        this.a = flow0;
        this.b = v;
    }

    public ChannelFlowMerge(Flow flow0, int v, CoroutineContext coroutineContext0, int v1, BufferOverflow bufferOverflow0, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 4) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        if((v2 & 8) != 0) {
            v1 = -2;
        }
        if((v2 & 16) != 0) {
            bufferOverflow0 = BufferOverflow.SUSPEND;
        }
        this(flow0, v, coroutineContext0, v1, bufferOverflow0);
    }

    @Override  // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public String additionalToStringProps() {
        return "concurrency=" + this.b;
    }

    @Override  // kotlinx.coroutines.flow.internal.ChannelFlow
    @Nullable
    public Object collectTo(@NotNull ProducerScope producerScope0, @NotNull Continuation continuation0) {
        Semaphore semaphore0 = SemaphoreKt.Semaphore$default(this.b, 0, 2, null);
        SendingCollector sendingCollector0 = new SendingCollector(producerScope0);
        o7 o70 = new o7(2, ((Job)continuation0.getContext().get(Job.Key)), semaphore0, producerScope0, sendingCollector0);
        Object object0 = this.a.collect(o70, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public ChannelFlow create(@NotNull CoroutineContext coroutineContext0, int v, @NotNull BufferOverflow bufferOverflow0) {
        return new ChannelFlowMerge(this.a, this.b, coroutineContext0, v, bufferOverflow0);
    }

    @Override  // kotlinx.coroutines.flow.internal.ChannelFlow
    @NotNull
    public ReceiveChannel produceImpl(@NotNull CoroutineScope coroutineScope0) {
        Function2 function20 = this.getCollectToFun$kotlinx_coroutines_core();
        return ProduceKt.produce(coroutineScope0, this.context, this.capacity, function20);
    }
}

