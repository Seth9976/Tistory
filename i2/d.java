package i2;

import androidx.compose.ui.text.font.AsyncFontListLoader;
import androidx.compose.ui.text.font.Font;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class d extends ContinuationImpl {
    public Font o;
    public Object p;
    public final AsyncFontListLoader q;
    public int r;

    public d(AsyncFontListLoader asyncFontListLoader0, Continuation continuation0) {
        this.q = asyncFontListLoader0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.loadWithTimeoutOrNull$ui_text_release(null, this);
    }
}

