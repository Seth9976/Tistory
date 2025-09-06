package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H&J\b\u0010\u0004\u001A\u00020\u0003H&J\b\u0010\u0005\u001A\u00020\u0003H&J\b\u0010\u0006\u001A\u00020\u0003H&J\u0010\u0010\u0007\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\tH&J\b\u0010\n\u001A\u00020\u0003H&J\b\u0010\u000B\u001A\u00020\u0003H&J\u0010\u0010\f\u001A\u00020\u00032\u0006\u0010\r\u001A\u00020\u000EH&J\u0018\u0010\u000F\u001A\u00020\u00032\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0013H&J(\u0010\u0014\u001A\u00020\u00032\u0006\u0010\u0015\u001A\u00020\u00112\u0006\u0010\u0016\u001A\u00020\u00112\u0006\u0010\u0017\u001A\u00020\u00112\u0006\u0010\u0018\u001A\u00020\u0011H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "", "acceptStylusHandwritingDelegation", "", "hideSoftInput", "prepareStylusHandwritingDelegation", "restartInput", "sendKeyEvent", "event", "Landroid/view/KeyEvent;", "showSoftInput", "startStylusHandwriting", "updateCursorAnchorInfo", "info", "Landroid/view/inputmethod/CursorAnchorInfo;", "updateExtractedText", "token", "", "extractedText", "Landroid/view/inputmethod/ExtractedText;", "updateSelection", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface ComposeInputMethodManager {
    void acceptStylusHandwritingDelegation();

    void hideSoftInput();

    void prepareStylusHandwritingDelegation();

    void restartInput();

    void sendKeyEvent(@NotNull KeyEvent arg1);

    void showSoftInput();

    void startStylusHandwriting();

    void updateCursorAnchorInfo(@NotNull CursorAnchorInfo arg1);

    void updateExtractedText(int arg1, @NotNull ExtractedText arg2);

    void updateSelection(int arg1, int arg2, int arg3, int arg4);
}

