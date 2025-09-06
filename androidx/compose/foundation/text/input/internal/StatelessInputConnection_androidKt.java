package androidx.compose.foundation.text.input.internal;

import android.content.ClipData.Item;
import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.inputmethod.ExtractedText;
import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.content.PlatformTransferableContent;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import androidx.compose.ui.text.TextRange;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\u001A\u001D\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u001A\u0010\u0007\u001A\u00020\u00068\u0000X\u0081T¢\u0006\f\n\u0004\b\u0007\u0010\b\u0012\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/core/view/inputmethod/InputContentInfoCompat;", "Landroid/os/Bundle;", "extras", "Landroidx/compose/foundation/content/TransferableContent;", "toTransferableContent", "(Landroidx/core/view/inputmethod/InputContentInfoCompat;Landroid/os/Bundle;)Landroidx/compose/foundation/content/TransferableContent;", "", "SIC_DEBUG", "Z", "getSIC_DEBUG$annotations", "()V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class StatelessInputConnection_androidKt {
    public static final boolean SIC_DEBUG = false;

    public static final ExtractedText access$toExtractedText(TextFieldCharSequence textFieldCharSequence0) {
        ExtractedText extractedText0 = new ExtractedText();
        extractedText0.text = textFieldCharSequence0;
        extractedText0.startOffset = 0;
        extractedText0.partialEndOffset = textFieldCharSequence0.length();
        extractedText0.partialStartOffset = -1;
        extractedText0.selectionStart = TextRange.getMin-impl(textFieldCharSequence0.getSelection-d9O1mEE());
        extractedText0.selectionEnd = TextRange.getMax-impl(textFieldCharSequence0.getSelection-d9O1mEE());
        extractedText0.flags = !StringsKt__StringsKt.contains$default(textFieldCharSequence0, '\n', false, 2, null);
        return extractedText0;
    }

    @VisibleForTesting
    public static void getSIC_DEBUG$annotations() {
    }

    @NotNull
    public static final TransferableContent toTransferableContent(@NotNull InputContentInfoCompat inputContentInfoCompat0, @Nullable Bundle bundle0) {
        ClipEntry clipEntry0 = AndroidClipboardManager_androidKt.toClipEntry(new ClipData(inputContentInfoCompat0.getDescription(), new ClipData.Item(inputContentInfoCompat0.getContentUri())));
        ClipMetadata clipMetadata0 = AndroidClipboardManager_androidKt.toClipMetadata(inputContentInfoCompat0.getDescription());
        Uri uri0 = inputContentInfoCompat0.getLinkUri();
        if(bundle0 == null) {
            bundle0 = Bundle.EMPTY;
        }
        return new TransferableContent(clipEntry0, clipMetadata0, 0, new PlatformTransferableContent(uri0, bundle0), null);
    }
}

