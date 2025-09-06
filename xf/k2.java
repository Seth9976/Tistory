package xf;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.CancellableFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.FusibleFlow;

public final class k2 implements CancellableFlow, StateFlow, FusibleFlow {
    public final Job a;
    public final MutableStateFlow b;

    public k2(MutableStateFlow mutableStateFlow0, Job job0) {
        this.a = job0;
        this.b = mutableStateFlow0;
    }

    @Override  // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector0, Continuation continuation0) {
        return this.b.collect(flowCollector0, continuation0);
    }

    @Override  // kotlinx.coroutines.flow.internal.FusibleFlow
    public final Flow fuse(CoroutineContext coroutineContext0, int v, BufferOverflow bufferOverflow0) {
        return StateFlowKt.fuseStateFlow(this, coroutineContext0, v, bufferOverflow0);
    }

    @Override  // kotlinx.coroutines.flow.SharedFlow
    public final List getReplayCache() {
        return this.b.getReplayCache();
    }

    @Override  // kotlinx.coroutines.flow.StateFlow
    public final Object getValue() {
        return this.b.getValue();
    }
}

