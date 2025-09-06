package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A7\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\u0003\u001A\u00020\u00012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001A=\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u0004H\u0000¢\u0006\u0004\b\u000E\u0010\u000F\"\u0014\u0010\u0011\u001A\u00020\u00108\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"T", "", "replay", "extraBufferCapacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "MutableSharedFlow", "(IILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lkotlinx/coroutines/flow/Flow;", "fuseSharedFlow", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/internal/Symbol;", "NO_VALUE", "Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,731:1\n1#2:732\n*E\n"})
public final class SharedFlowKt {
    @JvmField
    @NotNull
    public static final Symbol NO_VALUE;

    static {
        SharedFlowKt.NO_VALUE = new Symbol("NO_VALUE");
    }

    @NotNull
    public static final MutableSharedFlow MutableSharedFlow(int v, int v1, @NotNull BufferOverflow bufferOverflow0) {
        if(v < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + v).toString());
        }
        if(v1 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + v1).toString());
        }
        if(v <= 0 && v1 <= 0 && bufferOverflow0 != BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow0).toString());
        }
        return new SharedFlowImpl(v, (v1 + v >= 0 ? v1 + v : 0x7FFFFFFF), bufferOverflow0);
    }

    public static MutableSharedFlow MutableSharedFlow$default(int v, int v1, BufferOverflow bufferOverflow0, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        if((v2 & 4) != 0) {
            bufferOverflow0 = BufferOverflow.SUSPEND;
        }
        return SharedFlowKt.MutableSharedFlow(v, v1, bufferOverflow0);
    }

    public static final Object access$getBufferAt(Object[] arr_object, long v) {
        return arr_object[((int)v) & arr_object.length - 1];
    }

    public static final void access$setBufferAt(Object[] arr_object, long v, Object object0) {
        arr_object[((int)v) & arr_object.length - 1] = object0;
    }

    @NotNull
    public static final Flow fuseSharedFlow(@NotNull SharedFlow sharedFlow0, @NotNull CoroutineContext coroutineContext0, int v, @NotNull BufferOverflow bufferOverflow0) {
        return (v == -3 || v == 0) && bufferOverflow0 == BufferOverflow.SUSPEND ? sharedFlow0 : new ChannelFlowOperatorImpl(sharedFlow0, coroutineContext0, v, bufferOverflow0);
    }
}

