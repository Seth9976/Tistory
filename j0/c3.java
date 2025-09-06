package j0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction.Cancel;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.foundation.interaction.PressInteraction.Release;
import androidx.compose.runtime.MutableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class c3 extends SuspendLambda implements Function2 {
    public MutableState o;
    public int p;
    public final MutableState q;
    public final boolean r;
    public final MutableInteractionSource s;

    public c3(MutableState mutableState0, boolean z, MutableInteractionSource mutableInteractionSource0, Continuation continuation0) {
        this.q = mutableState0;
        this.r = z;
        this.s = mutableInteractionSource0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new c3(this.q, this.r, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((c3)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                MutableState mutableState0 = this.q;
                Press pressInteraction$Press0 = (Press)mutableState0.getValue();
                if(pressInteraction$Press0 != null) {
                    Release pressInteraction$Release0 = this.r ? new Release(pressInteraction$Press0) : new Cancel(pressInteraction$Press0);
                    MutableInteractionSource mutableInteractionSource0 = this.s;
                    if(mutableInteractionSource0 != null) {
                        this.o = mutableState0;
                        this.p = 1;
                        if(mutableInteractionSource0.emit(pressInteraction$Release0, this) == object1) {
                            return object1;
                        }
                    }
                    mutableState0.setValue(null);
                    return Unit.INSTANCE;
                }
                break;
            }
            case 1: {
                MutableState mutableState1 = this.o;
                ResultKt.throwOnFailure(object0);
                mutableState1.setValue(null);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return Unit.INSTANCE;
    }
}

