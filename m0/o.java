package m0;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.core.view.SoftwareKeyboardControllerCompat;
import kotlin.jvm.internal.Intrinsics;

public class o implements ComposeInputMethodManager {
    public final View a;
    public InputMethodManager b;
    public final SoftwareKeyboardControllerCompat c;

    public o(View view0) {
        this.a = view0;
        this.c = new SoftwareKeyboardControllerCompat(view0);
    }

    public final InputMethodManager a() {
        InputMethodManager inputMethodManager0 = this.b;
        if(inputMethodManager0 == null) {
            Object object0 = this.a.getContext().getSystemService("input_method");
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            inputMethodManager0 = (InputMethodManager)object0;
            this.b = inputMethodManager0;
        }
        return inputMethodManager0;
    }

    @Override  // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void acceptStylusHandwritingDelegation() {
    }

    @Override  // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public final void hideSoftInput() {
        this.c.hide();
    }

    @Override  // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void prepareStylusHandwritingDelegation() {
    }

    @Override  // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public final void restartInput() {
        this.a().restartInput(this.a);
    }

    @Override  // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public final void sendKeyEvent(KeyEvent keyEvent0) {
        this.a().dispatchKeyEventFromInputMethod(this.a, keyEvent0);
    }

    @Override  // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public final void showSoftInput() {
        this.c.show();
    }

    @Override  // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public void startStylusHandwriting() {
    }

    @Override  // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public final void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo0) {
        this.a().updateCursorAnchorInfo(this.a, cursorAnchorInfo0);
    }

    @Override  // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public final void updateExtractedText(int v, ExtractedText extractedText0) {
        this.a().updateExtractedText(this.a, v, extractedText0);
    }

    @Override  // androidx.compose.foundation.text.input.internal.ComposeInputMethodManager
    public final void updateSelection(int v, int v1, int v2, int v3) {
        this.a().updateSelection(this.a, v, v1, v2, v3);
    }
}

