package g0;

import androidx.compose.ui.geometry.Rect;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class a extends ContinuationImpl {
    public Rect o;
    public Object[] p;
    public int q;
    public int r;
    public Object s;
    public final b t;
    public int u;

    public a(b b0, Continuation continuation0) {
        this.t = b0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.s = object0;
        this.u |= 0x80000000;
        return this.t.bringIntoView(null, this);
    }
}

