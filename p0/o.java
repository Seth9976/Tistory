package p0;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import qd.a;

public final class o implements FlowCollector {
    public final ObjectRef a;
    public final CoroutineScope b;
    public final Function2 c;

    public o(ObjectRef ref$ObjectRef0, CoroutineScope coroutineScope0, Function2 function20) {
        this.a = ref$ObjectRef0;
        this.b = coroutineScope0;
        this.c = function20;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        o o0;
        n n0;
        if(continuation0 instanceof n) {
            n0 = (n)continuation0;
            int v = n0.t;
            if((v & 0x80000000) == 0) {
                n0 = new n(this, continuation0);
            }
            else {
                n0.t = v ^ 0x80000000;
            }
        }
        else {
            n0 = new n(this, continuation0);
        }
        Object object1 = n0.r;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(n0.t) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                Job job0 = (Job)this.a.element;
                if(job0 != null) {
                    job0.cancel(new g());  // 初始化器: Ljava/util/concurrent/CancellationException;-><init>()V
                    n0.o = this;
                    n0.p = object0;
                    n0.q = job0;
                    n0.t = 1;
                    if(job0.join(n0) == object2) {
                        return object2;
                    }
                }
                o0 = this;
                break;
            }
            case 1: {
                object0 = n0.p;
                o0 = n0.o;
                ResultKt.throwOnFailure(object1);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        m m0 = new m(o0.c, object0, o0.b, null);
        o0.a.element = BuildersKt.launch$default(o0.b, null, CoroutineStart.UNDISPATCHED, m0, 1, null);
        return Unit.INSTANCE;
    }
}

