package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SelectionControllerKt {
    public static final Modifier access$makeSelectionModifier(SelectionRegistrar selectionRegistrar0, long v, Function0 function00) {
        SelectionControllerKt.makeSelectionModifier.longPressDragObserver.1 selectionControllerKt$makeSelectionModifier$longPressDragObserver$10 = new SelectionControllerKt.makeSelectionModifier.longPressDragObserver.1(selectionRegistrar0, v, function00);
        SelectionControllerKt.makeSelectionModifier.mouseSelectionObserver.1 selectionControllerKt$makeSelectionModifier$mouseSelectionObserver$10 = new SelectionControllerKt.makeSelectionModifier.mouseSelectionObserver.1(selectionRegistrar0, v, function00);
        return SelectionGesturesKt.selectionGestureInput(Modifier.Companion, selectionControllerKt$makeSelectionModifier$mouseSelectionObserver$10, selectionControllerKt$makeSelectionModifier$longPressDragObserver$10);
    }
}

