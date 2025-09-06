package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\"\u0014\u0010\u0001\u001A\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0004\u001A\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class RecordingInputConnection_androidKt {
    public static final boolean DEBUG = false;
    @NotNull
    public static final String TAG = "RecordingIC";

    public static final ExtractedText access$toExtractedText(TextFieldValue textFieldValue0) {
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

