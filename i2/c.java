package i2;

import androidx.compose.ui.text.font.AsyncFontListLoader;
import androidx.compose.ui.text.font.Font;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import qd.a;

public final class c extends SuspendLambda implements Function1 {
    public int o;
    public final AsyncFontListLoader p;
    public final Font q;

    public c(AsyncFontListLoader asyncFontListLoader0, Font font0, Continuation continuation0) {
        this.p = asyncFontListLoader0;
        this.q = font0;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new c(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((c)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.o = 1;
                object0 = this.p.loadWithTimeoutOrNull$ui_text_release(this.q, this);
                return object0 == object1 ? object1 : object0;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

