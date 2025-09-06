package l1;

import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.ChannelIterator;

public final class d extends ContinuationImpl {
    public AndroidContentCaptureManager o;
    public ChannelIterator p;
    public Object q;
    public final AndroidContentCaptureManager r;
    public int s;

    public d(AndroidContentCaptureManager androidContentCaptureManager0, Continuation continuation0) {
        this.r = androidContentCaptureManager0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.q = object0;
        this.s |= 0x80000000;
        return this.r.boundsUpdatesEventLoop$ui_release(this);
    }
}

