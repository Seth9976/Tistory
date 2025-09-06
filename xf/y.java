package xf;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref.LongRef;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.OnTimeoutKt;
import kotlinx.coroutines.selects.SelectImplementation;
import qd.a;

public final class y extends SuspendLambda implements Function3 {
    public ObjectRef o;
    public LongRef p;
    public int q;
    public Object r;
    public Object s;
    public final Function1 t;
    public final Flow u;

    public y(Function1 function10, Flow flow0, Continuation continuation0) {
        this.t = function10;
        this.u = flow0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        y y0 = new y(this.t, this.u, ((Continuation)object2));
        y0.r = (CoroutineScope)object0;
        y0.s = (FlowCollector)object1;
        return y0.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        FlowCollector flowCollector2;
        ReceiveChannel receiveChannel2;
        ObjectRef ref$ObjectRef1;
        LongRef ref$LongRef0;
        ReceiveChannel receiveChannel1;
        FlowCollector flowCollector1;
        ObjectRef ref$ObjectRef0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.r;
                FlowCollector flowCollector0 = (FlowCollector)this.s;
                ReceiveChannel receiveChannel0 = ProduceKt.produce$default(coroutineScope0, null, 0, new x(this.u, null), 3, null);
                ref$ObjectRef0 = new ObjectRef();
                flowCollector1 = flowCollector0;
                receiveChannel1 = receiveChannel0;
                goto label_25;
            }
            case 1: {
                ref$LongRef0 = this.p;
                ref$ObjectRef0 = this.o;
                receiveChannel1 = (ReceiveChannel)this.s;
                flowCollector1 = (FlowCollector)this.r;
                ResultKt.throwOnFailure(object0);
                ref$ObjectRef0.element = null;
                goto label_47;
            }
            case 2: {
                ref$ObjectRef1 = this.o;
                receiveChannel2 = (ReceiveChannel)this.s;
                flowCollector2 = (FlowCollector)this.r;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            flowCollector1 = flowCollector2;
            receiveChannel1 = receiveChannel2;
            ref$ObjectRef0 = ref$ObjectRef1;
        label_25:
            if(ref$ObjectRef0.element == NullSurrogateKt.DONE) {
                break;
            }
            ref$LongRef0 = new LongRef();
            Object object2 = ref$ObjectRef0.element;
            if(object2 != null) {
                Symbol symbol0 = NullSurrogateKt.NULL;
                if(object2 == symbol0) {
                    object2 = null;
                }
                long v = ((Number)this.t.invoke(object2)).longValue();
                ref$LongRef0.element = v;
                int v1 = Long.compare(v, 0L);
                if(v1 < 0) {
                    throw new IllegalArgumentException("Debounce timeout should not be negative");
                }
                if(v1 == 0) {
                    this.r = flowCollector1;
                    this.s = receiveChannel1;
                    this.o = ref$ObjectRef0;
                    this.p = ref$LongRef0;
                    this.q = 1;
                    if(flowCollector1.emit((ref$ObjectRef0.element == symbol0 ? null : ref$ObjectRef0.element), this) == object1) {
                        return object1;
                    }
                    ref$ObjectRef0.element = null;
                }
            }
        label_47:
            ref$ObjectRef1 = ref$ObjectRef0;
            receiveChannel2 = receiveChannel1;
            flowCollector2 = flowCollector1;
            SelectImplementation selectImplementation0 = new SelectImplementation(this.getContext());
            if(ref$ObjectRef1.element != null) {
                OnTimeoutKt.onTimeout(selectImplementation0, ref$LongRef0.element, new u(null, ref$ObjectRef1, flowCollector2));
            }
            selectImplementation0.invoke(receiveChannel2.getOnReceiveCatching(), new v(null, ref$ObjectRef1, flowCollector2));
            this.r = flowCollector2;
            this.s = receiveChannel2;
            this.o = ref$ObjectRef1;
            this.p = null;
            this.q = 2;
            if(selectImplementation0.doSelect(this) != object1) {
                continue;
            }
            return object1;
        }
        return Unit.INSTANCE;
    }
}

