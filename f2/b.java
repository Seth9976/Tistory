package f2;

import androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback;
import androidx.compose.ui.unit.IntRect;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class b extends ContinuationImpl {
    public ComposeScrollCaptureCallback o;
    public Object p;
    public IntRect q;
    public int r;
    public int s;
    public Object t;
    public final ComposeScrollCaptureCallback u;
    public int v;

    public b(ComposeScrollCaptureCallback composeScrollCaptureCallback0, Continuation continuation0) {
        this.u = composeScrollCaptureCallback0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.t = object0;
        this.v |= 0x80000000;
        return ComposeScrollCaptureCallback.access$onScrollCaptureImageRequest(this.u, null, null, this);
    }
}

