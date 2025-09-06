package n0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction.Cancel;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class u extends SuspendLambda implements Function2 {
    public Object o;
    public int p;
    public final TextFieldSelectionState q;
    public final long r;
    public final MutableInteractionSource s;

    public u(TextFieldSelectionState textFieldSelectionState0, long v, MutableInteractionSource mutableInteractionSource0, Continuation continuation0) {
        this.q = textFieldSelectionState0;
        this.r = v;
        this.s = mutableInteractionSource0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new u(this.q, this.r, this.s, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((u)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Press pressInteraction$Press2;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        MutableInteractionSource mutableInteractionSource0 = this.s;
        TextFieldSelectionState textFieldSelectionState0 = this.q;
        switch(this.p) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Press pressInteraction$Press0 = textFieldSelectionState0.u;
                if(pressInteraction$Press0 != null) {
                    Cancel pressInteraction$Cancel0 = new Cancel(pressInteraction$Press0);
                    this.o = textFieldSelectionState0;
                    this.p = 1;
                    if(mutableInteractionSource0.emit(pressInteraction$Cancel0, this) == object1) {
                        return object1;
                    }
                    textFieldSelectionState0.u = null;
                }
                goto label_18;
            }
            case 1: {
                TextFieldSelectionState textFieldSelectionState1 = (TextFieldSelectionState)this.o;
                ResultKt.throwOnFailure(object0);
                textFieldSelectionState1.u = null;
            label_18:
                Press pressInteraction$Press1 = new Press(this.r, null);
                this.o = pressInteraction$Press1;
                this.p = 2;
                if(mutableInteractionSource0.emit(pressInteraction$Press1, this) == object1) {
                    return object1;
                }
                pressInteraction$Press2 = pressInteraction$Press1;
                break;
            }
            case 2: {
                pressInteraction$Press2 = (Press)this.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        textFieldSelectionState0.u = pressInteraction$Press2;
        return Unit.INSTANCE;
    }
}

