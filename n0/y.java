package n0;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class y extends ContinuationImpl {
    public TextFieldSelectionState o;
    public Object p;
    public final TextFieldSelectionState q;
    public int r;

    public y(TextFieldSelectionState textFieldSelectionState0, Continuation continuation0) {
        this.q = textFieldSelectionState0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.p = object0;
        this.r |= 0x80000000;
        return this.q.observeChanges(this);
    }
}

