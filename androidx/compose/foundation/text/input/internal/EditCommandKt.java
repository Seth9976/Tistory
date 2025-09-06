package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.StringHelpers_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\u001A#\u0010\u0006\u001A\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001A#\u0010\n\u001A\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000B\u001A#\u0010\f\u001A\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\u0007\u001A#\u0010\u000F\u001A\u00020\u0005*\u00020\u00002\u0006\u0010\r\u001A\u00020\u00032\u0006\u0010\u000E\u001A\u00020\u0003H\u0000¢\u0006\u0004\b\u000F\u0010\u000B\u001A#\u0010\u0010\u001A\u00020\u0005*\u00020\u00002\u0006\u0010\r\u001A\u00020\u00032\u0006\u0010\u000E\u001A\u00020\u0003H\u0000¢\u0006\u0004\b\u0010\u0010\u000B\u001A\u0013\u0010\u0011\u001A\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001A\u0013\u0010\u0013\u001A\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0012\u001A\u001B\u0010\u0015\u001A\u00020\u0005*\u00020\u00002\u0006\u0010\u0014\u001A\u00020\u0003H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001A\u0013\u0010\u0017\u001A\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0012¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/text/input/internal/EditingBuffer;", "", "text", "", "newCursorPosition", "", "commitText", "(Landroidx/compose/foundation/text/input/internal/EditingBuffer;Ljava/lang/String;I)V", "start", "end", "setComposingRegion", "(Landroidx/compose/foundation/text/input/internal/EditingBuffer;II)V", "setComposingText", "lengthBeforeCursor", "lengthAfterCursor", "deleteSurroundingText", "deleteSurroundingTextInCodePoints", "finishComposingText", "(Landroidx/compose/foundation/text/input/internal/EditingBuffer;)V", "backspace", "amount", "moveCursor", "(Landroidx/compose/foundation/text/input/internal/EditingBuffer;I)V", "deleteAll", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEditCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCommand.kt\nandroidx/compose/foundation/text/input/internal/EditCommandKt\n+ 2 MathUtils.kt\nandroidx/compose/foundation/text/input/internal/MathUtilsKt\n*L\n1#1,304:1\n27#2,3:305\n36#2,4:308\n*S KotlinDebug\n*F\n+ 1 EditCommand.kt\nandroidx/compose/foundation/text/input/internal/EditCommandKt\n*L\n156#1:305,3\n161#1:308,4\n*E\n"})
public final class EditCommandKt {
    public static final void backspace(@NotNull EditingBuffer editingBuffer0) {
        if(editingBuffer0.hasComposition()) {
            editingBuffer0.delete(editingBuffer0.getCompositionStart(), editingBuffer0.getCompositionEnd());
            return;
        }
        switch(editingBuffer0.getCursor()) {
            case -1: {
                editingBuffer0.setCursor(editingBuffer0.getSelectionStart());
                editingBuffer0.delete(editingBuffer0.getSelectionStart(), editingBuffer0.getSelectionEnd());
                return;
            }
            case 0: {
                break;
            }
            default: {
                editingBuffer0.delete(StringHelpers_androidKt.findPrecedingBreak(editingBuffer0.toString(), editingBuffer0.getCursor()), editingBuffer0.getCursor());
                break;
            }
        }
    }

    public static final void commitText(@NotNull EditingBuffer editingBuffer0, @NotNull String s, int v) {
        if(editingBuffer0.hasComposition()) {
            editingBuffer0.replace(editingBuffer0.getCompositionStart(), editingBuffer0.getCompositionEnd(), s);
        }
        else {
            editingBuffer0.replace(editingBuffer0.getSelectionStart(), editingBuffer0.getSelectionEnd(), s);
        }
        int v1 = editingBuffer0.getCursor();
        editingBuffer0.setCursor(c.coerceIn((v <= 0 ? v1 + v - s.length() : v1 + v - 1), 0, editingBuffer0.getLength()));
    }

    public static final void deleteAll(@NotNull EditingBuffer editingBuffer0) {
        editingBuffer0.replace(0, editingBuffer0.getLength(), "");
    }

