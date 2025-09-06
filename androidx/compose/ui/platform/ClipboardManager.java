package androidx.compose.ui.platform;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\n\u0010\u0007\u001A\u0004\u0018\u00010\bH\u0016J\n\u0010\t\u001A\u0004\u0018\u00010\nH&J\b\u0010\u000B\u001A\u00020\fH\u0016J\u0012\u0010\r\u001A\u00020\u000E2\b\u0010\u000F\u001A\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u0010\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\nH&R\u0018\u0010\u0002\u001A\u00060\u0003j\u0002`\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/ClipboardManager;", "", "nativeClipboard", "Landroid/content/ClipboardManager;", "Landroidx/compose/ui/platform/NativeClipboard;", "getNativeClipboard", "()Landroid/content/ClipboardManager;", "getClip", "Landroidx/compose/ui/platform/ClipEntry;", "getText", "Landroidx/compose/ui/text/AnnotatedString;", "hasText", "", "setClip", "", "clipEntry", "setText", "annotatedString", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface ClipboardManager {
    @Nullable
    default ClipEntry getClip() {
        return null;
    }

    @NotNull
    default android.content.ClipboardManager getNativeClipboard() {
        throw new UnsupportedOperationException("This platform does not offer a native Clipboard");
    }

    @Nullable
    AnnotatedString getText();

    default boolean hasText() {
        AnnotatedString annotatedString0 = this.getText();
        return annotatedString0 != null && annotatedString0.length() > 0;
    }

    default void setClip(@Nullable ClipEntry clipEntry0) {
    }

    void setText(@NotNull AnnotatedString arg1);
}

