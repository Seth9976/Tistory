package m0;

import androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class h1 extends ContinuationImpl {
    public NotifyImeListener o;
    public Object p;
    public final TransformedTextFieldState q;
    public int r;

    public h1(TransformedTextFieldState transformedTextFieldState0, Continuation continuation0) {
        this.q = transformedTextFieldState0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.collectImeNotifications(null, this);
    }
}

