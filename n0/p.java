package n0;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref.LongRef;

public final class p extends ContinuationImpl {
    public TextFieldSelectionState o;
    public LongRef p;
    public LongRef q;
    public Handle r;
    public Object s;
    public final TextFieldSelectionState t;
    public int u;

    public p(TextFieldSelectionState textFieldSelectionState0, Continuation continuation0) {
        this.t = textFieldSelectionState0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.s = object0;
        this.u |= 0x80000000;
        return TextFieldSelectionState.access$detectSelectionHandleDragGestures(this.t, null, false, this);
    }
}

