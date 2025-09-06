package m0;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifierKt;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode;
import androidx.compose.ui.geometry.Rect;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class k0 extends SuspendLambda implements Function2 {
    public int o;
    public final TextFieldCoreModifierNode p;
    public final float q;
    public final Rect r;

    public k0(TextFieldCoreModifierNode textFieldCoreModifierNode0, float f, Rect rect0, Continuation continuation0) {
        this.p = textFieldCoreModifierNode0;
        this.q = f;
        this.r = rect0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new k0(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((k0)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        TextFieldCoreModifierNode textFieldCoreModifierNode0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.o = 1;
                if(ScrollExtensionsKt.scrollBy(textFieldCoreModifierNode0.w, TextFieldCoreModifierKt.access$roundToNext(this.q), this) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.o = 2;
        return textFieldCoreModifierNode0.r.getBringIntoViewRequester().bringIntoView(this.r, this) == object1 ? object1 : Unit.INSTANCE;
    }
}

