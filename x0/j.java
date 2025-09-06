package x0;

import androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class j extends SuspendLambda implements Function2 {
    public int o;
    public final PullToRefreshModifierNode p;

    public j(PullToRefreshModifierNode pullToRefreshModifierNode0, Continuation continuation0) {
        this.p = pullToRefreshModifierNode0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new j(this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((j)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                PullToRefreshModifierNode pullToRefreshModifierNode0 = this.p;
                if(pullToRefreshModifierNode0.isRefreshing()) {
                    this.o = 1;
                    if(pullToRefreshModifierNode0.getState().snapTo(1.0f, this) == object1) {
                        return object1;
                    }
                }
                else {
                    this.o = 2;
                    if(pullToRefreshModifierNode0.getState().snapTo(0.0f, this) == object1) {
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

