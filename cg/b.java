package cg;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.stream.Stream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

public final class b implements Flow {
    public final Stream a;
    public static final AtomicIntegerFieldUpdater b;
    @Volatile
    private volatile int consumed;

    static {
        b.b = AtomicIntegerFieldUpdater.newUpdater(b.class, "consumed");
    }

    public b(Stream stream0) {
        this.a = stream0;
        this.consumed = 0;
    }

    @Override  // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector0, Continuation continuation0) {
        Iterator iterator0;
        FlowCollector flowCollector1;
        b b0;
        a a0;
        if(continuation0 instanceof a) {
            a0 = (a)continuation0;
            int v = a0.t;
            if((v & 0x80000000) == 0) {
                a0 = new a(this, continuation0);
            }
            else {
                a0.t = v ^ 0x80000000;
            }
        }
        else {
            a0 = new a(this, continuation0);
        }
        Object object0 = a0.r;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(a0.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(b.b.compareAndSet(this, 0, 1)) {
                    try {
                        b0 = this;
                        flowCollector1 = flowCollector0;
                        iterator0 = this.a.iterator();
                        goto label_25;
                    }
                    catch(Throwable throwable0) {
                        break;
                    }
                }
                throw new IllegalStateException("Stream.consumeAsFlow can be collected only once");
            }
            case 1: {
                try {
                    iterator0 = a0.q;
                    FlowCollector flowCollector2 = a0.p;
                    b0 = a0.o;
                    ResultKt.throwOnFailure(object0);
                    flowCollector1 = flowCollector2;
                    while(true) {
                    label_25:
                        if(!iterator0.hasNext()) {
                            goto label_38;
                        }
                        Object object2 = iterator0.next();
                        a0.o = b0;
                        a0.p = flowCollector1;
                        a0.q = iterator0;
                        a0.t = 1;
                        if(flowCollector1.emit(object2, a0) == object1) {
                            return object1;
                        }
                    }
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        b0.a.close();
        throw throwable0;
    label_38:
        b0.a.close();
        return Unit.INSTANCE;
    }
}

