package i2;

import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter;
import androidx.compose.ui.text.font.PlatformFontLoader;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class l extends SuspendLambda implements Function2 {
    public int o;
    public final FontListFontFamilyTypefaceAdapter p;
    public final Font q;
    public final PlatformFontLoader r;

    public l(FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter0, Font font0, PlatformFontLoader platformFontLoader0, Continuation continuation0) {
        this.p = fontListFontFamilyTypefaceAdapter0;
        this.q = font0;
        this.r = platformFontLoader0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new l(this.p, this.q, this.r, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((l)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.o) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                k k0 = new k(this.q, this.r, null);
                this.o = 1;
                object0 = this.p.a.runCached(this.q, this.r, true, k0, this);
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

