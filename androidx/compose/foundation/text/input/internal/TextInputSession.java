package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tH&J\u001A\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\rH&ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0013H&J\u001A\u0010\u0014\u001A\u00020\u00072\u0006\u0010\u0012\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0017H&J\u0010\u0010\u0018\u001A\u00020\u000B2\u0006\u0010\u0019\u001A\u00020\u0011H&J!\u0010\u001A\u001A\u00020\u000B2\u0017\u0010\u001B\u001A\u0013\u0012\u0004\u0012\u00020\u001D\u0012\u0004\u0012\u00020\u000B0\u001C¢\u0006\u0002\b\u001EH&J\u0010\u0010\u001F\u001A\u00020\u000B2\u0006\u0010 \u001A\u00020!H&R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextInputSession;", "", "text", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getText", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "onCommitContent", "", "transferableContent", "Landroidx/compose/foundation/content/TransferableContent;", "onImeAction", "", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "onImeAction-KlQnJC8", "(I)V", "performHandwritingGesture", "", "gesture", "Landroid/view/inputmethod/HandwritingGesture;", "previewHandwritingGesture", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "cancellationSignal", "Landroid/os/CancellationSignal;", "requestCursorUpdates", "cursorUpdateMode", "requestEdit", "block", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/input/internal/EditingBuffer;", "Lkotlin/ExtensionFunctionType;", "sendKeyEvent", "keyEvent", "Landroid/view/KeyEvent;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface TextInputSession {
    @NotNull
    TextFieldCharSequence getText();

    boolean onCommitContent(@NotNull TransferableContent arg1);

    void onImeAction-KlQnJC8(int arg1);

    int performHandwritingGesture(@NotNull HandwritingGesture arg1);

    boolean previewHandwritingGesture(@NotNull PreviewableHandwritingGesture arg1, @Nullable CancellationSignal arg2);

    void requestCursorUpdates(int arg1);

    void requestEdit(@NotNull Function1 arg1);

    void sendKeyEvent(@NotNull KeyEvent arg1);
}

