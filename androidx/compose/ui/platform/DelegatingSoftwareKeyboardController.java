package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/platform/DelegatingSoftwareKeyboardController;", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "<init>", "(Landroidx/compose/ui/text/input/TextInputService;)V", "", "show", "()V", "hide", "a", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DelegatingSoftwareKeyboardController implements SoftwareKeyboardController {
    public static final int $stable;
    public final TextInputService a;

    public DelegatingSoftwareKeyboardController(@NotNull TextInputService textInputService0) {
        this.a = textInputService0;
    }

    @NotNull
    public final TextInputService getTextInputService() {
        return this.a;
    }

    @Override  // androidx.compose.ui.platform.SoftwareKeyboardController
    public void hide() {
        this.a.hideSoftwareKeyboard();
    }

    @Override  // androidx.compose.ui.platform.SoftwareKeyboardController
    public void show() {
        this.a.showSoftwareKeyboard();
    }
}

