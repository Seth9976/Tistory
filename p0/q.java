package p0;

import androidx.compose.material.AnchoredDragScope;
import androidx.compose.material.DraggableAnchors;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;

public final class q extends SuspendLambda implements Function4 {
    public final int o;
    public Object p;
    public Object q;
    public Object r;

    public q(int v, int v1, Continuation continuation0) {
        this.o = v1;
        super(v, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        switch(this.o) {
            case 0: {
                q q1 = new q(4, 0, ((Continuation)object3));
                q1.q = (AnchoredDragScope)object0;
                q1.r = (DraggableAnchors)object1;
                q1.p = object2;
                return q1.invokeSuspend(Unit.INSTANCE);
            }
            case 1: {
                q q2 = new q(4, 1, ((Continuation)object3));
                q2.q = (androidx.compose.material3.internal.AnchoredDragScope)object0;
                q2.r = (androidx.compose.material3.internal.DraggableAnchors)object1;
                q2.p = object2;
                return q2.invokeSuspend(Unit.INSTANCE);
            }
            default: {
                q q0 = new q(4, 2, ((Continuation)object3));
                q0.q = (androidx.compose.foundation.gestures.AnchoredDragScope)object0;
                q0.r = (androidx.compose.foundation.gestures.DraggableAnchors)object1;
                q0.p = object2;
                return q0.invokeSuspend(Unit.INSTANCE);
            }
        }
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                AnchoredDragScope anchoredDragScope1 = (AnchoredDragScope)this.q;
                float f1 = ((DraggableAnchors)this.r).positionOf(this.p);
                if(!Float.isNaN(f1)) {
                    AnchoredDragScope.dragTo$default(anchoredDragScope1, f1, 0.0f, 2, null);
                }
                return Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                androidx.compose.material3.internal.AnchoredDragScope anchoredDragScope2 = (androidx.compose.material3.internal.AnchoredDragScope)this.q;
                float f2 = ((androidx.compose.material3.internal.DraggableAnchors)this.r).positionOf(this.p);
                if(!Float.isNaN(f2)) {
                    androidx.compose.material3.internal.AnchoredDragScope.dragTo$default(anchoredDragScope2, f2, 0.0f, 2, null);
                }
                return Unit.INSTANCE;
            }
            default: {
                ResultKt.throwOnFailure(object0);
                androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope0 = (androidx.compose.foundation.gestures.AnchoredDragScope)this.q;
                float f = ((androidx.compose.foundation.gestures.DraggableAnchors)this.r).positionOf(this.p);
                if(!Float.isNaN(f)) {
                    androidx.compose.foundation.gestures.AnchoredDragScope.dragTo$default(anchoredDragScope0, f, 0.0f, 2, null);
                }
                return Unit.INSTANCE;
            }
        }
    }
}

