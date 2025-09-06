package kotlinx.coroutines.flow.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class h implements FlowCollector {
    public final ObjectRef a;
    public final CoroutineScope b;
    public final ChannelFlowTransformLatest c;
    public final FlowCollector d;

    public h(ObjectRef ref$ObjectRef0, CoroutineScope coroutineScope0, ChannelFlowTransformLatest channelFlowTransformLatest0, FlowCollector flowCollector0) {
        this.a = ref$ObjectRef0;
        this.b = coroutineScope0;
        this.c = channelFlowTransformLatest0;
        this.d = flowCollector0;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        h h0;
        g g0;
        if(continuation0 instanceof g) {
            g0 = (g)continuation0;
            int v = g0.t;
            if((v & 0x80000000) == 0) {
                g0 = new g(this, continuation0);
            }
            else {
                g0.t = v ^ 0x80000000;
            }
        }
        else {
            g0 = new g(this, continuation0);
        }
        Object object1 = g0.r;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(g0.t) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                Job job0 = (Job)this.a.element;
                if(job0 != null) {
                    job0.cancel(new ChildCancelledException());
                    g0.o = this;
                    g0.p = object0;
                    g0.q = job0;
                    g0.t = 1;
                    if(job0.join(g0) == object2) {
                        return object2;
                    }
                }
                h0 = this;
                break;
            }
            case 1: {
                object0 = g0.p;
                h0 = g0.o;
                ResultKt.throwOnFailure(object1);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        f f0 = new f(h0.c, h0.d, object0, null);
        h0.a.element = BuildersKt.launch$default(h0.b, null, CoroutineStart.UNDISPATCHED, f0, 1, null);
        return Unit.INSTANCE;
    }
}

