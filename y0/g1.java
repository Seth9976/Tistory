package y0;

import androidx.compose.runtime.ProduceStateScope;
import i4.b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import qd.a;

public final class g1 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final CoroutineContext q;
    public final Flow r;

    public g1(CoroutineContext coroutineContext0, Flow flow0, Continuation continuation0) {
        this.q = coroutineContext0;
        this.r = flow0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new g1(this.q, this.r, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((g1)this.create(((ProduceStateScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                ProduceStateScope produceStateScope0 = (ProduceStateScope)this.p;
                CoroutineContext coroutineContext0 = this.q;
                boolean z = Intrinsics.areEqual(coroutineContext0, EmptyCoroutineContext.INSTANCE);
                Flow flow0 = this.r;
                if(z) {
                    b b0 = new b(produceStateScope0, 3);
                    this.o = 1;
                    if(flow0.collect(b0, this) == object1) {
                        return object1;
                    }
                }
                else {
                    f1 f10 = new f1(flow0, produceStateScope0, null);
                    this.o = 2;
                    if(BuildersKt.withContext(coroutineContext0, f10, this) == object1) {
                        return object1;
                    }
                }
                return Unit.INSTANCE;
            }
            case 1: 
            case 2: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

