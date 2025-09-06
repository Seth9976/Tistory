package p0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.e9;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import qd.a;

public final class m8 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final MutableInteractionSource q;
    public final MutableInteractionSource r;
    public final State s;
    public final State t;
    public final State u;
    public final boolean v;
    public final float w;
    public final State x;

    public m8(MutableInteractionSource mutableInteractionSource0, MutableInteractionSource mutableInteractionSource1, State state0, State state1, State state2, boolean z, float f, State state3, Continuation continuation0) {
        this.q = mutableInteractionSource0;
        this.r = mutableInteractionSource1;
        this.s = state0;
        this.t = state1;
        this.u = state2;
        this.v = z;
        this.w = f;
        this.x = state3;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new m8(this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((m8)this.create(((PointerInputScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                PointerInputScope pointerInputScope0 = (PointerInputScope)this.p;
                e9 e90 = new e9(this.q, this.r, this.s, this.t, this.u);
                l8 l80 = new l8(pointerInputScope0, this.v, this.w, e90, this.s, this.x, this.t, this.u, null);
                this.o = 1;
                return CoroutineScopeKt.coroutineScope(l80, this) == object1 ? object1 : Unit.INSTANCE;
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

