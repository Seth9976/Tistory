package w0;

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

public final class p implements FlowCollector {
    public final ObjectRef a;
    public final CoroutineScope b;
    public final Function2 c;

    public p(ObjectRef ref$ObjectRef0, CoroutineScope coroutineScope0, Function2 function20) {
        this.a = ref$ObjectRef0;
        this.b = coroutineScope0;
        this.c = function20;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        p p0;
        o o0;
        if(continuation0 instanceof o) {
            o0 = (o)continuation0;
            int v = o0.t;
            if((v & 0x80000000) == 0) {
                o0 = new o(this, continuation0);
            }
            else {
                o0.t = v ^ 0x80000000;
            }
        }
        else {
            o0 = new o(this, continuation0);
        }
        Object object1 = o0.r;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(o0.t) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                Job job0 = (Job)this.a.element;
                if(job0 != null) {
                    job0.cancel(new i());  // 初始化器: Ljava/util/concurrent/CancellationException;-><init>()V
                    o0.o = this;
                    o0.p = object0;
                    o0.q = job0;
                    o0.t = 1;
                    if(job0.join(o0) == object2) {
                        return object2;
                    }
                }
                p0 = this;
                break;
            }
            case 1: {
                object0 = o0.p;
                p0 = o0.o;
                ResultKt.throwOnFailure(object1);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        n n0 = new n(p0.c, object0, p0.b, null);
        p0.a.element = BuildersKt.launch$default(p0.b, null, CoroutineStart.UNDISPATCHED, n0, 1, null);
        return Unit.INSTANCE;
    }
}

