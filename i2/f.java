package i2;

import androidx.compose.ui.text.font.AsyncTypefaceCache.Key;
import androidx.compose.ui.text.font.AsyncTypefaceCache;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class f extends ContinuationImpl {
    public AsyncTypefaceCache o;
    public Key p;
    public boolean q;
    public Object r;
    public final AsyncTypefaceCache s;
    public int t;

    public f(AsyncTypefaceCache asyncTypefaceCache0, Continuation continuation0) {
        this.s = asyncTypefaceCache0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return this.s.runCached(null, null, false, null, this);
    }
}

