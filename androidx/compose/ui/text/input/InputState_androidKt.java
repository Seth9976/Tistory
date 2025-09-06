package androidx.compose.ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\f\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toExtractedText", "Landroid/view/inputmethod/ExtractedText;", "Landroidx/compose/ui/text/input/TextFieldValue;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class InputState_androidKt {
    @NotNull
    public static final ExtractedText toExtractedText(@NotNull TextFieldValue textFieldValue0) {
        ExtractedText extractedText0 = new ExtractedText();
        extractedText0.text = textFieldValue0.getText();
        extractedText0.startOffset = 0;
        extractedText0.partialEndOffset = textFieldValue0.getText().length();
        extractedText0.partialStartOffset = -1;
        extractedText0.selectionStart = TextRange.getMin-impl(textFieldValue0.getSelection-d9O1mEE());
        extractedText0.selectionEnd = TextRange.getMax-impl(textFieldValue0.getSelection-d9O1mEE());
        extractedText0.flags = !StringsKt__StringsKt.contains$default(textFieldValue0.getText(), '\n', false, 2, null);
        return extractedText0;
    }
}

