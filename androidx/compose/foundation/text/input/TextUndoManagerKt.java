package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.undo.TextDeleteType;
import androidx.compose.foundation.text.input.internal.undo.TextEditType;
import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u001D\u0010\u0002\u001A\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0001\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001A5\u0010\r\u001A\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\u00052\u0006\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "next", "merge", "(Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;)Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "Landroidx/compose/foundation/text/input/TextUndoManager;", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "pre", "post", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "changes", "", "allowMerge", "", "recordChanges", "(Landroidx/compose/foundation/text/input/TextUndoManager;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;Z)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TextUndoManagerKt {
    @Nullable
    public static final TextUndoOperation merge(@NotNull TextUndoOperation textUndoOperation0, @NotNull TextUndoOperation textUndoOperation1) {
        if(!textUndoOperation0.getCanMerge() || !textUndoOperation1.getCanMerge() || textUndoOperation1.getTimeInMillis() < textUndoOperation0.getTimeInMillis() || textUndoOperation1.getTimeInMillis() - textUndoOperation0.getTimeInMillis() >= 5000L || Intrinsics.areEqual(textUndoOperation0.getPostText(), "\n") || Intrinsics.areEqual(textUndoOperation0.getPostText(), "\r\n") || Intrinsics.areEqual(textUndoOperation1.getPostText(), "\n") || Intrinsics.areEqual(textUndoOperation1.getPostText(), "\r\n") || textUndoOperation0.getTextEditType() != textUndoOperation1.getTextEditType()) {
            return null;
        }
        if(textUndoOperation0.getTextEditType() == TextEditType.Insert && textUndoOperation0.getPostText().length() + textUndoOperation0.getIndex() == textUndoOperation1.getIndex()) {
            return new TextUndoOperation(textUndoOperation0.getIndex(), "", textUndoOperation0.getPostText() + textUndoOperation1.getPostText(), textUndoOperation0.getPreSelection-d9O1mEE(), textUndoOperation1.getPostSelection-d9O1mEE(), textUndoOperation0.getTimeInMillis(), false, 0x40, null);
        }
        if(textUndoOperation0.getTextEditType() == TextEditType.Delete && textUndoOperation0.getDeletionType() == textUndoOperation1.getDeletionType() && (textUndoOperation0.getDeletionType() == TextDeleteType.Start || textUndoOperation0.getDeletionType() == TextDeleteType.End)) {
            if(textUndoOperation0.getIndex() == textUndoOperation1.getPreText().length() + textUndoOperation1.getIndex()) {
                return new TextUndoOperation(textUndoOperation1.getIndex(), textUndoOperation1.getPreText() + textUndoOperation0.getPreText(), "", textUndoOperation0.getPreSelection-d9O1mEE(), textUndoOperation1.getPostSelection-d9O1mEE(), textUndoOperation0.getTimeInMillis(), false, 0x40, null);
            }
            return textUndoOperation0.getIndex() == textUndoOperation1.getIndex() ? new TextUndoOperation(textUndoOperation0.getIndex(), textUndoOperation0.getPreText() + textUndoOperation1.getPreText(), "", textUndoOperation0.getPreSelection-d9O1mEE(), textUndoOperation1.getPostSelection-d9O1mEE(), textUndoOperation0.getTimeInMillis(), false, 0x40, null) : null;
        }
        return null;
    }

    public static final void recordChanges(@NotNull TextUndoManager textUndoManager0, @NotNull TextFieldCharSequence textFieldCharSequence0, @NotNull TextFieldCharSequence textFieldCharSequence1, @NotNull ChangeList textFieldBuffer$ChangeList0, boolean z) {
        if(textFieldBuffer$ChangeList0.getChangeCount() > 1) {
            textUndoManager0.record(new TextUndoOperation(0, textFieldCharSequence0.toString(), textFieldCharSequence1.toString(), textFieldCharSequence0.getSelection-d9O1mEE(), textFieldCharSequence1.getSelection-d9O1mEE(), 0L, false, 0x20, null));
            return;
        }
        if(textFieldBuffer$ChangeList0.getChangeCount() == 1) {
            long v = textFieldBuffer$ChangeList0.getOriginalRange--jx7JFs(0);
            long v1 = textFieldBuffer$ChangeList0.getRange--jx7JFs(0);
            if(!TextRange.getCollapsed-impl(v) || !TextRange.getCollapsed-impl(v1)) {
                textUndoManager0.record(new TextUndoOperation(TextRange.getMin-impl(v), TextRangeKt.substring-FDrldGo(textFieldCharSequence0, v), TextRangeKt.substring-FDrldGo(textFieldCharSequence1, v1), textFieldCharSequence0.getSelection-d9O1mEE(), textFieldCharSequence1.getSelection-d9O1mEE(), 0L, z, 0x20, null));
            }
        }
    }

    public static void recordChanges$default(TextUndoManager textUndoManager0, TextFieldCharSequence textFieldCharSequence0, TextFieldCharSequence textFieldCharSequence1, ChangeList textFieldBuffer$ChangeList0, boolean z, int v, Object object0) {
        if((v & 8) != 0) {
            z = true;
        }
        TextUndoManagerKt.recordChanges(textUndoManager0, textFieldCharSequence0, textFieldCharSequence1, textFieldBuffer$ChangeList0, z);
    }
}

