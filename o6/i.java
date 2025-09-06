package o6;

import androidx.compose.ui.unit.Density;
import com.google.accompanist.pager.PagerState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class i extends SuspendLambda implements Function2 {
    public final Density o;
    public final PagerState p;
    public final float q;

    public i(Density density0, PagerState pagerState0, float f, Continuation continuation0) {
        this.o = density0;
        this.p = pagerState0;
        this.q = f;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new i(this.o, this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((i)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        int v = this.o.roundToPx-0680j_4(this.q);
        this.p.setItemSpacing$pager_release(v);
        return Unit.INSTANCE;
    }
}

