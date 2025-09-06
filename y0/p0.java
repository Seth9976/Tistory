package y0;

import androidx.compose.runtime.Recomposer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class p0 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final Function3 q;

    public p0(Function3 function30, Continuation continuation0) {
        this.q = function30;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new p0(this.q, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((p0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Recomposer recomposer0;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.p;
                recomposer0 = new Recomposer(coroutineScope0.getCoroutineContext());
                BuildersKt.launch$default(coroutineScope0, null, null, new o0(recomposer0, null), 3, null);
                this.p = recomposer0;
                this.o = 1;
                object0 = this.q.invoke(coroutineScope0, recomposer0, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                recomposer0 = (Recomposer)this.p;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 2: {
                Object object2 = this.p;
                ResultKt.throwOnFailure(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        recomposer0.close();
        this.p = object0;
        this.o = 2;
        return recomposer0.join(this) == object1 ? object1 : object0;
    }
}

