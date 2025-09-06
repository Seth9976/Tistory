package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;

public final class c0 extends SharedFlowImpl implements StateFlow {
    @Override  // kotlinx.coroutines.flow.StateFlow
    public final Object getValue() {
        synchronized(this) {
            return ((Number)this.getLastReplayedLocked()).intValue();
        }
    }

    public final void n(int v) {
        synchronized(this) {
            this.tryEmit(((int)(((Number)this.getLastReplayedLocked()).intValue() + v)));
        }
    }
}

