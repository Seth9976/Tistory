package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import m0.z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001A\u000F\u0010\u0001\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"4\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0000@\u0000X\u0081\u000E¢\u0006\u0018\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\f\u0010\r\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000B¨\u0006\u000F"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;", "createLegacyPlatformTextInputServiceAdapter", "()Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;", "Lkotlin/Function1;", "Landroid/view/View;", "Landroidx/compose/foundation/text/input/internal/InputMethodManager;", "a", "Lkotlin/jvm/functions/Function1;", "getInputMethodManagerFactory", "()Lkotlin/jvm/functions/Function1;", "setInputMethodManagerFactory", "(Lkotlin/jvm/functions/Function1;)V", "getInputMethodManagerFactory$annotations", "()V", "inputMethodManagerFactory", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LegacyPlatformTextInputServiceAdapter_androidKt {
    public static Function1 a;

    static {
        LegacyPlatformTextInputServiceAdapter_androidKt.a = z.a;
    }

    // 去混淆评级： 低(30)
    public static final void access$updateWithEmojiCompat(EditorInfo editorInfo0) {
    }

    @NotNull
    public static final LegacyPlatformTextInputServiceAdapter createLegacyPlatformTextInputServiceAdapter() {
        return new AndroidLegacyPlatformTextInputServiceAdapter();
    }

    @NotNull
    public static final Function1 getInputMethodManagerFactory() {
        return LegacyPlatformTextInputServiceAdapter_androidKt.a;
    }

    @VisibleForTesting
    public static void getInputMethodManagerFactory$annotations() {
    }

    public static final void setInputMethodManagerFactory(@NotNull Function1 function10) {
        LegacyPlatformTextInputServiceAdapter_androidKt.a = function10;
    }
}

