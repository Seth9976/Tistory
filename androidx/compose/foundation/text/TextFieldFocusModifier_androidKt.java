package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.key.Key_androidKt;
import j0.x2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A#\u0010\u0005\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "state", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "interceptDPadAndMoveFocus", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/focus/FocusManager;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TextFieldFocusModifier_androidKt {
    public static final boolean access$isKeyCode-YhN2O0w(KeyEvent keyEvent0, int v) {
        return Key_androidKt.getNativeKeyCode-YVgTNJs(KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0)) == v;
    }

    @NotNull
    public static final Modifier interceptDPadAndMoveFocus(@NotNull Modifier modifier0, @NotNull LegacyTextFieldState legacyTextFieldState0, @NotNull FocusManager focusManager0) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier0, new x2(focusManager0, legacyTextFieldState0));
    }
}

