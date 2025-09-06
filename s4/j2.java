package s4;

import androidx.paging.SingleRunner;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import qd.a;

public final class j2 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final SingleRunner q;
    public final int r;
    public final Function1 s;

    public j2(SingleRunner singleRunner0, int v, Function1 function10, Continuation continuation0) {
        this.q = singleRunner0;
        this.r = v;
        this.s = function10;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new j2(this.q, this.r, this.s, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((j2)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Throwable throwable0;
        Job job0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        SingleRunner singleRunner0 = this.q;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Element coroutineContext$Element0 = ((CoroutineScope)this.p).getCoroutineContext().get(Job.Key);
                if(coroutineContext$Element0 == null) {
                    throw new IllegalStateException("Internal error. coroutineScope should\'ve created a job.");
                }
                this.p = (Job)coroutineContext$Element0;
                this.o = 1;
                Object object2 = singleRunner0.a.b(this.r, ((Job)coroutineContext$Element0), this);
                if(object2 == object1) {
                    return object1;
                }
                job0 = (Job)coroutineContext$Element0;
                object0 = object2;
            label_25:
                if(((Boolean)object0).booleanValue()) {
                    try {
                        this.p = job0;
                        this.o = 2;
                        if(this.s.invoke(this) == object1) {
                            return object1;
                        }
                    }
                    catch(Throwable throwable1) {
                    label_31:
                        this.p = throwable1;
                        this.o = 4;
                        if(singleRunner0.a.a(job0, this) == object1) {
                            return object1;
                        }
                        throwable0 = throwable1;
                        throw throwable0;
                    }
                label_38:
                    this.p = null;
                    this.o = 3;
                    if(singleRunner0.a.a(job0, this) == object1) {
                        return object1;
                    }
                }
                return Unit.INSTANCE;
            }
            case 1: {
                job0 = (Job)this.p;
                ResultKt.throwOnFailure(object0);
                goto label_25;
            }
            case 2: {
                job0 = (Job)this.p;
                try {
                    ResultKt.throwOnFailure(object0);
                    goto label_38;
                }
                catch(Throwable throwable1) {
                    goto label_31;
                }
            }
            case 3: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            case 4: {
                throwable0 = (Throwable)this.p;
                ResultKt.throwOnFailure(object0);
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

