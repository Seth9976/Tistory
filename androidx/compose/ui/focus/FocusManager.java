package androidx.compose.ui.focus;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005H&J\u001A\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u000BÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusManager;", "", "clearFocus", "", "force", "", "moveFocus", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "moveFocus-3ESFkO8", "(I)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface FocusManager {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void clearFocus$default(FocusManager focusManager0, boolean z, int v, Object object0) {
            FocusManager.clearFocus$default(focusManager0, z, v, object0);
        }
    }

    void clearFocus(boolean arg1);

    static void clearFocus$default(FocusManager focusManager0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
        }
        if((v & 1) != 0) {
            z = false;
        }
        focusManager0.clearFocus(z);
    }

    boolean moveFocus-3ESFkO8(int arg1);
}

