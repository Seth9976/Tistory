package u;

import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import qd.a;

public final class c extends SuspendLambda implements Function2 {
    public Press o;
    public int p;
    public final AbstractClickableNode q;
    public final long r;
    public final MutableInteractionSource s;

    public c(AbstractClickableNode abstractClickableNode0, long v, MutableInteractionSource mutableInteractionSource0, Continuation continuation0) {
        this.q = abstractClickableNode0;
        this.r = v;
        this.s = mutableInteractionSource0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new c(this.q, this.r, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Press pressInteraction$Press1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        AbstractClickableNode abstractClickableNode0 = this.q;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(AbstractClickableNode.access$delayPressInteraction(abstractClickableNode0)) {
                    this.p = 1;
                    if(DelayKt.delay(100L, this) == object1) {
                        return object1;
                    }
                }
                goto label_10;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
            label_10:
                Press pressInteraction$Press0 = new Press(this.r, null);
                this.o = pressInteraction$Press0;
                this.p = 2;
                if(this.s.emit(pressInteraction$Press0, this) == object1) {
                    return object1;
                }
                pressInteraction$Press1 = pressInteraction$Press0;
                break;
            }
            case 2: {
                pressInteraction$Press1 = this.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        abstractClickableNode0.z = pressInteraction$Press1;
        return Unit.INSTANCE;
    }
}

