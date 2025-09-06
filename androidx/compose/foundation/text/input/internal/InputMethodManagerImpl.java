package androidx.compose.foundation.text.input.internal;

import android.os.Build.VERSION;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import j2.j;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import md.c;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\f\u001A\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000BJ\u000F\u0010\r\u001A\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000BJ\u001F\u0010\u0012\u001A\u00020\t2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001A\u00020\t2\u0006\u0010\u0014\u001A\u00020\u000E2\u0006\u0010\u0015\u001A\u00020\u000E2\u0006\u0010\u0016\u001A\u00020\u000E2\u0006\u0010\u0017\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001C\u001A\u00020\t2\u0006\u0010\u001B\u001A\u00020\u001AH\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010\u001E\u001A\u00020\tH\u0016¢\u0006\u0004\b\u001E\u0010\u000B¨\u0006\u001F"}, d2 = {"Landroidx/compose/foundation/text/input/internal/InputMethodManagerImpl;", "Landroidx/compose/foundation/text/input/internal/InputMethodManager;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "", "isActive", "()Z", "", "restartInput", "()V", "showSoftInput", "hideSoftInput", "", "token", "Landroid/view/inputmethod/ExtractedText;", "extractedText", "updateExtractedText", "(ILandroid/view/inputmethod/ExtractedText;)V", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "updateSelection", "(IIII)V", "Landroid/view/inputmethod/CursorAnchorInfo;", "cursorAnchorInfo", "updateCursorAnchorInfo", "(Landroid/view/inputmethod/CursorAnchorInfo;)V", "startStylusHandwriting", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class InputMethodManagerImpl implements InputMethodManager {
    public static final int $stable = 8;
    public final View a;
    public final Lazy b;
    public final SoftwareKeyboardControllerCompat c;

    public InputMethodManagerImpl(@NotNull View view0) {
        this.a = view0;
        j j0 = new j(this, 22);
        this.b = c.lazy(LazyThreadSafetyMode.NONE, j0);
        this.c = new SoftwareKeyboardControllerCompat(view0);
    }

    public final android.view.inputmethod.InputMethodManager a() {
        return (android.view.inputmethod.InputMethodManager)this.b.getValue();
    }

    @Override  // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void hideSoftInput() {
        this.c.hide();
    }

    @Override  // androidx.compose.foundation.text.input.internal.InputMethodManager
    public boolean isActive() {
        return this.a().isActive(this.a);
    }

    @Override  // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void restartInput() {
        this.a().restartInput(this.a);
    }

    @Override  // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void showSoftInput() {
        this.c.show();
    }

    @Override  // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void startStylusHandwriting() {
        if(Build.VERSION.SDK_INT >= 34) {
            android.view.inputmethod.InputMethodManager inputMethodManager0 = this.a();
            Api34StartStylusHandwriting.INSTANCE.startStylusHandwriting(inputMethodManager0, this.a);
        }
    }

    @Override  // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void updateCursorAnchorInfo(@NotNull CursorAnchorInfo cursorAnchorInfo0) {
        this.a().updateCursorAnchorInfo(this.a, cursorAnchorInfo0);
    }

    @Override  // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void updateExtractedText(int v, @NotNull ExtractedText extractedText0) {
        this.a().updateExtractedText(this.a, v, extractedText0);
    }

    @Override  // androidx.compose.foundation.text.input.internal.InputMethodManager
    public void updateSelection(int v, int v1, int v2, int v3) {
        this.a().updateSelection(this.a, v, v1, v2, v3);
    }
}

