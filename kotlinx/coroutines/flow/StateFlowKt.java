package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import xf.v2;

@Metadata(d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A!\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001A\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A4\u0010\u0007\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001A4\u0010\t\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\b\u001A4\u0010\u000B\u001A\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\u000B\u0010\f\u001A=\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"T", "value", "Lkotlinx/coroutines/flow/MutableStateFlow;", "MutableStateFlow", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlin/Function1;", "function", "updateAndGet", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getAndUpdate", "", "update", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/Flow;", "fuseStateFlow", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,428:1\n1#2:429\n*E\n"})
public final class StateFlowKt {
    public static final Symbol a;
    public static final Symbol b;

    static {
        StateFlowKt.a = new Symbol("NONE");
        StateFlowKt.b = new Symbol("PENDING");
    }

    @NotNull
    public static final MutableStateFlow MutableStateFlow(Object object0) {
        if(object0 == null) {
            object0 = NullSurrogateKt.NULL;
        }
        return new v2(object0);
    }

    @NotNull
    public static final Flow fuseStateFlow(@NotNull StateFlow stateFlow0, @NotNull CoroutineContext coroutineContext0, int v, @NotNull BufferOverflow bufferOverflow0) {
        return (v >= 0 && v < 2 || v == -2) && bufferOverflow0 == BufferOverflow.DROP_OLDEST ? stateFlow0 : SharedFlowKt.fuseSharedFlow(stateFlow0, coroutineContext0, v, bufferOverflow0);
    }

    public static final Object getAndUpdate(@NotNull MutableStateFlow mutableStateFlow0, @NotNull Function1 function10) {
        Object object0;
        do {
            object0 = mutableStateFlow0.getValue();
        }
        while(!mutableStateFlow0.compareAndSet(object0, function10.invoke(object0)));
        return object0;
    }

    public static final void update(@NotNull MutableStateFlow mutableStateFlow0, @NotNull Function1 function10) {
        do {
            Object object0 = mutableStateFlow0.getValue();
        }
        while(!mutableStateFlow0.compareAndSet(object0, function10.invoke(object0)));
    }

    public static final Object updateAndGet(@NotNull MutableStateFlow mutableStateFlow0, @NotNull Function1 function10) {
        Object object1;
        do {
            Object object0 = mutableStateFlow0.getValue();
            object1 = function10.invoke(object0);
        }
        while(!mutableStateFlow0.compareAndSet(object0, object1));
        return object1;
    }
}

