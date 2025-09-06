package j0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction.Cancel;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.runtime.MutableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class b3 extends SuspendLambda implements Function2 {
    public Object o;
    public int p;
    public final MutableState q;
    public final long r;
    public final MutableInteractionSource s;

    public b3(MutableState mutableState0, long v, MutableInteractionSource mutableInteractionSource0, Continuation continuation0) {
        this.q = mutableState0;
        this.r = v;
        this.s = mutableInteractionSource0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new b3(this.q, this.r, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((b3)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Press pressInteraction$Press1;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        MutableInteractionSource mutableInteractionSource0 = this.s;
        MutableState mutableState0 = this.q;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Press pressInteraction$Press0 = (Press)mutableState0.getValue();
                if(pressInteraction$Press0 != null) {
                    Cancel pressInteraction$Cancel0 = new Cancel(pressInteraction$Press0);
                    if(mutableInteractionSource0 != null) {
                        this.o = mutableState0;
                        this.p = 1;
                        if(mutableInteractionSource0.emit(pressInteraction$Cancel0, this) == object1) {
                            return object1;
                        }
                    }
                    mutableState0.setValue(null);
                }
                goto label_19;
            }
            case 1: {
                MutableState mutableState1 = (MutableState)this.o;
                ResultKt.throwOnFailure(object0);
                mutableState1.setValue(null);
            label_19:
                pressInteraction$Press1 = new Press(this.r, null);
                if(mutableInteractionSource0 != null) {
                    this.o = pressInteraction$Press1;
                    this.p = 2;
                    if(mutableInteractionSource0.emit(pressInteraction$Press1, this) == object1) {
                        return object1;
                    }
                }
                break;
            }
            case 2: {
                Press pressInteraction$Press2 = (Press)this.o;
                ResultKt.throwOnFailure(object0);
                pressInteraction$Press1 = pressInteraction$Press2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        mutableState0.setValue(pressInteraction$Press1);
        return Unit.INSTANCE;
    }
}

