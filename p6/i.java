package p6;

import com.google.accompanist.swiperefresh.SwipeRefreshState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class i extends SuspendLambda implements Function2 {
    public int o;
    public final SwipeRefreshState p;

    public i(SwipeRefreshState swipeRefreshState0, Continuation continuation0) {
        this.p = swipeRefreshState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new i(this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((i)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                SwipeRefreshState swipeRefreshState0 = this.p;
                if(!swipeRefreshState0.isSwipeInProgress()) {
                    this.o = 1;
                    if(swipeRefreshState0.animateOffsetTo$swiperefresh_release(0.0f, this) == object1) {
                        return object1;
                    }
                }
                return Unit.INSTANCE;
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

