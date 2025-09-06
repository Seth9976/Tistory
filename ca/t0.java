package ca;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.State;
import com.kakao.kandinsky.designsystem.common.ItemSliderKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

public final class t0 extends SuspendLambda implements Function2 {
    public final int o;
    public final PagerState p;
    public final Function2 q;
    public final State r;

    public t0(int v, PagerState pagerState0, Function2 function20, State state0, Continuation continuation0) {
        this.o = v;
        this.p = pagerState0;
        this.q = function20;
        this.r = state0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new t0(this.o, this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((t0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        ResultKt.throwOnFailure(object0);
        PagerState pagerState0 = this.p;
        int v = pagerState0.getTargetPage();
        if(this.o != v) {
            Boolean boolean0 = Boxing.boxBoolean(ItemSliderKt.access$ItemSlider$lambda$2(this.r));
            Integer integer0 = Boxing.boxInt(pagerState0.getTargetPage());
            this.q.invoke(boolean0, integer0);
        }
        return Unit.INSTANCE;
    }
}

