package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.node.DelegatableNode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u001A\u0010\u0002\u001A\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "focusState", "Landroidx/compose/ui/focus/FocusState;", "getFocusState$annotations", "()V", "getFocusState", "()Landroidx/compose/ui/focus/FocusState;", "Landroidx/compose/ui/focus/FocusTargetNode;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface FocusTargetModifierNode extends DelegatableNode {
    @NotNull
    FocusState getFocusState();

    @ExperimentalComposeUiApi
    static void getFocusState$annotations() {
    }
}

