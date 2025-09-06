package j0;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class d3 extends SuspendLambda implements Function3 {
    public int o;
    public PressGestureScope p;
    public long q;
    public final CoroutineScope r;
    public final MutableState s;
    public final MutableInteractionSource t;

    public d3(CoroutineScope coroutineScope0, MutableState mutableState0, MutableInteractionSource mutableInteractionSource0, Continuation continuation0) {
        this.r = coroutineScope0;
        this.s = mutableState0;
        this.t = mutableInteractionSource0;
        super(3, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        d3 d30 = new d3(this.r, this.s, this.t, ((Continuation)object2));
        d30.p = (PressGestureScope)object0;
        d30.q = ((Offset)object1).unbox-impl();
        return d30.invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                PressGestureScope pressGestureScope0 = this.p;
                b3 b30 = new b3(this.s, this.q, this.t, null);
                BuildersKt.launch$default(this.r, null, null, b30, 3, null);
                this.o = 1;
                object0 = pressGestureScope0.tryAwaitRelease(this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        c3 c30 = new c3(this.s, ((Boolean)object0).booleanValue(), this.t, null);
        BuildersKt.launch$default(this.r, null, null, c30, 3, null);
        return Unit.INSTANCE;
    }
}

