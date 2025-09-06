package p0;

import androidx.compose.material.AnchoredDraggableKt;
import androidx.compose.material.AnchoredDraggableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class ga extends SuspendLambda implements Function2 {
    public int o;
    public final boolean p;
    public final AnchoredDraggableState q;

    public ga(boolean z, AnchoredDraggableState anchoredDraggableState0, Continuation continuation0) {
        this.p = z;
        this.q = anchoredDraggableState0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new ga(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((ga)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                boolean z = ((Boolean)this.q.getCurrentValue()).booleanValue();
                boolean z1 = this.p;
                if(z1 != z) {
                    this.o = 1;
                    if(AnchoredDraggableKt.animateTo$default(this.q, Boxing.boxBoolean(z1), 0.0f, this, 2, null) == object1) {
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

