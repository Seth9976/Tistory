package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&J\u0016\u0010\u0006\u001A\u00020\u00032\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\t0\bH&J\u001A\u0010\n\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\fH&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u00032\u0006\u0010\u0010\u001A\u00020\u0011H&J8\u0010\u0012\u001A\u00020\u00032\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u00142\u0006\u0010\u0017\u001A\u00020\u00142\u0006\u0010\u0018\u001A\u00020\u00142\u0006\u0010\u0019\u001A\u00020\u0014H&ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u001AÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/InputEventCallback2;", "", "onConnectionClosed", "", "inputConnection", "Landroidx/compose/foundation/text/input/internal/RecordingInputConnection;", "onEditCommands", "editCommands", "", "Landroidx/compose/ui/text/input/EditCommand;", "onImeAction", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "onImeAction-KlQnJC8", "(I)V", "onKeyEvent", "event", "Landroid/view/KeyEvent;", "onRequestCursorAnchorInfo", "immediate", "", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface InputEventCallback2 {
    void onConnectionClosed(@NotNull RecordingInputConnection arg1);

    void onEditCommands(@NotNull List arg1);

    void onImeAction-KlQnJC8(int arg1);

    void onKeyEvent(@NotNull KeyEvent arg1);

    void onRequestCursorAnchorInfo(boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6);
}

