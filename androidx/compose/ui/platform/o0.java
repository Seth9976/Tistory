package androidx.compose.ui.platform;

import android.content.ClipboardManager;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

public abstract class o0 {
    @DoNotInline
    @JvmStatic
    public static final void a(@NotNull ClipboardManager clipboardManager0) {
        clipboardManager0.clearPrimaryClip();
    }
}

