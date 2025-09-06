package androidx.databinding;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

public final class s implements FlowCollector {
    public final StateFlowListener a;

    public s(StateFlowListener viewDataBindingKtx$StateFlowListener0) {
        this.a = viewDataBindingKtx$StateFlowListener0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        StateFlowListener viewDataBindingKtx$StateFlowListener0 = this.a;
        ViewDataBinding viewDataBinding0 = viewDataBindingKtx$StateFlowListener0.c.a();
        if(viewDataBinding0 != null) {
            w w0 = viewDataBindingKtx$StateFlowListener0.c;
            w w1 = viewDataBindingKtx$StateFlowListener0.c;
            viewDataBinding0.handleFieldChange(w0.b, w1.c, 0);
        }
        return Unit.INSTANCE;
    }
}

