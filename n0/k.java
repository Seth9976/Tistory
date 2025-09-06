package n0;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.LongRef;

public final class k extends ContinuationImpl {
    public TextFieldSelectionState o;
    public LongRef p;
    public LongRef q;
    public Object r;
    public final TextFieldSelectionState s;
    public int t;

    public k(TextFieldSelectionState textFieldSelectionState0, Continuation continuation0) {
        this.s = textFieldSelectionState0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.r = object0;
        this.t |= 0x80000000;
        return TextFieldSelectionState.access$detectCursorHandleDragGestures(this.s, null, this);
    }
}

