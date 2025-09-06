package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.TimeoutKt;
import qd.a;

public final class br extends SuspendLambda implements Function1 {
    public int o;
    public final dr p;
    public final cr q;
    public final MutatePriority r;

    public br(dr dr0, cr cr0, MutatePriority mutatePriority0, Continuation continuation0) {
        this.p = dr0;
        this.q = cr0;
        this.r = mutatePriority0;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new br(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((br)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        MutatePriority mutatePriority0 = this.r;
        dr dr0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                cr cr0 = this.q;
                try {
                    if(dr0.a) {
                        this.o = 1;
                        if(cr0.invoke(this) == object1) {
                            return object1;
                        }
                    }
                    else {
                        ar ar0 = new ar(cr0, null);
                        this.o = 2;
                        if(TimeoutKt.withTimeout(1500L, ar0, this) == object1) {
                            return object1;
                        label_15:
                            ResultKt.throwOnFailure(object0);
                        }
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_18;
                }
            }
            case 1: 
            case 2: {
                goto label_15;
            label_18:
                if(mutatePriority0 != MutatePriority.PreventUserInput) {
                    dr0.dismiss();
                }
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(mutatePriority0 != MutatePriority.PreventUserInput) {
            dr0.dismiss();
        }
        return Unit.INSTANCE;
    }
}

