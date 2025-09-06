package i2;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class h extends ContinuationImpl {
    public FontFamilyResolverImpl o;
    public FontFamily p;
    public Object q;
    public final FontFamilyResolverImpl r;
    public int s;

    public h(FontFamilyResolverImpl fontFamilyResolverImpl0, Continuation continuation0) {
        this.r = fontFamilyResolverImpl0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.preload(null, this);
    }
}

