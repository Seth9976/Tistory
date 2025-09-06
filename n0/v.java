package n0;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction.Cancel;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.foundation.interaction.PressInteraction.Release;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class v extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final PressGestureScope q;
    public final TextFieldSelectionState r;
    public final long s;
    public final MutableInteractionSource t;

    public v(PressGestureScope pressGestureScope0, TextFieldSelectionState textFieldSelectionState0, long v, MutableInteractionSource mutableInteractionSource0, Continuation continuation0) {
        this.q = pressGestureScope0;
        this.r = textFieldSelectionState0;
        this.s = v;
        this.t = mutableInteractionSource0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new v(this.q, this.r, this.s, this.t, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((v)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        TextFieldSelectionState textFieldSelectionState0 = this.r;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                BuildersKt.launch$default(((CoroutineScope)this.p), null, null, new u(this.r, this.s, this.t, null), 3, null);
                this.o = 1;
                object0 = this.q.tryAwaitRelease(this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_11;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
            label_11:
                boolean z = ((Boolean)object0).booleanValue();
                Press pressInteraction$Press0 = textFieldSelectionState0.u;
                if(pressInteraction$Press0 != null) {
                    Release pressInteraction$Release0 = z ? new Release(pressInteraction$Press0) : new Cancel(pressInteraction$Press0);
                    this.o = 2;
                    if(this.t.emit(pressInteraction$Release0, this) == object1) {
                        return object1;
                    }
                }
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        textFieldSelectionState0.u = null;
        return Unit.INSTANCE;
    }
}

