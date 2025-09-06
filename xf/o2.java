package xf;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingCommand;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

public final class o2 implements SharingStarted {
    public final int a;

    public o2(int v) {
        this.a = v;
        super();
    }

    @Override  // kotlinx.coroutines.flow.SharingStarted
    public final Flow command(StateFlow stateFlow0) {
        return this.a == 0 ? FlowKt.flowOf(SharingCommand.START) : FlowKt.flow(new r2(stateFlow0, null));
    }

    @Override
    public final String toString() {
        return this.a == 0 ? "SharingStarted.Eagerly" : "SharingStarted.Lazily";
    }
}

