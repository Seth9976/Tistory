package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.functions.Function0;
import n0.e;

public final class c implements TextDragObserver {
    public final Function0 a;
    public int b;
    public long c;
    public long d;
    public Handle e;
    public final TextFieldSelectionState f;

    public c(TextFieldSelectionState textFieldSelectionState0, Function0 function00) {
        this.f = textFieldSelectionState0;
        this.a = function00;
        this.b = -1;
        this.c = 0x7FC000007FC00000L;
        this.d = 0L;
        this.e = Handle.SelectionEnd;
    }

    public final void a() {
        if(OffsetKt.isSpecified-k-4lQ0M(this.c)) {
            this.f.clearHandleDragging();
            this.b = -1;
            this.c = 0x7FC000007FC00000L;
            this.d = 0L;
            this.f.t = -1;
            this.f.setDirectDragGestureInitiator(InputType.None);
            this.a.invoke();
        }
    }

    @Override  // androidx.compose.foundation.text.TextDragObserver
    public final void onCancel() {
        this.a();
    }

    @Override  // androidx.compose.foundation.text.TextDragObserver
    public final void onDown-k-4lQ0M(long v) {
    }

    @Override  // androidx.compose.foundation.text.TextDragObserver
    public final void onDrag-k-4lQ0M(long v) {
        Handle handle0;
        int v6;
        int v5;
        SelectionAdjustment selectionAdjustment0;
        TextFieldSelectionState textFieldSelectionState0 = this.f;
        if(textFieldSelectionState0.d && textFieldSelectionState0.a.getVisualText().length() != 0) {
            long v1 = Offset.plus-MK-Hz9U(this.d, v);
            this.d = v1;
            long v2 = Offset.plus-MK-Hz9U(this.c, v1);
            new e(v2, 1);
            if(this.b >= 0 || textFieldSelectionState0.b.isPositionOnText-k-4lQ0M(v2)) {
                Integer integer0 = this.b >= 0 ? this.b : null;
                int v7 = integer0 == null ? textFieldSelectionState0.b.getOffsetForPosition-3MmeM6k(this.c, false) : ((int)integer0);
                int v8 = textFieldSelectionState0.b.getOffsetForPosition-3MmeM6k(v2, false);
                if(this.b < 0 && v7 == v8) {
                    return;
                }
                selectionAdjustment0 = SelectionAdjustment.Companion.getWord();
                textFieldSelectionState0.updateTextToolbarState(TextToolbarState.Selection);
                v6 = v8;
                v5 = v7;
            }
            else {
                int v3 = TextLayoutState.getOffsetForPosition-3MmeM6k$default(textFieldSelectionState0.b, this.c, false, 2, null);
                int v4 = TextLayoutState.getOffsetForPosition-3MmeM6k$default(textFieldSelectionState0.b, v2, false, 2, null);
                selectionAdjustment0 = v3 == v4 ? SelectionAdjustment.Companion.getNone() : SelectionAdjustment.Companion.getWord();
                v5 = v3;
                v6 = v4;
            }
            long v9 = textFieldSelectionState0.a.getVisualText().getSelection-d9O1mEE();
            TextFieldCharSequence textFieldCharSequence0 = this.f.a.getVisualText();
            long v10 = this.f.f(textFieldCharSequence0, v5, v6, false, selectionAdjustment0, false, false);
            if(this.b == -1 && !TextRange.getCollapsed-impl(v10)) {
                this.b = TextRange.getStart-impl(v10);
            }
            if(TextRange.getReversed-impl(v10)) {
                v10 = TextFieldSelectionStateKt.access$reverse-5zc-tL8(v10);
            }
            if(!TextRange.equals-impl0(v10, v9)) {
                if(TextRange.getStart-impl(v10) != TextRange.getStart-impl(v9) && TextRange.getEnd-impl(v10) == TextRange.getEnd-impl(v9)) {
                    handle0 = Handle.SelectionStart;
                }
                else if(TextRange.getStart-impl(v10) != TextRange.getStart-impl(v9) || TextRange.getEnd-impl(v10) == TextRange.getEnd-impl(v9)) {
                    handle0 = ((float)(TextRange.getEnd-impl(v10) + TextRange.getStart-impl(v10))) / 2.0f > ((float)(TextRange.getEnd-impl(v9) + TextRange.getStart-impl(v9))) / 2.0f ? Handle.SelectionEnd : Handle.SelectionStart;
                }
                else {
                    handle0 = Handle.SelectionEnd;
                }
                this.e = handle0;
            }
            if(TextRange.getCollapsed-impl(v9) || !TextRange.getCollapsed-impl(v10)) {
                textFieldSelectionState0.a.selectCharsIn-5zc-tL8(v10);
            }
            textFieldSelectionState0.updateHandleDragging-Uv8p0NA(this.e, v2);
        }
    }

    @Override  // androidx.compose.foundation.text.TextDragObserver
    public final void onStart-k-4lQ0M(long v) {
        TextFieldSelectionState textFieldSelectionState0 = this.f;
        if(!textFieldSelectionState0.d) {
            return;
        }
        new e(v, 2);
        textFieldSelectionState0.updateHandleDragging-Uv8p0NA(this.e, v);
        TextFieldSelectionState.access$setShowCursorHandle(textFieldSelectionState0, false);
        textFieldSelectionState0.setDirectDragGestureInitiator(InputType.Touch);
        this.c = v;
        this.d = 0L;
        textFieldSelectionState0.t = -1;
        if(!textFieldSelectionState0.b.isPositionOnText-k-4lQ0M(v)) {
            int v1 = TextLayoutState.getOffsetForPosition-3MmeM6k$default(textFieldSelectionState0.b, v, false, 2, null);
            HapticFeedback hapticFeedback0 = textFieldSelectionState0.h;
            if(hapticFeedback0 != null) {
                hapticFeedback0.performHapticFeedback-CdsT49E(HapticFeedbackType.Companion.getTextHandleMove-5zf0vsI());
            }
            textFieldSelectionState0.a.placeCursorBeforeCharAt(v1);
            TextFieldSelectionState.access$setShowCursorHandle(textFieldSelectionState0, true);
            textFieldSelectionState0.updateTextToolbarState(TextToolbarState.Cursor);
            return;
        }
        if(textFieldSelectionState0.a.getVisualText().length() == 0) {
            return;
        }
        int v2 = TextLayoutState.getOffsetForPosition-3MmeM6k$default(textFieldSelectionState0.b, v, false, 2, null);
        TextFieldCharSequence textFieldCharSequence0 = new TextFieldCharSequence(this.f.a.getVisualText(), 0L, null, null, 12, null);
        long v3 = this.f.f(textFieldCharSequence0, v2, v2, false, SelectionAdjustment.Companion.getWord(), false, false);
        textFieldSelectionState0.a.selectCharsIn-5zc-tL8(v3);
        textFieldSelectionState0.updateTextToolbarState(TextToolbarState.Selection);
        this.b = TextRange.getStart-impl(v3);
    }

    @Override  // androidx.compose.foundation.text.TextDragObserver
    public final void onStop() {
        this.a();
    }

    @Override  // androidx.compose.foundation.text.TextDragObserver
    public final void onUp() {
    }
}

