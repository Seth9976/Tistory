package p0;

import androidx.compose.material.SliderKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class w7 extends SuspendLambda implements Function2 {
    public int o;
    public final j7 p;
    public final float q;
    public final float r;
    public final float s;
    public final Function0 t;

    public w7(j7 j70, float f, float f1, float f2, Function0 function00, Continuation continuation0) {
        this.p = j70;
        this.q = f;
        this.r = f1;
        this.s = f2;
        this.t = function00;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new w7(this.p, this.q, this.r, this.s, this.t, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((w7)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.o = 1;
                if(SliderKt.access$animateToTarget(this.p, this.q, this.r, this.s, this) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Function0 function00 = this.t;
        if(function00 != null) {
            function00.invoke();
        }
        return Unit.INSTANCE;
    }
}

