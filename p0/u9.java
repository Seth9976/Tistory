package p0;

import androidx.compose.foundation.text.selection.y;
import androidx.compose.material.ResistanceConfig;
import androidx.compose.material.SwipeableState;
import androidx.compose.ui.unit.Density;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class u9 extends SuspendLambda implements Function2 {
    public int o;
    public final SwipeableState p;
    public final Map q;
    public final ResistanceConfig r;
    public final Density s;
    public final Function2 t;
    public final float u;

    public u9(SwipeableState swipeableState0, Map map0, ResistanceConfig resistanceConfig0, Density density0, Function2 function20, float f, Continuation continuation0) {
        this.p = swipeableState0;
        this.q = map0;
        this.r = resistanceConfig0;
        this.s = density0;
        this.t = function20;
        this.u = f;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new u9(this.p, this.q, this.r, this.s, this.t, this.u, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((u9)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Map map0 = this.p.getAnchors$material_release();
                this.p.setAnchors$material_release(this.q);
                this.p.setResistance$material_release(this.r);
                y y0 = new y(this.q, this.t, this.s);
                this.p.setThresholds$material_release(y0);
                float f = this.s.toPx-0680j_4(this.u);
                this.p.setVelocityThreshold$material_release(f);
                this.o = 1;
                return this.p.processNewAnchors$material_release(map0, this.q, this) == object1 ? object1 : Unit.INSTANCE;
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

