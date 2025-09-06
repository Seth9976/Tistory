package p0;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction.Focus;
import androidx.compose.foundation.interaction.HoverInteraction.Enter;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.material.ElevationKt;
import androidx.compose.ui.unit.Dp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import qd.a;

public final class n4 {
    public float a;
    public float b;
    public float c;
    public float d;
    public final Animatable e;
    public Interaction f;
    public Interaction g;

    public n4(float f, float f1, float f2, float f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.e = new Animatable(Dp.box-impl(f), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
    }

    public final Object a(Interaction interaction0, ContinuationImpl continuationImpl0) {
        n4 n40;
        float f;
        l4 l40;
        Animatable animatable0 = this.e;
        if(continuationImpl0 instanceof l4) {
            l40 = (l4)continuationImpl0;
            int v = l40.s;
            if((v & 0x80000000) == 0) {
                l40 = new l4(this, continuationImpl0);
            }
            else {
                l40.s = v ^ 0x80000000;
            }
        }
        else {
            l40 = new l4(this, continuationImpl0);
        }
        Object object0 = l40.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(l40.s) {
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
                        l40.o = this;
                        l40.p = interaction0;
                        l40.s = 1;
                        if(ElevationKt.animateElevation-rAjV9yQ(animatable0, f, this.f, interaction0, l40) == object1) {
                            return object1;
                        }
                    }
                    n40 = this;
                    break;
                }
                catch(Throwable throwable0) {
                    n40 = this;
                    n40.f = interaction0;
                    throw throwable0;
                }
            }
            case 1: {
                try {
                    interaction0 = l40.p;
                    n40 = l40.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
                n40.f = interaction0;
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        n40.f = interaction0;
        return Unit.INSTANCE;
    }

    public final Object b(ContinuationImpl continuationImpl0) {
        n4 n40;
        float f;
        m4 m40;
        if(continuationImpl0 instanceof m4) {
            m40 = (m4)continuationImpl0;
            int v = m40.r;
            if((v & 0x80000000) == 0) {
                m40 = new m4(this, continuationImpl0);
            }
            else {
                m40.r = v ^ 0x80000000;
            }
        }
        else {
            m40 = new m4(this, continuationImpl0);
        }
        Object object0 = m40.p;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(m40.r) {
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
                        m40.o = this;
                        m40.r = 1;
                        if(animatable0.snapTo(dp0, m40) == object1) {
                            return object1;
                        }
                    }
                    catch(Throwable throwable0) {
                        n40 = this;
                        n40.f = n40.g;
                        throw throwable0;
                    }
                    n40 = this;
                    break;
                }
                return Unit.INSTANCE;
            }
            case 1: {
                try {
                    n40 = m40.o;
                    ResultKt.throwOnFailure(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
                n40.f = n40.g;
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        n40.f = n40.g;
        return Unit.INSTANCE;
    }
}

