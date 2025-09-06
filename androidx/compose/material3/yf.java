package androidx.compose.material3;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.text.selection.b1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class yf extends SuspendLambda implements Function2 {
    public int o;
    public final DrawerPredictiveBackState p;

    public yf(DrawerPredictiveBackState drawerPredictiveBackState0, Continuation continuation0) {
        this.p = drawerPredictiveBackState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new yf(this.p, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((yf)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        DrawerPredictiveBackState drawerPredictiveBackState0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                float f = drawerPredictiveBackState0.getScaleXDistance();
                b1 b10 = new b1(drawerPredictiveBackState0, 5);
                this.o = 1;
                if(SuspendAnimationKt.animate$default(f, 0.0f, 0.0f, null, b10, this, 12, null) == object1) {
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
        drawerPredictiveBackState0.clear();
        return Unit.INSTANCE;
    }
}

