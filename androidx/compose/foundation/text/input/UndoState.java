package androidx.compose.foundation.text.input;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@ExperimentalFoundationApi
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001A\u00020\u0006¢\u0006\u0004\b\n\u0010\bR\u0017\u0010\u000F\u001A\u00020\u000B8F¢\u0006\f\u0012\u0004\b\u000E\u0010\b\u001A\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001A\u00020\u000B8F¢\u0006\f\u0012\u0004\b\u0011\u0010\b\u001A\u0004\b\u0010\u0010\r¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/text/input/UndoState;", "", "Landroidx/compose/foundation/text/input/TextFieldState;", "state", "<init>", "(Landroidx/compose/foundation/text/input/TextFieldState;)V", "", "undo", "()V", "redo", "clearHistory", "", "getCanUndo", "()Z", "getCanUndo$annotations", "canUndo", "getCanRedo", "getCanRedo$annotations", "canRedo", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class UndoState {
    public static final int $stable;
    public final TextFieldState a;

    public UndoState(@NotNull TextFieldState textFieldState0) {
        this.a = textFieldState0;
    }

    public final void clearHistory() {
        this.a.getTextUndoManager$foundation_release().clearHistory();
    }

    public final boolean getCanRedo() {
        return this.a.getTextUndoManager$foundation_release().getCanRedo();
    }

    public static void getCanRedo$annotations() {
    }

    public final boolean getCanUndo() {
        return this.a.getTextUndoManager$foundation_release().getCanUndo();
    }

    public static void getCanUndo$annotations() {
    }

    public final void redo() {
        this.a.getTextUndoManager$foundation_release().redo(this.a);
    }

    public final void undo() {
        this.a.getTextUndoManager$foundation_release().undo(this.a);
    }
}

