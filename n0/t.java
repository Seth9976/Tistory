package n0;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.LongRef;

public final class t extends Lambda implements Function2 {
    public final boolean A;
    public final LongRef w;
    public final TextFieldSelectionState x;
    public final Handle y;
    public final LongRef z;

    public t(Handle handle0, TextFieldSelectionState textFieldSelectionState0, LongRef ref$LongRef0, LongRef ref$LongRef1, boolean z) {
        this.w = ref$LongRef0;
        this.x = textFieldSelectionState0;
        this.y = handle0;
        this.z = ref$LongRef1;
        this.A = z;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        PointerInputChange pointerInputChange0 = (PointerInputChange)object0;
        LongRef ref$LongRef0 = this.w;
        ref$LongRef0.element = Offset.plus-MK-Hz9U(ref$LongRef0.element, ((Offset)object1).unbox-impl());
        TextFieldSelectionState textFieldSelectionState0 = this.x;
        TextLayoutResult textLayoutResult0 = textFieldSelectionState0.b.getLayoutResult();
        if(textLayoutResult0 != null) {
            textFieldSelectionState0.updateHandleDragging-Uv8p0NA(this.y, Offset.plus-MK-Hz9U(this.z.element, ref$LongRef0.element));
            int v = this.A ? textLayoutResult0.getOffsetForPosition-k-4lQ0M(textFieldSelectionState0.getHandleDragPosition-F1C5BW0()) : TextRange.getStart-impl(textFieldSelectionState0.a.getVisualText().getSelection-d9O1mEE());
            int v1 = this.A ? TextRange.getEnd-impl(textFieldSelectionState0.a.getVisualText().getSelection-d9O1mEE()) : textLayoutResult0.getOffsetForPosition-k-4lQ0M(textFieldSelectionState0.getHandleDragPosition-F1C5BW0());
            long v2 = textFieldSelectionState0.a.getVisualText().getSelection-d9O1mEE();
            TextFieldCharSequence textFieldCharSequence0 = this.x.a.getVisualText();
            long v3 = this.x.f(textFieldCharSequence0, v, v1, this.A, SelectionAdjustment.Companion.getCharacterWithWordAccelerate(), false, false);
            if(TextRange.getCollapsed-impl(v2) || !TextRange.getCollapsed-impl(v3)) {
                textFieldSelectionState0.a.selectCharsIn-5zc-tL8(v3);
            }
        }
        return Unit.INSTANCE;
    }
}

