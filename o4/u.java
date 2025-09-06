package o4;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.text.selection.y;
import androidx.navigation.NavBackStackEntry;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class u extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final SeekableTransitionState q;
    public final NavBackStackEntry r;
    public final Transition s;

    public u(SeekableTransitionState seekableTransitionState0, NavBackStackEntry navBackStackEntry0, Transition transition0, Continuation continuation0) {
        this.q = seekableTransitionState0;
        this.r = navBackStackEntry0;
        this.s = transition0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new u(this.q, this.r, this.s, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((u)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                CoroutineScope coroutineScope0 = (CoroutineScope)this.p;
                SeekableTransitionState seekableTransitionState0 = this.q;
                Object object2 = seekableTransitionState0.getCurrentState();
                NavBackStackEntry navBackStackEntry0 = this.r;
                if(Intrinsics.areEqual(object2, navBackStackEntry0)) {
                    long v = this.s.getTotalDurationNanos();
                    float f = seekableTransitionState0.getFraction();
                    TweenSpec tweenSpec0 = AnimationSpecKt.tween$default(((int)(seekableTransitionState0.getFraction() * ((float)(v / 1000000L)))), 0, null, 6, null);
                    y y0 = new y(coroutineScope0, seekableTransitionState0, 3, navBackStackEntry0);
                    this.o = 2;
                    if(SuspendAnimationKt.animate$default(f, 0.0f, 0.0f, tweenSpec0, y0, this, 4, null) == object1) {
                        return object1;
                    }
                }
                else {
                    this.o = 1;
                    if(SeekableTransitionState.animateTo$default(this.q, navBackStackEntry0, null, this, 2, null) == object1) {
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

