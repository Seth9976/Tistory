package j0;

import androidx.compose.foundation.text.DeadKeyCombiner;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldKeyInput;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.platform.h;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class z2 extends Lambda implements Function3 {
    public final boolean A;
    public final OffsetMapping B;
    public final UndoManager C;
    public final Function1 D;
    public final int E;
    public final LegacyTextFieldState w;
    public final TextFieldSelectionManager x;
    public final TextFieldValue y;
    public final boolean z;

    public z2(LegacyTextFieldState legacyTextFieldState0, TextFieldSelectionManager textFieldSelectionManager0, TextFieldValue textFieldValue0, boolean z, boolean z1, OffsetMapping offsetMapping0, UndoManager undoManager0, Function1 function10, int v) {
        this.w = legacyTextFieldState0;
        this.x = textFieldSelectionManager0;
        this.y = textFieldValue0;
        this.z = z;
        this.A = z1;
        this.B = offsetMapping0;
        this.C = undoManager0;
        this.D = function10;
        this.E = v;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Modifier modifier0 = (Modifier)object0;
        int v = ((Number)object2).intValue();
        ((Composer)object1).startReplaceGroup(851809892);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(851809892, v, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:245)");
        }
        TextPreparedSelectionState textPreparedSelectionState0 = ((Composer)object1).rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(textPreparedSelectionState0 == composer$Companion0.getEmpty()) {
            textPreparedSelectionState0 = new TextPreparedSelectionState();
            ((Composer)object1).updateRememberedValue(textPreparedSelectionState0);
        }
        DeadKeyCombiner deadKeyCombiner0 = ((Composer)object1).rememberedValue();
        if(deadKeyCombiner0 == composer$Companion0.getEmpty()) {
            deadKeyCombiner0 = new DeadKeyCombiner();
            ((Composer)object1).updateRememberedValue(deadKeyCombiner0);
        }
        TextFieldKeyInput textFieldKeyInput0 = new TextFieldKeyInput(this.w, this.x, this.y, this.z, this.A, textPreparedSelectionState0, this.B, this.C, deadKeyCombiner0, null, this.D, this.E, 0x200, null);
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        boolean z = ((Composer)object1).changedInstance(textFieldKeyInput0);
        h h0 = ((Composer)object1).rememberedValue();
        if(z || h0 == composer$Companion0.getEmpty()) {
            h0 = new h(1, textFieldKeyInput0, TextFieldKeyInput.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 5);
            ((Composer)object1).updateRememberedValue(h0);
        }
        Modifier modifier1 = KeyInputModifierKt.onKeyEvent(modifier$Companion0, h0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return modifier1;
    }
}

