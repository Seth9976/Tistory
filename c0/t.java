package c0;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

public final class t extends SuspendLambda implements Function2 {
    public final LazyGridState o;
    public final int p;
    public final int q;

    public t(LazyGridState lazyGridState0, int v, int v1, Continuation continuation0) {
        this.o = lazyGridState0;
        this.p = v;
        this.q = v1;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new t(this.o, this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((t)this.create(((ScrollScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        this.o.snapToItemIndexInternal$foundation_release(this.p, this.q, true);
        return Unit.INSTANCE;
    }
}

