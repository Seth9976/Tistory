package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.EditingBuffer;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004H\u0000\u001A\u0014\u0010\u0005\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004H\u0000¨\u0006\u0006"}, d2 = {"redo", "", "Landroidx/compose/foundation/text/input/TextFieldState;", "op", "Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "undo", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextUndoOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUndoOperation.kt\nandroidx/compose/foundation/text/input/internal/undo/TextUndoOperationKt\n+ 2 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,176:1\n288#2,15:177\n288#2,15:192\n*S KotlinDebug\n*F\n+ 1 TextUndoOperation.kt\nandroidx/compose/foundation/text/input/internal/undo/TextUndoOperationKt\n*L\n115#1:177,15\n125#1:192,15\n*E\n"})
public final class TextUndoOperationKt {
    public static final void redo(@NotNull TextFieldState textFieldState0, @NotNull TextUndoOperation textUndoOperation0) {
        textFieldState0.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer editingBuffer0 = textFieldState0.getMainBuffer$foundation_release();
        editingBuffer0.replace(textUndoOperation0.getIndex(), textUndoOperation0.getPreText().length() + textUndoOperation0.getIndex(), textUndoOperation0.getPostText());
        editingBuffer0.setSelection(TextRange.getStart-impl(textUndoOperation0.getPostSelection-d9O1mEE()), TextRange.getEnd-impl(textUndoOperation0.getPostSelection-d9O1mEE()));
        TextFieldCharSequence textFieldCharSequence0 = new TextFieldCharSequence(textFieldState0.getMainBuffer$foundation_release().toString(), textFieldState0.getMainBuffer$foundation_release().getSelection-d9O1mEE(), textFieldState0.getMainBuffer$foundation_release().getComposition-MzsxiRA(), null, 8, null);
        textFieldState0.b(textFieldState0.getValue$foundation_release(), textFieldCharSequence0, true);
    }

    public static final void undo(@NotNull TextFieldState textFieldState0, @NotNull TextUndoOperation textUndoOperation0) {
        textFieldState0.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        EditingBuffer editingBuffer0 = textFieldState0.getMainBuffer$foundation_release();
        editingBuffer0.replace(textUndoOperation0.getIndex(), textUndoOperation0.getPostText().length() + textUndoOperation0.getIndex(), textUndoOperation0.getPreText());
        editingBuffer0.setSelection(TextRange.getStart-impl(textUndoOperation0.getPreSelection-d9O1mEE()), TextRange.getEnd-impl(textUndoOperation0.getPreSelection-d9O1mEE()));
        TextFieldCharSequence textFieldCharSequence0 = new TextFieldCharSequence(textFieldState0.getMainBuffer$foundation_release().toString(), textFieldState0.getMainBuffer$foundation_release().getSelection-d9O1mEE(), textFieldState0.getMainBuffer$foundation_release().getComposition-MzsxiRA(), null, 8, null);
        textFieldState0.b(textFieldState0.getValue$foundation_release(), textFieldCharSequence0, true);
    }
}

