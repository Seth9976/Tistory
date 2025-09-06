package i2;

import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.PlatformFontLoader;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.TimeoutKt;
import qd.a;

public final class k extends SuspendLambda implements Function1 {
    public int o;
    public final Font p;
    public final PlatformFontLoader q;

    public k(Font font0, PlatformFontLoader platformFontLoader0, Continuation continuation0) {
        this.p = font0;
        this.q = platformFontLoader0;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new k(this.p, this.q, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((k)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        Font font0 = this.p;
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                try {
                    j j0 = new j(font0, this.q, null);
                    this.o = 1;
                    object0 = TimeoutKt.withTimeout(15000L, j0, this);
                    if(object0 == object1) {
                        return object1;
                    label_10:
                        ResultKt.throwOnFailure(object0);
                    }
                    break;
                }
                catch(Exception exception0) {
                    throw new IllegalStateException("Unable to load font " + font0, exception0);
                }
            }
            case 1: {
                goto label_10;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(object0 == null) {
            throw new IllegalStateException("Unable to load font " + font0);
        }
        return object0;
    }
}

