package z;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.AnchoredDragScope;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DraggableAnchors;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref.FloatRef;
import qd.a;

public final class g extends SuspendLambda implements Function4 {
    public int o;
    public AnchoredDragScope p;
    public DraggableAnchors q;
    public Object r;
    public final AnchoredDraggableState s;
    public final float t;
    public final FloatRef u;

    public g(AnchoredDraggableState anchoredDraggableState0, float f, FloatRef ref$FloatRef0, Continuation continuation0) {
        this.s = anchoredDraggableState0;
        this.t = f;
        this.u = ref$FloatRef0;
        super(4, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        g g0 = new g(this.s, this.t, this.u, ((Continuation)object3));
        g0.p = (AnchoredDragScope)object0;
        g0.q = (DraggableAnchors)object1;
        g0.r = object2;
        return g0.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        FloatRef ref$FloatRef0 = this.u;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                AnchoredDragScope anchoredDragScope0 = this.p;
                DraggableAnchors draggableAnchors0 = this.q;
                Object object2 = this.r;
                float f = draggableAnchors0.positionOf(object2);
                if(Float.isNaN(f)) {
                    return Unit.INSTANCE;
                }
                FloatRef ref$FloatRef1 = new FloatRef();
                AnchoredDraggableState anchoredDraggableState0 = this.s;
                float f1 = Float.isNaN(anchoredDraggableState0.getOffset()) ? 0.0f : anchoredDraggableState0.getOffset();
                ref$FloatRef1.element = f1;
                if(f1 == f) {
                    return Unit.INSTANCE;
                }
                float f2 = this.t;
                if(Float.compare((f - f1) * f2, 0.0f) < 0 || f2 == 0.0f) {
                    goto label_37;
                }
                float f3 = DecayAnimationSpecKt.calculateTargetValue(anchoredDraggableState0.getDecayAnimationSpec(), ref$FloatRef1.element, this.t);
                float f4 = this.t;
                if(f4 <= 0.0f) {
                    if(f3 <= f) {
                    label_25:
                        AnimationState animationState0 = AnimationStateKt.AnimationState$default(ref$FloatRef1.element, f4, 0L, 0L, false, 28, null);
                        f f5 = new f(f, anchoredDragScope0, ref$FloatRef0, ref$FloatRef1);
                        this.p = null;
                        this.q = null;
                        this.o = 2;
                        return SuspendAnimationKt.animateDecay$default(animationState0, anchoredDraggableState0.getDecayAnimationSpec(), false, f5, this, 2, null) != object1 ? Unit.INSTANCE : object1;
                    }
                }
                else if(f3 >= f) {
                    goto label_25;
                }
                this.p = null;
                this.q = null;
                this.o = 3;
                if(AnchoredDraggableKt.access$animateTo(this.s, f4, anchoredDragScope0, draggableAnchors0, object2, this) == object1) {
                    return object1;
                label_37:
                    this.p = null;
                    this.q = null;
                    this.o = 1;
                    if(AnchoredDraggableKt.access$animateTo(this.s, f2, anchoredDragScope0, draggableAnchors0, object2, this) == object1) {
                        return object1;
                    }
                    ref$FloatRef0.element = 0.0f;
                    return Unit.INSTANCE;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                ref$FloatRef0.element = 0.0f;
                return Unit.INSTANCE;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            case 3: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ref$FloatRef0.element = 0.0f;
        return Unit.INSTANCE;
    }
}

