package i4;

import androidx.compose.runtime.ProduceStateScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import qd.a;

public final class d extends SuspendLambda implements Function2 {
    public int o;
    public final CoroutineContext p;
    public final Flow q;
    public final ProduceStateScope r;

    public d(CoroutineContext coroutineContext0, Flow flow0, ProduceStateScope produceStateScope0, Continuation continuation0) {
        this.p = coroutineContext0;
        this.q = flow0;
        this.r = produceStateScope0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new d(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((d)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineContext coroutineContext0 = this.p;
                boolean z = Intrinsics.areEqual(coroutineContext0, EmptyCoroutineContext.INSTANCE);
                ProduceStateScope produceStateScope0 = this.r;
                Flow flow0 = this.q;
                if(z) {
                    b b0 = new b(produceStateScope0, 0);
                    this.o = 1;
                    if(flow0.collect(b0, this) == object1) {
                        return object1;
                    }
                }
                else {
                    c c0 = new c(flow0, produceStateScope0, null);
                    this.o = 2;
                    if(BuildersKt.withContext(coroutineContext0, c0, this) == object1) {
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

