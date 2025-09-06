package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import d0.s;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import md.c;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Deprecated(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\f\u001A\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000BJ\u000F\u0010\r\u001A\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000BJ\u001F\u0010\u0012\u001A\u00020\t2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001A\u00020\t2\u0006\u0010\u0014\u001A\u00020\u000E2\u0006\u0010\u0015\u001A\u00020\u000E2\u0006\u0010\u0016\u001A\u00020\u000E2\u0006\u0010\u0017\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001C\u001A\u00020\t2\u0006\u0010\u001B\u001A\u00020\u001AH\u0016¢\u0006\u0004\b\u001C\u0010\u001D¨\u0006\u001E"}, d2 = {"Landroidx/compose/ui/text/input/InputMethodManagerImpl;", "Landroidx/compose/ui/text/input/InputMethodManager;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "", "isActive", "()Z", "", "restartInput", "()V", "showSoftInput", "hideSoftInput", "", "token", "Landroid/view/inputmethod/ExtractedText;", "extractedText", "updateExtractedText", "(ILandroid/view/inputmethod/ExtractedText;)V", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "updateSelection", "(IIII)V", "Landroid/view/inputmethod/CursorAnchorInfo;", "cursorAnchorInfo", "updateCursorAnchorInfo", "(Landroid/view/inputmethod/CursorAnchorInfo;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class InputMethodManagerImpl implements InputMethodManager {
    public static final int $stable = 8;
    public final View a;
    public final Lazy b;
    public final SoftwareKeyboardControllerCompat c;

    public InputMethodManagerImpl(@NotNull View view0) {
        this.a = view0;
        s s0 = new s(this, 29);
        this.b = c.lazy(LazyThreadSafetyMode.NONE, s0);
        this.c = new SoftwareKeyboardControllerCompat(view0);
    }

    @Override  // androidx.compose.ui.text.input.InputMethodManager
    public void hideSoftInput() {
        this.c.hide();
    }

    @Override  // androidx.compose.ui.text.input.InputMethodManager
    public boolean isActive() {
        return ((android.view.inputmethod.InputMethodManager)this.b.getValue()).isActive(this.a);
    }

    @Override  // androidx.compose.ui.text.input.InputMethodManager
    public void restartInput() {
        ((android.view.inputmethod.InputMethodManager)this.b.getValue()).restartInput(this.a);
    }

    @Override  // androidx.compose.ui.text.input.InputMethodManager
    public void showSoftInput() {
        this.c.show();
    }

    @Override  // androidx.compose.ui.text.input.InputMethodManager
    public void updateCursorAnchorInfo(@NotNull CursorAnchorInfo cursorAnchorInfo0) {
        ((android.view.inputmethod.InputMethodManager)this.b.getValue()).updateCursorAnchorInfo(this.a, cursorAnchorInfo0);
    }

    @Override  // androidx.compose.ui.text.input.InputMethodManager
    public void updateExtractedText(int v, @NotNull ExtractedText extractedText0) {
        ((android.view.inputmethod.InputMethodManager)this.b.getValue()).updateExtractedText(this.a, v, extractedText0);
    }

    @Override  // androidx.compose.ui.text.input.InputMethodManager
    public void updateSelection(int v, int v1, int v2, int v3) {
        ((android.view.inputmethod.InputMethodManager)this.b.getValue()).updateSelection(this.a, v, v1, v2, v3);
    }
}

