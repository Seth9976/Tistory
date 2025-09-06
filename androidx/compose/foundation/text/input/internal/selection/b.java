package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.functions.Function0;
import n0.e;

public final class b implements MouseSelectionObserver {
    public final Function0 a;
    public int b;
    public long c;
    public final TextFieldSelectionState d;

    public b(TextFieldSelectionState textFieldSelectionState0, Function0 function00) {
        this.d = textFieldSelectionState0;
        this.a = function00;
        this.b = -1;
        this.c = 0x7FC000007FC00000L;
    }

    public final long a(long v, SelectionAdjustment selectionAdjustment0, boolean z) {
        Integer integer0 = this.b >= 0 ? this.b : null;
        TextFieldSelectionState textFieldSelectionState0 = this.d;
        int v1 = integer0 == null ? textFieldSelectionState0.b.getOffsetForPosition-3MmeM6k(this.c, false) : ((int)integer0);
        int v2 = textFieldSelectionState0.b.getOffsetForPosition-3MmeM6k(v, false);
        TextFieldCharSequence textFieldCharSequence0 = this.d.a.getVisualText();
        long v3 = this.d.f(textFieldCharSequence0, v1, v2, false, selectionAdjustment0, false, z);
        if(this.b == -1 && !TextRange.getCollapsed-impl(v3)) {
            this.b = TextRange.getStart-impl(v3);
        }
        if(TextRange.getReversed-impl(v3)) {
            v3 = TextFieldSelectionStateKt.access$reverse-5zc-tL8(v3);
        }
        textFieldSelectionState0.a.selectCharsIn-5zc-tL8(v3);
        textFieldSelectionState0.updateTextToolbarState(TextToolbarState.Selection);
        return v3;
    }

    @Override  // androidx.compose.foundation.text.selection.MouseSelectionObserver
    public final boolean onDrag-3MmeM6k(long v, SelectionAdjustment selectionAdjustment0) {
        if(this.d.d && this.d.a.getVisualText().length() != 0) {
            new e(v, 0);
            this.a(v, selectionAdjustment0, false);
            return true;
        }
        return false;
    }

    @Override  // androidx.compose.foundation.text.selection.MouseSelectionObserver
    public final void onDragDone() {
        this.d.setDirectDragGestureInitiator(InputType.None);
    }

    @Override  // androidx.compose.foundation.text.selection.MouseSelectionObserver
    public final boolean onExtend-k-4lQ0M(long v) {
        return true;
    }

    @Override  // androidx.compose.foundation.text.selection.MouseSelectionObserver
    public final boolean onExtendDrag-k-4lQ0M(long v) {
        return true;
    }

    @Override  // androidx.compose.foundation.text.selection.MouseSelectionObserver
    public final boolean onStart-3MmeM6k(long v, SelectionAdjustment selectionAdjustment0) {
        TextFieldSelectionState textFieldSelectionState0 = this.d;
        if(textFieldSelectionState0.d && textFieldSelectionState0.a.getVisualText().length() != 0) {
            textFieldSelectionState0.setDirectDragGestureInitiator(InputType.Mouse);
            this.a.invoke();
            textFieldSelectionState0.t = -1;
            this.c = v;
            this.b = TextRange.getStart-impl(this.a(v, selectionAdjustment0, true));
            return true;
        }
        return false;
    }
}

