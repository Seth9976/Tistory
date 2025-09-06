package ca;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import com.kakao.kandinsky.designsystem.common.ItemSliderKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import qd.a;

public final class u0 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final PagerState q;
    public final MutableState r;

    public u0(PagerState pagerState0, MutableState mutableState0, Continuation continuation0) {
        this.q = pagerState0;
        this.r = mutableState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new u0(this.q, this.r, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((u0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        CoroutineScope coroutineScope1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        MutableState mutableState0 = this.r;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.p;
                if(this.q.isScrollInProgress()) {
                    ItemSliderKt.access$ItemSlider$lambda$5(mutableState0, true);
                    return Unit.INSTANCE;
                }
                this.p = coroutineScope0;
                this.o = 1;
                if(DelayKt.delay(300L, this) == object1) {
                    return object1;
                }
                coroutineScope1 = coroutineScope0;
                break;
            }
            case 1: {
                coroutineScope1 = (CoroutineScope)this.p;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        CoroutineScopeKt.ensureActive(coroutineScope1);
        ItemSliderKt.access$ItemSlider$lambda$5(mutableState0, false);
        return Unit.INSTANCE;
    }
}

