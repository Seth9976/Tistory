package j;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import qd.a;

public final class e extends SuspendLambda implements Function2 {
    public BooleanRef o;
    public int p;
    public final Function2 q;
    public final f r;

    public e(Function2 function20, f f0, Continuation continuation0) {
        this.q = function20;
        this.r = f0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new e(this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((e)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        BooleanRef ref$BooleanRef1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                BooleanRef ref$BooleanRef0 = new BooleanRef();
                Flow flow0 = FlowKt.onCompletion(FlowKt.consumeAsFlow(this.r.b), new d(ref$BooleanRef0, null));
                this.o = ref$BooleanRef0;
                this.p = 1;
                if(this.q.invoke(flow0, this) == object1) {
                    return object1;
                }
                ref$BooleanRef1 = ref$BooleanRef0;
                break;
            }
            case 1: {
                ref$BooleanRef1 = this.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(!ref$BooleanRef1.element) {
            throw new IllegalStateException("You must collect the progress flow");
        }
        return Unit.INSTANCE;
    }
}

