package z;

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

public final class k implements FlowCollector {
    public final ObjectRef a;
    public final CoroutineScope b;
    public final Function2 c;

    public k(ObjectRef ref$ObjectRef0, CoroutineScope coroutineScope0, Function2 function20) {
        this.a = ref$ObjectRef0;
        this.b = coroutineScope0;
        this.c = function20;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        k k0;
        j j0;
        if(continuation0 instanceof j) {
            j0 = (j)continuation0;
            int v = j0.t;
            if((v & 0x80000000) == 0) {
                j0 = new j(this, continuation0);
            }
            else {
                j0.t = v ^ 0x80000000;
            }
        }
        else {
            j0 = new j(this, continuation0);
        }
        Object object1 = j0.r;
        Object object2 = a.getCOROUTINE_SUSPENDED();
        switch(j0.t) {
            case 0: {
                ResultKt.throwOnFailure(object1);
                Job job0 = (Job)this.a.element;
                if(job0 != null) {
                    job0.cancel(new z.a());  // 初始化器: Ljava/util/concurrent/CancellationException;-><init>()V
                    j0.o = this;
                    j0.p = object0;
                    j0.q = job0;
                    j0.t = 1;
                    if(job0.join(j0) == object2) {
                        return object2;
                    }
                }
                k0 = this;
                break;
            }
            case 1: {
                object0 = j0.p;
                k0 = j0.o;
                ResultKt.throwOnFailure(object1);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        i i0 = new i(k0.c, object0, k0.b, null);
        k0.a.element = BuildersKt.launch$default(k0.b, null, CoroutineStart.UNDISPATCHED, i0, 1, null);
        return Unit.INSTANCE;
    }
}

