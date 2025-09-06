package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0011\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0001H\u0081\b\u001A\u0018\u0010\u0003\u001A\u00020\u0004*\u00020\u00052\n\u0010\u0006\u001A\u0006\u0012\u0002\b\u00030\u0007H\u0000¨\u0006\b"}, d2 = {"checkIndexOverflow", "", "index", "checkOwnership", "", "Lkotlinx/coroutines/flow/internal/AbortFlowException;", "owner", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class FlowExceptions_commonKt {
    @PublishedApi
    public static final int checkIndexOverflow(int v) {
        if(v < 0) {
            throw new ArithmeticException("Index overflow has happened");
        }
        return v;
    }

    public static final void checkOwnership(@NotNull AbortFlowException abortFlowException0, @NotNull FlowCollector flowCollector0) {
        if(abortFlowException0.owner != flowCollector0) {
            throw abortFlowException0;
        }
    }
}

