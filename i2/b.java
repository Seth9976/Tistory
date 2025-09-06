package i2;

import androidx.compose.ui.text.font.AsyncFontListLoader;
import androidx.compose.ui.text.font.Font;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class b extends ContinuationImpl {
    public AsyncFontListLoader o;
    public List p;
    public Font q;
    public int r;
    public int s;
    public Object t;
    public final AsyncFontListLoader u;
    public int v;

    public b(AsyncFontListLoader asyncFontListLoader0, Continuation continuation0) {
        this.u = asyncFontListLoader0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.t = object0;
        this.v |= 0x80000000;
        return this.u.load(this);
    }
}

