package androidx.work.impl.constraints;

import androidx.compose.foundation.text.selection.y0;
import androidx.work.impl.model.WorkSpec;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import qd.a;

public final class b extends SuspendLambda implements Function2 {
    public int o;
    public final WorkConstraintsTracker p;
    public final WorkSpec q;
    public final OnConstraintsStateChangedListener r;

    public b(WorkConstraintsTracker workConstraintsTracker0, WorkSpec workSpec0, OnConstraintsStateChangedListener onConstraintsStateChangedListener0, Continuation continuation0) {
        this.p = workConstraintsTracker0;
        this.q = workSpec0;
        this.r = onConstraintsStateChangedListener0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new b(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Flow flow0 = this.p.track(this.q);
                y0 y00 = new y0(1, this.r, this.q);
                this.o = 1;
                return flow0.collect(y00, this) == object1 ? object1 : Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

