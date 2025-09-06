package j;

import androidx.activity.FullyDrawnReporter;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class k extends SuspendLambda implements Function2 {
    public FullyDrawnReporter o;
    public int p;
    public final FullyDrawnReporter q;
    public final Function1 r;

    public k(FullyDrawnReporter fullyDrawnReporter0, Function1 function10, Continuation continuation0) {
        this.q = fullyDrawnReporter0;
        this.r = function10;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new k(this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((k)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        FullyDrawnReporter fullyDrawnReporter1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Function1 function10 = this.r;
                FullyDrawnReporter fullyDrawnReporter0 = this.q;
                fullyDrawnReporter0.addReporter();
                if(!fullyDrawnReporter0.isFullyDrawnReported()) {
                    try {
                        this.o = fullyDrawnReporter0;
                        this.p = 1;
                        if(function10.invoke(this) == object1) {
                            return object1;
                        }
                    }
                    catch(Throwable throwable0) {
                        fullyDrawnReporter1 = fullyDrawnReporter0;
                        fullyDrawnReporter1.removeReporter();
                        throw throwable0;
                    }
                    fullyDrawnReporter0.removeReporter();
                    return Unit.INSTANCE;
                }
                break;
            }
            case 1: {
                try {
                    fullyDrawnReporter1 = this.o;
                    ResultKt.throwOnFailure(object0);
                }
                catch(Throwable throwable0) {
                    fullyDrawnReporter1.removeReporter();
                    throw throwable0;
                }
                fullyDrawnReporter1.removeReporter();
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

