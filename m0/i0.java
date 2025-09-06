package m0;

import androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qd.a;

public final class i0 extends SuspendLambda implements Function2 {
    public int o;
    public int p;
    public final TextFieldCoreModifierNode q;

    public i0(TextFieldCoreModifierNode textFieldCoreModifierNode0, Continuation continuation0) {
        this.q = textFieldCoreModifierNode0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new i0(this.q, continuation0);
        continuation1.p = ((Number)object0).intValue();
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((i0)this.create(((Number)object0).intValue(), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(Math.abs(this.p) == 1) {
                    this.o = 1;
                    if(this.q.y.snapToVisibleAndAnimate(this) == object1) {
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

