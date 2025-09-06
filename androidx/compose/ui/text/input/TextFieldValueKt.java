package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0002\u001A\u0012\u0010\u0003\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0005\u001A\u0012\u0010\u0006\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0005¨\u0006\u0007"}, d2 = {"getSelectedText", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getTextAfterSelection", "maxChars", "", "getTextBeforeSelection", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TextFieldValueKt {
    @NotNull
    public static final AnnotatedString getSelectedText(@NotNull TextFieldValue textFieldValue0) {
        return textFieldValue0.getAnnotatedString().subSequence-5zc-tL8(textFieldValue0.getSelection-d9O1mEE());
    }

    @NotNull
    public static final AnnotatedString getTextAfterSelection(@NotNull TextFieldValue textFieldValue0, int v) {
        return textFieldValue0.getAnnotatedString().subSequence(TextRange.getMax-impl(textFieldValue0.getSelection-d9O1mEE()), Math.min(TextRange.getMax-impl(textFieldValue0.getSelection-d9O1mEE()) + v, textFieldValue0.getText().length()));
    }

    @NotNull
    public static final AnnotatedString getTextBeforeSelection(@NotNull TextFieldValue textFieldValue0, int v) {
        return textFieldValue0.getAnnotatedString().subSequence(Math.max(0, TextRange.getMin-impl(textFieldValue0.getSelection-d9O1mEE()) - v), TextRange.getMin-impl(textFieldValue0.getSelection-d9O1mEE()));
    }
}

