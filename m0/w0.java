package m0;

import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputSessionScope;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.h;
import androidx.compose.ui.text.input.ImeOptions;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;
import qd.a;

public final class w0 extends SuspendLambda implements Function2 {
    public int o;
    public Object p;
    public final TextFieldDecoratorModifierNode q;
    public final ReceiveContentConfiguration r;

    public w0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode0, ReceiveContentConfiguration receiveContentConfiguration0, Continuation continuation0) {
        this.q = textFieldDecoratorModifierNode0;
        this.r = receiveContentConfiguration0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        Continuation continuation1 = new w0(this.q, this.r, continuation0);
        continuation1.p = object0;
        return continuation1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((w0)this.create(((PlatformTextInputSessionScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                PlatformTextInputSessionScope platformTextInputSessionScope0 = (PlatformTextInputSessionScope)this.p;
                ImeOptions imeOptions0 = this.q.getKeyboardOptions().toImeOptions$foundation_release(this.q.getSingleLine());
                h h0 = new h(this.q, 6);
                MutableSharedFlow mutableSharedFlow0 = TextFieldDecoratorModifierNode.access$getStylusHandwritingTrigger(this.q);
                Object object2 = CompositionLocalConsumerModifierNodeKt.currentValueOf(this.q, CompositionLocalsKt.getLocalViewConfiguration());
                this.o = 1;
                if(AndroidTextInputSession_androidKt.platformSpecificTextInputSession(platformTextInputSessionScope0, this.q.getTextFieldState(), this.q.getTextLayoutState(), imeOptions0, this.r, h0, mutableSharedFlow0, ((ViewConfiguration)object2), this) == object1) {
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
        throw new KotlinNothingValueException();
    }
}

