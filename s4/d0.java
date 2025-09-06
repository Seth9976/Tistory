package s4;

import androidx.paging.ViewportHint;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

public final class d0 {
    public ViewportHint a;
    public final MutableSharedFlow b;

    public d0() {
        this.b = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
    }
}

