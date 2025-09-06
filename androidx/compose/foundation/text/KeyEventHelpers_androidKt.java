package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\b\u0010\u0000\u001A\u00020\u0001H\u0000\u001A\u0016\u0010\u0002\u001A\u00020\u0003*\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0007"}, d2 = {"showCharacterPalette", "", "cancelsTextSelection", "", "Landroidx/compose/ui/input/key/KeyEvent;", "cancelsTextSelection-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class KeyEventHelpers_androidKt {
    // 去混淆评级： 低(30)
    public static final boolean cancelsTextSelection-ZmokQxo(@NotNull KeyEvent keyEvent0) {
        return keyEvent0.getKeyCode() == 4 && KeyEventType.equals-impl0(KeyEvent_androidKt.getType-ZmokQxo(keyEvent0), 1);
    }

    public static final void showCharacterPalette() {
    }
}

