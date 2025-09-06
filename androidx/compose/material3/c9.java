package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.material3.internal.AnchoredDragScope;
import androidx.compose.material3.internal.DraggableAnchors;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref.FloatRef;
import qd.a;

public final class c9 extends SuspendLambda implements Function4 {
    public int o;
    public AnchoredDragScope p;
    public DraggableAnchors q;
    public DrawerValue r;
    public final DrawerState s;
    public final float t;
    public final AnimationSpec u;

    public c9(DrawerState drawerState0, float f, AnimationSpec animationSpec0, Continuation continuation0) {
        this.s = drawerState0;
        this.t = f;
        this.u = animationSpec0;
        super(4, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        c9 c90 = new c9(this.s, this.t, this.u, ((Continuation)object3));
        c90.p = (AnchoredDragScope)object0;
        c90.q = (DraggableAnchors)object1;
        c90.r = (DrawerValue)object2;
        return c90.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                AnchoredDragScope anchoredDragScope0 = this.p;
                float f = this.q.positionOf(this.r);
                if(!Float.isNaN(f)) {
                    FloatRef ref$FloatRef0 = new FloatRef();
                    float f1 = Float.isNaN(this.s.getCurrentOffset()) ? 0.0f : this.s.getCurrentOffset();
                    ref$FloatRef0.element = f1;
                    b9 b90 = new b9(anchoredDragScope0, ref$FloatRef0);
                    this.p = null;
                    this.q = null;
                    this.o = 1;
                    if(SuspendAnimationKt.animate(f1, f, this.t, this.u, b90, this) == object1) {
                        return object1;
                    }
                }
                return Unit.INSTANCE;
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

