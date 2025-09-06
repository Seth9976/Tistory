package i2;

import androidx.compose.ui.text.font.AndroidFontLoader;
import androidx.compose.ui.text.font.Font;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class a extends ContinuationImpl {
    public AndroidFontLoader o;
    public Font p;
    public Object q;
    public final AndroidFontLoader r;
    public int s;

    public a(AndroidFontLoader androidFontLoader0, Continuation continuation0) {
        this.r = androidFontLoader0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.awaitLoad(null, this);
    }
}

