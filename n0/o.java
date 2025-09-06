package n0;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.LongRef;

public final class o extends Lambda implements Function2 {
    public final LongRef w;
    public final TextFieldSelectionState x;
    public final LongRef y;

    public o(LongRef ref$LongRef0, TextFieldSelectionState textFieldSelectionState0, LongRef ref$LongRef1) {
        this.w = ref$LongRef0;
        this.x = textFieldSelectionState0;
        this.y = ref$LongRef1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        long v = Offset.plus-MK-Hz9U(this.w.element, ((Offset)object1).unbox-impl());
        this.w.element = v;
        TextFieldSelectionState textFieldSelectionState0 = this.x;
        textFieldSelectionState0.updateHandleDragging-Uv8p0NA(Handle.Cursor, Offset.plus-MK-Hz9U(this.y.element, v));
        if(TextFieldSelectionState.access$placeCursorAtNearestOffset-k-4lQ0M(textFieldSelectionState0, textFieldSelectionState0.getHandleDragPosition-F1C5BW0())) {
            ((PointerInputChange)object0).consume();
            HapticFeedback hapticFeedback0 = textFieldSelectionState0.h;
            if(hapticFeedback0 != null) {
                hapticFeedback0.performHapticFeedback-CdsT49E(HapticFeedbackType.Companion.getTextHandleMove-5zf0vsI());
            }
        }
        return Unit.INSTANCE;
    }
}

