package m0;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.internal.Intrinsics;

public final class f implements NotifyImeListener {
    public final ComposeInputMethodManager a;

    public f(ComposeInputMethodManager composeInputMethodManager0) {
        this.a = composeInputMethodManager0;
    }

    @Override  // androidx.compose.foundation.text.input.TextFieldState$NotifyImeListener
    public final void onChange(TextFieldCharSequence textFieldCharSequence0, TextFieldCharSequence textFieldCharSequence1, boolean z) {
        long v = textFieldCharSequence0.getSelection-d9O1mEE();
        long v1 = textFieldCharSequence1.getSelection-d9O1mEE();
        TextRange textRange0 = textFieldCharSequence0.getComposition-MzsxiRA();
        TextRange textRange1 = textFieldCharSequence1.getComposition-MzsxiRA();
        ComposeInputMethodManager composeInputMethodManager0 = this.a;
        if(z && textFieldCharSequence0.getComposition-MzsxiRA() != null && !textFieldCharSequence0.contentEquals(textFieldCharSequence1)) {
            composeInputMethodManager0.restartInput();
            return;
        }
        if(!TextRange.equals-impl0(v, v1) || !Intrinsics.areEqual(textRange0, textRange1)) {
            int v2 = TextRange.getMin-impl(v1);
            int v3 = TextRange.getMax-impl(v1);
            int v4 = -1;
            int v5 = textRange1 == null ? -1 : TextRange.getMin-impl(textRange1.unbox-impl());
            if(textRange1 != null) {
                v4 = TextRange.getMax-impl(textRange1.unbox-impl());
            }
            composeInputMethodManager0.updateSelection(v2, v3, v5, v4);
        }
    }
}

