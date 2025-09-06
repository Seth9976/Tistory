package androidx.compose.ui.scrollcapture;

import f2.g;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class a extends SuspendLambda implements Function2 {
    public int o;
    public final ComposeScrollCaptureCallback p;
    public final Runnable q;

    public a(ComposeScrollCaptureCallback composeScrollCaptureCallback0, Runnable runnable0, Continuation continuation0) {
        this.p = composeScrollCaptureCallback0;
        this.q = runnable0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new a(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((a)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        ComposeScrollCaptureCallback composeScrollCaptureCallback0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                g g0 = composeScrollCaptureCallback0.e;
                this.o = 1;
                Unit unit0 = g0.a(0.0f - g0.c, this);
                if(unit0 != qd.a.getCOROUTINE_SUSPENDED()) {
                    unit0 = Unit.INSTANCE;
                }
                if(unit0 == object1) {
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
        composeScrollCaptureCallback0.c.onSessionEnded();
        this.q.run();
        return Unit.INSTANCE;
    }
}

