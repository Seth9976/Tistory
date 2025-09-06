package androidx.compose.ui.platform;

import androidx.collection.MutableIntSet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.ChannelIterator;

public final class x extends ContinuationImpl {
    public AndroidComposeViewAccessibilityDelegateCompat o;
    public MutableIntSet p;
    public ChannelIterator q;
    public Object r;
    public final AndroidComposeViewAccessibilityDelegateCompat s;
    public int t;

    public x(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0, Continuation continuation0) {
        this.s = androidComposeViewAccessibilityDelegateCompat0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return this.s.boundsUpdatesEventLoop$ui_release(this);
    }
}

