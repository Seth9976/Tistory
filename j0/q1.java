package j0;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class q1 extends SuspendLambda implements Function2 {
    public int o;
    public final BringIntoViewRequester p;
    public final TextFieldValue q;
    public final LegacyTextFieldState r;
    public final TextLayoutResultProxy s;
    public final OffsetMapping t;

    public q1(BringIntoViewRequester bringIntoViewRequester0, TextFieldValue textFieldValue0, LegacyTextFieldState legacyTextFieldState0, TextLayoutResultProxy textLayoutResultProxy0, OffsetMapping offsetMapping0, Continuation continuation0) {
        this.p = bringIntoViewRequester0;
        this.q = textFieldValue0;
        this.r = legacyTextFieldState0;
        this.s = textLayoutResultProxy0;
        this.t = offsetMapping0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new q1(this.p, this.q, this.r, this.s, this.t, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((q1)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.o = 1;
                return CoreTextFieldKt.bringSelectionEndIntoView(this.p, this.q, this.r.getTextDelegate(), this.s.getValue(), this.t, this) == object1 ? object1 : Unit.INSTANCE;
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

