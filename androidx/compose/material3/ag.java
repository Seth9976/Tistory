package androidx.compose.material3;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class ag extends SuspendLambda implements Function2 {
    public final DrawerState o;
    public final DrawerPredictiveBackState p;

    public ag(DrawerState drawerState0, DrawerPredictiveBackState drawerPredictiveBackState0, Continuation continuation0) {
        this.o = drawerState0;
        this.p = drawerPredictiveBackState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new ag(this.o, this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((ag)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        if(this.o.isClosed()) {
            this.p.clear();
        }
        return Unit.INSTANCE;
    }
}

