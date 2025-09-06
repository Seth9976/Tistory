package w0;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.material3.internal.AnchoredDragScope;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchors;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref.FloatRef;
import qd.a;

public final class l extends SuspendLambda implements Function4 {
    public int o;
    public AnchoredDragScope p;
    public DraggableAnchors q;
    public Object r;
    public final AnchoredDraggableState s;
    public final float t;

    public l(AnchoredDraggableState anchoredDraggableState0, float f, Continuation continuation0) {
        this.s = anchoredDraggableState0;
        this.t = f;
        super(4, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        l l0 = new l(this.s, this.t, ((Continuation)object3));
        l0.p = (AnchoredDragScope)object0;
        l0.q = (DraggableAnchors)object1;
        l0.r = object2;
        return l0.invokeSuspend(Unit.INSTANCE);
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
                    float f1 = Float.isNaN(this.s.getOffset()) ? 0.0f : this.s.getOffset();
                    ref$FloatRef0.element = f1;
                    k k0 = new k(anchoredDragScope0, ref$FloatRef0);
                    this.p = null;
                    this.q = null;
                    this.o = 1;
                    if(SuspendAnimationKt.animate(f1, f, this.t, this.s.getAnimationSpec(), k0, this) == object1) {
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

