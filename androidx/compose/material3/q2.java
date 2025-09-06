package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.interaction.DragInteraction.Start;
import androidx.compose.foundation.interaction.FocusInteraction.Focus;
import androidx.compose.foundation.interaction.HoverInteraction.Enter;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.material3.internal.ElevationKt;
import androidx.compose.ui.unit.Dp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class q2 extends SuspendLambda implements Function2 {
    public int o;
    public final Animatable p;
    public final float q;
    public final boolean r;
    public final CardElevation s;
    public final Interaction t;

    public q2(Animatable animatable0, float f, boolean z, CardElevation cardElevation0, Interaction interaction0, Continuation continuation0) {
        this.p = animatable0;
        this.q = f;
        this.r = z;
        this.s = cardElevation0;
        this.t = interaction0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new q2(this.p, this.q, this.r, this.s, this.t, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((q2)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Animatable animatable0 = this.p;
                float f = ((Dp)animatable0.getTargetValue()).unbox-impl();
                float f1 = this.q;
                if(!Dp.equals-impl0(f, f1)) {
                    if(this.r) {
                        float f2 = ((Dp)animatable0.getTargetValue()).unbox-impl();
                        CardElevation cardElevation0 = this.s;
                        Press pressInteraction$Press0 = null;
                        if(Dp.equals-impl0(f2, cardElevation0.b)) {
                            pressInteraction$Press0 = new Press(0L, null);
                        }
                        else if(Dp.equals-impl0(f2, cardElevation0.d)) {
                            pressInteraction$Press0 = new Enter();
                        }
                        else if(Dp.equals-impl0(f2, cardElevation0.c)) {
                            pressInteraction$Press0 = new Focus();
                        }
                        else if(Dp.equals-impl0(f2, cardElevation0.e)) {
                            pressInteraction$Press0 = new Start();
                        }
                        this.o = 2;
                        if(ElevationKt.animateElevation-rAjV9yQ(animatable0, f1, pressInteraction$Press0, this.t, this) == object1) {
                            return object1;
                        }
                    }
                    else {
                        Dp dp0 = Dp.box-impl(f1);
                        this.o = 1;
                        if(animatable0.snapTo(dp0, this) == object1) {
                            return object1;
                        }
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