    public static final void deleteSurroundingText(@NotNull EditingBuffer editingBuffer0, int v, int v1) {
        if(v < 0 || v1 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + v + " and " + v1 + " respectively.").toString());
        }
        int v2 = editingBuffer0.getSelectionEnd();
        int v3 = v2 + v1;
        editingBuffer0.delete(editingBuffer0.getSelectionEnd(), Math.min((((v1 ^ v3) & (v2 ^ v3)) >= 0 ? v2 + v1 : editingBuffer0.getLength()), editingBuffer0.getLength()));
        int v4 = editingBuffer0.getSelectionStart();
        editingBuffer0.delete(Math.max(0, (((v ^ v4) & (v4 ^ v4 - v)) >= 0 ? v4 - v : 0)), editingBuffer0.getSelectionStart());
    }

    public static final void deleteSurroundingTextInCodePoints(@NotNull EditingBuffer editingBuffer0, int v, int v1) {
        if(v < 0 || v1 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + v + " and " + v1 + " respectively.").toString());
        }
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        while(v3 < v) {
            if(editingBuffer0.getSelectionStart() > v4 + 1) {
                v4 = !Character.isHighSurrogate(editingBuffer0.get(editingBuffer0.getSelectionStart() - (v4 + 1) - 1)) || !Character.isLowSurrogate(editingBuffer0.get(editingBuffer0.getSelectionStart() - (v4 + 1))) ? v4 + 1 : v4 + 2;
                ++v3;
            }
            else {
                v4 = editingBuffer0.getSelectionStart();
                if(true) {
                    break;
                }
            }
        }
        int v5 = 0;
        while(v2 < v1) {
            if(editingBuffer0.getSelectionEnd() + (v5 + 1) < editingBuffer0.getLength()) {
                v5 = !Character.isHighSurrogate(editingBuffer0.get(editingBuffer0.getSelectionEnd() + (v5 + 1) - 1)) || !Character.isLowSurrogate(editingBuffer0.get(editingBuffer0.getSelectionEnd() + (v5 + 1))) ? v5 + 1 : v5 + 2;
                ++v2;
            }
            else {
                v5 = editingBuffer0.getLength() - editingBuffer0.getSelectionEnd();
                if(true) {
                    break;
                }
            }
        }
        editingBuffer0.delete(editingBuffer0.getSelectionEnd(), editingBuffer0.getSelectionEnd() + v5);
        editingBuffer0.delete(editingBuffer0.getSelectionStart() - v4, editingBuffer0.getSelectionStart());
    }

    public static final void finishComposingText(@NotNull EditingBuffer editingBuffer0) {
        editingBuffer0.commitComposition();
    }

    public static final void moveCursor(@NotNull EditingBuffer editingBuffer0, int v) {
        if(editingBuffer0.getCursor() == -1) {
            editingBuffer0.setCursor(editingBuffer0.getSelectionStart());
        }
        int v1 = editingBuffer0.getSelectionStart();
        String s = editingBuffer0.toString();
        int v2 = 0;
        if(v > 0) {
            while(v2 < v) {
                int v3 = StringHelpers_androidKt.findFollowingBreak(s, v1);
                if(v3 == -1) {
                    break;
                }
                ++v2;
                v1 = v3;
            }
        }
        else {
            while(v2 < -v) {
                int v4 = StringHelpers_androidKt.findPrecedingBreak(s, v1);
                if(v4 == -1) {
                    break;
                }
                ++v2;
                v1 = v4;
            }
        }
        editingBuffer0.setCursor(v1);
    }

    public static final void setComposingRegion(@NotNull EditingBuffer editingBuffer0, int v, int v1) {
        if(editingBuffer0.hasComposition()) {
            editingBuffer0.commitComposition();
        }
        int v2 = c.coerceIn(v, 0, editingBuffer0.getLength());
        int v3 = c.coerceIn(v1, 0, editingBuffer0.getLength());
        if(v2 != v3) {
            if(v2 < v3) {
                editingBuffer0.setComposition(v2, v3);
                return;
            }
            editingBuffer0.setComposition(v3, v2);
        }
    }

    public static final void setComposingText(@NotNull EditingBuffer editingBuffer0, @NotNull String s, int v) {
        if(editingBuffer0.hasComposition()) {
            int v1 = editingBuffer0.getCompositionStart();
            editingBuffer0.replace(v1, editingBuffer0.getCompositionEnd(), s);
            if(s.length() > 0) {
                editingBuffer0.setComposition(v1, s.length() + v1);
            }
        }
        else {
            int v2 = editingBuffer0.getSelectionStart();
            editingBuffer0.replace(v2, editingBuffer0.getSelectionEnd(), s);
            if(s.length() > 0) {
                editingBuffer0.setComposition(v2, s.length() + v2);
            }
        }
        int v3 = editingBuffer0.getCursor();
        editingBuffer0.setCursor(c.coerceIn((v <= 0 ? v3 + v - s.length() : v3 + v - 1), 0, editingBuffer0.getLength()));
    }
}

