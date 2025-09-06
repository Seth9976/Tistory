package androidx.compose.foundation.text.input;

import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001A\f\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\u0000\u001A\u0014\u0010\u0003\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0005H\u0000\u001A\u0014\u0010\u0006\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0005H\u0000¨\u0006\u0007"}, d2 = {"getSelectedText", "", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getTextAfterSelection", "maxChars", "", "getTextBeforeSelection", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TextFieldCharSequenceKt {
    @NotNull
    public static final CharSequence getSelectedText(@NotNull TextFieldCharSequence textFieldCharSequence0) {
        return textFieldCharSequence0.subSequence(TextRange.getMin-impl(textFieldCharSequence0.getSelection-d9O1mEE()), TextRange.getMax-impl(textFieldCharSequence0.getSelection-d9O1mEE()));
    }

    @NotNull
    public static final CharSequence getTextAfterSelection(@NotNull TextFieldCharSequence textFieldCharSequence0, int v) {
        return textFieldCharSequence0.subSequence(TextRange.getMax-impl(textFieldCharSequence0.getSelection-d9O1mEE()), Math.min(TextRange.getMax-impl(textFieldCharSequence0.getSelection-d9O1mEE()) + v, textFieldCharSequence0.length()));
    }

    @NotNull
    public static final CharSequence getTextBeforeSelection(@NotNull TextFieldCharSequence textFieldCharSequence0, int v) {
        return textFieldCharSequence0.subSequence(Math.max(0, TextRange.getMin-impl(textFieldCharSequence0.getSelection-d9O1mEE()) - v), TextRange.getMin-impl(textFieldCharSequence0.getSelection-d9O1mEE()));
    }
}

