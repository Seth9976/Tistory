package xf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

public final class a2 implements FlowCollector {
    public final ObjectRef a;
    public final CoroutineScope b;
    public final CompletableDeferred c;

    public a2(ObjectRef ref$ObjectRef0, CoroutineScope coroutineScope0, CompletableDeferred completableDeferred0) {
        this.a = ref$ObjectRef0;
        this.b = coroutineScope0;
        this.c = completableDeferred0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        Unit unit0;
        ObjectRef ref$ObjectRef0 = this.a;
        MutableStateFlow mutableStateFlow0 = (MutableStateFlow)ref$ObjectRef0.element;
        if(mutableStateFlow0 == null) {
            unit0 = null;
        }
        else {
            mutableStateFlow0.setValue(object0);
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            MutableStateFlow mutableStateFlow1 = StateFlowKt.MutableStateFlow(object0);
            k2 k20 = new k2(mutableStateFlow1, JobKt.getJob(this.b.getCoroutineContext()));
            this.c.complete(k20);
            ref$ObjectRef0.element = mutableStateFlow1;
        }
        return Unit.INSTANCE;
    }
}

