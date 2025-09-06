package kotlinx.coroutines.flow.internal;

import androidx.compose.material3.fj;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A%\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A]\u0010\u000E\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00028\u00012\b\b\u0002\u0010\n\u001A\u00020\t2\"\u0010\r\u001A\u001E\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000BH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "asChannelFlow", "(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "V", "Lkotlin/coroutines/CoroutineContext;", "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "withContextUndispatched", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,245:1\n95#2,5:246\n*S KotlinDebug\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n*L\n226#1:246,5\n*E\n"})
public final class ChannelFlowKt {
    public static final FlowCollector access$withUndispatchedContextCollector(FlowCollector flowCollector0, CoroutineContext coroutineContext0) {
        return !(flowCollector0 instanceof SendingCollector ? true : flowCollector0 instanceof NopCollector) ? new fj(flowCollector0, coroutineContext0) : flowCollector0;
    }

    @NotNull
    public static final ChannelFlow asChannelFlow(@NotNull Flow flow0) {
        ChannelFlow channelFlow0 = flow0 instanceof ChannelFlow ? ((ChannelFlow)flow0) : null;
        return channelFlow0 == null ? new ChannelFlowOperatorImpl(flow0, null, 0, null, 14, null) : channelFlow0;
    }

    @Nullable
    public static final Object withContextUndispatched(@NotNull CoroutineContext coroutineContext0, Object object0, @NotNull Object object1, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        Object object3;
        Object object2 = ThreadContextKt.updateThreadContext(coroutineContext0, object1);
        try {
            b0 b00 = new b0(continuation0, coroutineContext0);
            object3 = ((Function2)TypeIntrinsics.beforeCheckcastToFunctionOfArity(function20, 2)).invoke(object0, b00);
        }
        finally {
            ThreadContextKt.restoreThreadContext(coroutineContext0, object2);
        }
        if(object3 == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object3;
    }

    public static Object withContextUndispatched$default(CoroutineContext coroutineContext0, Object object0, Object object1, Function2 function20, Continuation continuation0, int v, Object object2) {
        if((v & 4) != 0) {
            object1 = ThreadContextKt.threadContextElements(coroutineContext0);
        }
        return ChannelFlowKt.withContextUndispatched(coroutineContext0, object0, object1, function20, continuation0);
    }
}

