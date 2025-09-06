package z;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.gestures.NestedScrollScope;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import androidx.compose.material3.td;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;
import qd.a;

public final class w extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final UpdatableAnimationState q;
    public final ContentInViewNode r;
    public final BringIntoViewSpec s;
    public final Job t;

    public w(UpdatableAnimationState updatableAnimationState0, ContentInViewNode contentInViewNode0, BringIntoViewSpec bringIntoViewSpec0, Job job0, Continuation continuation0) {
        this.q = updatableAnimationState0;
        this.r = contentInViewNode0;
        this.s = bringIntoViewSpec0;
        this.t = job0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new w(this.q, this.r, this.s, this.t, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((w)this.create(((NestedScrollScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                NestedScrollScope nestedScrollScope0 = (NestedScrollScope)this.p;
                float f = ContentInViewNode.access$calculateScrollDelta(this.r, this.s);
                this.q.setValue(f);
                v v0 = new v(this.r, this.t, nestedScrollScope0);
                td td0 = new td(this.r, this.q, 17, this.s);
                this.o = 1;
                return this.q.animateToZero(v0, td0, this) == object1 ? object1 : Unit.INSTANCE;
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

