package androidx.compose.ui.platform;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import kotlin.Metadata;

@Stable
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0004R \u0010\u0005\u001A\u00020\u00068WX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\nø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u000BÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/WindowInfo;", "", "isWindowFocused", "", "()Z", "keyboardModifiers", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "getKeyboardModifiers-k7X9c1A$annotations", "()V", "getKeyboardModifiers-k7X9c1A", "()I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface WindowInfo {
    @ExperimentalComposeUiApi
    default int getKeyboardModifiers-k7X9c1A() {
        return ((PointerKeyboardModifiers)WindowInfoImpl.Companion.getGlobalKeyboardModifiers$ui_release().getValue()).unbox-impl();
    }

    static void getKeyboardModifiers-k7X9c1A$annotations() {
    }

    boolean isWindowFocused();
}

