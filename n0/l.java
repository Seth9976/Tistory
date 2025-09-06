package n0;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.LongRef;

public final class l extends Lambda implements Function1 {
    public final LongRef w;
    public final TextFieldSelectionState x;
    public final LongRef y;

    public l(LongRef ref$LongRef0, TextFieldSelectionState textFieldSelectionState0, LongRef ref$LongRef1) {
        this.w = ref$LongRef0;
        this.x = textFieldSelectionState0;
        this.y = ref$LongRef1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.w.element = SelectionHandlesKt.getAdjustedCoordinates-k-4lQ0M(this.x.getCursorRect().getBottomCenter-F1C5BW0());
        this.y.element = 0L;
        this.x.setInTouchMode(true);
        TextFieldSelectionState.access$markStartContentVisibleOffset(this.x);
        this.x.updateHandleDragging-Uv8p0NA(Handle.Cursor, this.w.element);
        return Unit.INSTANCE;
    }
}

