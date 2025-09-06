package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\"\u0015\u0010\u0000\u001A\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001A\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001A\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\b\u0010\u0004\"\u0015\u0010\t\u001A\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\n\u0010\u0004\"\u0015\u0010\u000B\u001A\u00020\f*\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\r\u0010\u000E\"\u0015\u0010\u000F\u001A\u00020\u0010*\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012\"\u0015\u0010\u0013\u001A\u00020\u0014*\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0012*\n\u0010\u0016\"\u00020\u00172\u00020\u0017¨\u0006\u0018"}, d2 = {"isAltPressed", "", "Landroidx/compose/ui/input/key/KeyEvent;", "isAltPressed-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isCtrlPressed", "isCtrlPressed-ZmokQxo", "isMetaPressed", "isMetaPressed-ZmokQxo", "isShiftPressed", "isShiftPressed-ZmokQxo", "key", "Landroidx/compose/ui/input/key/Key;", "getKey-ZmokQxo", "(Landroid/view/KeyEvent;)J", "type", "Landroidx/compose/ui/input/key/KeyEventType;", "getType-ZmokQxo", "(Landroid/view/KeyEvent;)I", "utf16CodePoint", "", "getUtf16CodePoint-ZmokQxo", "NativeKeyEvent", "Landroid/view/KeyEvent;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class KeyEvent_androidKt {
    public static final long getKey-ZmokQxo(@NotNull KeyEvent keyEvent0) {
        return Key_androidKt.Key(keyEvent0.getKeyCode());
    }

    public static final int getType-ZmokQxo(@NotNull KeyEvent keyEvent0) {
        switch(keyEvent0.getAction()) {
            case 0: {
                return 2;
            }
            case 1: {
                return 1;
            }
            default: {
                return 0;
            }
        }
    }

    public static final int getUtf16CodePoint-ZmokQxo(@NotNull KeyEvent keyEvent0) {
        return keyEvent0.getUnicodeChar();
    }

    public static final boolean isAltPressed-ZmokQxo(@NotNull KeyEvent keyEvent0) {
        return keyEvent0.isAltPressed();
    }

    public static final boolean isCtrlPressed-ZmokQxo(@NotNull KeyEvent keyEvent0) {
        return keyEvent0.isCtrlPressed();
    }

    public static final boolean isMetaPressed-ZmokQxo(@NotNull KeyEvent keyEvent0) {
        return keyEvent0.isMetaPressed();
    }

    public static final boolean isShiftPressed-ZmokQxo(@NotNull KeyEvent keyEvent0) {
        return keyEvent0.isShiftPressed();
    }
}

