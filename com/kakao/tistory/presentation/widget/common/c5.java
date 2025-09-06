package com.kakao.tistory.presentation.widget.common;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.material3.TopAppBarState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class c5 extends SuspendLambda implements Function3 {
    public int a;
    public float b;
    public final TopAppBarScrollBehavior c;

    public c5(TopAppBarScrollBehavior topAppBarScrollBehavior0, Continuation continuation0) {
        this.c = topAppBarScrollBehavior0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        c5 c50 = new c5(this.c, ((Continuation)object2));
        c50.b = ((Number)object1).floatValue();
        return c50.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                float f = this.b;
                TopAppBarState topAppBarState0 = this.c.getState();
                DecayAnimationSpec decayAnimationSpec0 = this.c.getFlingAnimationSpec();
                AnimationSpec animationSpec0 = this.c.getSnapAnimationSpec();
                this.a = 1;
                return TopAppBarKt.access$settleAppBar(topAppBarState0, f, decayAnimationSpec0, animationSpec0, this) == object1 ? object1 : Unit.INSTANCE;
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

