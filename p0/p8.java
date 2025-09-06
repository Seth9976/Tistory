package p0;

import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import qd.a;

public final class p8 extends SuspendLambda implements Function3 {
    public int o;
    public PressGestureScope p;
    public long q;
    public final boolean r;
    public final float s;
    public final MutableState t;
    public final State u;

    public p8(boolean z, float f, MutableState mutableState0, State state0, Continuation continuation0) {
        this.r = z;
        this.s = f;
        this.t = mutableState0;
        this.u = state0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        p8 p80 = new p8(this.r, this.s, this.t, this.u, ((Continuation)object2));
        p80.p = (PressGestureScope)object0;
        p80.q = ((Offset)object1).unbox-impl();
        return p80.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        MutableState mutableState0 = this.t;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                PressGestureScope pressGestureScope0 = this.p;
                mutableState0.setValue(Boxing.boxFloat((this.r ? this.s - Offset.getX-impl(this.q) : Offset.getX-impl(this.q)) - ((Number)this.u.getValue()).floatValue()));
                try {
                    this.o = 1;
                    if(pressGestureScope0.awaitRelease(this) == object1) {
                        return object1;
                    }
                }
                catch(GestureCancellationException unused_ex) {
                    mutableState0.setValue(Boxing.boxFloat(0.0f));
                }
                return Unit.INSTANCE;
            }
            case 1: {
                try {
                    ResultKt.throwOnFailure(object0);
                }
                catch(GestureCancellationException unused_ex) {
                    mutableState0.setValue(Boxing.boxFloat(0.0f));
                }
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

