package n0;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.LongRef;

public final class m extends Lambda implements Function0 {
    public final LongRef w;
    public final LongRef x;
    public final TextFieldSelectionState y;

    public m(LongRef ref$LongRef0, TextFieldSelectionState textFieldSelectionState0, LongRef ref$LongRef1) {
        this.w = ref$LongRef0;
        this.x = ref$LongRef1;
        this.y = textFieldSelectionState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TextFieldSelectionState.access$detectCursorHandleDragGestures$onDragStop(this.w, this.x, this.y);
        return Unit.INSTANCE;
    }
}

