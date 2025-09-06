package p0;

import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.material.SwipeableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import w0.j;

public final class i extends SuspendLambda implements Function3 {
    public final int o;
    public CoroutineScope p;
    public float q;
    public final Object r;

    public i(int v, Object object0, Continuation continuation0) {
        this.o = v;
        this.r = object0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        float f = ((Number)object1).floatValue();
        switch(this.o) {
            case 0: {
                i i1 = new i(0, ((AnchoredDraggableState)this.r), ((Continuation)object2));
                i1.p = (CoroutineScope)object0;
                i1.q = f;
                return i1.invokeSuspend(Unit.INSTANCE);
            }
            case 1: {
                i i2 = new i(1, ((SwipeableState)this.r), ((Continuation)object2));
                i2.p = (CoroutineScope)object0;
                i2.q = f;
                return i2.invokeSuspend(Unit.INSTANCE);
            }
            default: {
                i i0 = new i(2, ((androidx.compose.material3.internal.AnchoredDraggableState)this.r), ((Continuation)object2));
                i0.p = (CoroutineScope)object0;
                i0.q = f;
                return i0.invokeSuspend(Unit.INSTANCE);
            }
        }
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                BuildersKt.launch$default(this.p, null, null, new h(((AnchoredDraggableState)this.r), this.q, null), 3, null);
                return Unit.INSTANCE;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                BuildersKt.launch$default(this.p, null, null, new v9(((SwipeableState)this.r), this.q, null), 3, null);
                return Unit.INSTANCE;
            }
            default: {
                ResultKt.throwOnFailure(object0);
                BuildersKt.launch$default(this.p, null, null, new j(((androidx.compose.material3.internal.AnchoredDraggableState)this.r), this.q, null), 3, null);
                return Unit.INSTANCE;
            }
        }
    }
}

