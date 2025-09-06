package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.Key_androidKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\u001A\u000F\u0010\u0001\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u0018\u0010\u0007\u001A\u00020\u0004*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "createTextFieldKeyEventHandler", "()Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "isFromSoftKeyboard-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isFromSoftKeyboard", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TextFieldKeyEventHandler_androidKt {
    public static final boolean access$isKeyCode-YhN2O0w(KeyEvent keyEvent0, int v) {
        return Key_androidKt.getNativeKeyCode-YVgTNJs(KeyEvent_androidKt.getKey-ZmokQxo(keyEvent0)) == v;
    }

    @NotNull
    public static final TextFieldKeyEventHandler createTextFieldKeyEventHandler() {
        return new AndroidTextFieldKeyEventHandler();
    }

    public static final boolean isFromSoftKeyboard-ZmokQxo(@NotNull KeyEvent keyEvent0) {
        return (keyEvent0.getFlags() & 2) == 2;
    }
}

