package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction.Focus;
import androidx.compose.foundation.interaction.HoverInteraction.Enter;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.material3.internal.ElevationKt;
import androidx.compose.ui.unit.Dp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import qd.a;

public final class ma {
    public float a;
    public float b;
    public float c;
    public float d;
    public final Animatable e;
    public Interaction f;
    public Interaction g;

    public ma(float f, float f1, float f2, float f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.e = new Animatable(Dp.box-impl(f), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
    }

    public final Object a(Interaction interaction0, ContinuationImpl continuationImpl0) {
        ma ma0;
        float f;
        ka ka0;
        Animatable animatable0 = this.e;
        if(continuationImpl0 instanceof ka) {
            ka0 = (ka)continuationImpl0;
            int v = ka0.s;
            if((v & 0x80000000) == 0) {
                ka0 = new ka(this, continuationImpl0);
            }
            else {
                ka0.s = v ^ 0x80000000;
            }
        }
        else {
            ka0 = new ka(this, continuationImpl0);
        }
        Object object0 = ka0.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(ka0.s) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(interaction0 instanceof Press) {
                    f = this.b;
                }
                else if(interaction0 instanceof Enter) {
                    f = this.c;
                }
                else {
                    f = interaction0 instanceof Focus ? this.d : this.a;
                }
                try {
                    this.g = interaction0;
                    if(!Dp.equals-impl0(((Dp)animatable0.getTargetValue()).unbox-impl(), f)) {
                        ka0.o = this;
                        ka0.p = interaction0;
                        ka0.s = 1;
                        if(ElevationKt.animateElevation-rAjV9yQ(animatable0, f, this.f, interaction0, ka0) == object1) {
                            return object1;
                        }
                    }
                    ma0 = this;
                    break;
                }
                catch(Throwable throwable0) {
                    ma0 = this;
                    ma0.f = interaction0;
                    throw throwable0;
                }
            }
            case 1: {
                try {
                    interaction0 = ka0.p;
                    ma0 = ka0.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
                ma0.f = interaction0;
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ma0.f = interaction0;
        return Unit.INSTANCE;
    }

    public final Object b(ContinuationImpl continuationImpl0) {
        ma ma0;
        float f;
        la la0;
        if(continuationImpl0 instanceof la) {
            la0 = (la)continuationImpl0;
            int v = la0.r;
            if((v & 0x80000000) == 0) {
                la0 = new la(this, continuationImpl0);
            }
            else {
                la0.r = v ^ 0x80000000;
            }
        }
        else {
            la0 = new la(this, continuationImpl0);
        }
        Object object0 = la0.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(la0.r) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Interaction interaction0 = this.g;
                if(interaction0 instanceof Press) {
                    f = this.b;
                }
                else if(interaction0 instanceof Enter) {
                    f = this.c;
                }
                else {
                    f = interaction0 instanceof Focus ? this.d : this.a;
                }
                Animatable animatable0 = this.e;
                if(!Dp.equals-impl0(((Dp)animatable0.getTargetValue()).unbox-impl(), f)) {
                    try {
                        Dp dp0 = Dp.box-impl(f);
                        la0.o = this;
                        la0.r = 1;
                        if(animatable0.snapTo(dp0, la0) == object1) {
                            return object1;
                        }
                    }
                    catch(Throwable throwable0) {
                        ma0 = this;
                        ma0.f = ma0.g;
                        throw throwable0;
                    }
                    ma0 = this;
                    break;
                }
                return Unit.INSTANCE;
            }
            case 1: {
                try {
                    ma0 = la0.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
                ma0.f = ma0.g;
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ma0.f = ma0.g;
        return Unit.INSTANCE;
    }
}

