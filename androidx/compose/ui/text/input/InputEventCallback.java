package androidx.compose.ui.text.input;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "This function is not being used by any APIs. API is now deprecated and will be removed")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u001A\u0010\u0007\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\tH&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000Bø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/InputEventCallback;", "", "onEditCommands", "", "editCommands", "", "Landroidx/compose/ui/text/input/EditCommand;", "onImeAction", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "onImeAction-KlQnJC8", "(I)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface InputEventCallback {
    void onEditCommands(@NotNull List arg1);

    void onImeAction-KlQnJC8(int arg1);
}

